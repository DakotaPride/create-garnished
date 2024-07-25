package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.RedDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanRedDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanRedDyeingEmiRecipe(RedDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_RED_DYEING, recipe, GarnishedFluids.RED_MASTIC_RESIN.get());
	}
}
