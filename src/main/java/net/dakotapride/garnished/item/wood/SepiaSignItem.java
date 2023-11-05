package net.dakotapride.garnished.item.wood;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.world.item.SignItem;

public class SepiaSignItem extends SignItem {
	public SepiaSignItem(Properties pProperties) {
		super(pProperties.stacksTo(16), GarnishedBlocks.SEPIA_SIGN.get(), GarnishedBlocks.SEPIA_WALL_SIGN.get());
	}
}
