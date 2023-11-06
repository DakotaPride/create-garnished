package net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades;

import net.dakotapride.garnished.item.hatchet.IntegratedMaterials;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;

public class AmetrineHatchetToolItem extends MythicUpgradesHatchetToolItem {
	public AmetrineHatchetToolItem(Properties properties) {
		super(IntegratedMaterials.AMETRINE, properties);
	}

	@Override
	public boolean hurtEnemy(ItemStack pStack, @NotNull LivingEntity target, @NotNull LivingEntity attacker) {
		target.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 10, 2));

		return super.hurtEnemy(pStack, target, attacker);
	}
}
