package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class GloomyGatheringFoodItem extends Item implements IGarnishedItem {
	public GloomyGatheringFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.GLOOMY_GATHERING).stacksTo(1));
	}
}
