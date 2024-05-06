package net.dakotapride.garnished.item.hatchet;

import org.spongepowered.asm.mixin.Unique;

import net.dakotapride.garnished.registry.GarnishedEnchantments;
import net.dakotapride.garnished.registry.GarnishedTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
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
	// Information
	// Maximum Level: 4
	// Minimum Level: 1
	//
	// Grants the player bonus damage, similar to Sharpness or Smite
	static Enchantment striking = GarnishedEnchantments.STRIKING.get();
	// Information
	// Maximum Level: 3
	// Minimum Level: 1
	//
	// Grants the player a speed boost whilst under half health. This enchantment cannot be applied alongside Ravaging
	static Enchantment quickStep = GarnishedEnchantments.QUICK_STEP.get();
	//
	static Enchantment leechingCurse = GarnishedEnchantments.LEECHING_CURSE.get();
    // random shit
    public static final RandomSource random = RandomSource.create();

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

	public static boolean hasStriking(LivingEntity entity) {
		return hasEnchantment(striking, entity);
	}

	public static boolean hasLeechingCurse(LivingEntity entity) {
		return hasEnchantment(leechingCurse, entity);
	}

	public static boolean hasQuickStep(LivingEntity entity) {
		return hasEnchantment(quickStep, entity);
	}

	public static boolean canApplyRavagingEffects(LivingEntity entity) {
		return entity.getMainHandItem().is(GarnishedTags.HATCHETS_TAG) && hasEnchantment(ravaging, entity) && entity.getHealth() <= (entity.getMaxHealth() / 2);
	}

	public static boolean canApplyQuickStepEffects(LivingEntity entity) {
		return entity.getMainHandItem().is(GarnishedTags.HATCHETS_TAG) && hasEnchantment(quickStep, entity) && entity.getHealth() <= (entity.getMaxHealth() / 2);
	}


	@Unique
    private static boolean hasEnchantment(Enchantment enchantment, LivingEntity entity) {
        return EnchantmentHelper.getEnchantmentLevel(enchantment, entity) > 0;
    }


}
