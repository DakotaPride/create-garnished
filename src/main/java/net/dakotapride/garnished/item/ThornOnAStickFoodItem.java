package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class ThornOnAStickFoodItem extends Item implements IGarnishedItem {
	public ThornOnAStickFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.THORN_ON_A_STICK).stacksTo(16));
	}
}
