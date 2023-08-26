package net.dakotapride.garnished.block.sapling;

import net.dakotapride.garnished.gen.BuhgTreeGrower;
import net.dakotapride.garnished.gen.PistachioTreeGrower;
import net.minecraft.world.level.block.SaplingBlock;

public class PistachioSaplingBlock extends SaplingBlock {
	public PistachioSaplingBlock(Properties properties) {
		super(new PistachioTreeGrower(), properties);
	}
}
