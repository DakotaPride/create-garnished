package net.dakotapride.garnished.registry;


import java.util.List;

import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.HugeFungusConfiguration;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
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

public class GarnishedFeatures {

	public static final ResourceLocation NUT_TREE_CONFIGURED = set("nut_tree_configured");
	public static final ResourceLocation NUT_TREE_PLACED = set("nut_tree_placed");

	public static final ResourceLocation BUHG_TREE_CONFIGURED = set("peanut_tree_configured");
	public static final ResourceLocation WALNUT_TREE_CONFIGURED = set("walnut_tree_configured");
	public static final ResourceLocation ALMOND_TREE_CONFIGURED = set("almond_tree_configured");
	public static final ResourceLocation CASHEW_TREE_CONFIGURED = set("cashew_tree_configured");
	public static final ResourceLocation HAZELNUT_TREE_CONFIGURED = set("hazelnut_tree_configured");
	public static final ResourceLocation MACADAMIA_TREE_CONFIGURED = set("macadamia_tree_configured");
	public static final ResourceLocation PECAN_TREE_CONFIGURED = set("pecan_tree_configured");
	public static final ResourceLocation PISTACHIO_TREE_CONFIGURED = set("pistachio_tree_configured");

	public static final ResourceLocation SEPIA_FUNGUS_CONFIGURED = set("patch_sepia_fungus_configured");
	public static final ResourceLocation SEPIA_FUNGUS_PLACED = set("patch_sepia_fungus_placed");
	public static final ResourceLocation SEPIA_FUNGUS_TREE_CONFIGURED = set("sepia_fungus_tree_configured");
	public static final ResourceLocation SOUL_ROOTS_CONFIGURED = set("patch_soul_roots_configured");
	public static final ResourceLocation SOUL_ROOTS_PLACED = set("patch_soul_roots_placed");

	public static final ResourceLocation SOUL_SAND_VEGETATION_BONEMEAL_CONFIGURED = set("soul_sand_vegetation_bonemeal");

	public static ResourceLocation set(String id) {
		return new ResourceLocation(CreateGarnished.ID, id);
	}

	public static void setRegister() {}

}
