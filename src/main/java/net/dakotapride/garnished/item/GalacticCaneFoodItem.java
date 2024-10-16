package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class GalacticCaneFoodItem extends ConditionalEffectItem implements IGarnishedUtilities {
    public GalacticCaneFoodItem(Properties properties) {
        super(0, 0.35F, properties.stacksTo(16).food(GarnishedFoodValues.GALACTIC_CANE));
    }
}
