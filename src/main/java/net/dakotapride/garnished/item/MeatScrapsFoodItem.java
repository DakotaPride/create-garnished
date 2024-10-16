package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class MeatScrapsFoodItem extends ConditionalEffectItem implements IGarnishedUtilities {
	public MeatScrapsFoodItem(Properties properties) {
		super(4, 1.0F, properties.food(GarnishedFoodValues.MEAT_SCRAPS));
	}
}
