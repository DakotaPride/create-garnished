package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.BrownDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class BrownDyeBlowingFanCategory extends DyeBlowingFanCategory<BrownDyeBlowingFanRecipe> {
    public BrownDyeBlowingFanCategory(Info<BrownDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.BROWN_MASTIC_RESIN.getSource(), info);
    }

}
