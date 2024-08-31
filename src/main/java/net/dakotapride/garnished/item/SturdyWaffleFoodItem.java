package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.world.item.Item;

public class SturdyWaffleFoodItem extends Item {
    public SturdyWaffleFoodItem(Properties properties) {
        super(properties.stacksTo(16).food(GarnishedFoodValues.STURDY_WAFFLE));
    }
}
