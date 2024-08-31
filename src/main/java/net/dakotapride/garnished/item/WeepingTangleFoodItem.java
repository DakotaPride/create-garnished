package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class WeepingTangleFoodItem extends Item implements IGarnishedUtilities {
	public WeepingTangleFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.WEEPING_TANGLE).stacksTo(16));
	}
}
