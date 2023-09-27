package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class SenileSweetFoodItem extends Item implements IGarnishedItem {
	public SenileSweetFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.SENILE_SWEET));
	}
}
