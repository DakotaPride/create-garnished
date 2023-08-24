package net.dakotapride.garnished.block.sapling;

import net.dakotapride.garnished.gen.BuhgTreeGrower;
import net.minecraft.world.level.block.SaplingBlock;

public class WalnutSaplingBlock extends SaplingBlock {
	public WalnutSaplingBlock(Properties properties) {
		super(new BuhgTreeGrower(), properties);
	}
}
