package net.dakotapride.garnished.block;

import java.util.Random;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class AbyssalStoneStairsBlock extends StairBlock {
    public AbyssalStoneStairsBlock(Properties properties) {
        super(GarnishedBlocks.ABYSSAL_STONE.get().defaultBlockState(), properties);
    }

    @Override
    public void animateTick(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Random random) {
        SpecialEffectsBlock.Abyssal.getParticles(state, level, pos, random);
    }

    @Override
    public void stepOn(@NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState state, @NotNull Entity entity) {
        SpecialEffectsBlock.Abyssal.getEffects(level, pos, state, entity);

        super.stepOn(level, pos, state, entity);
    }
}
