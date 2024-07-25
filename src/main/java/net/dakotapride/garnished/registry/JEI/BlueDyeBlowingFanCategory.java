package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class BlueDyeBlowingFanCategory extends DyeBlowingFanCategory<BlueDyeBlowingFanRecipe> {
	public BlueDyeBlowingFanCategory(Info<BlueDyeBlowingFanRecipe> info) {
		super(GarnishedFluids.BLUE_MASTIC_RESIN.getSource(), info);
	}

}
