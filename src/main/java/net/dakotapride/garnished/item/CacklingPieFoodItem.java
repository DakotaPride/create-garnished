package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class CacklingPieFoodItem extends Item implements IGarnishedUtilities {
	public CacklingPieFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.CACKLING_PIE));
	}
}
