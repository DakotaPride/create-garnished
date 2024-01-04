package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class BewilderedPastryFoodItem extends Item implements IGarnishedItem {
	public BewilderedPastryFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.BEWILDERED_PASTRY).stacksTo(16));
	}
}
