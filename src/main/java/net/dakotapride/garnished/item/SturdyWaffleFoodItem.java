package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.item.Item;

public class SturdyWaffleFoodItem extends Item {
    public SturdyWaffleFoodItem(Properties properties) {
        super(properties.stacksTo(16).food(GarnishedFoods.STURDY_WAFFLE));
    }
}
