package net.dakotapride.garnished.item.hatchet.tier;

import net.dakotapride.garnished.item.hatchet.HatchetToolItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.Vanishable;

public class StoneHatchetToolItem extends HatchetToolItem implements Vanishable {
    public StoneHatchetToolItem(Properties properties) {
        super(Tiers.STONE, 6.0F, -2.8F, properties);
    }
}
