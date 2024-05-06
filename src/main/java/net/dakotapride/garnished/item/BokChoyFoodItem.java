package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class BokChoyFoodItem extends Item implements IGarnishedItem {
	public BokChoyFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.BOK_CHOY));
	}
}
