package net.dakotapride.garnished.registry;


import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import java.util.List;

public class GarnishedFeatures {

	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> NUT_TREE_CONFIGURED =
			FeatureUtils.register(CreateGarnished.ID + ":nut_tree_configured", Feature.TREE,
					new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG),
							new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
							new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 5)
									.add(GarnishedBlocks.NUT_LEAVES.get().defaultBlockState(), 1)),
							new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
							new TwoLayersFeatureSize(1, 0, 1)).dirt(BlockStateProvider.simple(Blocks.DIRT)).forceDirt().build());

	public static final Holder<PlacedFeature> NUT_TREE_PLACED = PlacementUtils.register("nut_tree_placed",
			NUT_TREE_CONFIGURED, RarityFilter.onAverageOnceEvery(8),
					InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> BUHG_TREE_CONFIGURED =
			FeatureUtils.register(CreateGarnished.ID + ":peanut_tree_configured", Feature.TREE,
					new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG),
							new StraightTrunkPlacer(1, 1, 0),
							new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 3)
									.add(GarnishedBlocks.BUHG_LEAVES.get().defaultBlockState(), 1)),
							new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 30),
							new TwoLayersFeatureSize(1, 0, 1)).dirt(BlockStateProvider.simple(Blocks.DIRT)).forceDirt().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> WALNUT_TREE_CONFIGURED =
			FeatureUtils.register(CreateGarnished.ID + ":walnut_tree_configured", Feature.TREE,
					new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG),
							new BendingTrunkPlacer(6, 3, 4, 4, ConstantInt.of(3)),
							new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 3)
									.add(GarnishedBlocks.WALNUT_LEAVES.get().defaultBlockState(), 1)),
							new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 45),
							new TwoLayersFeatureSize(1, 0, 1)).dirt(BlockStateProvider.simple(Blocks.DIRT)).forceDirt().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ALMOND_TREE_CONFIGURED =
			FeatureUtils.register(CreateGarnished.ID + ":almond_tree_configured", Feature.TREE,
					new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG),
							new ForkingTrunkPlacer(3, 1, 2),
							new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 3)
									.add(GarnishedBlocks.ALMOND_LEAVES.get().defaultBlockState(), 1)),
							new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 25),
							new TwoLayersFeatureSize(1, 0, 1)).dirt(BlockStateProvider.simple(Blocks.DIRT)).forceDirt().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> CASHEW_TREE_CONFIGURED =
			FeatureUtils.register(CreateGarnished.ID + ":cashew_tree_configured", Feature.TREE,
					new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG),
							new BendingTrunkPlacer(2, 1, 2, 2, ConstantInt.of(2)),
							new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 3)
									.add(GarnishedBlocks.CASHEW_LEAVES.get().defaultBlockState(), 1)),
							new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 25),
							new TwoLayersFeatureSize(1, 0, 1)).dirt(BlockStateProvider.simple(Blocks.DIRT)).forceDirt().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> HAZELNUT_TREE_CONFIGURED =
			FeatureUtils.register(CreateGarnished.ID + ":hazelnut_tree_configured", Feature.TREE,
					new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG),
							new ForkingTrunkPlacer(3, 2, 3),
							new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 3)
									.add(GarnishedBlocks.HAZELNUT_LEAVES.get().defaultBlockState(), 1)),
							new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 35),
							new TwoLayersFeatureSize(1, 0, 1)).dirt(BlockStateProvider.simple(Blocks.DIRT)).forceDirt().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> MACADAMIA_TREE_CONFIGURED =
			FeatureUtils.register(CreateGarnished.ID + ":macadamia_tree_configured", Feature.TREE,
					new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG),
							new BendingTrunkPlacer(4, 2, 4, 4, ConstantInt.of(2)),
							new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 3)
									.add(GarnishedBlocks.MACADAMIA_LEAVES.get().defaultBlockState(), 1)),
							new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 40),
							new TwoLayersFeatureSize(1, 0, 1)).dirt(BlockStateProvider.simple(Blocks.DIRT)).forceDirt().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PECAN_TREE_CONFIGURED =
			FeatureUtils.register(CreateGarnished.ID + ":pecan_tree_configured", Feature.TREE,
					new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG),
							new ForkingTrunkPlacer(4, 2, 3),
							new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 3)
									.add(GarnishedBlocks.PECAN_LEAVES.get().defaultBlockState(), 1)),
							new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 40),
							new TwoLayersFeatureSize(1, 0, 1)).dirt(BlockStateProvider.simple(Blocks.DIRT)).forceDirt().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PISTACHIO_TREE_CONFIGURED =
			FeatureUtils.register(CreateGarnished.ID + ":pistachio_tree_configured", Feature.TREE,
					new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG),
							new BendingTrunkPlacer(3, 2, 3, 3, ConstantInt.of(2)),
							new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.OAK_LEAVES.defaultBlockState(), 3)
									.add(GarnishedBlocks.PISTACHIO_LEAVES.get().defaultBlockState(), 1)),
							new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 30),
							new TwoLayersFeatureSize(1, 0, 1)).dirt(BlockStateProvider.simple(Blocks.DIRT)).forceDirt().build());

}
