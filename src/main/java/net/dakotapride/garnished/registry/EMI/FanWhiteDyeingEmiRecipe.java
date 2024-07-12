package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanWhiteDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanWhiteDyeingEmiRecipe(BlueDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_WHITE_DYEING, recipe, GarnishedFluids.WHITE_MASTIC_RESIN.getSource());
	}
}
