package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.LightBlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class LightBlueDyeBlowingFanCategory extends DyeBlowingFanCategory<LightBlueDyeBlowingFanRecipe> {
    public LightBlueDyeBlowingFanCategory(Info<LightBlueDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.LIGHT_BLUE_MASTIC_RESIN.getSource(), info);
    }

}
