package net.dakotapride.garnished.registry.EMI;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.emi.CreateEmiAnimations;
import com.simibubi.create.compat.emi.recipes.fan.FanEmiRecipe;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.dakotapride.garnished.recipe.PurpleDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanPurpleDyeingEmiRecipe extends FanEmiRecipe.MultiOutput<PurpleDyeBlowingFanRecipe> {
	public FanPurpleDyeingEmiRecipe(PurpleDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_PURPLE_DYEING, recipe);
	}

	@Override
	protected void renderAttachedBlock(PoseStack graphics) {
		GuiGameElement.of(GarnishedFluids.PURPLE_MASTIC_RESIN.get())
				.scale(SCALE)
				.atLocal(0, 0, 2)
				.lighting(CreateEmiAnimations.DEFAULT_LIGHTING)
				.render(graphics);
	}
}
