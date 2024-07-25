package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanBlueDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanBlueDyeingEmiRecipe(BlueDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_BLUE_DYEING, recipe, GarnishedFluids.BLUE_MASTIC_RESIN.get());
	}
}
