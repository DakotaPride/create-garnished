package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class BewilderedPastryFoodItem extends Item implements IGarnishedUtilities {
	public BewilderedPastryFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.BEWILDERED_PASTRY).stacksTo(16));
	}
}
