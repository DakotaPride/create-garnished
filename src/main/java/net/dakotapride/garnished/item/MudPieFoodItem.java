package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class MudPieFoodItem extends Item implements IGarnishedItem {
	public MudPieFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.MUD_PIE));
	}
}
