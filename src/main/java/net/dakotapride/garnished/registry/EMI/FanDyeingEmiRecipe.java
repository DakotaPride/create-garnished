package net.dakotapride.garnished.registry.EMI;

import com.simibubi.create.compat.emi.CreateEmiAnimations;
import com.simibubi.create.compat.emi.recipes.fan.FanEmiRecipe;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import dev.emi.emi.api.recipe.EmiRecipeCategory;
import net.dakotapride.garnished.recipe.DyeBlowingFanRecipe;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.material.Fluid;

public class FanDyeingEmiRecipe extends FanEmiRecipe.MultiOutput<DyeBlowingFanRecipe> {
	Fluid fluid;

	public FanDyeingEmiRecipe(EmiRecipeCategory emiRecipeCategory, DyeBlowingFanRecipe recipe, Fluid fluid) {
		super(emiRecipeCategory, recipe);
		this.fluid = fluid;
	}

	@Override
	protected void renderAttachedBlock(GuiGraphics graphics) {
		GuiGameElement.of(fluid)
				.scale(SCALE)
				.atLocal(0, 0, 2)
				.lighting(CreateEmiAnimations.DEFAULT_LIGHTING)
				.render(graphics);
	}
}
