package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class NopalitoWrapSupremeFoodItem extends Item implements IGarnishedUtilities {
	public NopalitoWrapSupremeFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.NOPALITO_WRAP_SUPREME).stacksTo(16));
	}
}
