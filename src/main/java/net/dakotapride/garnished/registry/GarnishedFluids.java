package net.dakotapride.garnished.registry;

import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import com.simibubi.create.foundation.data.CreateRegistrate;

import com.simibubi.create.foundation.fluid.FluidHelper;
import com.simibubi.create.foundation.utility.Iterate;
import com.tterrag.registrate.fabric.SimpleFlowableFluid;

import com.tterrag.registrate.util.entry.FluidEntry;

import io.github.fabricators_of_create.porting_lib.event.common.FluidPlaceBlockCallback;
import net.dakotapride.garnished.CreateGarnished;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidConstants;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributeHandler;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.EmptyItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.FullItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.material.FluidState;

import javax.annotation.Nullable;

import static net.minecraft.world.item.Items.BUCKET;

@SuppressWarnings("UnstableApiUsage")
public class GarnishedFluids {
	public static void setRegister() {
		FluidPlaceBlockCallback.EVENT.register(GarnishedFluids::whenFluidsMeet);
	}
	private static final CreateRegistrate REGISTRATE = CreateGarnished.registrate()
			.useCreativeTab(GarnishedTabs.GARNISHED.key());

	private static ResourceLocation createLocation(String fluid, boolean isFlowing) {
		String getMotion;

		if (isFlowing) {
			getMotion = "_flow";
		} else {
			getMotion = "_still";
		}

		return new ResourceLocation(CreateGarnished.ID, "fluid/" + fluid + getMotion);
	}

	public static final FluidEntry<SimpleFlowableFluid.Flowing> GARNISH;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> APPLE_CIDER;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> PEANUT_OIL;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> CASHEW_MIXTURE;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> RED_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> ORANGE_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> YELLOW_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> GREEN_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> BLUE_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> PURPLE_MASTIC_RESIN;

	static  {
		GARNISH = REGISTRATE
				.fluid("garnish",
						createLocation("garnish", false),
						createLocation("garnish", true)
				)
				.fluidProperties(p -> p.levelDecreasePerBlock(2)
						.tickRate(25)
						.flowSpeed(3)
						.blastResistance(100f))
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.liquid_garnish", 1500, 800))
				.onRegisterAfter(Registries.ITEM, fluid -> {
					Fluid source = fluid.getSource();
					FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
							new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
					FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
							new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
				}).register();
		APPLE_CIDER = REGISTRATE
				.fluid("apple_cider",
						createLocation("apple_cider", false),
						createLocation("apple_cider", true)
				)
				.fluidProperties(p -> p.levelDecreasePerBlock(2)
						.tickRate(25)
						.flowSpeed(3)
						.blastResistance(100f))
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.apple_cider", 1500, 800))
				.onRegisterAfter(Registries.ITEM, fluid -> {
					Fluid source = fluid.getSource();
					FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
							new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
					FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
							new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
				}).register();
		PEANUT_OIL = REGISTRATE
				.fluid("peanut_oil",
						createLocation("peanut_oil", false),
						createLocation("peanut_oil", true)
				)
				.fluidProperties(p -> p.levelDecreasePerBlock(2)
						.tickRate(25)
						.flowSpeed(3)
						.blastResistance(100f))
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.peanut_oil", 1500, 800))
				.onRegisterAfter(Registries.ITEM, fluid -> {
					Fluid source = fluid.getSource();
					FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
							new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
					FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
							new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
				}).register();
		CASHEW_MIXTURE = REGISTRATE
				.fluid("cashew_mixture",
						createLocation("cashew_mixture", false),
						createLocation("cashew_mixture", true)
				)
				.fluidProperties(p -> p.levelDecreasePerBlock(2)
						.tickRate(25)
						.flowSpeed(3)
						.blastResistance(100f))
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.cashew_mixture", 1500, 800))
				.onRegisterAfter(Registries.ITEM, fluid -> {
					Fluid source = fluid.getSource();
					FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
							new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
					FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
							new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
				}).register();
		MASTIC_RESIN = REGISTRATE
				.fluid("mastic_resin",
						createLocation("mastic_resin", false),
						createLocation("mastic_resin", true)
				)
				.fluidProperties(p -> p.levelDecreasePerBlock(2)
						.tickRate(25)
						.flowSpeed(3)
						.blastResistance(100f))
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.mastic_resin", 1500, 800))
				.onRegisterAfter(Registries.ITEM, fluid -> {
					Fluid source = fluid.getSource();
					FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
							new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
					FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
							new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
				}).register();
		RED_MASTIC_RESIN = REGISTRATE
				.fluid("red_mastic_resin",
						createLocation("red_mastic_resin", false),
						createLocation("red_mastic_resin", true)
				)
				.fluidProperties(p -> p.levelDecreasePerBlock(2)
						.tickRate(25)
						.flowSpeed(3)
						.blastResistance(100f))
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.red_mastic_resin", 1500, 800))
				.onRegisterAfter(Registries.ITEM, fluid -> {
					Fluid source = fluid.getSource();
					FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
							new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
					FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
							new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
				}).register();
		ORANGE_MASTIC_RESIN = REGISTRATE
				.fluid("orange_mastic_resin",
						createLocation("orange_mastic_resin", false),
						createLocation("orange_mastic_resin", true)
				)
				.fluidProperties(p -> p.levelDecreasePerBlock(2)
						.tickRate(25)
						.flowSpeed(3)
						.blastResistance(100f))
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.orange_mastic_resin", 1500, 800))
				.onRegisterAfter(Registries.ITEM, fluid -> {
					Fluid source = fluid.getSource();
					FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
							new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
					FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
							new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
				}).register();
		YELLOW_MASTIC_RESIN = REGISTRATE
				.fluid("yellow_mastic_resin",
						createLocation("yellow_mastic_resin", false),
						createLocation("yellow_mastic_resin", true)
				)
				.fluidProperties(p -> p.levelDecreasePerBlock(2)
						.tickRate(25)
						.flowSpeed(3)
						.blastResistance(100f))
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.yellow_mastic_resin", 1500, 800))
				.onRegisterAfter(Registries.ITEM, fluid -> {
					Fluid source = fluid.getSource();
					FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
							new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
					FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
							new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
				}).register();
		GREEN_MASTIC_RESIN = REGISTRATE
				.fluid("green_mastic_resin",
						createLocation("green_mastic_resin", false),
						createLocation("green_mastic_resin", true)
				)
				.fluidProperties(p -> p.levelDecreasePerBlock(2)
						.tickRate(25)
						.flowSpeed(3)
						.blastResistance(100f))
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.green_mastic_resin", 1500, 800))
				.onRegisterAfter(Registries.ITEM, fluid -> {
					Fluid source = fluid.getSource();
					FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
							new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
					FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
							new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
				}).register();
		BLUE_MASTIC_RESIN = REGISTRATE
				.fluid("blue_mastic_resin",
						createLocation("blue_mastic_resin", false),
						createLocation("blue_mastic_resin", true)
				)
				.fluidProperties(p -> p.levelDecreasePerBlock(2)
						.tickRate(25)
						.flowSpeed(3)
						.blastResistance(100f))
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.blue_mastic_resin", 1500, 800))
				.onRegisterAfter(Registries.ITEM, fluid -> {
					Fluid source = fluid.getSource();
					FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
							new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
					FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
							new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
				}).register();
		PURPLE_MASTIC_RESIN = REGISTRATE
				.fluid("purple_mastic_resin",
						createLocation("purple_mastic_resin", false),
						createLocation("purple_mastic_resin", true)
				)
				.fluidProperties(p -> p.levelDecreasePerBlock(2)
						.tickRate(25)
						.flowSpeed(3)
						.blastResistance(100f))
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.purple_mastic_resin", 1500, 800))
				.onRegisterAfter(Registries.ITEM, fluid -> {
					Fluid source = fluid.getSource();
					FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
							new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
					FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
							new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
				}).register();
	}


	private record CreateAdditionsAttributeHandler(Component name, int viscosity, boolean lighterThanAir) implements FluidVariantAttributeHandler {
		private CreateAdditionsAttributeHandler(String key, int viscosity, int density) {
			this(Component.translatable(key), viscosity, density <= 0);
		}

		@Override
		public Component getName(FluidVariant fluidVariant) {
			return name.copy();
		}

		@Override
		public int getViscosity(FluidVariant variant, @Nullable Level world) {
			return viscosity;
		}

		@Override
		public boolean isLighterThanAir(FluidVariant variant) {
			return lighterThanAir;
		}
	}

	public static BlockState whenFluidsMeet(LevelAccessor world, BlockPos pos, BlockState blockState) {
		FluidState fluidState = blockState.getFluidState();

		if (fluidState.isSource() && FluidHelper.isLava(fluidState.getType()))
			return null;

		for (Direction direction : Iterate.directions) {
			FluidState metFluidState =
					fluidState.isSource() ? fluidState : world.getFluidState(pos.relative(direction));
			if (!metFluidState.is(FluidTags.WATER))
				continue;
			BlockState lavaInteraction = getLavaInteraction(metFluidState);
			if (lavaInteraction == null)
				continue;
			return lavaInteraction;
		}
		return null;
	}

	@Nullable
	public static BlockState getLavaInteraction(FluidState fluidState) {
		Fluid fluid = fluidState.getType();

		if (fluid.isSame(GARNISH.get()))
			return AllPaletteStoneTypes.CALCITE.getBaseBlock().get().defaultBlockState();
		if (fluid.isSame(APPLE_CIDER.get()))
			return AllPaletteStoneTypes.OCHRUM.getBaseBlock().get().defaultBlockState();
		if (fluid.isSame(PEANUT_OIL.get()))
			return AllPaletteStoneTypes.DRIPSTONE.getBaseBlock().get().defaultBlockState();

		if (fluid.isSame(MASTIC_RESIN.get()))
			return AllPaletteStoneTypes.TUFF.getBaseBlock().get().defaultBlockState();
		if (fluid.isSame(RED_MASTIC_RESIN.get()))
			return AllPaletteStoneTypes.CRIMSITE.getBaseBlock().get().defaultBlockState();
		if (fluid.isSame(ORANGE_MASTIC_RESIN.get()))
			return Blocks.TERRACOTTA.defaultBlockState();
		if (fluid.isSame(YELLOW_MASTIC_RESIN.get()))
			return GarnishedBlocks.CARNOTITE.get().defaultBlockState();
		if (fluid.isSame(GREEN_MASTIC_RESIN.get()))
			return AllPaletteStoneTypes.VERIDIUM.getBaseBlock().get().defaultBlockState();
		if (fluid.isSame(BLUE_MASTIC_RESIN.get()))
			return AllPaletteStoneTypes.ASURINE.getBaseBlock().get().defaultBlockState();
		if (fluid.isSame(PURPLE_MASTIC_RESIN.get()))
			return GarnishedBlocks.ABYSSAL_STONE.get().defaultBlockState();

		return null;
	}
}
