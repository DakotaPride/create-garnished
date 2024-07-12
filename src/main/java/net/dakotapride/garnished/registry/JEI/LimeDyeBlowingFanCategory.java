package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.LimeDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class LimeDyeBlowingFanCategory extends DyeBlowingFanCategory<LimeDyeBlowingFanRecipe> {
    public LimeDyeBlowingFanCategory(Info<LimeDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.LIME_MASTIC_RESIN.getSource(), info);
    }

}
