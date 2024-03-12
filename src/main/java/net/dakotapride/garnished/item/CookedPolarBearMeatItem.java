package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class CookedPolarBearMeatItem extends Item implements IGarnishedItem {
	public CookedPolarBearMeatItem(Properties properties) {
		super(properties.food(GarnishedFoods.COOKED_POLAR_BEAR_MEAT));
	}

}
