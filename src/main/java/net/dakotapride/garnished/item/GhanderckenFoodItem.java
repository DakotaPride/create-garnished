package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class GhanderckenFoodItem extends Item implements IGarnishedItem {
	public GhanderckenFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.GHANDERCKEN).stacksTo(1));
	}
}
