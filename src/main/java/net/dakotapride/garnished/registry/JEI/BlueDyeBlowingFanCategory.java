package net.dakotapride.garnished.registry.JEI;

import org.jetbrains.annotations.NotNull;

import com.simibubi.create.compat.jei.category.ProcessingViaFanCategory;
import com.simibubi.create.compat.jei.category.animations.AnimatedKinetics;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.minecraft.client.gui.GuiGraphics;

public class BlueDyeBlowingFanCategory extends DyeBlowingFanCategory<BlueDyeBlowingFanRecipe> {
    public BlueDyeBlowingFanCategory(Info<BlueDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.BLUE_MASTIC_RESIN.getSource(), info);
    }

}
