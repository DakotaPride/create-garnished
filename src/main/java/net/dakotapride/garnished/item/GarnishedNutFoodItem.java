package net.dakotapride.garnished.item;

import net.dakotapride.garnished.item.GarnishedFoodItem;
import net.minecraft.world.food.FoodProperties;

public class GarnishedNutFoodItem extends GarnishedFoodItem {
	public GarnishedNutFoodItem(Properties properties) {
		super(properties.food(new FoodProperties.Builder().saturationMod(0.2F).nutrition(3).build()));
	}
}
