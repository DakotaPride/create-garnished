package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class NutNachoBowlFoodItem extends Item implements IGarnishedItem {
	public NutNachoBowlFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.NUT_NACHO_BOWL).stacksTo(16));
	}
}
