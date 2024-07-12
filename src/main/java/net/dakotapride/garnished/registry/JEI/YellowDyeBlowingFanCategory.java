package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.YellowDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class YellowDyeBlowingFanCategory extends DyeBlowingFanCategory<YellowDyeBlowingFanRecipe> {
    public YellowDyeBlowingFanCategory(Info<YellowDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.YELLOW_MASTIC_RESIN.getSource(), info);
    }

}
