package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class SinopiaRockSweetFoodItem extends ConditionalEffectItem implements IGarnishedUtilities {
	public SinopiaRockSweetFoodItem(Properties properties) {
		super(2, 0.25F, properties.food(GarnishedFoodValues.SINOPIA_ROCK_SWEET).stacksTo(16));
	}
}
