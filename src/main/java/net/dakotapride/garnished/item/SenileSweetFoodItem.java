package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class SenileSweetFoodItem extends Item implements IGarnishedUtilities {
	public SenileSweetFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.SENILE_SWEET));
	}
}
