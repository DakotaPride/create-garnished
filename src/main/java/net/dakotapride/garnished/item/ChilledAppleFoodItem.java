package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class ChilledAppleFoodItem extends ConditionalEffectItem implements IGarnishedUtilities {
	public ChilledAppleFoodItem(Properties properties) {
		super(1, 0.50F, properties.food(GarnishedFoodValues.CHILLED_APPLE));
	}
}
