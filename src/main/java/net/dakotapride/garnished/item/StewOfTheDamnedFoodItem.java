package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class StewOfTheDamnedFoodItem extends Item implements IGarnishedItem {
	public StewOfTheDamnedFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.STEW_OF_THE_DAMNED).stacksTo(1));
	}
}
