package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class SinopiaRockSweetFoodItem extends Item implements IGarnishedUtilities {
	public SinopiaRockSweetFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.SINOPIA_ROCK_SWEET).stacksTo(16));
	}
}
