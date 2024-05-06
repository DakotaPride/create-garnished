package net.dakotapride.garnished.enchantment;

import org.jetbrains.annotations.NotNull;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class StrikingEnchantment extends HatchetEnchantment {
    public StrikingEnchantment(Rarity rarity, EnchantmentCategory category, EquipmentSlot[] slots) {
        super(rarity, category, slots);
    }

    @Override
    public int getMinCost(int level) {
        return 1 + (level - 1) * 8;
    }

    @Override
    public int getMaxCost(int level) {
        return this.getMinCost(level) + 20;
    }

    @Override
    public float getDamageBonus(int level, @NotNull MobType mobType) {
        return 1.4F + (float)Math.max(0, level - 1) * 0.60F;
    }

    @Override
    public int getMaxLevel() {
        return 4;
    }
}
