package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class PiquantPretzelFoodItem extends Item implements IGarnishedItem {
	public PiquantPretzelFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.PIQUANT_PRETZEL).stacksTo(16));
	}
}
