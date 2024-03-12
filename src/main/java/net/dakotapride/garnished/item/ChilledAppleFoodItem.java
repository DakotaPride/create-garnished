package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class ChilledAppleFoodItem extends Item implements IGarnishedItem {
	public ChilledAppleFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.CHILLED_APPLE));
	}
}
