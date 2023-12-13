package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class AchingTenebrousClumpFoodItem extends Item implements IGarnishedItem {
	public AchingTenebrousClumpFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.ACHING_TENEBROUS_CLUMP).stacksTo(16));
	}
}
