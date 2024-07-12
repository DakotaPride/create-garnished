package net.dakotapride.garnished.registry.JEI;

import org.jetbrains.annotations.NotNull;

import com.simibubi.create.compat.jei.category.ProcessingViaFanCategory;
import com.simibubi.create.compat.jei.category.animations.AnimatedKinetics;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.dakotapride.garnished.recipe.GreenDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.minecraft.client.gui.GuiGraphics;

public class GreenDyeBlowingFanCategory extends DyeBlowingFanCategory<GreenDyeBlowingFanRecipe> {
    public GreenDyeBlowingFanCategory(Info<GreenDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.GREEN_MASTIC_RESIN.getSource(), info);
    }

}
