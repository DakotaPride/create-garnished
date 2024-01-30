package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class PricklyPearStewFoodItem extends Item implements IGarnishedItem {
	public PricklyPearStewFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.PRICKLY_PEAR_STEW).stacksTo(1));
	}
}
