package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class VenerableDelicacyFoodItem extends Item {
    public VenerableDelicacyFoodItem(Properties properties) {
        super(properties.food(GarnishedFoods.VENERABLE_DELICACY).stacksTo(16));
    }
}
