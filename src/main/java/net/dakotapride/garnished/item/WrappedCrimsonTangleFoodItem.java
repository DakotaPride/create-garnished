package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class WrappedCrimsonTangleFoodItem extends Item implements IGarnishedItem {
	public WrappedCrimsonTangleFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.WRAPPED_CRIMSON_TANGLE).stacksTo(16));
	}
}
