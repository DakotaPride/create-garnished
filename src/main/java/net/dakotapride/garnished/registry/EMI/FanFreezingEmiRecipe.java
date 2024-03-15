package net.dakotapride.garnished.registry.EMI;

import com.simibubi.create.compat.emi.CreateEmiAnimations;
import com.simibubi.create.compat.emi.recipes.fan.FanEmiRecipe;
import com.simibubi.create.compat.jei.category.animations.AnimatedKinetics;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.dakotapride.garnished.recipe.FreezingFanRecipe;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.block.Blocks;

public class FanFreezingEmiRecipe extends FanEmiRecipe.MultiOutput<FreezingFanRecipe> {
	public FanFreezingEmiRecipe(FreezingFanRecipe recipe) {
		super(GarnishedEMI.FAN_FREEZING, recipe);
	}

	@Override
	protected void renderAttachedBlock(GuiGraphics graphics) {
		GuiGameElement.of(Blocks.POWDER_SNOW.defaultBlockState())
				.scale(SCALE)
				.atLocal(0, 0, 2)
				.lighting(CreateEmiAnimations.DEFAULT_LIGHTING)
				.render(graphics);
	}
}
