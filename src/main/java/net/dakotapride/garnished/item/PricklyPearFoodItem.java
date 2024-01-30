package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class PricklyPearFoodItem extends Item implements IGarnishedItem {
	public PricklyPearFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.PRICKLY_PEAR));
	}
}
