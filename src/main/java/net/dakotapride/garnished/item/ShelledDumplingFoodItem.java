package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class ShelledDumplingFoodItem extends Item implements IGarnishedItem {
	public ShelledDumplingFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.SHELLED_DUMPLING).stacksTo(16));
	}
}
