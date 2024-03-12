package net.dakotapride.garnished.registry.JEI;

import org.jetbrains.annotations.NotNull;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.jei.category.ProcessingViaFanCategory;
import com.simibubi.create.compat.jei.category.animations.AnimatedKinetics;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.dakotapride.garnished.recipe.PurpleDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class PurpleDyeBlowingFanCategory extends ProcessingViaFanCategory.MultiOutput<PurpleDyeBlowingFanRecipe> {
    public PurpleDyeBlowingFanCategory(Info<PurpleDyeBlowingFanRecipe> info) {
        super(info);
    }

    @Override
    protected void renderAttachedBlock(@NotNull PoseStack graphics) {
        GuiGameElement.of(GarnishedFluids.PURPLE_MASTIC_RESIN.get())
                .scale(SCALE)
                .atLocal(0, 0, 2)
                .lighting(AnimatedKinetics.DEFAULT_LIGHTING)
                .render(graphics);
    }

}
