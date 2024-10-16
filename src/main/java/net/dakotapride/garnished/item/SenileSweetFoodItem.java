package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class SenileSweetFoodItem extends ConditionalEffectItem implements IGarnishedUtilities {
	public SenileSweetFoodItem(Properties properties) {
		super(0, 1.0F, properties.food(GarnishedFoodValues.SENILE_SWEET));
	}

}
