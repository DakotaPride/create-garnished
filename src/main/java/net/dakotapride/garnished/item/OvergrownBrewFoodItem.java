package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class OvergrownBrewFoodItem extends Item implements IGarnishedItem {
	public OvergrownBrewFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.OVERGROWN_BREW).stacksTo(1));
	}
}
