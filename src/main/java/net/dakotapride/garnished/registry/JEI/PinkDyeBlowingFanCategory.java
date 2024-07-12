package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.PinkDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class PinkDyeBlowingFanCategory extends DyeBlowingFanCategory<PinkDyeBlowingFanRecipe> {
    public PinkDyeBlowingFanCategory(Info<PinkDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.PINK_MASTIC_RESIN.getSource(), info);
    }

}
