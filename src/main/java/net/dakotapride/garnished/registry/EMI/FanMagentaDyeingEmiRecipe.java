package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.MagentaDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanMagentaDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanMagentaDyeingEmiRecipe(MagentaDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_MAGENTA_DYEING, recipe, GarnishedFluids.MAGENTA_MASTIC_RESIN.getSource());
	}
}
