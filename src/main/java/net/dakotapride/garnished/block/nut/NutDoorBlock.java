package net.dakotapride.garnished.block.nut;

import net.dakotapride.garnished.registry.GarnishedSetTypes;
import net.minecraft.world.level.block.DoorBlock;

public class NutDoorBlock extends DoorBlock {
	public NutDoorBlock(Properties properties) {
		super(properties, GarnishedSetTypes.NUT);
	}
}
