package net.dakotapride.garnished.recipe;

import javax.annotation.ParametersAreNonnullByDefault;

import com.simibubi.create.content.processing.recipe.ProcessingRecipe;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;

import io.github.fabricators_of_create.porting_lib.transfer.item.ItemStackHandler;
import io.github.fabricators_of_create.porting_lib.transfer.item.RecipeWrapper;
import net.dakotapride.garnished.registry.GarnishedRecipeTypes;
import net.minecraft.world.level.Level;

@ParametersAreNonnullByDefault
public class RedDyeBlowingFanRecipe extends ProcessingRecipe<RedDyeBlowingFanRecipe.RedDyeBlowingWrapper> {

    public RedDyeBlowingFanRecipe(ProcessingRecipeBuilder.ProcessingRecipeParams params) {
        super(GarnishedRecipeTypes.RED_DYE_BLOWING, params);
    }

    @Override
    public boolean matches(RedDyeBlowingWrapper inv, Level worldIn) {
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

    public static class RedDyeBlowingWrapper extends RecipeWrapper {
        public RedDyeBlowingWrapper() {
            super(new ItemStackHandler(1));
        }
    }

}
