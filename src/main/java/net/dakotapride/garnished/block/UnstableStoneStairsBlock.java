package net.dakotapride.garnished.block;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class UnstableStoneStairsBlock extends StairBlock {
    public UnstableStoneStairsBlock(Properties pProperties) {
        super(GarnishedBlocks.UNSTABLE_STONE.get().defaultBlockState(), pProperties);
    }

    @Override
    public void stepOn(@NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState state, @NotNull Entity entity) {
        SpecialEffectsBlock.Unstable.getEffects(level, pos, state, entity);

        super.stepOn(level, pos, state, entity);
    }
}
