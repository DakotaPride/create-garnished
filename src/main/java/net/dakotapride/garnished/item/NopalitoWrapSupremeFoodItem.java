package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class NopalitoWrapSupremeFoodItem extends ConditionalEffectItem implements IGarnishedUtilities {
	public NopalitoWrapSupremeFoodItem(Properties properties) {
		super(2, 1.0F, properties.food(GarnishedFoodValues.NOPALITO_WRAP_SUPREME).stacksTo(16));
	}
}
