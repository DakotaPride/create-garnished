package net.dakotapride.garnished.block;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class DragonStoneStairsBlock extends StairBlock {
    public DragonStoneStairsBlock(Properties properties) {
        super(GarnishedBlocks.DRAGON_STONE.get().defaultBlockState(), properties);
    }

    @Override
    public void animateTick(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        SpecialEffectsBlock.Wyvern.getParticles(state, level, pos, random);
    }

    @Override
    public void stepOn(@NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState state, @NotNull Entity entity) {
        SpecialEffectsBlock.Wyvern.getEffects(level, pos, state, entity);

        super.stepOn(level, pos, state, entity);
    }
}
