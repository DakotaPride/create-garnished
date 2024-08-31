package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class ChampionsOmeletteFoodItem extends Item implements IGarnishedUtilities {
	public ChampionsOmeletteFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.CHAMPIONS_OMELETTE).stacksTo(16));
	}
}
