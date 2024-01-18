package net.dakotapride.garnished.block;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.world.level.block.StairBlock;

public class RitualisticStoneStairsBlock extends StairBlock {
    public RitualisticStoneStairsBlock(Properties properties) {
        super(GarnishedBlocks.RITUALISTIC_STONE.get().defaultBlockState(), properties);
    }
}
