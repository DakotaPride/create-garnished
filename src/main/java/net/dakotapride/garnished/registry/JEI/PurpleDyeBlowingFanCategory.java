package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.PurpleDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class PurpleDyeBlowingFanCategory extends DyeBlowingFanCategory<PurpleDyeBlowingFanRecipe> {
    public PurpleDyeBlowingFanCategory(Info<PurpleDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.PURPLE_MASTIC_RESIN.getSource(), info);
    }

}
