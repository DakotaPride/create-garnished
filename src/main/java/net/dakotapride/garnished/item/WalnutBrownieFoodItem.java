package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class WalnutBrownieFoodItem extends Item implements IGarnishedUtilities {
	public WalnutBrownieFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.WALNUT_BROWNIE));
	}
}
