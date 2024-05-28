package net.dakotapride.garnished.item.hatchet.tier.integrated;

import net.dakotapride.garnished.GarnishedUtils;
import net.dakotapride.garnished.item.hatchet.IntegratedHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.IntegratedMaterials;

public class CincinnasiteDiamondHatchetToolItem extends IntegratedHatchetToolItem {
    public CincinnasiteDiamondHatchetToolItem(Properties properties) {
        super(GarnishedUtils.betterNether(), IntegratedMaterials.CINCINNASITE_DIAMOND, IntegratedMaterials.CINCINNASITE_DIAMOND.getAttackDamageBonus(), IntegratedMaterials.CINCINNASITE_DIAMOND.getSpeed(), properties);
    }
}
