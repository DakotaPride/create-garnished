package net.dakotapride.garnished.mixin;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionBrewing;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(PotionBrewing.class)
public interface PotionBrewingMixin {
	@Invoker("addMix")
	static void addMixToInvoker(Potion input, Item addition, Potion output) {
		throw new AssertionError();
	}
}
