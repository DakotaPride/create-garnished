package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class MoltenStewFoodItem extends Item implements IGarnishedItem {
	public MoltenStewFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.MOLTEN_STEW));
	}
}
