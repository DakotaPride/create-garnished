package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class BambooClodFoodItem extends Item implements IGarnishedUtilities {
	public BambooClodFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.BAMBOO_CLOD));
	}
}
