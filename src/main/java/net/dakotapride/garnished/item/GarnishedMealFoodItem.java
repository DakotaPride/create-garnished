package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class GarnishedMealFoodItem extends Item implements IGarnishedUtilities {
	public GarnishedMealFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.GARNISHED_MEAL).stacksTo(16));
	}

}
