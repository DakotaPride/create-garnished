package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class ThornOnAStickFoodItem extends Item implements IGarnishedUtilities {
	public ThornOnAStickFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.THORN_ON_A_STICK).stacksTo(16));
	}
}
