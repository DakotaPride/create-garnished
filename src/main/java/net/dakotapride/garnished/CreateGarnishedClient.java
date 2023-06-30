package net.dakotapride.garnished;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.minecraft.client.renderer.RenderType;

public class CreateGarnishedClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.CASHEW_CROP.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.WALNUT_CROP.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.ALMOND_CROP.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.PECAN_CROP.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.PISTACHIO_CROP.get(), RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.NUT_PLANT.get(), RenderType.cutout());

		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.GARNISH.get().getSource(),
				GarnishedFluids.GARNISH.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.GARNISH.get()));

	}
}
