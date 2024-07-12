package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanLimeDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanLimeDyeingEmiRecipe(BlueDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_LIME_DYEING, recipe, GarnishedFluids.LIME_MASTIC_RESIN.getSource());
	}
}
