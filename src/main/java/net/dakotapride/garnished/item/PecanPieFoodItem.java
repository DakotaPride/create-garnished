package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class PecanPieFoodItem extends Item implements IGarnishedUtilities {
	public PecanPieFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.PECAN_PIE));
	}
}
