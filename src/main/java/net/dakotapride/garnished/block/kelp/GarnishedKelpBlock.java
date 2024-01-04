package net.dakotapride.garnished.block.kelp;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

import org.jetbrains.annotations.NotNull;

import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.KelpBlock;
import net.minecraft.world.level.block.LiquidBlockContainer;

public class GarnishedKelpBlock extends KelpBlock implements LiquidBlockContainer {
    public GarnishedKelpBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected int getBlocksToGrowWhenBonemealed(@NotNull RandomSource random) {
        return random.nextInt(5);
    }

}
