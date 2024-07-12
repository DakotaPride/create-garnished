package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.CyanDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class CyanDyeBlowingFanCategory extends DyeBlowingFanCategory<CyanDyeBlowingFanRecipe> {
    public CyanDyeBlowingFanCategory(Info<CyanDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.CYAN_MASTIC_RESIN.getSource(), info);
    }

}
