package net.dakotapride.garnished.block;

import java.util.Random;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SeagrassBlock;
import net.minecraft.world.level.block.state.BlockState;

public class VoltaicSeagrassBlock extends SeagrassBlock {
    public VoltaicSeagrassBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull ItemStack getCloneItemStack(@NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull BlockState state) {
        return GarnishedBlocks.VOLTAIC_SEA_GRASS.asStack();
    }

    @Override
    public boolean isValidBonemealTarget(@NotNull BlockGetter pLevel, @NotNull BlockPos pPos, @NotNull BlockState pState, boolean pIsClient) {
        return false;
    }

    @Override
    public boolean isBonemealSuccess(@NotNull Level level, @NotNull Random random, @NotNull BlockPos pos, @NotNull BlockState state) {
        return false;
    }

    @Override
    public void performBonemeal(@NotNull ServerLevel level, @NotNull Random random, @NotNull BlockPos pos, @NotNull BlockState state) {}
}
