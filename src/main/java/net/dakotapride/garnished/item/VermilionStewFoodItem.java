package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class VermilionStewFoodItem extends Item implements IGarnishedItem {
	public VermilionStewFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.VERMILION_STEW).stacksTo(1));
	}
}
