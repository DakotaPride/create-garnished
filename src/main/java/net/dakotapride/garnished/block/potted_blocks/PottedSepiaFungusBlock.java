package net.dakotapride.garnished.block.potted_blocks;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class PottedSepiaFungusBlock extends FlowerPotBlock {
    public PottedSepiaFungusBlock(Properties properties) {
        super(GarnishedBlocks.SEPIA_FUNGUS.get(), properties);
    }
}
