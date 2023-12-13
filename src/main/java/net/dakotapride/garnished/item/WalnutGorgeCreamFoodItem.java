package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class WalnutGorgeCreamFoodItem extends Item implements IGarnishedItem {
	public WalnutGorgeCreamFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.WALNUT_GORGE_CREAM).stacksTo(1));
	}
}
