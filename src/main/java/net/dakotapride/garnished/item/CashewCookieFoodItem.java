package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class CashewCookieFoodItem extends Item implements IGarnishedItem {
	public CashewCookieFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.CASHEW_COOKIE));
	}
}
