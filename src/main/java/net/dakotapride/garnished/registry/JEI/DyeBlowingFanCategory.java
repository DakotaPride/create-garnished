package net.dakotapride.garnished.registry.JEI;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.jei.category.ProcessingViaFanCategory;
import com.simibubi.create.compat.jei.category.animations.AnimatedKinetics;
import com.simibubi.create.content.processing.recipe.ProcessingRecipe;
import com.simibubi.create.foundation.gui.element.GuiGameElement;
import net.minecraft.world.level.material.Fluid;
import org.jetbrains.annotations.NotNull;

public class DyeBlowingFanCategory<T extends ProcessingRecipe<?>> extends ProcessingViaFanCategory.MultiOutput<T> {
    Fluid fluid;

    public DyeBlowingFanCategory(Fluid fluid0, Info<T> info) {
        super(info);
        this.fluid = fluid0;
    }

    @Override
    protected void renderAttachedBlock(@NotNull PoseStack graphics) {
        GuiGameElement.of(fluid)
                .scale(SCALE)
                .atLocal(0, 0, 2)
                .lighting(AnimatedKinetics.DEFAULT_LIGHTING)
                .render(graphics);
    }
}
