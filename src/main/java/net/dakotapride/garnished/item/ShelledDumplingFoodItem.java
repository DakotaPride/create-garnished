package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class ShelledDumplingFoodItem extends Item implements IGarnishedUtilities {
	public ShelledDumplingFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.SHELLED_DUMPLING).stacksTo(16));
	}
}
