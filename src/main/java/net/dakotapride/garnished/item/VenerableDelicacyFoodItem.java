package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class VenerableDelicacyFoodItem extends Item {
    public VenerableDelicacyFoodItem(Properties properties) {
        super(properties.food(GarnishedFoodValues.VENERABLE_DELICACY).stacksTo(16));
    }
}
