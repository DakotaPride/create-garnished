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
		return 1.4F + (float)Math.max(0, level - 0.50) * 0.60F;
		// 1.4 + ((if 0 is greater than (level - 0.50) = 0, otherwise (level - 0.50)) * 0.60)

		// 1.4 + (((level = 4) (level - 0.50)) * 0.60)
		// 1.4 + (3.5 * 0.60)
		// 1.4 + 2.1
		// 3.5 damage increase at level 4

		// 1.4 + (((level = 1) (level - 0.50)) * 0.60)
		// 1.4 + (0.50 * 0.60)
		// 1.4 + 0.30
		// 1.7 damage increase at level 1
    }

    @Override
    public int getMaxLevel() {
        return 4;
    }
}
