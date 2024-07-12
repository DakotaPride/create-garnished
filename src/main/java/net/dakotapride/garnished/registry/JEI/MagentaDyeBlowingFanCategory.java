package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.MagentaDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class MagentaDyeBlowingFanCategory extends DyeBlowingFanCategory<MagentaDyeBlowingFanRecipe> {
    public MagentaDyeBlowingFanCategory(Info<MagentaDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.MAGENTA_MASTIC_RESIN.getSource(), info);
    }

}
