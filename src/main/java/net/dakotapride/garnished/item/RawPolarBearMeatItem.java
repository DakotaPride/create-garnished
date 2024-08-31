package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class RawPolarBearMeatItem extends Item implements IGarnishedUtilities {
	public RawPolarBearMeatItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.RAW_POLAR_BEAR_MEAT));
	}

}
