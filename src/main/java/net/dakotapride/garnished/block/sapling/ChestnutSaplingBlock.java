package net.dakotapride.garnished.block.sapling;

import net.dakotapride.garnished.gen.ChestnutTreeGrower;
import net.minecraft.world.level.block.SaplingBlock;

public class ChestnutSaplingBlock extends SaplingBlock {
	public ChestnutSaplingBlock(Properties properties) {
		super(new ChestnutTreeGrower(), properties);
	}
}
