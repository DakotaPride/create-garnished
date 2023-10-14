package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class MulchItem extends Item implements IGarnishedItem {
	public MulchItem(Properties properties) {
		super(properties.food(GarnishedFoods.MULCH));
	}
}
