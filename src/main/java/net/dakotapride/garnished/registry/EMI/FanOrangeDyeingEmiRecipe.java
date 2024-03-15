package net.dakotapride.garnished.registry.EMI;

import com.simibubi.create.compat.emi.CreateEmiAnimations;
import com.simibubi.create.compat.emi.recipes.fan.FanEmiRecipe;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.dakotapride.garnished.recipe.OrangeDyeBlowingFanRecipe;
import net.dakotapride.garnished.recipe.RedDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.minecraft.client.gui.GuiGraphics;

public class FanOrangeDyeingEmiRecipe extends FanEmiRecipe.MultiOutput<OrangeDyeBlowingFanRecipe> {
	public FanOrangeDyeingEmiRecipe(OrangeDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_ORANGE_DYEING, recipe);
	}

	@Override
	protected void renderAttachedBlock(GuiGraphics graphics) {
		GuiGameElement.of(GarnishedFluids.ORANGE_MASTIC_RESIN.get())
				.scale(SCALE)
				.atLocal(0, 0, 2)
				.lighting(CreateEmiAnimations.DEFAULT_LIGHTING)
				.render(graphics);
	}
}
