package net.dakotapride.garnished.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public interface ISpreadableBlock {
    /**
     * @return whether spread can be used on this block
     */
    boolean isValidTarget(BlockGetter pLevel, BlockPos pPos, BlockState pState, boolean pIsClient);

    boolean isSuccess(Level pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState);

    void performSpread(ServerLevel pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState);

    SimpleParticleType getParticle();
}
