package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class DustyRegaleFoodItem extends Item implements IGarnishedItem {
	public DustyRegaleFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.DUSTY_REGALE));
	}
}
