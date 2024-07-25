package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.RedDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class RedDyeBlowingFanCategory extends DyeBlowingFanCategory<RedDyeBlowingFanRecipe> {
    public RedDyeBlowingFanCategory(Info<RedDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.RED_MASTIC_RESIN.getSource(), info);
    }

}
