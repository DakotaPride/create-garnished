package net.dakotapride.garnished.enchantment;

import net.minecraft.world.damagesource.DamageSource;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.registry.GarnishedDamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class CurseOfTheLeechEnchantment extends HatchetEnchantment {
    public CurseOfTheLeechEnchantment(Rarity rarity, EnchantmentCategory category, EquipmentSlot[] slots) {
        super(rarity, category, slots);
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity attacker, @NotNull Entity target, int level) {
        if (canHit(level)) {
            attacker.hurt(GarnishedDamageSource.LEECHING, 2);
        }
    }

    private boolean canHit(int level) {
        return level > 0;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean isCurse() {
        return true;
    }
}
