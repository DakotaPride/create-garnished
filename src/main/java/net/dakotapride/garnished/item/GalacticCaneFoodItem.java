package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class GalacticCaneFoodItem extends Item implements IGarnishedUtilities {
    public GalacticCaneFoodItem(Properties properties) {
        super(properties.stacksTo(16).food(GarnishedFoodValues.GALACTIC_CANE));
    }
}
