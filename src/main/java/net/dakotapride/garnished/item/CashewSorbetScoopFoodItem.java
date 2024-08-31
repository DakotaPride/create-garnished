package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class CashewSorbetScoopFoodItem extends Item implements IGarnishedUtilities {
	public CashewSorbetScoopFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.CASHEW_SORBET_SCOOP));
	}
}
