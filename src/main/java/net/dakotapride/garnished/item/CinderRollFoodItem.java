package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class CinderRollFoodItem extends Item implements IGarnishedUtilities {
	public CinderRollFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.CINDER_ROLL).stacksTo(16));
	}
}
