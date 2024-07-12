package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanBlackDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanBlackDyeingEmiRecipe(BlueDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_BLACK_DYEING, recipe, GarnishedFluids.BLACK_MASTIC_RESIN.getSource());
	}
}
