package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class NopalitoWrapSupremeFoodItem extends Item implements IGarnishedItem {
	public NopalitoWrapSupremeFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.NOPALITO_WRAP_SUPREME).stacksTo(16));
	}
}
