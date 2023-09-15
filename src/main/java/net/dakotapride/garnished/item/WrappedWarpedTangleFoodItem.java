package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class WrappedWarpedTangleFoodItem extends Item implements IGarnishedItem {
	public WrappedWarpedTangleFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.WRAPPED_WARPED_TANGLE).stacksTo(16));
	}
}
