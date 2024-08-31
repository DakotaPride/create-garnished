package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class CookedPolarBearMeatItem extends Item implements IGarnishedUtilities {
	public CookedPolarBearMeatItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.COOKED_POLAR_BEAR_MEAT));
	}

}
