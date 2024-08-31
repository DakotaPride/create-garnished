package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class MeatScrapsFoodItem extends Item implements IGarnishedUtilities {
	public MeatScrapsFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.MEAT_SCRAPS));
	}
}
