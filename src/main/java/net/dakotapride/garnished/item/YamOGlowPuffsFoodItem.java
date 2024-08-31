package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class YamOGlowPuffsFoodItem extends Item implements IGarnishedUtilities {
	public YamOGlowPuffsFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.YAM_O_GLOW_PUFFS));
	}
}
