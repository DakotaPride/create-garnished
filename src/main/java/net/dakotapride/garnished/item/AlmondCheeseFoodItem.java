package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class AlmondCheeseFoodItem extends Item implements IGarnishedItem {
	public AlmondCheeseFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.ALMOND_CHEESE));
	}
}
