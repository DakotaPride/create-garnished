package net.dakotapride.garnished.registry.JEI;

import org.jetbrains.annotations.NotNull;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.jei.category.ProcessingViaFanCategory;
import com.simibubi.create.compat.jei.category.animations.AnimatedKinetics;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.dakotapride.garnished.recipe.YellowDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class YellowDyeBlowingFanCategory extends ProcessingViaFanCategory.MultiOutput<YellowDyeBlowingFanRecipe> {
    public YellowDyeBlowingFanCategory(Info<YellowDyeBlowingFanRecipe> info) {
        super(info);
    }

    @Override
    protected void renderAttachedBlock(@NotNull PoseStack graphics) {
        GuiGameElement.of(GarnishedFluids.YELLOW_MASTIC_RESIN.get())
                .scale(SCALE)
                .atLocal(0, 0, 2)
                .lighting(AnimatedKinetics.DEFAULT_LIGHTING)
                .render(graphics);
    }

}
