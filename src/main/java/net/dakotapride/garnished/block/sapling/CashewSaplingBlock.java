package net.dakotapride.garnished.block.sapling;

import net.dakotapride.garnished.gen.BuhgTreeGrower;
import net.dakotapride.garnished.gen.CashewTreeGrower;
import net.minecraft.world.level.block.SaplingBlock;

public class CashewSaplingBlock extends SaplingBlock {
	public CashewSaplingBlock(Properties properties) {
		super(new CashewTreeGrower(), properties);
	}
}
