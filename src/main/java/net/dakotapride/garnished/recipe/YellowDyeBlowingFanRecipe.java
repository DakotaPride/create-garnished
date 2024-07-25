package net.dakotapride.garnished.recipe;

import javax.annotation.ParametersAreNonnullByDefault;

import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;

import net.dakotapride.garnished.registry.GarnishedRecipeTypes;

@ParametersAreNonnullByDefault
public class YellowDyeBlowingFanRecipe extends DyeBlowingFanRecipe {

    public YellowDyeBlowingFanRecipe(ProcessingRecipeBuilder.ProcessingRecipeParams params) {
        super(GarnishedRecipeTypes.YELLOW_DYE_BLOWING, params);
    }

}
