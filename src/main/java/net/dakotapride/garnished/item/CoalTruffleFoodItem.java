package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class CoalTruffleFoodItem extends ConditionalEffectItem implements IGarnishedUtilities {

    public CoalTruffleFoodItem(Properties properties) {
        super(0, 0.80F, properties.stacksTo(16).food(GarnishedFoodValues.COAL_TRUFFLE));
    }
}
