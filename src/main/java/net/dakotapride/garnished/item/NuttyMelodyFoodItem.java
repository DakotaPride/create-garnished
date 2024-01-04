package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class NuttyMelodyFoodItem extends Item implements IGarnishedItem {
	public NuttyMelodyFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.NUTTY_MELODY).stacksTo(1));
	}
}
