package net.dakotapride.garnished.recipe;

import javax.annotation.ParametersAreNonnullByDefault;

import com.simibubi.create.content.processing.recipe.ProcessingRecipe;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;

import net.dakotapride.garnished.registry.GarnishedRecipeTypes;
import net.minecraft.world.level.Level;
import io.github.fabricators_of_create.porting_lib.transfer.item.ItemStackHandler;
import io.github.fabricators_of_create.porting_lib.transfer.item.RecipeWrapper;

@ParametersAreNonnullByDefault
public class GreenDyeBlowingFanRecipe extends ProcessingRecipe<GreenDyeBlowingFanRecipe.GreenDyeBlowingWrapper> {

    public GreenDyeBlowingFanRecipe(ProcessingRecipeBuilder.ProcessingRecipeParams params) {
        super(GarnishedRecipeTypes.GREEN_DYE_BLOWING, params);
    }

    @Override
    public boolean matches(GreenDyeBlowingWrapper inv, Level worldIn) {
        if (inv.isEmpty())
            return false;
        return ingredients.get(0)
                .test(inv.getItem(0));
    }

    @Override
    protected int getMaxInputCount() {
        return 1;
    }

    @Override
    protected int getMaxOutputCount() {
        return 12;
    }

    public static class GreenDyeBlowingWrapper extends RecipeWrapper {
        public GreenDyeBlowingWrapper() {
            super(new ItemStackHandler(1));
        }
    }

}
