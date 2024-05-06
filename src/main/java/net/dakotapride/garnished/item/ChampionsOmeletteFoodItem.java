package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class ChampionsOmeletteFoodItem extends Item implements IGarnishedItem {
	public ChampionsOmeletteFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.CHAMPIONS_OMELETTE).stacksTo(16));
	}
}
