package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class WheatGrazeFoodItem extends Item implements IGarnishedUtilities {
	public WheatGrazeFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.WHEAT_GRAZE));
	}
}
