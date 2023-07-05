package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class AppleCiderFoodItem extends Item {
	public AppleCiderFoodItem(Properties properties) {
		super(properties.stacksTo(8).food(GarnishedFoods.APPLE_CIDER));
	}
}
