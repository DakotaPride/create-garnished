package net.dakotapride.garnished.block.sapling;

import net.dakotapride.garnished.gen.BuhgTreeGrower;
import net.dakotapride.garnished.gen.MacadamiaTreeGrower;
import net.minecraft.world.level.block.SaplingBlock;

public class MacadamiaSaplingBlock extends SaplingBlock {
	public MacadamiaSaplingBlock(Properties properties) {
		super(new MacadamiaTreeGrower(), properties);
	}
}
