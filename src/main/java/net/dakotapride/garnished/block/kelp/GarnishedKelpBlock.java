package net.dakotapride.garnished.block.kelp;

import java.util.Random;

import org.jetbrains.annotations.NotNull;

import net.minecraft.world.level.block.KelpBlock;
import net.minecraft.world.level.block.LiquidBlockContainer;

public class GarnishedKelpBlock extends KelpBlock implements LiquidBlockContainer {
    public GarnishedKelpBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected int getBlocksToGrowWhenBonemealed(@NotNull Random random) {
        return random.nextInt(5);
    }

}
