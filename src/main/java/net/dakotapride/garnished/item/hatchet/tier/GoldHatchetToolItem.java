package net.dakotapride.garnished.item.hatchet.tier;

import net.dakotapride.garnished.item.hatchet.HatchetToolItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.Vanishable;

public class GoldHatchetToolItem extends HatchetToolItem implements Vanishable {
    public GoldHatchetToolItem(Properties properties) {
        super(Tiers.GOLD, 5.0F, -2.6F, properties);
    }
}
