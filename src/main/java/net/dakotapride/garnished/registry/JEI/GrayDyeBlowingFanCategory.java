package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.GrayDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class GrayDyeBlowingFanCategory extends DyeBlowingFanCategory<GrayDyeBlowingFanRecipe> {
    public GrayDyeBlowingFanCategory(Info<GrayDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.GRAY_MASTIC_RESIN.getSource(), info);
    }

}
