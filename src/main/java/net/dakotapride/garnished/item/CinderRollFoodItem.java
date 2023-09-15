package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class CinderRollFoodItem extends Item implements IGarnishedItem {
	public CinderRollFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.CINDER_ROLL).stacksTo(16));
	}
}
