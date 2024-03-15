package net.dakotapride.garnished.registry.EMI;

import com.simibubi.create.compat.emi.CreateEmiAnimations;
import com.simibubi.create.compat.emi.recipes.fan.FanEmiRecipe;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.RedDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.minecraft.client.gui.GuiGraphics;

public class FanGreenDyeingEmiRecipe extends FanEmiRecipe.MultiOutput<GreenDyeBlowingFanRecipe> {
	public FanGreenDyeingEmiRecipe(GreenDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_GREEN_DYEING, recipe);
	}

	@Override
	protected void renderAttachedBlock(GuiGraphics graphics) {
		GuiGameElement.of(GarnishedFluids.GREEN_MASTIC_RESIN.get())
				.scale(SCALE)
				.atLocal(0, 0, 2)
				.lighting(CreateEmiAnimations.DEFAULT_LIGHTING)
				.render(graphics);
	}
}
