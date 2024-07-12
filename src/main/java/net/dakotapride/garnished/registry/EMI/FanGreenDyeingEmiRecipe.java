package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanGreenDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanGreenDyeingEmiRecipe(GreenDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_GREEN_DYEING, recipe, GarnishedFluids.GREEN_MASTIC_RESIN.getSource());
	}
}
