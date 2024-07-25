package net.dakotapride.garnished.recipe;

import javax.annotation.ParametersAreNonnullByDefault;

import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;

import net.dakotapride.garnished.registry.GarnishedRecipeTypes;

@ParametersAreNonnullByDefault
public class BlueDyeBlowingFanRecipe extends DyeBlowingFanRecipe {
    public BlueDyeBlowingFanRecipe(ProcessingRecipeBuilder.ProcessingRecipeParams params) {
        super(GarnishedRecipeTypes.BLUE_DYE_BLOWING, params);
    }


}
