package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.LightBlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanLightBlueDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanLightBlueDyeingEmiRecipe(LightBlueDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_LIGHT_BLUE_DYEING, recipe, GarnishedFluids.LIGHT_BLUE_MASTIC_RESIN.get());
	}
}
