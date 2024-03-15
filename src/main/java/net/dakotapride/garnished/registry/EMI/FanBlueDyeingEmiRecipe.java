package net.dakotapride.garnished.registry.EMI;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.emi.CreateEmiAnimations;
import com.simibubi.create.compat.emi.recipes.fan.FanEmiRecipe;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanBlueDyeingEmiRecipe extends FanEmiRecipe.MultiOutput<BlueDyeBlowingFanRecipe> {
	public FanBlueDyeingEmiRecipe(BlueDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_BLUE_DYEING, recipe);
	}

	@Override
	protected void renderAttachedBlock(PoseStack graphics) {
		GuiGameElement.of(GarnishedFluids.BLUE_MASTIC_RESIN.get())
				.scale(SCALE)
				.atLocal(0, 0, 2)
				.lighting(CreateEmiAnimations.DEFAULT_LIGHTING)
				.render(graphics);
	}
}
