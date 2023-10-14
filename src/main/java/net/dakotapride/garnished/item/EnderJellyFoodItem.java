package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class EnderJellyFoodItem extends Item implements IGarnishedItem {
	public EnderJellyFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.ENDER_JELLY));
	}
}
