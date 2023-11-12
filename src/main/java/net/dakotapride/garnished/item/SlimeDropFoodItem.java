package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class SlimeDropFoodItem extends Item {
    public SlimeDropFoodItem(Properties properties) {
        super(properties.food(GarnishedFoods.SLIME_DROP).stacksTo(16));
    }
}
