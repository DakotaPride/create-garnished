package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.WhiteDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class WhiteDyeBlowingFanCategory extends DyeBlowingFanCategory<WhiteDyeBlowingFanRecipe> {
    public WhiteDyeBlowingFanCategory(Info<WhiteDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.WHITE_MASTIC_RESIN.getSource(), info);
    }

}
