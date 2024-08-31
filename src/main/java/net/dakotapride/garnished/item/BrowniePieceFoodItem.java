package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class BrowniePieceFoodItem extends FarmersDelightItem {
    public BrowniePieceFoodItem(Properties properties) {
        super(properties.food(GarnishedFoodValues.BROWNIE_PIECE));
    }
}
