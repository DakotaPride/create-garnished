package net.dakotapride.garnished.block;

import org.jetbrains.annotations.NotNull;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;

public class DragonStoneWallBlock extends WallBlock {
    public DragonStoneWallBlock(Properties properties) {
        super(properties);
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
