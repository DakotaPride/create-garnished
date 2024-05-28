package net.dakotapride.garnished.item.hatchet.tier.integrated;

import net.dakotapride.garnished.GarnishedUtils;
import net.dakotapride.garnished.item.hatchet.IntegratedHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.IntegratedMaterials;

public class AeterniumHatchetToolItem extends IntegratedHatchetToolItem {
    public AeterniumHatchetToolItem(Properties properties) {
        super(GarnishedUtils.betterEnd(), IntegratedMaterials.AETERNIUM, IntegratedMaterials.AETERNIUM.getAttackDamageBonus(), IntegratedMaterials.AETERNIUM.getSpeed(), properties);
    }


}
