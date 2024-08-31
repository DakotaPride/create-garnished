package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class MulchItem extends Item implements IGarnishedUtilities {
	public MulchItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.MULCH));
	}
}
