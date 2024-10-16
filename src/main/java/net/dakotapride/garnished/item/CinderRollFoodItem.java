package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class CinderRollFoodItem extends ConditionalEffectItem implements IGarnishedUtilities {
	public CinderRollFoodItem(Properties properties) {
		super(5, 1.0F, properties.food(GarnishedFoodValues.CINDER_ROLL).stacksTo(16));
	}
}
