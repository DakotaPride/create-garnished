package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class MuesliFoodItem extends Item implements IGarnishedItem {
	public MuesliFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.MUESLI).stacksTo(1));
	}
}
