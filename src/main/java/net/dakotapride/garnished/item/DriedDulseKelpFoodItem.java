package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class DriedDulseKelpFoodItem extends Item implements IGarnishedItem {
	public DriedDulseKelpFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.DRIED_DULSE_KELP));
	}
}
