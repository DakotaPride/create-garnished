package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class PeanutOilAndCinderSandwichFoodItem extends Item implements IGarnishedUtilities {
	public PeanutOilAndCinderSandwichFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.PEANUT_OIL_AND_CINDER_SANDWICH).stacksTo(16));
	}
}
