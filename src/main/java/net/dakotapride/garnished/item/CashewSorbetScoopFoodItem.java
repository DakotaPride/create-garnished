package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class CashewSorbetScoopFoodItem extends Item implements IGarnishedItem {
	public CashewSorbetScoopFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.CASHEW_SORBET_SCOOP));
	}
}
