package net.dakotapride.garnished.enchantment;

import org.jetbrains.annotations.NotNull;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class RavagingEnchantment extends HatchetEnchantment {
    public RavagingEnchantment(Rarity rarity, EnchantmentCategory category, EquipmentSlot[] slots) {
        super(rarity, category, slots);
    }

    @Override
    public boolean checkCompatibility(@NotNull Enchantment enchantment) {
        return !(enchantment instanceof QuickStepEnchantment);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }
}
