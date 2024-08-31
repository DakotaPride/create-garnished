package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class PricklyPearFoodItem extends Item implements IGarnishedUtilities {
	public PricklyPearFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.PRICKLY_PEAR));
	}
}
