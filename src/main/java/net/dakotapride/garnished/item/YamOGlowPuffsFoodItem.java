package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class YamOGlowPuffsFoodItem extends Item implements IGarnishedItem {
	public YamOGlowPuffsFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.YAM_O_GLOW_PUFFS));
	}
}
