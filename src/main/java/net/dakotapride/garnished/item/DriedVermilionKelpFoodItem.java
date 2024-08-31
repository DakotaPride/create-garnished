package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class DriedVermilionKelpFoodItem extends Item implements IGarnishedUtilities {
	public DriedVermilionKelpFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.GENERIC_DRIED_KELP));
	}
}
