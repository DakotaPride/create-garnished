package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class NutNachoFoodItem extends Item implements IGarnishedItem {
	public NutNachoFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.NUT_NACHO));
	}
}
