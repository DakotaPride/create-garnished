package net.dakotapride.garnished.registry.JEI;

import org.jetbrains.annotations.NotNull;

import com.simibubi.create.compat.jei.category.ProcessingViaFanCategory;
import com.simibubi.create.compat.jei.category.animations.AnimatedKinetics;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.dakotapride.garnished.recipe.RedDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.minecraft.client.gui.GuiGraphics;

public class RedDyeBlowingFanCategory extends DyeBlowingFanCategory<RedDyeBlowingFanRecipe> {
    public RedDyeBlowingFanCategory(Info<RedDyeBlowingFanRecipe> info) {
        super(GarnishedFluids.RED_MASTIC_RESIN.getSource(), info);
    }

}
