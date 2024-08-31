package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class AlmondCheeseFoodItem extends Item implements IGarnishedUtilities {
	public AlmondCheeseFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.ALMOND_CHEESE));
	}
}
