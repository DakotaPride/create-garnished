package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class ShelledDumplingFoodItem extends ConditionalEffectItem implements IGarnishedUtilities {
	public ShelledDumplingFoodItem(Properties properties) {
		super(3, 0.50F, properties.food(GarnishedFoodValues.SHELLED_DUMPLING).stacksTo(16));
	}
}
