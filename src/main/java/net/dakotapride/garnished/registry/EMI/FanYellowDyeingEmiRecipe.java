package net.dakotapride.garnished.registry.EMI;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.emi.CreateEmiAnimations;
import com.simibubi.create.compat.emi.recipes.fan.FanEmiRecipe;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.dakotapride.garnished.recipe.YellowDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanYellowDyeingEmiRecipe extends FanEmiRecipe.MultiOutput<YellowDyeBlowingFanRecipe> {
	public FanYellowDyeingEmiRecipe(YellowDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_YELLOW_DYEING, recipe);
	}

	@Override
	protected void renderAttachedBlock(PoseStack graphics) {
		GuiGameElement.of(GarnishedFluids.YELLOW_MASTIC_RESIN.get())
				.scale(SCALE)
				.atLocal(0, 0, 2)
				.lighting(CreateEmiAnimations.DEFAULT_LIGHTING)
				.render(graphics);
	}
}
