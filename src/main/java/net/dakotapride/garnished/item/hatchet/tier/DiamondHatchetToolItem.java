package net.dakotapride.garnished.item.hatchet.tier;

import net.dakotapride.garnished.item.hatchet.HatchetToolItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.Vanishable;

public class DiamondHatchetToolItem extends HatchetToolItem implements Vanishable {
    public DiamondHatchetToolItem(Properties properties) {
        super(Tiers.DIAMOND, 4.0F, -2.6F, properties);
    }
}
