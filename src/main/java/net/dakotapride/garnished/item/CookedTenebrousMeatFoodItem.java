package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class CookedTenebrousMeatFoodItem extends Item implements IGarnishedItem {
	public CookedTenebrousMeatFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.COOKED_TENEBROUS_MEAT));
	}
}
