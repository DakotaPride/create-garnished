package net.dakotapride.garnished.registry;

import static net.minecraft.world.item.Items.BUCKET;

import javax.annotation.Nullable;

import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.fluid.FluidHelper;
import com.simibubi.create.foundation.utility.Iterate;
import com.tterrag.registrate.fabric.SimpleFlowableFluid;
import com.tterrag.registrate.util.entry.FluidEntry;
import com.tterrag.registrate.util.nullness.NonNullSupplier;

import io.github.fabricators_of_create.porting_lib.event.common.FluidPlaceBlockCallback;
import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.block.DragonBreathFluidBlock;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidConstants;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributeHandler;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.EmptyItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.FullItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;

@SuppressWarnings("UnstableApiUsage")
public class GarnishedFluids {
	public static void setRegister() {
		FluidPlaceBlockCallback.EVENT.register(GarnishedFluids::whenFluidsMeet);
	}
	private static final CreateRegistrate REGISTRATE = CreateGarnished.registrate()
			.setCreativeTab(GarnishedTabs.GARNISHED.key());

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
	public static final FluidEntry<SimpleFlowableFluid.Flowing> LIME_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> BLUE_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> LIGHT_BLUE_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> CYAN_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> PURPLE_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> MAGENTA_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> PINK_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> BLACK_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> GRAY_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> LIGHT_GRAY_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> WHITE_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> BROWN_MASTIC_RESIN;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> DRAGON_BREATH;
	public static final FluidEntry<SimpleFlowableFluid.Flowing> SWEET_TEA;

	public static FluidEntry<SimpleFlowableFluid.Flowing> masticResinRegistration(String colour0) {
		return REGISTRATE
				.fluid((colour0 == "" ? colour0 : colour0 + "_") + "mastic_resin",
						createLocation((colour0 == "" ? colour0 : colour0 + "_") + "mastic_resin", false),
						createLocation((colour0 == "" ? colour0 : colour0 + "_") + "mastic_resin", true)
				)
				.fluidProperties(p -> p.levelDecreasePerBlock(2)
						.tickRate(25)
						.flowSpeed(3)
						.blastResistance(100f))
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.garnished." + (colour0 == "" ? colour0 : colour0 + "_") + "mastic_resin", 1500, 1400))
				.onRegisterAfter(Registries.ITEM, fluid -> {
					Fluid source = fluid.getSource();
					FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
							new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
					FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
							new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
				}).register();
	}

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
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.garnished.liquid_garnish", 1500, 1400))
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
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.garnished.apple_cider", 1500, 1400))
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
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.garnished.peanut_oil", 1500, 1400))
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
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.garnished.cashew_mixture", 1500, 1400))
				.onRegisterAfter(Registries.ITEM, fluid -> {
					Fluid source = fluid.getSource();
					FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
							new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
					FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
							new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
				}).register();

		MASTIC_RESIN = masticResinRegistration("");
		RED_MASTIC_RESIN = masticResinRegistration("red");
		ORANGE_MASTIC_RESIN = masticResinRegistration("orange");
		YELLOW_MASTIC_RESIN = masticResinRegistration("yellow");
		GREEN_MASTIC_RESIN = masticResinRegistration("green");
		LIME_MASTIC_RESIN = masticResinRegistration("lime");
		BLUE_MASTIC_RESIN = masticResinRegistration("blue");
		LIGHT_BLUE_MASTIC_RESIN = masticResinRegistration("light_blue");
		CYAN_MASTIC_RESIN = masticResinRegistration("cyan");
		PURPLE_MASTIC_RESIN = masticResinRegistration("purple");
		MAGENTA_MASTIC_RESIN = masticResinRegistration("magenta");
		PINK_MASTIC_RESIN = masticResinRegistration("pink");
		BLACK_MASTIC_RESIN = masticResinRegistration("black");
		GRAY_MASTIC_RESIN = masticResinRegistration("gray");
		LIGHT_GRAY_MASTIC_RESIN = masticResinRegistration("light_gray");
		WHITE_MASTIC_RESIN = masticResinRegistration("white");
		BROWN_MASTIC_RESIN = masticResinRegistration("brown");

		DRAGON_BREATH = REGISTRATE
				.fluid("dragon_breath",
						createLocation("dragon_breath", false),
						createLocation("dragon_breath", true)
				)
				.fluidProperties(p -> p.levelDecreasePerBlock(2)
						.tickRate(25)
						.flowSpeed(3)
						.blastResistance(100f))
				.block((NonNullSupplier<? extends SimpleFlowableFluid.Flowing> pProperties, BlockBehaviour.Properties pProperties2) -> new DragonBreathFluidBlock(pProperties2)).build()
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.garnished.dragon_breath", 1500, 1400))
				.onRegisterAfter(Registries.ITEM, fluid -> {
					Fluid source = fluid.getSource();
					FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
							new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
					FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
							new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
				}).register();
		SWEET_TEA = REGISTRATE
				.fluid("sweet_tea",
						createLocation("sweet_tea", false),
						createLocation("sweet_tea", true)
				)
				.fluidProperties(p -> p.levelDecreasePerBlock(2)
						.tickRate(25)
						.flowSpeed(3)
						.blastResistance(100f))
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.garnished.sweet_tea", 1500, 1400))
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
			if (metFluidState.is(FluidTags.LAVA))
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
		// Fluids.lavaInteraction(fluidState, GARNISH.get(), AllPaletteStoneTypes.CALCITE.getBaseBlock().get());
		if (fluid.isSame(GARNISH.get()))
			return AllPaletteStoneTypes.CALCITE.getBaseBlock().get().defaultBlockState();
		// Fluids.lavaInteraction(fluidState, PEANUT_OIL.get(), AllPaletteStoneTypes.DRIPSTONE.getBaseBlock().get());
		if (fluid.isSame(PEANUT_OIL.get()))
			return AllPaletteStoneTypes.DRIPSTONE.getBaseBlock().get().defaultBlockState();
		// Fluids.lavaInteraction(fluidState, APPLE_CIDER.get(), GarnishedBlocks.CARNOTITE.get());
		if (fluid.isSame(APPLE_CIDER.get()))
			return GarnishedBlocks.CARNOTITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, CASHEW_MIXTURE.get(), Blocks.END_STONE);
		if (fluid.isSame(CASHEW_MIXTURE.get()))
			return Blocks.END_STONE.defaultBlockState();

		// Fluids.lavaInteraction(fluidState, MASTIC_RESIN.get(), GarnishedBlocks.ZULTANITE.get());
		if (fluid.isSame(MASTIC_RESIN.get()))
			return GarnishedBlocks.ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, RED_MASTIC_RESIN.get(), GarnishedBlocks.RED_ZULTANITE.get());
		if (fluid.isSame(RED_MASTIC_RESIN.get()))
			return GarnishedBlocks.RED_ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, ORANGE_MASTIC_RESIN.get(), GarnishedBlocks.ORANGE_ZULTANITE.get());
		if (fluid.isSame(ORANGE_MASTIC_RESIN.get()))
			return GarnishedBlocks.ORANGE_ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, YELLOW_MASTIC_RESIN.get(), GarnishedBlocks.YELLOW_ZULTANITE.get());
		if (fluid.isSame(YELLOW_MASTIC_RESIN.get()))
			return GarnishedBlocks.YELLOW_ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, GREEN_MASTIC_RESIN.get(), GarnishedBlocks.GREEN_ZULTANITE.get());
		if (fluid.isSame(GREEN_MASTIC_RESIN.get()))
			return GarnishedBlocks.GREEN_ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, LIME_MASTIC_RESIN.get(), GarnishedBlocks.LIME_ZULTANITE.get());
		if (fluid.isSame(LIME_MASTIC_RESIN.get()))
			return GarnishedBlocks.LIME_ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, BLUE_MASTIC_RESIN.get(), GarnishedBlocks.BLUE_ZULTANITE.get());
		if (fluid.isSame(BLUE_MASTIC_RESIN.get()))
			return GarnishedBlocks.BLUE_ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, LIGHT_BLUE_MASTIC_RESIN.get(), GarnishedBlocks.LIGHT_BLUE_ZULTANITE.get());
		if (fluid.isSame(LIGHT_BLUE_MASTIC_RESIN.get()))
			return GarnishedBlocks.LIGHT_BLUE_ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, CYAN_MASTIC_RESIN.get(), GarnishedBlocks.CYAN_ZULTANITE.get());
		if (fluid.isSame(CYAN_MASTIC_RESIN.get()))
			return GarnishedBlocks.CYAN_ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, PURPLE_MASTIC_RESIN.get(), GarnishedBlocks.PURPLE_ZULTANITE.get());
		if (fluid.isSame(PURPLE_MASTIC_RESIN.get()))
			return GarnishedBlocks.PURPLE_ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, MAGENTA_MASTIC_RESIN.get(), GarnishedBlocks.MAGENTA_ZULTANITE.get());
		if (fluid.isSame(MAGENTA_MASTIC_RESIN.get()))
			return GarnishedBlocks.MAGENTA_ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, PINK_MASTIC_RESIN.get(), GarnishedBlocks.PINK_ZULTANITE.get());
		if (fluid.isSame(PINK_MASTIC_RESIN.get()))
			return GarnishedBlocks.PINK_ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, BLACK_MASTIC_RESIN.get(), GarnishedBlocks.BLACK_ZULTANITE.get());
		if (fluid.isSame(BLACK_MASTIC_RESIN.get()))
			return GarnishedBlocks.BLACK_ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, GRAY_MASTIC_RESIN.get(), GarnishedBlocks.GRAY_ZULTANITE.get());
		if (fluid.isSame(GRAY_MASTIC_RESIN.get()))
			return GarnishedBlocks.GRAY_ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, LIGHT_GRAY_MASTIC_RESIN.get(), GarnishedBlocks.LIGHT_GRAY_ZULTANITE.get());
		if (fluid.isSame(LIGHT_GRAY_MASTIC_RESIN.get()))
			return GarnishedBlocks.LIGHT_GRAY_ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, WHITE_MASTIC_RESIN.get(), GarnishedBlocks.WHITE_ZULTANITE.get());
		if (fluid.isSame(WHITE_MASTIC_RESIN.get()))
			return GarnishedBlocks.WHITE_ZULTANITE.getDefaultState();
		// Fluids.lavaInteraction(fluidState, BROWN_MASTIC_RESIN.get(), GarnishedBlocks.BROWN_ZULTANITE.get());
		if (fluid.isSame(BROWN_MASTIC_RESIN.get()))
			return GarnishedBlocks.BROWN_ZULTANITE.getDefaultState();

		return null;
	}
}
