package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class BambooClodFoodItem extends Item implements IGarnishedItem {
	public BambooClodFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.BAMBOO_CLOD));
	}
}
