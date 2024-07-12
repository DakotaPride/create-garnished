package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanCyanDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanCyanDyeingEmiRecipe(BlueDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_CYAN_DYEING, recipe, GarnishedFluids.CYAN_MASTIC_RESIN.getSource());
	}
}
