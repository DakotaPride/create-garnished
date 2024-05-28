package net.dakotapride.garnished.item.hatchet.tier.integrated;

import net.dakotapride.garnished.GarnishedUtils;
import net.dakotapride.garnished.item.hatchet.IntegratedHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.IntegratedMaterials;

public class NetherRubyHatchetToolItem extends IntegratedHatchetToolItem {
    public NetherRubyHatchetToolItem(Properties properties) {
        super(GarnishedUtils.betterNether(), IntegratedMaterials.NETHER_RUBY, IntegratedMaterials.NETHER_RUBY.getAttackDamageBonus(), IntegratedMaterials.NETHER_RUBY.getSpeed(), properties);
    }
}
