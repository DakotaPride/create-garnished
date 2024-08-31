package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

public class PhantomBurgerFoodItem extends FarmersDelightItem {
    public PhantomBurgerFoodItem(Properties properties) {
        super(properties.food(GarnishedFoodValues.PHANTOM_BURGER));
    }
}
