package net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades;

import net.dakotapride.garnished.GarnishedUtils;
import net.dakotapride.garnished.item.hatchet.IntegratedHatchetToolItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.server.dedicated.Settings;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import net.minecraft.world.item.Tier;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.List;

public class MythicUpgradesHatchetToolItem extends IntegratedHatchetToolItem {
	Tier tier;

    public MythicUpgradesHatchetToolItem(Tier tier, Properties properties) {
        super(GarnishedUtils.mythicUpgrades(), tier, 5, -2.6f, properties.fireResistant());
		this.tier = tier;
    }

	public MythicUpgradesHatchetToolItem(Tier tier, Properties properties, float damage) {
		super(GarnishedUtils.mythicUpgrades(), tier, damage, -2.6F, properties.fireResistant());
		this.tier = tier;
	}

	public MythicUpgradesHatchetToolItem(float speed, Tier tier, Properties properties) {
		super(GarnishedUtils.mythicUpgrades(), tier, 5, speed, properties.fireResistant());
		this.tier = tier;
	}

	public MythicUpgradesHatchetToolItem(float speed, float damage, Tier tier, Properties properties) {
		super(GarnishedUtils.mythicUpgrades(), tier, damage, speed, properties.fireResistant());
		this.tier = tier;
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
		String j;
		ChatFormatting l;

		if (tier == MythicUpgradesTiers.JADE.tier()) {
			j = MythicUpgradesTiers.JADE.entry();
			l = MythicUpgradesTiers.JADE.getColour();
		} else if (tier == MythicUpgradesTiers.RUBY.tier()) {
			j = MythicUpgradesTiers.RUBY.entry();
			l = MythicUpgradesTiers.RUBY.getColour();
		} else if (tier == MythicUpgradesTiers.AMETRINE.tier()) {
			j = MythicUpgradesTiers.AMETRINE.entry();
			l = MythicUpgradesTiers.AMETRINE.getColour();
		} else if (tier == MythicUpgradesTiers.AQUAMARINE.tier()) {
			j = MythicUpgradesTiers.AQUAMARINE.entry();
			l = MythicUpgradesTiers.AQUAMARINE.getColour();
		} else if (tier == MythicUpgradesTiers.SAPPHIRE.tier()) {
			j = MythicUpgradesTiers.SAPPHIRE.entry();
			l = MythicUpgradesTiers.SAPPHIRE.getColour();
		} else if (tier == MythicUpgradesTiers.TOPAZ.tier()) {
			j = MythicUpgradesTiers.TOPAZ.entry();
			l = MythicUpgradesTiers.TOPAZ.getColour();
		} else {
			j = "empty";
			l = ChatFormatting.WHITE;
		}

		components.add(Component.translatable("garnished." + j + "_hatchet.description").withStyle(l));

		super.appendHoverText(stack, level, components, tooltipFlag);
	}
}
