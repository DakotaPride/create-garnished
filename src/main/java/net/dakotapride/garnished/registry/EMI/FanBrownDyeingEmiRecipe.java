package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.BrownDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanBrownDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanBrownDyeingEmiRecipe(BrownDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_BROWN_DYEING, recipe, GarnishedFluids.BROWN_MASTIC_RESIN.get());
	}
}
