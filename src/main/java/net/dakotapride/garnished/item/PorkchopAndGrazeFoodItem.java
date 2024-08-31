package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class PorkchopAndGrazeFoodItem extends Item implements IGarnishedUtilities {
	public PorkchopAndGrazeFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.PORKCHOP_AND_GRAZE));
	}
}
