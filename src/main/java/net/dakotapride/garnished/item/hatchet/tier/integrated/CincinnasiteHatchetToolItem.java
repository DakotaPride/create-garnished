package net.dakotapride.garnished.item.hatchet.tier.integrated;

import net.dakotapride.garnished.GarnishedUtils;
import net.dakotapride.garnished.item.hatchet.IntegratedHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.IntegratedMaterials;

public class CincinnasiteHatchetToolItem extends IntegratedHatchetToolItem {
    public CincinnasiteHatchetToolItem(Properties properties) {
        super(GarnishedUtils.betterNether(), IntegratedMaterials.CINCINNASITE, IntegratedMaterials.CINCINNASITE.getAttackDamageBonus(), IntegratedMaterials.CINCINNASITE.getSpeed(), properties);
    }
}
