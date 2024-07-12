package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanPinkDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanPinkDyeingEmiRecipe(BlueDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_PINK_DYEING, recipe, GarnishedFluids.PINK_MASTIC_RESIN.getSource());
	}
}
