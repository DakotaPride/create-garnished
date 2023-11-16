package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class MasticCoveredSlimeDropFoodItem extends Item {
    public MasticCoveredSlimeDropFoodItem(Properties properties) {
        super(properties.food(GarnishedFoods.MASTIC_COVERED_SLIME_DROP).stacksTo(16));
    }
}
