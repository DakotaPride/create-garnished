package net.dakotapride.garnished.block;

import org.jetbrains.annotations.NotNull;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;

public class UnstableStoneWallBlock extends WallBlock {
    public UnstableStoneWallBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void stepOn(@NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState state, @NotNull Entity entity) {
        SpecialEffectsBlock.Unstable.getEffects(level, pos, state, entity);

        super.stepOn(level, pos, state, entity);
    }
}
