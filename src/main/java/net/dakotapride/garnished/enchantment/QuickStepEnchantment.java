package net.dakotapride.garnished.enchantment;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.item.hatchet.HatchetUtils;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class QuickStepEnchantment extends HatchetEnchantment {
    public QuickStepEnchantment(Rarity rarity, EnchantmentCategory category, EquipmentSlot[] slots) {
        super(rarity, category, slots);
    }

    @Override
    public boolean checkCompatibility(@NotNull Enchantment enchantment) {
        return !(enchantment instanceof RavagingEnchantment) && !(enchantment instanceof RejuvenateEnchantment);
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity attacker, @NotNull Entity target, int level) {
        if (HatchetUtils.canApplyQuickStepEffects(attacker))
            attacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, level - 1));
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}
