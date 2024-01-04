package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class DriedVermilionKelpFoodItem extends Item implements IGarnishedItem {
	public DriedVermilionKelpFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.DRIED_VERMILION_KELP));
	}
}
