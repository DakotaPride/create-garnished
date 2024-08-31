package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class ChorusCookieFoodItem extends Item implements IGarnishedUtilities {
	public ChorusCookieFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.CHORUS_COOKIE));
	}
}
