package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.CyanDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanCyanDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanCyanDyeingEmiRecipe(CyanDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_CYAN_DYEING, recipe, GarnishedFluids.CYAN_MASTIC_RESIN.get());
	}
}
