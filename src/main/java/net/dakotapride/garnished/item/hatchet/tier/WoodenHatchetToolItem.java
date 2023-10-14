package net.dakotapride.garnished.item.hatchet.tier;

import net.dakotapride.garnished.item.hatchet.HatchetToolItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.Vanishable;

public class WoodenHatchetToolItem extends HatchetToolItem implements Vanishable {
    public WoodenHatchetToolItem(Properties properties) {
        super(Tiers.WOOD, 5.0F, -2.8F, properties);
    }
}
