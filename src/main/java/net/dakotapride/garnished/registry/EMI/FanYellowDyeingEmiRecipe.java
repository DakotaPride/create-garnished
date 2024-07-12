package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.YellowDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanYellowDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanYellowDyeingEmiRecipe(YellowDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_YELLOW_DYEING, recipe, GarnishedFluids.YELLOW_MASTIC_RESIN.getSource());
	}
}
