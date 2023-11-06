package net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades;

import net.dakotapride.garnished.GarnishedUtils;
import net.dakotapride.garnished.item.hatchet.IntegratedHatchetToolItem;
import net.minecraft.server.dedicated.Settings;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import net.minecraft.world.item.Tier;

import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.List;

public class MythicUpgradesHatchetToolItem extends IntegratedHatchetToolItem {

    public MythicUpgradesHatchetToolItem(Tier tier, Properties properties) {
        super(GarnishedUtils.mythicUpgrades(), tier, 5, -2.6f, properties);
    }
}
