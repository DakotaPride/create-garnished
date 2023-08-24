package net.dakotapride.garnished.mixin;

import net.dakotapride.garnished.CreateGarnishedClient;
import net.minecraft.client.color.block.BlockColors;

import net.minecraft.client.color.item.ItemColors;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemColors.class)
public class ItemColoursMixin {

	@Inject(method = "createDefault", at = @At("RETURN"))
	private static void getItemColourProviders(BlockColors blockColors, CallbackInfoReturnable<ItemColors> cir) {
		CreateGarnishedClient.itemColourProvider(blockColors, cir.getReturnValue());
	}
}
