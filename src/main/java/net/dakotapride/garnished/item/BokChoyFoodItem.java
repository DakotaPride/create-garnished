package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class BokChoyFoodItem extends Item implements IGarnishedUtilities {
	public BokChoyFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.BOK_CHOY));
	}
}
