package net.dakotapride.garnished;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.renderer.RenderType;

public class CreateGarnishedClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.CASHEW_CROP.get(), RenderType.cutout());

		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.GARNISHED_WATER.get().getSource(),
				GarnishedFluids.GARNISHED_WATER.get().getFlowing(), SimpleFluidRenderHandler.coloredWater(0x5A92ED));

	}
}
