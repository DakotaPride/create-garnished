package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.PinkDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanPinkDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanPinkDyeingEmiRecipe(PinkDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_PINK_DYEING, recipe, GarnishedFluids.PINK_MASTIC_RESIN.get());
	}
}
