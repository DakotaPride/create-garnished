package net.dakotapride.garnished.item.hatchet.tier.integrated;

import net.dakotapride.garnished.GarnishedUtils;
import net.dakotapride.garnished.item.hatchet.IntegratedHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.IntegratedMaterials;

public class WardenHatchetToolItem extends IntegratedHatchetToolItem {
    public WardenHatchetToolItem(Properties properties) {
        super(GarnishedUtils.deeperAndDarker(), IntegratedMaterials.WARDEN, 4, -2.7F, properties);
    }
}
