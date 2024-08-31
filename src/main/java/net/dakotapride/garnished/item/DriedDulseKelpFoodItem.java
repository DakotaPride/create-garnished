package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class DriedDulseKelpFoodItem extends Item implements IGarnishedUtilities {
	public DriedDulseKelpFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.DRIED_DULSE_KELP));
	}
}
