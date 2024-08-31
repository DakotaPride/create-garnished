package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class SlimeDropFoodItem extends Item {
    public SlimeDropFoodItem(Properties properties) {
        super(properties.food(GarnishedFoodValues.SLIME_DROP).stacksTo(16));
    }
}
