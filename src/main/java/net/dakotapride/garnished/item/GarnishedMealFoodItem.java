package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class GarnishedMealFoodItem extends Item implements IGarnishedItem {
	public GarnishedMealFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.GARNISHED_MEAL).stacksTo(16));
	}

}
