package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class NopalitoWrapFoodItem extends Item implements IGarnishedItem {
	public NopalitoWrapFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.NOPALITO_WRAP).stacksTo(16));
	}
}
