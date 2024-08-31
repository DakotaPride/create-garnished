package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class RawTenebrousMeatFoodItem extends Item implements IGarnishedUtilities {
	public RawTenebrousMeatFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.RAW_TENEBROUS_MEAT));
	}
}
