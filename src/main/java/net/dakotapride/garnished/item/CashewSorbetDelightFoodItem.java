package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class CashewSorbetDelightFoodItem extends Item implements IGarnishedItem {
	public CashewSorbetDelightFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.CASHEW_SORBET_DELIGHT).stacksTo(1));
	}
}
