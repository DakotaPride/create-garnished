package net.dakotapride.garnished.mixin;

import net.dakotapride.garnished.entity.GarnishedBoatTypes;
import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.world.entity.vehicle.Boat;

import net.minecraft.world.level.block.Block;

import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.Arrays;

@Mixin(Boat.Type.class)
public class BoatTypeMixin {

	//CREDIT TO nyuppo/fabric-boat-example ON GITHUB

	@SuppressWarnings("ShadowTarget")
	@Final
	@Shadow
	@Mutable
	private static Boat.Type[] $VALUES;

	@SuppressWarnings("InvokerTarget")
	@Invoker("<init>")
	private static Boat.Type newType(String internalName, int internalId, Block baseBlock, String name) {
		throw new AssertionError();
	}

	@Inject(method = "<clinit>", at = @At(value = "FIELD",
			opcode = Opcodes.PUTSTATIC,
			target = "Lnet/minecraft/world/entity/vehicle/Boat$Type;$VALUES:[Lnet/minecraft/world/entity/vehicle/Boat$Type;",
			shift = At.Shift.AFTER))
	private static void addType(CallbackInfo info) {
		var types = new ArrayList<>(Arrays.asList($VALUES));
		var last = types.get(types.size() - 1);

		var nut = newType("NUT", last.ordinal() + 1, GarnishedBlocks.NUT_PLANKS.get(), "nut");
		GarnishedBoatTypes.NUT = nut;
		types.add(nut);

		$VALUES = types.toArray(new Boat.Type[0]);
	}

}
