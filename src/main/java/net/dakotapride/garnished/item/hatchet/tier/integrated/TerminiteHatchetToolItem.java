package net.dakotapride.garnished.item.hatchet.tier.integrated;

import net.dakotapride.garnished.GarnishedUtils;
import net.dakotapride.garnished.item.hatchet.IntegratedHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.IntegratedMaterials;

public class TerminiteHatchetToolItem extends IntegratedHatchetToolItem {
    public TerminiteHatchetToolItem(Properties properties) {
        super(GarnishedUtils.betterEnd(), IntegratedMaterials.TERMINITE, IntegratedMaterials.TERMINITE.getAttackDamageBonus(), IntegratedMaterials.TERMINITE.getSpeed(), properties);
    }


}
