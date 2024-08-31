package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class PiquantPretzelFoodItem extends Item implements IGarnishedUtilities {
	public PiquantPretzelFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.PIQUANT_PRETZEL).stacksTo(16));
	}
}
