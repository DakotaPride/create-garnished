package net.dakotapride.garnished.item.hatchet.tier.integrated;

import net.dakotapride.garnished.GarnishedUtils;
import net.dakotapride.garnished.item.hatchet.IntegratedHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.IntegratedMaterials;

public class RoseGoldHatchetToolItem extends IntegratedHatchetToolItem {
    public RoseGoldHatchetToolItem(Properties properties) {
        super(GarnishedUtils.additionalAdditions(), IntegratedMaterials.ROSE_GOLD, 5, -2.7F, properties);
    }
}
