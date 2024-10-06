package net.dakotapride.garnished.block;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.world.level.block.StairBlock;

public class AmberRemnantStairsBlock extends StairBlock {
    public AmberRemnantStairsBlock(Properties properties) {
        super(GarnishedBlocks.AMBER_REMNANT_BLOCK.get().defaultBlockState(), properties);
    }
}
