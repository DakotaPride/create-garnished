package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.BlackDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class BlackDyeBlowingFanCategory extends DyeBlowingFanCategory<BlackDyeBlowingFanRecipe> {
    public BlackDyeBlowingFanCategory(Info<BlackDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.BLACK_MASTIC_RESIN.getSource(), info);
    }

}
