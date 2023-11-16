package net.dakotapride.garnished.block;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.world.level.block.StairBlock;

public class CarnotiteStairsBlock extends StairBlock {
    public CarnotiteStairsBlock(Properties properties) {
        super(GarnishedBlocks.CARNOTITE.get().defaultBlockState(), properties);
    }
}
