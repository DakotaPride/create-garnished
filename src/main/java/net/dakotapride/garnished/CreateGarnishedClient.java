package net.dakotapride.garnished;

import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.dakotapride.garnished.registry.GarnishedPonderIndex;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.resources.model.Material;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;

public class CreateGarnishedClient implements ClientModInitializer {

	public static String sepia = "sepia";
	public static String nut = "nut";

	public static ResourceLocation signResourceLocation(String type) {
		return new ResourceLocation(CreateGarnished.ID, "entity/signs/" + type);
	}

	@Override
	public void onInitializeClient() {
		// GarnishedPonderIndex.index();
		// GarnishedPonderIndex.Tags.fillPonderTags();

		SpriteIdentifierRegistry.INSTANCE.addIdentifier(new Material(
				Sheets.SIGN_SHEET, signResourceLocation(sepia)));

		SpriteIdentifierRegistry.INSTANCE.addIdentifier(new Material(
				Sheets.SIGN_SHEET, signResourceLocation(nut)));

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.NUT_PLANT.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.NUT_LEAVES.get(), RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.ALMOND_LEAVES.get(), RenderType.cutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.CASHEW_LEAVES.get(), RenderType.cutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.WALNUT_LEAVES.get(), RenderType.cutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.PECAN_LEAVES.get(), RenderType.cutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.BUHG_LEAVES.get(), RenderType.cutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.PISTACHIO_LEAVES.get(), RenderType.cutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.MACADAMIA_LEAVES.get(), RenderType.cutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.HAZELNUT_LEAVES.get(), RenderType.cutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.CHESTNUT_LEAVES.get(), RenderType.cutoutMipped());

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.ALMOND_SAPLING.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.CASHEW_SAPLING.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.WALNUT_SAPLING.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.PECAN_SAPLING.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.BUHG_SAPLING.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.PISTACHIO_SAPLING.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.MACADAMIA_SAPLING.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.HAZELNUT_SAPLING.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.CHESTNUT_SAPLING.get(), RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.SEPIA_FUNGUS.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.SOUL_ROOTS.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.SEPIA_TRAPDOOR.get(), RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.BLOCK_OF_ENDER_JELLY.get(), RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.BARREN_ROOTS.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.SMALL_CHORUS_PLANT.get(), RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.VERMILION_KELP.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.VERMILION_KELP_PLANT.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.DULSE_KELP.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.DULSE_KELP_PLANT.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.VOLTAIC_SEA_GRASS.get(), RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.NUT_DOOR.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.NUT_TRAPDOOR.get(), RenderType.cutout());

		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.GARNISH.get().getSource(),
				GarnishedFluids.GARNISH.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.GARNISH.get()));
		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.APPLE_CIDER.get().getSource(),
				GarnishedFluids.APPLE_CIDER.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.APPLE_CIDER.get()));
		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.APPLE_CIDER.get().getSource(),
				GarnishedFluids.APPLE_CIDER.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.APPLE_CIDER.get()));

	}

	public static synchronized void blockColourProvider(BlockColors colors) {
		colors.register((unknown, lightReader, pos, unknown2) -> lightReader != null && pos != null ?
						BiomeColors.getAverageFoliageColor(lightReader, pos) : FoliageColor.get(0.5D, 1.0D),
				GarnishedBlocks.NUT_LEAVES.get(),
				GarnishedBlocks.ALMOND_LEAVES.get(), GarnishedBlocks.CASHEW_LEAVES.get(), GarnishedBlocks.WALNUT_LEAVES.get(),
				GarnishedBlocks.PECAN_LEAVES.get(), GarnishedBlocks.BUHG_LEAVES.get(), GarnishedBlocks.PISTACHIO_LEAVES.get(),
				GarnishedBlocks.MACADAMIA_LEAVES.get(), GarnishedBlocks.HAZELNUT_LEAVES.get(), GarnishedBlocks.CHESTNUT_LEAVES.get());
	}

	public static synchronized void itemColourProvider(BlockColors colors, ItemColors itemColors) {
		ItemColor itemBlockColourHandler = (stack, tintIndex) -> {
			BlockState state = ((BlockItem) stack.getItem()).getBlock().defaultBlockState();
			return colors.getColor(state, null, null, tintIndex);
		};

		itemColors.register(itemBlockColourHandler, GarnishedBlocks.NUT_LEAVES.get(),
				GarnishedBlocks.ALMOND_LEAVES.get(), GarnishedBlocks.CASHEW_LEAVES.get(), GarnishedBlocks.WALNUT_LEAVES.get(),
				GarnishedBlocks.PECAN_LEAVES.get(), GarnishedBlocks.BUHG_LEAVES.get(), GarnishedBlocks.PISTACHIO_LEAVES.get(),
				GarnishedBlocks.MACADAMIA_LEAVES.get(), GarnishedBlocks.HAZELNUT_LEAVES.get(), GarnishedBlocks.CHESTNUT_LEAVES.get());
	}
}
