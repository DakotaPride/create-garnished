package net.dakotapride.garnished.block.nut;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.world.level.block.StairBlock;

public class NutStairsBlock extends StairBlock {
	public NutStairsBlock(Properties properties) {
		super(GarnishedBlocks.NUT_PLANKS.getDefaultState(), properties);
	}
}
