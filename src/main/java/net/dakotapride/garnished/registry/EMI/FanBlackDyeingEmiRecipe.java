package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.BlackDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanBlackDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanBlackDyeingEmiRecipe(BlackDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_BLACK_DYEING, recipe, GarnishedFluids.BLACK_MASTIC_RESIN.get());
	}
}
