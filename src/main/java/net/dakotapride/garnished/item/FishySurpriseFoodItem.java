package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class FishySurpriseFoodItem extends Item implements IGarnishedItem {
	public FishySurpriseFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.FISHY_SURPRISE).stacksTo(1));
	}
}
