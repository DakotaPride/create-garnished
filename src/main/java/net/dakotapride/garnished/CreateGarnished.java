package net.dakotapride.garnished;

import net.dakotapride.garnished.modifier.LootTableModifiers;

import net.dakotapride.garnished.registry.GarnishedPonderIndex;
import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.dakotapride.garnished.registry.GarnishedEffects;
import net.dakotapride.garnished.registry.GarnishedEnchantments;
import net.dakotapride.garnished.registry.GarnishedFeatures;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.dakotapride.garnished.registry.GarnishedFoods;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.dakotapride.garnished.registry.GarnishedTabs;
import net.dakotapride.garnished.registry.GarnishedTags;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class CreateGarnished implements ModInitializer {

	public static final String ID = "garnished";
	public static final String NAME = "Create: Garnished";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
	private static final NonNullSupplier<CreateRegistrate> REGISTRATE =
			NonNullSupplier.lazy(() -> CreateRegistrate.create(ID));

	public static ResourceLocation asResource(String path) {
		return new ResourceLocation(ID, path);
	}

	@Override
	public void onInitialize() {

		GarnishedItems.setRegister();
		GarnishedBlocks.setRegister();
		GarnishedTabs.setRegister();
		GarnishedFluids.setRegister();
		GarnishedFoods.setRegister();
		GarnishedEffects.setRegister();
		GarnishedEnchantments.setRegister();
		GarnishedTags.setRegister();
		LootTableModifiers.modifyLootTables();
		REGISTRATE.get().register();

		// Generation
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.PLAINS),
				GenerationStep.Decoration.VEGETAL_DECORATION, GarnishedFeatures.NUT_TREE_PLACED);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SOUL_SAND_VALLEY),
				GenerationStep.Decoration.VEGETAL_DECORATION, GarnishedFeatures.SOUL_ROOTS_PLACED);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SOUL_SAND_VALLEY),
				GenerationStep.Decoration.VEGETAL_DECORATION, GarnishedFeatures.SEPIA_FUNGUS_PLACED);
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

		PotionBrewing.addMix(Potions.MUNDANE, GarnishedItems.VOLATILE_DUST.get(), GarnishedEffects.SANCTITY_POTION);

		StrippableBlockRegistry.register(GarnishedBlocks.SEPIA_STEM.get(), GarnishedBlocks.STRIPPED_SEPIA_STEM.get());
		StrippableBlockRegistry.register(GarnishedBlocks.SEPIA_HYPHAE.get(), GarnishedBlocks.STRIPPED_SEPIA_HYPHAE.get());
		StrippableBlockRegistry.register(GarnishedBlocks.NUT_LOG.get(), GarnishedBlocks.STRIPPED_NUT_LOG.get());
		StrippableBlockRegistry.register(GarnishedBlocks.NUT_WOOD.get(), GarnishedBlocks.STRIPPED_NUT_WOOD.get());
	}

	public static CreateRegistrate registrate() {
		return REGISTRATE.get();
	}
}
