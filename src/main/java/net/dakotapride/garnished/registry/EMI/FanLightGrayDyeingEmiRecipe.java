package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanLightGrayDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanLightGrayDyeingEmiRecipe(BlueDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_LIGHT_GRAY_DYEING, recipe, GarnishedFluids.LIGHT_GRAY_MASTIC_RESIN.getSource());
	}
}
