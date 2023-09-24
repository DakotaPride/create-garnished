package net.dakotapride.garnished.block;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.dakotapride.garnished.registry.GarnishedSetTypes;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class SepiaStairsBlock extends StairBlock {
	public SepiaStairsBlock(Properties properties) {
		super(GarnishedBlocks.SEPIA_PLANKS.getDefaultState(), properties);
	}
}
