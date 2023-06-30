package net.dakotapride.garnished.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class HoneyedSweetBerriesItem extends Item {
	public HoneyedSweetBerriesItem(Properties properties) {
		super(properties.food(new FoodProperties.Builder().saturationMod(0.5F).nutrition(8).build()));
	}
}
