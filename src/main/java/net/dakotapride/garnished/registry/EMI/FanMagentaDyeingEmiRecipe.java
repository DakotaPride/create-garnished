package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanMagentaDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanMagentaDyeingEmiRecipe(BlueDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_MAGENTA_DYEING, recipe, GarnishedFluids.MAGENTA_MASTIC_RESIN.getSource());
	}
}
