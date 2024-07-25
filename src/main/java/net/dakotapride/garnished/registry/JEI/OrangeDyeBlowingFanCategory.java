package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.OrangeDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class OrangeDyeBlowingFanCategory extends DyeBlowingFanCategory<OrangeDyeBlowingFanRecipe> {
    public OrangeDyeBlowingFanCategory(Info<OrangeDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.ORANGE_MASTIC_RESIN.getSource(), info);
    }

}
