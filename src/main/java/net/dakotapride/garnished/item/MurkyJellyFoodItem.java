package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class MurkyJellyFoodItem extends Item implements IGarnishedItem {
	public MurkyJellyFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.MURKY_JELLY));
	}
}
