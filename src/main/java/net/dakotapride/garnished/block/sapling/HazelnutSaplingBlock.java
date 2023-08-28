package net.dakotapride.garnished.block.sapling;

import net.dakotapride.garnished.gen.BuhgTreeGrower;
import net.dakotapride.garnished.gen.HazelnutTreeGrower;
import net.minecraft.world.level.block.SaplingBlock;

public class HazelnutSaplingBlock extends SaplingBlock {
	public HazelnutSaplingBlock(Properties properties) {
		super(new HazelnutTreeGrower(), properties);
	}
}
