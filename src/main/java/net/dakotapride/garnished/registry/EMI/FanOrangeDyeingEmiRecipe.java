package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.OrangeDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanOrangeDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanOrangeDyeingEmiRecipe(OrangeDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_ORANGE_DYEING, recipe, GarnishedFluids.ORANGE_MASTIC_RESIN.getSource());
	}

}
