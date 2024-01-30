package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class SinopiaRockSweetFoodItem extends Item implements IGarnishedItem {
	public SinopiaRockSweetFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.SINOPIA_ROCK_SWEET).stacksTo(16));
	}
}
