package net.dakotapride.garnished.registry.EMI;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.emi.CreateEmiAnimations;
import com.simibubi.create.compat.emi.recipes.fan.FanEmiRecipe;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanGreenDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanGreenDyeingEmiRecipe(GreenDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_GREEN_DYEING, recipe, GarnishedFluids.GREEN_MASTIC_RESIN.get());
	}
}
