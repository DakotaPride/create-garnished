package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class PorkchopAndGrazeFoodItem extends Item implements IGarnishedItem {
	public PorkchopAndGrazeFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.PORKCHOP_AND_GRAZE));
	}
}
