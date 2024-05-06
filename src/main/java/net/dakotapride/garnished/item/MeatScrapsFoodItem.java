package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class MeatScrapsFoodItem extends Item implements IGarnishedItem {
	public MeatScrapsFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.MEAT_SCRAPS));
	}
}
