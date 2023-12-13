package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class RawTenebrousMeatFoodItem extends Item implements IGarnishedItem {
	public RawTenebrousMeatFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.RAW_TENEBROUS_MEAT));
	}
}
