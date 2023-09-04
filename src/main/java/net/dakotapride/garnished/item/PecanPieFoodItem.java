package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class PecanPieFoodItem extends Item implements IGarnishedItem {
	public PecanPieFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.PECAN_PIE));
	}
}
