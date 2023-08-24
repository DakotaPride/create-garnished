package net.dakotapride.garnished;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;

public class CreateGarnishedClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.CASHEW_CROP.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.WALNUT_CROP.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.ALMOND_CROP.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.PECAN_CROP.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.PISTACHIO_CROP.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.MACADAMIA_CROP.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.BUHG_CROP.get(), RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.NUT_PLANT.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.NUT_SAPLING.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.NUT_LEAVES.get(), RenderType.cutout());

		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.GARNISH.get().getSource(),
				GarnishedFluids.GARNISH.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.GARNISH.get()));

	}

	public static synchronized void blockColourProvider(BlockColors colors) {
		colors.register((unknown, lightReader, pos, unknown2) -> lightReader != null && pos != null ?
						BiomeColors.getAverageFoliageColor(lightReader, pos) : FoliageColor.get(0.5D, 1.0D),
				GarnishedBlocks.NUT_LEAVES.get());
	}

	public static synchronized void itemColourProvider(BlockColors colors, ItemColors itemColors) {
		ItemColor itemBlockColourHandler = (stack, tintIndex) -> {
			BlockState state = ((BlockItem) stack.getItem()).getBlock().defaultBlockState();
			return colors.getColor(state, null, null, tintIndex);
		};

		itemColors.register(itemBlockColourHandler, GarnishedBlocks.NUT_LEAVES.get());
	}
}
