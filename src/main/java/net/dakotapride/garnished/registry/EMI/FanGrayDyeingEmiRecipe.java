package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanGrayDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanGrayDyeingEmiRecipe(BlueDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_GRAY_DYEING, recipe, GarnishedFluids.GRAY_MASTIC_RESIN.getSource());
	}
}
