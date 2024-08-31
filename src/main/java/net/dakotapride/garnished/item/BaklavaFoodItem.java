package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class BaklavaFoodItem extends Item {
    public BaklavaFoodItem(Properties properties) {
        super(properties.stacksTo(16).food(GarnishedFoodValues.BAKLAVA));
    }
}
