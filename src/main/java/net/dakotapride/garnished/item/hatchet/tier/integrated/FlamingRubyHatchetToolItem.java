package net.dakotapride.garnished.item.hatchet.tier.integrated;

import net.dakotapride.garnished.GarnishedUtils;
import net.dakotapride.garnished.item.hatchet.IntegratedHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.IntegratedMaterials;

public class FlamingRubyHatchetToolItem extends IntegratedHatchetToolItem {
    public FlamingRubyHatchetToolItem(Properties properties) {
        super(GarnishedUtils.betterNether(), IntegratedMaterials.FLAMING_RUBY, 4.5F, -2.4F, properties);
    }
}
