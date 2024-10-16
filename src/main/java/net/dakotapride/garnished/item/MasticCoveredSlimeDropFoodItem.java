package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class MasticCoveredSlimeDropFoodItem extends ConditionalEffectItem {
    public MasticCoveredSlimeDropFoodItem(Properties properties) {
        super(0, 0.80F, properties.food(GarnishedFoodValues.MASTIC_COVERED_SLIME_DROP).stacksTo(16));
    }
}
