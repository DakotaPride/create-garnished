package net.dakotapride.garnished.item.hatchet.tier;

import net.dakotapride.garnished.item.hatchet.HatchetToolItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.Vanishable;

public class IronHatchetToolItem extends HatchetToolItem implements Vanishable {
    public IronHatchetToolItem(Properties properties) {
        super(Tiers.IRON, 5.0F, -2.7F, properties);
    }
}
