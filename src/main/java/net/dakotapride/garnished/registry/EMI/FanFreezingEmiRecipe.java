package net.dakotapride.garnished.registry.EMI;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.emi.CreateEmiAnimations;
import com.simibubi.create.compat.emi.recipes.fan.FanEmiRecipe;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.dakotapride.garnished.recipe.FreezingFanRecipe;
import net.minecraft.world.level.block.Blocks;

public class FanFreezingEmiRecipe extends FanEmiRecipe.MultiOutput<FreezingFanRecipe> {
	public FanFreezingEmiRecipe(FreezingFanRecipe recipe) {
		super(GarnishedEMI.FAN_FREEZING, recipe);
	}

	@Override
	protected void renderAttachedBlock(PoseStack graphics) {
		GuiGameElement.of(Blocks.POWDER_SNOW.defaultBlockState())
				.scale(SCALE)
				.atLocal(0, 0, 2)
				.lighting(CreateEmiAnimations.DEFAULT_LIGHTING)
				.render(graphics);
	}
}
