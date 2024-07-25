package net.dakotapride.garnished.recipe;

import javax.annotation.ParametersAreNonnullByDefault;

import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;

import net.dakotapride.garnished.registry.GarnishedRecipeTypes;

@ParametersAreNonnullByDefault
public class CyanDyeBlowingFanRecipe extends DyeBlowingFanRecipe {
    public CyanDyeBlowingFanRecipe(ProcessingRecipeBuilder.ProcessingRecipeParams params) {
        super(GarnishedRecipeTypes.CYAN_DYE_BLOWING, params);
    }


}
