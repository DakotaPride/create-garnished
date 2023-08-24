package net.dakotapride.garnished.mixin;

import net.dakotapride.garnished.CreateGarnishedClient;
import net.minecraft.client.color.block.BlockColors;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockColors.class)
public class BlockColoursMixin {

	@Inject(method = "createDefault", at = @At("RETURN"))
	private static void getBlockColourProviders(CallbackInfoReturnable<BlockColors> cir) {
		CreateGarnishedClient.blockColourProvider(cir.getReturnValue());
	}
}
