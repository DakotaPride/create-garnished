package net.dakotapride.garnished.item.hatchet.tier.integrated;

import net.dakotapride.garnished.GarnishedUtils;
import net.dakotapride.garnished.item.hatchet.IntegratedHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.IntegratedMaterials;

public class ThallasiumHatchetToolItem extends IntegratedHatchetToolItem {
    public ThallasiumHatchetToolItem(Properties properties) {
        super(GarnishedUtils.betterEnd(), IntegratedMaterials.THALLASIUM, IntegratedMaterials.THALLASIUM.getAttackDamageBonus(), IntegratedMaterials.THALLASIUM.getSpeed(), properties);
    }


}
