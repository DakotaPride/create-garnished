package net.dakotapride.garnished.block;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.world.level.block.StairBlock;

public class DragonStoneStairsBlock extends StairBlock {
    public DragonStoneStairsBlock(Properties properties) {
        super(GarnishedBlocks.DRAGON_STONE.get().defaultBlockState(), properties);
    }
}
