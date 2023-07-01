package net.dakotapride.garnished.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class HoneyedNutMixItem extends Item {
	public HoneyedNutMixItem(Properties properties) {
		super(properties.food(new FoodProperties.Builder().saturationMod(0.7F).nutrition(12).build()));
	}
}
