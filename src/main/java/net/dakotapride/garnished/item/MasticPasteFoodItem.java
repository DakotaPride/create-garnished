package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class MasticPasteFoodItem extends Item {
    public MasticPasteFoodItem(Properties properties) {
        super(properties.food(GarnishedFoodValues.MASTIC_PASTE));
    }
}
