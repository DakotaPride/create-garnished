package net.dakotapride.garnished.block.sapling;

import net.dakotapride.garnished.gen.BuhgTreeGrower;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BuhgSaplingBlock extends SaplingBlock {
	public BuhgSaplingBlock(BlockBehaviour.Properties properties) {
		super(new BuhgTreeGrower(), properties);
	}
}
