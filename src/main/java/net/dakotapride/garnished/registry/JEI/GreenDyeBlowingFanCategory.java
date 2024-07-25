package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class GreenDyeBlowingFanCategory extends DyeBlowingFanCategory<GreenDyeBlowingFanRecipe> {
    public GreenDyeBlowingFanCategory(Info<GreenDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.GREEN_MASTIC_RESIN.getSource(), info);
    }

}
