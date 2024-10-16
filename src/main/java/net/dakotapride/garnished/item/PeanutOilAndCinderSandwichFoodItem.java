package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class PeanutOilAndCinderSandwichFoodItem extends ConditionalEffectItem implements IGarnishedUtilities {
	public PeanutOilAndCinderSandwichFoodItem(Properties properties) {
		super(5, 0.15F, properties.food(GarnishedFoodValues.PEANUT_OIL_AND_CINDER_SANDWICH).stacksTo(16));
	}
}
