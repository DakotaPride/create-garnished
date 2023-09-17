package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class FermentedCashewMixtureItem extends Item implements IGarnishedItem {
	public FermentedCashewMixtureItem(Properties properties) {
		super(properties.food(GarnishedFoods.FERMENTED_CASHEW_MIXTURE));
	}
}
