package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class MasticPasteFoodItem extends ConditionalEffectItem {
    public MasticPasteFoodItem(Properties properties) {
        super(0, 0.15F, properties.food(GarnishedFoodValues.MASTIC_PASTE));
    }
}
