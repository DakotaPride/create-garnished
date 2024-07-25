package net.dakotapride.garnished.recipe;

import javax.annotation.ParametersAreNonnullByDefault;

import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;

import net.dakotapride.garnished.registry.GarnishedRecipeTypes;

@ParametersAreNonnullByDefault
public class LimeDyeBlowingFanRecipe extends DyeBlowingFanRecipe {
    public LimeDyeBlowingFanRecipe(ProcessingRecipeBuilder.ProcessingRecipeParams params) {
        super(GarnishedRecipeTypes.LIME_DYE_BLOWING, params);
    }


}
