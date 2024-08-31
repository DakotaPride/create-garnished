package net.dakotapride.garnished;

import net.dakotapride.garnished.modifier.LootTableModifiers;
import net.dakotapride.garnished.recipe.GarnishedFanProcessing;
import net.dakotapride.garnished.registry.GarnishedAdvancementUtils;
import net.dakotapride.garnished.registry.GarnishedBlockEntities;
import net.dakotapride.garnished.registry.GarnishedEnchantments;
import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.dakotapride.garnished.registry.GarnishedRecipeTypes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.levelgen.GenerationStep;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.dakotapride.garnished.registry.GarnishedEffects;
import net.dakotapride.garnished.registry.GarnishedFeatures;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.dakotapride.garnished.registry.GarnishedTabs;
import net.dakotapride.garnished.registry.GarnishedTags;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import plus.dragons.createdragonlib.lang.Lang;

public class CreateGarnished implements ModInitializer {

	public static final String ID = "garnished";
	public static final String NAME = "Create: Garnished";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
	public static final Lang LANG = new Lang(ID);
	private static final NonNullSupplier<CreateRegistrate> REGISTRATE =
			NonNullSupplier.lazy(() -> CreateRegistrate.create(ID));

	public static ResourceLocation asResource(String path) {
		return new ResourceLocation(ID, path);
	}

	@Override
	public void onInitialize() {

		GarnishedBlockEntities.setRegister();
		GarnishedItems.setRegister();
		GarnishedBlocks.setRegister();
		GarnishedTabs.setRegister();
		GarnishedFluids.setRegister();
		GarnishedFoodValues.setRegister();
		GarnishedEffects.setRegister();
		GarnishedFeatures.setRegister();
		GarnishedTags.setRegister();
		GarnishedEnchantments.setRegister();
		LootTableModifiers.modifyLootTables();
		GarnishedRecipeTypes.register();
		GarnishedFanProcessing.register();

		GarnishedAdvancementUtils.register();

		REGISTRATE.get().register();

		// Generation
		BiomeModifications.addFeature(BiomeSelectors.tag(GarnishedTags.HAS_NUT_TREES_TAG),
		 		GenerationStep.Decoration.VEGETAL_DECORATION, GarnishedFeatures.NUT_TREE_PLACED);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SOUL_SAND_VALLEY),
				GenerationStep.Decoration.VEGETAL_DECORATION, GarnishedFeatures.SOUL_ROOTS_PLACED);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SOUL_SAND_VALLEY),
				GenerationStep.Decoration.VEGETAL_DECORATION, GarnishedFeatures.SEPIA_FUNGUS_PLACED);
		BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_END),
				GenerationStep.Decoration.VEGETAL_DECORATION, GarnishedFeatures.BARREN_ROOTS_PLACED);
		BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_END),
				GenerationStep.Decoration.VEGETAL_DECORATION, GarnishedFeatures.CHORUS_PLANT_PLACED);

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.COLD_OCEAN),
				GenerationStep.Decoration.VEGETAL_DECORATION, GarnishedFeatures.VERMILION_KELP_PLACED);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.COLD_OCEAN),
				GenerationStep.Decoration.VEGETAL_DECORATION, GarnishedFeatures.VOLTAIC_SEAGRASS_PLACED);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.FROZEN_OCEAN),
				GenerationStep.Decoration.VEGETAL_DECORATION, GarnishedFeatures.DULSE_KELP_PLACED);
		BiomeModifications.addFeature(BiomeSelectors.tag(GarnishedTags.HAS_REMNANT_TAG),
				GenerationStep.Decoration.UNDERGROUND_ORES, GarnishedFeatures.REMNANT_PLACED);

		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);

		PotionBrewing.addMix(Potions.AWKWARD, GarnishedItems.BRITTLE_DUST.get(), GarnishedEffects.AVERSION_POTION);
		PotionBrewing.addMix(GarnishedEffects.AVERSION_POTION, Items.REDSTONE, GarnishedEffects.LONG_AVERSION_POTION);
		PotionBrewing.addMix(Potions.AWKWARD, GarnishedItems.ENDER_JELLY_BLOB.get(), GarnishedEffects.FLAGRANT_POTION);

		PotionBrewing.addMix(Potions.AWKWARD, GarnishedItems.SENILE_SWEET_BLACKSTONE.get(), GarnishedEffects.BLINDNESS_POTION);
		PotionBrewing.addMix(Potions.AWKWARD, GarnishedItems.SENILE_SWEET_BASALT.get(), Potions.WEAKNESS);
		PotionBrewing.addMix(Potions.AWKWARD, GarnishedItems.SENILE_SWEET_SCORIA.get(), Potions.POISON);
		PotionBrewing.addMix(Potions.AWKWARD, GarnishedItems.SENILE_SWEET_SCORCHIA.get(), Potions.SLOWNESS);

		PotionBrewing.addMix(Potions.AWKWARD, GarnishedItems.VOLATILE_DUST.get(), GarnishedEffects.SANCTITY_POTION);

		PotionBrewing.addMix(Potions.MUNDANE, GarnishedItems.SOLEMN_DUST.get(), GarnishedEffects.MUMMIFICATION_POTION);

		PotionBrewing.addMix(Potions.THICK, GarnishedItems.FROST.get(), GarnishedEffects.FREEZING_POTION);
		PotionBrewing.addMix(GarnishedEffects.FREEZING_POTION, Items.REDSTONE, GarnishedEffects.LONG_FREEZING_POTION);

		StrippableBlockRegistry.register(GarnishedBlocks.SEPIA_STEM.get(), GarnishedBlocks.STRIPPED_SEPIA_STEM.get());
		StrippableBlockRegistry.register(GarnishedBlocks.SEPIA_HYPHAE.get(), GarnishedBlocks.STRIPPED_SEPIA_HYPHAE.get());
		StrippableBlockRegistry.register(GarnishedBlocks.NUT_LOG.get(), GarnishedBlocks.STRIPPED_NUT_LOG.get());
		StrippableBlockRegistry.register(GarnishedBlocks.NUT_WOOD.get(), GarnishedBlocks.STRIPPED_NUT_WOOD.get());


		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CRACKED_BUHG.get(), 0.10f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CRACKED_CASHEW.get(), 0.10f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CRACKED_WALNUT.get(), 0.10f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CRACKED_ALMOND.get(), 0.10f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CRACKED_PISTACHIO.get(), 0.10f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CRACKED_PECAN.get(), 0.10f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CRACKED_MACADAMIA.get(), 0.10f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CRACKED_HAZELNUT.get(), 0.10f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CRACKED_CHESTNUT.get(), 0.10f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.UNGARNISHED_BUHG.get(), 0.15f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.UNGARNISHED_CASHEW.get(), 0.15f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.UNGARNISHED_WALNUT.get(), 0.15f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.UNGARNISHED_ALMOND.get(), 0.15f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.UNGARNISHED_PISTACHIO.get(), 0.15f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.UNGARNISHED_PECAN.get(), 0.15f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.UNGARNISHED_MACADAMIA.get(), 0.15f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.UNGARNISHED_HAZELNUT.get(), 0.15f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.UNGARNISHED_CHESTNUT.get(), 0.15f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.BUHG.get(), 0.20f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CASHEW.get(), 0.20f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.WALNUT.get(), 0.20f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.ALMOND.get(), 0.20f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.PISTACHIO.get(), 0.20f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.PECAN.get(), 0.20f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.MACADAMIA.get(), 0.20f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.HAZELNUT.get(), 0.20f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CHESTNUT.get(), 0.20f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CHOCOLATE_GLAZED_BUHG.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CHOCOLATE_GLAZED_CASHEW.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CHOCOLATE_GLAZED_WALNUT.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CHOCOLATE_GLAZED_ALMOND.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CHOCOLATE_GLAZED_PISTACHIO.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CHOCOLATE_GLAZED_PECAN.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CHOCOLATE_GLAZED_MACADAMIA.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CHOCOLATE_GLAZED_HAZELNUT.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CHOCOLATE_GLAZED_CHESTNUT.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.SWEETENED_BUHG.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.SWEETENED_CASHEW.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.SWEETENED_WALNUT.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.SWEETENED_ALMOND.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.SWEETENED_PISTACHIO.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.SWEETENED_PECAN.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.SWEETENED_MACADAMIA.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.SWEETENED_HAZELNUT.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.SWEETENED_CHESTNUT.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.HONEYED_BUHG.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.HONEYED_CASHEW.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.HONEYED_WALNUT.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.HONEYED_ALMOND.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.HONEYED_PISTACHIO.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.HONEYED_PECAN.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.HONEYED_MACADAMIA.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.HONEYED_HAZELNUT.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.HONEYED_CHESTNUT.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CINDER_FLOUR_BUHG.get(), 0.30f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CINDER_FLOUR_CASHEW.get(), 0.30f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CINDER_FLOUR_WALNUT.get(), 0.30f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CINDER_FLOUR_ALMOND.get(), 0.30f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CINDER_FLOUR_PISTACHIO.get(), 0.30f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CINDER_FLOUR_PECAN.get(), 0.30f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CINDER_FLOUR_MACADAMIA.get(), 0.30f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CINDER_FLOUR_HAZELNUT.get(), 0.30f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CINDER_FLOUR_CHESTNUT.get(), 0.30f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.MELTED_CINDER_FLOUR_BUHG.get(), 0.40f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.MELTED_CINDER_FLOUR_CASHEW.get(), 0.40f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.MELTED_CINDER_FLOUR_WALNUT.get(), 0.40f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.MELTED_CINDER_FLOUR_ALMOND.get(), 0.40f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.MELTED_CINDER_FLOUR_PISTACHIO.get(), 0.40f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.MELTED_CINDER_FLOUR_PECAN.get(), 0.40f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.MELTED_CINDER_FLOUR_MACADAMIA.get(), 0.40f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.MELTED_CINDER_FLOUR_HAZELNUT.get(), 0.40f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.MELTED_CINDER_FLOUR_CHESTNUT.get(), 0.40f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.NUT_LEAVES.get().asItem(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.UNASSIGNED_NUT_LEAVES.get().asItem(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.BUHG_LEAVES.get().asItem(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.CASHEW_LEAVES.get().asItem(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.WALNUT_LEAVES.get().asItem(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.ALMOND_LEAVES.get().asItem(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.PISTACHIO_LEAVES.get().asItem(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.PECAN_LEAVES.get().asItem(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.MACADAMIA_LEAVES.get().asItem(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.HAZELNUT_LEAVES.get().asItem(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.CHESTNUT_LEAVES.get().asItem(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.PECAN_PIE_SLICE.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.PECAN_PIE.get(), 1.0f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.ALMOND_CHEESE.get(), 0.20f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.SALAD.get(), 0.75f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CRUSHED_CRIMSON_FUNGUS.get(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CRUSHED_WARPED_FUNGUS.get(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CRUSHED_SEPIA_FUNGUS.get(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.SEPIA_FUNGUS.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(Items.CHORUS_FRUIT, 0.45f);
		ComposterBlock.COMPOSTABLES.put(Items.CHORUS_FLOWER, 0.65f);
		ComposterBlock.COMPOSTABLES.put(Items.CHORUS_PLANT, 0.65f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.HOLLOWED_CHORUS_FRUIT.get(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.CHORUS_TUFT.get(), 0.10f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.MULCH.get(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.WHEAT_GRAZE.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.DRIED_DULSE_KELP.get(), 0.30f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.DRIED_VERMILION_KELP.get(), 0.30f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.DULSE_KELP.get().asItem(), 0.30f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.VERMILION_KELP.get().asItem(), 0.30f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.DRIED_DULSE_KELP_BLOCK.get().asItem(), 0.50f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.DRIED_VERMILION_KELP_BLOCK.get().asItem(), 0.50f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.PRICKLY_PEAR.get(), 0.45f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.BAMBOO_CLOD.get(), 0.45f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.BOK_CHOY.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.BOK_CHOY_SEEDS.get(), 0.30f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.PANSOPHICAL_PETAL.get(), 0.45f);
		ComposterBlock.COMPOSTABLES.put(GarnishedItems.INCANDESCENT_PETAL.get(), 0.45f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.PANSOPHICAL_DAISY.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.INCANDESCENT_LILY.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.SORROWFUL_LICHEN.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.SOUL_ROOTS.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.AUREATE_SHRUB.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.SMALL_CHORUS_PLANT.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(GarnishedBlocks.BARREN_ROOTS.get().asItem(), 0.65f);

	}

	public static CreateRegistrate registrate() {
		return REGISTRATE.get();
	}
}
