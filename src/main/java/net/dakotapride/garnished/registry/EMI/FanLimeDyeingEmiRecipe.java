package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.LimeDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanLimeDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanLimeDyeingEmiRecipe(LimeDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_LIME_DYEING, recipe, GarnishedFluids.LIME_MASTIC_RESIN.get());
	}
}
