package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;

public class PhantomBurgerFoodItem extends FarmersDelightItem {
    public PhantomBurgerFoodItem(Properties properties) {
        super(properties.food(GarnishedFoods.PHANTOM_BURGER));
    }
}
