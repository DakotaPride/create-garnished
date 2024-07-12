package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.PurpleDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanPurpleDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanPurpleDyeingEmiRecipe(PurpleDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_PURPLE_DYEING, recipe, GarnishedFluids.PURPLE_MASTIC_RESIN.getSource());
	}
}
