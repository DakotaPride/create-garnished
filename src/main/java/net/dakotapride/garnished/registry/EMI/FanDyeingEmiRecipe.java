package net.dakotapride.garnished.registry.EMI;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.emi.CreateEmiAnimations;
import com.simibubi.create.compat.emi.recipes.fan.FanEmiRecipe;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import dev.emi.emi.api.recipe.EmiRecipeCategory;
import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.DyeBlowingFanRecipe;
import net.minecraft.world.level.material.Fluid;

public class FanDyeingEmiRecipe extends FanEmiRecipe.MultiOutput<DyeBlowingFanRecipe> {
	DyeBlowingFanRecipe recipe;
	EmiRecipeCategory category;
	Fluid fluid;

	public FanDyeingEmiRecipe(EmiRecipeCategory type, DyeBlowingFanRecipe recipe, Fluid fluid) {
		super(type, recipe);
		this.recipe = recipe;
		this.category = type;
		this.fluid = fluid;
	}

	@Override
	protected void renderAttachedBlock(PoseStack graphics) {
		GuiGameElement.of(fluid)
				.scale(SCALE)
				.atLocal(0, 0, 2)
				.lighting(CreateEmiAnimations.DEFAULT_LIGHTING)
				.render(graphics);
	}
}
