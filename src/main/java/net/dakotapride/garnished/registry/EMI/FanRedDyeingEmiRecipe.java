package net.dakotapride.garnished.registry.EMI;

import com.simibubi.create.compat.emi.CreateEmiAnimations;
import com.simibubi.create.compat.emi.recipes.fan.FanEmiRecipe;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.dakotapride.garnished.recipe.FreezingFanRecipe;
import net.dakotapride.garnished.recipe.RedDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.block.Blocks;

public class FanRedDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanRedDyeingEmiRecipe(RedDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_RED_DYEING, recipe, GarnishedFluids.RED_MASTIC_RESIN.getSource());
	}
}
