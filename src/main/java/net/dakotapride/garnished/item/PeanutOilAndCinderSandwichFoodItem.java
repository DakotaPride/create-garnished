package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class PeanutOilAndCinderSandwichFoodItem extends Item implements IGarnishedItem {
	public PeanutOilAndCinderSandwichFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.PEANUT_OIL_AND_CINDER_SANDWICH).stacksTo(16));
	}
}
