package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class AchingTenebrousClumpFoodItem extends Item implements IGarnishedUtilities {
	public AchingTenebrousClumpFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.ACHING_TENEBROUS_CLUMP).stacksTo(16));
	}
}
