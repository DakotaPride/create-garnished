package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class CashewCookieFoodItem extends Item implements IGarnishedUtilities {
	public CashewCookieFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.CASHEW_COOKIE));
	}
}
