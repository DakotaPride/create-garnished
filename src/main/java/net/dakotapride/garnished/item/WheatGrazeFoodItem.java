package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class WheatGrazeFoodItem extends Item implements IGarnishedItem {
	public WheatGrazeFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.WHEAT_GRAZE));
	}
}
