package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class ShiningDishFoodItem extends Item implements IGarnishedItem {
	public ShiningDishFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.SHINING_DISH).stacksTo(1));
	}
}
