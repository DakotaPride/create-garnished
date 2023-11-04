package net.dakotapride.garnished.mixin;

import net.dakotapride.garnished.entity.GarnishedBoatTypes;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChestBoat.class)
public class ChestBoatMixin {

	//CREDIT TO nyuppo/fabric-boat-example ON GITHUB

	@Inject(method = "getDropItem", at = @At("RETURN"), cancellable = true)
	public void wilderWild$getModdedBoats(CallbackInfoReturnable<Item> info) {
		var boat = Boat.class.cast(this);
		if (boat.getVariant() == GarnishedBoatTypes.NUT) {
			info.setReturnValue(GarnishedItems.NUT_CHEST_BOAT.get());
		}
	}

}
