package net.dakotapride.garnished.registry;


import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
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

	public static final ResourceKey<ConfiguredFeature<?, ?>> SEPIA_FUNGUS_CONFIGURED = registerConfiguredKey("patch_sepia_fungus_configured");
	public static final ResourceKey<PlacedFeature> SEPIA_FUNGUS_PLACED = registerPlacedKey("patch_sepia_fungus_placed");
	public static final ResourceKey<ConfiguredFeature<?, ?>> SEPIA_FUNGUS_TREE_CONFIGURED = registerConfiguredKey("sepia_fungus_tree_configured");
	public static final ResourceKey<ConfiguredFeature<?, ?>> SOUL_ROOTS_CONFIGURED = registerConfiguredKey("patch_soul_roots_configured");
	public static final ResourceKey<PlacedFeature> SOUL_ROOTS_PLACED = registerPlacedKey("patch_soul_roots_placed");

	public static ResourceKey<ConfiguredFeature<?, ?>> registerConfiguredKey(String name) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(CreateGarnished.ID, name));
	}

	public static ResourceKey<PlacedFeature> registerPlacedKey(String name) {
		return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(CreateGarnished.ID, name));
	}

}
