package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class ChilledAppleFoodItem extends Item implements IGarnishedUtilities {
	public ChilledAppleFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.CHILLED_APPLE));
	}
}
