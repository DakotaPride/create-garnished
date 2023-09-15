package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class WeepingTangleFoodItem extends Item implements IGarnishedItem {
	public WeepingTangleFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.WEEPING_TANGLE).stacksTo(16));
	}
}
