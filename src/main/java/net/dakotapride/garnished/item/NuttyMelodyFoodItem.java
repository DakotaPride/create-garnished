package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class NuttyMelodyFoodItem extends Item implements IGarnishedUtilities {
	public NuttyMelodyFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.NUTTY_MELODY).stacksTo(1));
	}
}
