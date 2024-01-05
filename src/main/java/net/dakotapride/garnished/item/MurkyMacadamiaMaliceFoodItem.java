package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class MurkyMacadamiaMaliceFoodItem extends Item implements IGarnishedItem {
	public MurkyMacadamiaMaliceFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.MURKY_MACADAMIA_MALICE).stacksTo(1));
	}
}
