package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class MurkyJellyFoodItem extends Item implements IGarnishedUtilities {
	public MurkyJellyFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.MURKY_JELLY));
	}
}
