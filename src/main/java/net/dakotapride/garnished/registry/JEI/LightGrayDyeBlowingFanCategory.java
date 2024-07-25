package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.LightGrayDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class LightGrayDyeBlowingFanCategory extends DyeBlowingFanCategory<LightGrayDyeBlowingFanRecipe> {
    public LightGrayDyeBlowingFanCategory(Info<LightGrayDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.LIGHT_GRAY_MASTIC_RESIN.getSource(), info);
    }

}
