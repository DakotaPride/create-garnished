package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class ThornOnAStickFoodItem extends ConditionalEffectItem implements IGarnishedUtilities {
	public ThornOnAStickFoodItem(Properties properties) {
		super(2, 1.0F, properties.food(GarnishedFoodValues.THORN_ON_A_STICK).stacksTo(16));
	}
}
