package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class CookedPolarBearMeatItem extends ConditionalEffectItem implements IGarnishedUtilities {
	public CookedPolarBearMeatItem(Properties properties) {
		super(1, 0.35F, properties.food(GarnishedFoodValues.COOKED_POLAR_BEAR_MEAT));
	}

}
