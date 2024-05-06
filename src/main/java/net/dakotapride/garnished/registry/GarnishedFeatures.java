package net.dakotapride.garnished.registry;


import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.gen.feature.DulseKelpFeature;
import net.dakotapride.garnished.gen.feature.VermilionKelpFeature;
import net.dakotapride.garnished.gen.feature.VoltaicSeagrassFeature;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class GarnishedFeatures {

	public static final ResourceKey<ConfiguredFeature<?, ?>> NUT_TREE_CONFIGURED = registerConfiguredKey("nut_tree_configured");
	public static final ResourceKey<PlacedFeature> NUT_TREE_PLACED = registerPlacedKey("nut_tree_placed");

	public static final ResourceKey<ConfiguredFeature<?, ?>> BUHG_TREE_CONFIGURED = registerConfiguredKey("peanut_tree_configured");
	public static final ResourceKey<ConfiguredFeature<?, ?>> WALNUT_TREE_CONFIGURED = registerConfiguredKey("walnut_tree_configured");
	public static final ResourceKey<ConfiguredFeature<?, ?>> ALMOND_TREE_CONFIGURED = registerConfiguredKey("almond_tree_configured");
	public static final ResourceKey<ConfiguredFeature<?, ?>> CASHEW_TREE_CONFIGURED = registerConfiguredKey("cashew_tree_configured");
	public static final ResourceKey<ConfiguredFeature<?, ?>> HAZELNUT_TREE_CONFIGURED = registerConfiguredKey("hazelnut_tree_configured");
	public static final ResourceKey<ConfiguredFeature<?, ?>> MACADAMIA_TREE_CONFIGURED = registerConfiguredKey("macadamia_tree_configured");
	public static final ResourceKey<ConfiguredFeature<?, ?>> PECAN_TREE_CONFIGURED = registerConfiguredKey("pecan_tree_configured");
	public static final ResourceKey<ConfiguredFeature<?, ?>> PISTACHIO_TREE_CONFIGURED = registerConfiguredKey("pistachio_tree_configured");
	public static final ResourceKey<ConfiguredFeature<?, ?>> CHESTNUT_TREE_CONFIGURED = registerConfiguredKey("chestnut_tree_configured");

	public static final ResourceKey<ConfiguredFeature<?, ?>> SEPIA_FUNGUS_CONFIGURED = registerConfiguredKey("patch_sepia_fungus_configured");
	public static final ResourceKey<PlacedFeature> SEPIA_FUNGUS_PLACED = registerPlacedKey("patch_sepia_fungus_placed");
	public static final ResourceKey<ConfiguredFeature<?, ?>> SEPIA_FUNGUS_TREE_CONFIGURED = registerConfiguredKey("sepia_fungus_tree_configured");
	public static final ResourceKey<ConfiguredFeature<?, ?>> SOUL_ROOTS_CONFIGURED = registerConfiguredKey("patch_soul_roots_configured");
	public static final ResourceKey<PlacedFeature> SOUL_ROOTS_PLACED = registerPlacedKey("patch_soul_roots_placed");

	public static final ResourceKey<ConfiguredFeature<?, ?>> SOUL_SAND_VEGETATION_SPREAD_CONFIGURED = registerConfiguredKey("soul_sand_vegetation_spread");
	public static final ResourceKey<ConfiguredFeature<?, ?>> WARPED_VEGETATION_SPREAD_CONFIGURED = registerConfiguredKey("warped_vegetation_spread");
	public static final ResourceKey<ConfiguredFeature<?, ?>> CRIMSON_VEGETATION_SPREAD_CONFIGURED = registerConfiguredKey("crimson_vegetation_spread");

	public static final ResourceKey<ConfiguredFeature<?, ?>> BARREN_ROOTS_CONFIGURED = registerConfiguredKey("patch_barren_roots_configured");
	public static final ResourceKey<PlacedFeature> BARREN_ROOTS_PLACED = registerPlacedKey("patch_barren_roots_placed");
	public static final ResourceKey<ConfiguredFeature<?, ?>> CHORUS_PLANT_CONFIGURED = registerConfiguredKey("patch_chorus_plant_configured");
	public static final ResourceKey<PlacedFeature> CHORUS_PLANT_PLACED = registerPlacedKey("patch_chorus_plant_placed");

	public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_VEGETATION_SPREAD_CONFIGURED = registerConfiguredKey("end_stone_vegetation_spread");

	public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_VEGETATION_BONEMEAL_CONFIGURED = registerConfiguredKey("end_stone_vegetation_bonemeal");

	public static final VermilionKelpFeature VERMILION_KELP_FEATURE = register("vermilion_kelp", new VermilionKelpFeature(NoneFeatureConfiguration.CODEC));
	public static final DulseKelpFeature DULSE_KELP_FEATURE = register("dulse_kelp", new DulseKelpFeature(NoneFeatureConfiguration.CODEC));
	public static final VoltaicSeagrassFeature VOLTAIC_SEAGRASS_FEATURE = register("voltaic_seagrass", new VoltaicSeagrassFeature(ProbabilityFeatureConfiguration.CODEC));

	public static final ResourceKey<PlacedFeature> VERMILION_KELP_PLACED = registerPlacedKey("vermilion_kelp_placed");
	public static final ResourceKey<PlacedFeature> DULSE_KELP_PLACED = registerPlacedKey("dulse_kelp_placed");
	public static final ResourceKey<PlacedFeature> VOLTAIC_SEAGRASS_PLACED = registerPlacedKey("voltaic_seagrass_placed");

	public static final ResourceKey<ConfiguredFeature<?, ?>> VERMILION_KELP_CONFIGURED = registerConfiguredKey("vermilion_kelp_configured");
	public static final ResourceKey<ConfiguredFeature<?, ?>> DULSE_KELP_CONFIGURED = registerConfiguredKey("dulse_kelp_configured");
	public static final ResourceKey<ConfiguredFeature<?, ?>> VOLTAIC_SEAGRASS_CONFIGURED = registerConfiguredKey("voltaic_seagrass_configured");

	public static final ResourceKey<PlacedFeature> REMNANT_PLACED = registerPlacedKey("ores_overworld");

	public static final ResourceKey<ConfiguredFeature<?, ?>> PANSOPHICAL_DAISY = registerConfiguredKey("pansophical_daisy_configured");
	public static final ResourceKey<ConfiguredFeature<?, ?>> INCANDESCENT_LILY = registerConfiguredKey("incandescent_lily_configured");
	public static final ResourceKey<ConfiguredFeature<?, ?>> SORROWFUL_LICHEN = registerConfiguredKey("sorrowful_lichen_configured");
	public static final ResourceKey<ConfiguredFeature<?, ?>> SORROWFUL_LICHEN_BASALT_DELTAS = registerConfiguredKey("sorrowful_lichen_basalt_deltas_configured");

	public static ResourceLocation set(String id) {
		return new ResourceLocation(CreateGarnished.ID, id);
	}

	public static ResourceKey<ConfiguredFeature<?, ?>> registerConfiguredKey(String name) {
		return ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, new ResourceLocation(CreateGarnished.ID, name));
	}

	public static ResourceKey<PlacedFeature> registerPlacedKey(String name) {
		return ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(CreateGarnished.ID, name));
	}

	private static <C extends FeatureConfiguration, F extends Feature<C>> F register(String key, F value) {
		return Registry.register(Registry.FEATURE, new ResourceLocation(CreateGarnished.ID, key), value);
	}

	public static void setRegister() {}

}
