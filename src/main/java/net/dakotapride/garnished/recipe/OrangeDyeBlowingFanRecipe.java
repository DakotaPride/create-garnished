package net.dakotapride.garnished.recipe;

import javax.annotation.ParametersAreNonnullByDefault;

import com.simibubi.create.content.processing.recipe.ProcessingRecipe;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;

import io.github.fabricators_of_create.porting_lib.transfer.item.ItemStackHandler;
import io.github.fabricators_of_create.porting_lib.transfer.item.RecipeWrapper;
import net.dakotapride.garnished.registry.GarnishedRecipeTypes;
import net.minecraft.world.level.Level;

@ParametersAreNonnullByDefault
public class OrangeDyeBlowingFanRecipe extends ProcessingRecipe<OrangeDyeBlowingFanRecipe.OrangeDyeBlowingWrapper> {

    public OrangeDyeBlowingFanRecipe(ProcessingRecipeBuilder.ProcessingRecipeParams params) {
        super(GarnishedRecipeTypes.ORANGE_DYE_BLOWING, params);
    }

    @Override
    public boolean matches(OrangeDyeBlowingWrapper inv, Level worldIn) {
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

    public static class OrangeDyeBlowingWrapper extends RecipeWrapper {
        public OrangeDyeBlowingWrapper() {
            super(new ItemStackHandler(1));
        }
    }

}
