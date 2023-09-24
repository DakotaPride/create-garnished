package net.dakotapride.garnished.block;

import net.dakotapride.garnished.registry.GarnishedSetTypes;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.TrapDoorBlock;

public class SepiaDoorBlock extends DoorBlock {
	public SepiaDoorBlock(Properties properties) {
		super(properties, GarnishedSetTypes.SEPIA);
	}
}
