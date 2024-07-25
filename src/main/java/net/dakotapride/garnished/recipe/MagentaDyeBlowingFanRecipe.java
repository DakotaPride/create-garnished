package net.dakotapride.garnished.recipe;

import javax.annotation.ParametersAreNonnullByDefault;

import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;

import net.dakotapride.garnished.registry.GarnishedRecipeTypes;

@ParametersAreNonnullByDefault
public class MagentaDyeBlowingFanRecipe extends DyeBlowingFanRecipe {

    public MagentaDyeBlowingFanRecipe(ProcessingRecipeBuilder.ProcessingRecipeParams params) {
        super(GarnishedRecipeTypes.MAGENTA_DYE_BLOWING, params);
    }

}
