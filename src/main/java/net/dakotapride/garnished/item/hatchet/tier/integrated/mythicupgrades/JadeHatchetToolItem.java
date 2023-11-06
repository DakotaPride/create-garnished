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

public class JadeHatchetToolItem extends MythicUpgradesHatchetToolItem {
	public JadeHatchetToolItem(Properties properties) {
		super(IntegratedMaterials.JADE, properties);
	}

	@Override
	public boolean hurtEnemy(ItemStack pStack, @NotNull LivingEntity target, @NotNull LivingEntity attacker) {
		target.addEffect(new MobEffectInstance(MobEffects.POISON, 40, 3));

		return super.hurtEnemy(pStack, target, attacker);
	}
}
