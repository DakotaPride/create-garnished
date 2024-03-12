package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class RawPolarBearMeatItem extends Item implements IGarnishedItem {
	public RawPolarBearMeatItem(Properties properties) {
		super(properties.food(GarnishedFoods.RAW_POLAR_BEAR_MEAT));
	}

}
