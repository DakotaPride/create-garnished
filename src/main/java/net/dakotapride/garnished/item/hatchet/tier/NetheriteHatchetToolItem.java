package net.dakotapride.garnished.item.hatchet.tier;

import net.dakotapride.garnished.item.hatchet.HatchetToolItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.Vanishable;

public class NetheriteHatchetToolItem extends HatchetToolItem implements Vanishable {
    public NetheriteHatchetToolItem(Properties properties) {
        super(Tiers.NETHERITE, 4.0F, -2.6F, properties);
    }
}
