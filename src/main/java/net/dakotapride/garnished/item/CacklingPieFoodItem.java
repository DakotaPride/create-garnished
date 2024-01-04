package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class CacklingPieFoodItem extends Item implements IGarnishedItem {
	public CacklingPieFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.CACKLING_PIE));
	}
}
