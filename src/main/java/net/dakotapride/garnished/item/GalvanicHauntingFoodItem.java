package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class GalvanicHauntingFoodItem extends Item implements IGarnishedItem {
	public GalvanicHauntingFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.GALVANIC_HAUNTING).stacksTo(1));
	}
}
