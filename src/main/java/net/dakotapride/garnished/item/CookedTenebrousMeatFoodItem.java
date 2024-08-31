package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class CookedTenebrousMeatFoodItem extends Item implements IGarnishedUtilities {
	public CookedTenebrousMeatFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.COOKED_TENEBROUS_MEAT));
	}
}
