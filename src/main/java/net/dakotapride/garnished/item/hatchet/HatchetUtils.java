package net.dakotapride.garnished.item.hatchet;

import java.util.Random;

import org.spongepowered.asm.mixin.Unique;

import net.dakotapride.garnished.registry.GarnishedEnchantments;
import net.dakotapride.garnished.registry.GarnishedTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;

public class HatchetUtils {
    // Information
    // Maximum Level: 2
    // Minimum Level: 1
    //
    // Grants additional drops depending on the level
    static Enchantment salvaging = GarnishedEnchantments.SALVAGING.get();
    // Information
    // Maximum Level: 1
    // Minimum Level: 1
    //
    // Grants the player PVE/PVP benefits depending on the situation
	// Grants additional drops depending on the level
    static Enchantment ravaging = GarnishedEnchantments.RAVAGING.get();
    // random shit
    public static final Random random = new Random();

    public HatchetUtils() {}


    public static boolean isAffectedByRavaging(Entity entity) {
        return entity.getType().is(GarnishedTags.IS_AFFECTED_BY_RAVAGING);
    }

    public static boolean isAffectedBySalvaging(Entity entity) {
        return entity.getType().is(GarnishedTags.IS_AFFECTED_BY_SALVAGING);
    }

    public static boolean hasRavaging(LivingEntity entity) {
        return hasEnchantment(ravaging, entity);
    }

    public static boolean hasSalvaging(LivingEntity entity) {
        return hasEnchantment(salvaging, entity);
    }

    public static boolean canApplyRavagingEffects(LivingEntity entity) {
        return entity.getMainHandItem().is(GarnishedTags.HATCHETS_TAG) && hasEnchantment(ravaging, entity) && entity.getHealth() <= 10;
    }

    @Unique
    private static boolean hasEnchantment(Enchantment enchantment, LivingEntity entity) {
        return EnchantmentHelper.getEnchantmentLevel(enchantment, entity) > 0;
    }


}
