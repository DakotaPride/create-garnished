package net.dakotapride.garnished;

import net.dakotapride.garnished.registry.GarnishedFluids;

import net.dakotapride.garnished.registry.GarnishedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;

import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateRegistrate;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.dakotapride.garnished.registry.GarnishedTabs;
import net.fabricmc.api.ModInitializer;

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
		REGISTRATE.get().register();

		// Generation
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.PLAINS),
				GenerationStep.Decoration.VEGETAL_DECORATION, GarnishedFeatures.NUT_PLANT_PLACED.unwrapKey().get());

		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);
	}

	public static CreateRegistrate registrate() {
		return REGISTRATE.get();
	}
}
