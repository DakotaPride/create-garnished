package net.dakotapride.garnished.registry;


import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.dakotapride.garnished.CreateGarnished;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import java.util.List;

public class GarnishedFeatures {

	public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> NUT_PLANT_CONFIGURED =
			FeatureUtils.register(CreateGarnished.ID + ":nut_plant_configured", Feature.FLOWER,
					FeatureUtils.simpleRandomPatchConfiguration(32, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
							new SimpleBlockConfiguration(BlockStateProvider.simple(GarnishedBlocks.NUT_PLANT.get())))));

	public static final Holder<PlacedFeature> NUT_PLANT_PLACED = PlacementUtils.register(CreateGarnished.ID + ":nut_plant_placed",
			NUT_PLANT_CONFIGURED, RarityFilter.onAverageOnceEvery(4), InSquarePlacement.spread(),
			PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

}
