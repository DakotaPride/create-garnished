package net.dakotapride.garnished;

import io.github.fabricators_of_create.porting_lib.brewing.BrewingRecipeRegistry;
import net.dakotapride.garnished.registry.GarnishedEffects;
import net.dakotapride.garnished.registry.GarnishedFoods;

import net.dakotapride.garnished.registry.GarnishedTags;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.dakotapride.garnished.registry.GarnishedFeatures;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.dakotapride.garnished.registry.GarnishedTabs;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class CreateGarnished implements ModInitializer {

	public static final String ID = "garnished";
	public static final String NAME = "Create: Garnished";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
	private static final NonNullSupplier<CreateRegistrate> REGISTRATE =
			NonNullSupplier.lazy(() -> CreateRegistrate.create(ID));

	@Override
	public void onInitialize() {

		GarnishedItems.setRegister();
		GarnishedBlocks.setRegister();
		GarnishedTabs.setRegister();
		GarnishedFluids.setRegister();
		GarnishedFoods.setRegister();
		GarnishedEffects.setRegister();
		GarnishedTags.setRegister();
		REGISTRATE.get().register();

		// Generation
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.PLAINS),
				GenerationStep.Decoration.VEGETAL_DECORATION, GarnishedFeatures.NUT_TREE_PLACED.unwrapKey().get());

		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);

		PotionBrewing.addMix(Potions.AWKWARD, GarnishedItems.BRITTLE_DUST.get(), GarnishedEffects.AVERSION_POTION);
		PotionBrewing.addMix(GarnishedEffects.AVERSION_POTION, Items.REDSTONE, GarnishedEffects.LONG_AVERSION_POTION);

	}

	public static CreateRegistrate registrate() {
		return REGISTRATE.get();
	}
}
