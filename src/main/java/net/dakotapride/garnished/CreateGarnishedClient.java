package net.dakotapride.garnished;

import com.mojang.blaze3d.shaders.FogShape;
import com.simibubi.create.infrastructure.config.AllConfigs;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;

import io.github.fabricators_of_create.porting_lib.event.client.FogEvents;
import net.dakotapride.garnished.block.cake.AnniversaryCakeBlockRenderer;
import net.dakotapride.garnished.registry.GarnishedBlockEntities;
import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.mixin.client.rendering.BlockEntityRendererFactoriesMixin;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.FogType;

public class CreateGarnishedClient implements ClientModInitializer {

	public static String sepia = "sepia";
	public static String nut = "nut";

	public static ResourceLocation signResourceLocation(String type) {
		return new ResourceLocation(CreateGarnished.ID, "entity/signs/" + type);
	}

	public static ResourceLocation hangingSignResourceLocation(String type) {
		return new ResourceLocation(CreateGarnished.ID, "entity/signs/hanging/" + type);
	}

	// public static ResourceLocation hangingSignGUIResourceLocation(String type) {
	//		return new ResourceLocation(CreateGarnished.ID, "textures/gui/hanging_signs/" + type);
	//	}


	@Override
	public void onInitializeClient() {
		// GarnishedPonderIndex.index();
		// GarnishedPonderIndex.Tags.fillPonderTags();

		SpriteIdentifierRegistry.INSTANCE.addIdentifier(new Material(
				Sheets.SIGN_SHEET, signResourceLocation(sepia)));
		SpriteIdentifierRegistry.INSTANCE.addIdentifier(new Material(
				Sheets.SIGN_SHEET, hangingSignResourceLocation(sepia)));

		SpriteIdentifierRegistry.INSTANCE.addIdentifier(new Material(
				Sheets.SIGN_SHEET, signResourceLocation(nut)));
		SpriteIdentifierRegistry.INSTANCE.addIdentifier(new Material(
				Sheets.SIGN_SHEET, hangingSignResourceLocation(nut)));

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
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.SEPIA_TRAPDOOR.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.SOUL_ROOTS.get(), RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.BLOCK_OF_ENDER_JELLY.get(), RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.BARREN_ROOTS.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.SMALL_CHORUS_PLANT.get(), RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.NUT_DOOR.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.NUT_TRAPDOOR.get(), RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.VERMILION_KELP.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.VERMILION_KELP_PLANT.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.DULSE_KELP.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.DULSE_KELP_PLANT.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.VOLTAIC_SEA_GRASS.get(), RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.PANSOPHICAL_DAISY.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.POTTED_PANSOPHICAL_DAISY.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.INCANDESCENT_LILY.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.POTTED_INCANDESCENT_LILY.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.SORROWFUL_LICHEN.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.AUREATE_SHRUB.get(), RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.POTTED_SEPIA_FUNGUS.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.POTTED_SOUL_ROOTS.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.POTTED_BARREN_ROOTS.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.POTTED_SMALL_CHORUS_PLANT.get(), RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.POTTED_AUREATE_SHRUB.get(), RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(GarnishedBlocks.BOK_CHOY_PLANT.get(), RenderType.cutout());

		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.GARNISH.get().getSource(),
				GarnishedFluids.GARNISH.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.GARNISH.get()));
		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.APPLE_CIDER.get().getSource(),
				GarnishedFluids.APPLE_CIDER.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.APPLE_CIDER.get()));
		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.PEANUT_OIL.get().getSource(),
				GarnishedFluids.PEANUT_OIL.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.PEANUT_OIL.get()));
		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.CASHEW_MIXTURE.get().getSource(),
				GarnishedFluids.CASHEW_MIXTURE.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.CASHEW_MIXTURE.get()));
		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.MASTIC_RESIN.get().getSource(),
				GarnishedFluids.MASTIC_RESIN.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.MASTIC_RESIN.get()));
		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.RED_MASTIC_RESIN.get().getSource(),
				GarnishedFluids.RED_MASTIC_RESIN.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.RED_MASTIC_RESIN.get()));
		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.ORANGE_MASTIC_RESIN.get().getSource(),
				GarnishedFluids.ORANGE_MASTIC_RESIN.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.ORANGE_MASTIC_RESIN.get()));
		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.YELLOW_MASTIC_RESIN.get().getSource(),
				GarnishedFluids.YELLOW_MASTIC_RESIN.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.YELLOW_MASTIC_RESIN.get()));
		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.GREEN_MASTIC_RESIN.get().getSource(),
				GarnishedFluids.GREEN_MASTIC_RESIN.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.GREEN_MASTIC_RESIN.get()));
		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.BLUE_MASTIC_RESIN.get().getSource(),
				GarnishedFluids.BLUE_MASTIC_RESIN.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.BLUE_MASTIC_RESIN.get()));
		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.PURPLE_MASTIC_RESIN.get().getSource(),
				GarnishedFluids.PURPLE_MASTIC_RESIN.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.PURPLE_MASTIC_RESIN.get()));
		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.DRAGON_BREATH.get().getSource(),
				GarnishedFluids.DRAGON_BREATH.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.DRAGON_BREATH.get()));
		FluidRenderHandlerRegistry.INSTANCE.register(GarnishedFluids.SWEET_TEA.get().getSource(),
				GarnishedFluids.SWEET_TEA.get().getFlowing(), FluidRenderHandlerRegistry.INSTANCE.get(GarnishedFluids.SWEET_TEA.get()));

		FogEvents.RENDER_FOG.register(CreateGarnishedClient::getGarnishedFogDensity);
		FogEvents.SET_COLOR.register(CreateGarnishedClient::getGarnishedFogColour);

		BlockEntityRenderers.register(GarnishedBlockEntities.CAKE.get(), AnniversaryCakeBlockRenderer::new);
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

	public static boolean getGarnishedFogDensity(FogRenderer.FogMode mode, FogType type, Camera camera, float partialTick, float renderDistance, float nearDistance, float farDistance, FogShape shape, FogEvents.FogData fogData) {
		Level level = Minecraft.getInstance().level;
		BlockPos blockPos = camera.getBlockPosition();
		FluidState fluidState = level.getFluidState(blockPos);
		if (camera.getPosition().y >= blockPos.getY() + fluidState.getHeight(level, blockPos))
			return false;
		Fluid fluid = fluidState.getType();
		Entity entity = camera.getEntity();

		if (GarnishedFluids.GARNISH.get().isSame(fluid)) {
			fogData.scaleFarPlaneDistance(1f / 8f * AllConfigs.client().honeyTransparencyMultiplier.getF());
			return true;
		}
		if (GarnishedFluids.APPLE_CIDER.get().isSame(fluid)) {
			fogData.scaleFarPlaneDistance(1f / 8f * AllConfigs.client().honeyTransparencyMultiplier.getF());
			return true;
		}
		if (GarnishedFluids.PEANUT_OIL.get().isSame(fluid)) {
			fogData.scaleFarPlaneDistance(1f / 8f * AllConfigs.client().honeyTransparencyMultiplier.getF());
			return true;
		}
		if (GarnishedFluids.CASHEW_MIXTURE.get().isSame(fluid)) {
			fogData.scaleFarPlaneDistance(1f / 8f * AllConfigs.client().honeyTransparencyMultiplier.getF());
			return true;
		}
		if (GarnishedFluids.MASTIC_RESIN.get().isSame(fluid)) {
			fogData.scaleFarPlaneDistance(1f / 8f * AllConfigs.client().honeyTransparencyMultiplier.getF());
			return true;
		}
		if (GarnishedFluids.RED_MASTIC_RESIN.get().isSame(fluid)) {
			fogData.scaleFarPlaneDistance(1f / 8f * AllConfigs.client().honeyTransparencyMultiplier.getF());
			return true;
		}
		if (GarnishedFluids.ORANGE_MASTIC_RESIN.get().isSame(fluid)) {
			fogData.scaleFarPlaneDistance(1f / 8f * AllConfigs.client().honeyTransparencyMultiplier.getF());
			return true;
		}
		if (GarnishedFluids.YELLOW_MASTIC_RESIN.get().isSame(fluid)) {
			fogData.scaleFarPlaneDistance(1f / 8f * AllConfigs.client().honeyTransparencyMultiplier.getF());
			return true;
		}
		if (GarnishedFluids.GREEN_MASTIC_RESIN.get().isSame(fluid)) {
			fogData.scaleFarPlaneDistance(1f / 8f * AllConfigs.client().honeyTransparencyMultiplier.getF());
			return true;
		}
		if (GarnishedFluids.BLUE_MASTIC_RESIN.get().isSame(fluid)) {
			fogData.scaleFarPlaneDistance(1f / 8f * AllConfigs.client().honeyTransparencyMultiplier.getF());
			return true;
		}
		if (GarnishedFluids.PURPLE_MASTIC_RESIN.get().isSame(fluid)) {
			fogData.scaleFarPlaneDistance(1f / 8f * AllConfigs.client().honeyTransparencyMultiplier.getF());
			return true;
		}
		if (GarnishedFluids.DRAGON_BREATH.get().isSame(fluid)) {
			fogData.scaleFarPlaneDistance(1f / 8f * AllConfigs.client().honeyTransparencyMultiplier.getF());
			return true;
		}
		if (GarnishedFluids.SWEET_TEA.get().isSame(fluid)) {
			fogData.scaleFarPlaneDistance(1f / 8f * AllConfigs.client().honeyTransparencyMultiplier.getF());
			return true;
		}

		if (entity.isSpectator())
			return false;

		return false;
	}

	public static void getGarnishedFogColour(FogEvents.ColorData event, float partialTicks) {
		Camera info = event.getCamera();
		Level level = Minecraft.getInstance().level;
		BlockPos blockPos = info.getBlockPosition();
		FluidState fluidState = level.getFluidState(blockPos);
		if (info.getPosition().y > blockPos.getY() + fluidState.getHeight(level, blockPos))
			return;

		Fluid fluid = fluidState.getType();

		if (GarnishedFluids.GARNISH.get().isSame(fluid)) {
			event.setRed(239 / 255f);
			event.setGreen(233 / 255f);
			event.setBlue(227 / 255f);
			return;
		}
		if (GarnishedFluids.APPLE_CIDER.get().isSame(fluid)) {
			event.setRed(239 / 255f);
			event.setGreen(179 / 255f);
			event.setBlue(119 / 255f);
			return;
		}
		if (GarnishedFluids.PEANUT_OIL.get().isSame(fluid)) {
			event.setRed(202 / 255f);
			event.setGreen(196 / 255f);
			event.setBlue(159 / 255f);
			return;
		}
		if (GarnishedFluids.CASHEW_MIXTURE.get().isSame(fluid)) {
			event.setRed(252 / 255f);
			event.setGreen(239 / 255f);
			event.setBlue(207 / 255f);
			return;
		}
		if (GarnishedFluids.MASTIC_RESIN.get().isSame(fluid)) {
			event.setRed(82 / 255f);
			event.setGreen(107 / 255f);
			event.setBlue(76 / 255f);
			return;
		}
		if (GarnishedFluids.RED_MASTIC_RESIN.get().isSame(fluid)) {
			event.setRed(142 / 255f);
			event.setGreen(25 / 255f);
			event.setBlue(25 / 255f);
			return;
		}
		if (GarnishedFluids.ORANGE_MASTIC_RESIN.get().isSame(fluid)) {
			event.setRed(165 / 255f);
			event.setGreen(86 / 255f);
			event.setBlue(46 / 255f);
			return;
		}
		if (GarnishedFluids.YELLOW_MASTIC_RESIN.get().isSame(fluid)) {
			event.setRed(178 / 255f);
			event.setGreen(136 / 255f);
			event.setBlue(53 / 255f);
			return;
		}
		if (GarnishedFluids.GREEN_MASTIC_RESIN.get().isSame(fluid)) {
			event.setRed(67 / 255f);
			event.setGreen(142 / 255f);
			event.setBlue(41 / 255f);
			return;
		}
		if (GarnishedFluids.BLUE_MASTIC_RESIN.get().isSame(fluid)) {
			event.setRed(57 / 255f);
			event.setGreen(122 / 255f);
			event.setBlue(126 / 255f);
			return;
		}
		if (GarnishedFluids.PURPLE_MASTIC_RESIN.get().isSame(fluid)) {
			event.setRed(87 / 255f);
			event.setGreen(36 / 255f);
			event.setBlue(153 / 255f);
			return;
		}
		if (GarnishedFluids.DRAGON_BREATH.get().isSame(fluid)) {
			event.setRed(197 / 255f);
			event.setGreen(72 / 255f);
			event.setBlue(131 / 255f);
			return;
		}
		if (GarnishedFluids.SWEET_TEA.get().isSame(fluid)) {
			event.setRed(227 / 255f);
			event.setGreen(141 / 255f);
			event.setBlue(82 / 255f);
			return;
		}
	}
}
