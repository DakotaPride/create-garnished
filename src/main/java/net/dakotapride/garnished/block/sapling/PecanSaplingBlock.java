package net.dakotapride.garnished.block.sapling;

import net.dakotapride.garnished.gen.BuhgTreeGrower;
import net.dakotapride.garnished.gen.PecanTreeGrower;
import net.minecraft.world.level.block.SaplingBlock;

public class PecanSaplingBlock extends SaplingBlock {
	public PecanSaplingBlock(Properties properties) {
		super(new PecanTreeGrower(), properties);
	}
}
