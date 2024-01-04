package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class VastBrewFoodItem extends Item implements IGarnishedItem {
	public VastBrewFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.VAST_BREW).stacksTo(1));
	}
}
