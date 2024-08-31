package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class CoalTruffleFoodItem extends Item implements IGarnishedUtilities {

    public CoalTruffleFoodItem(Properties properties) {
        super(properties.stacksTo(16).food(GarnishedFoodValues.COAL_TRUFFLE));
    }
}
