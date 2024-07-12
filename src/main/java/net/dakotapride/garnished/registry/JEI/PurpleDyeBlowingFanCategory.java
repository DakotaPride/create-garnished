package net.dakotapride.garnished.registry.JEI;

import net.dakotapride.garnished.recipe.PinkDyeBlowingFanRecipe;

import org.jetbrains.annotations.NotNull;

import com.simibubi.create.compat.jei.category.ProcessingViaFanCategory;
import com.simibubi.create.compat.jei.category.animations.AnimatedKinetics;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.dakotapride.garnished.recipe.PurpleDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.minecraft.client.gui.GuiGraphics;

public class PurpleDyeBlowingFanCategory extends DyeBlowingFanCategory<PurpleDyeBlowingFanRecipe> {
	public PurpleDyeBlowingFanCategory(Info<PurpleDyeBlowingFanRecipe> info) {
		super(GarnishedFluids.PURPLE_MASTIC_RESIN.getSource(), info);
	}

}
