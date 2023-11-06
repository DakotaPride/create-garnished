package net.dakotapride.garnished.item.hatchet;

import java.util.function.Supplier;

import net.minecraft.world.item.Tiers;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.registry.GarnishedTags;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

@SuppressWarnings({"deprecation","unused"})
public enum IntegratedMaterials implements Tier {
    // ZINC(2, 250, 7.0F, 7.0F, 11, () -> {
	//        return Ingredient.of(GarnishedTags.ZINC_INGOTS);
	//    }),
	//    COPPER(2, 131, 5.0F, 5.0F, 11, () -> {
	//        return Ingredient.of(GarnishedTags.COPPER_INGOTS);
	//    }),
	//    BRASS(3, 450, 8.0F, 7.0F, 14, () -> {
	//        return Ingredient.of(GarnishedTags.BRASS_INGOTS);
	//    }),
	//    ROSE_QUARTZ(3, 1644, 9.0F, 7.0F, 14, () -> {
	//        return Ingredient.of(GarnishedTags.ROSE_QUARTZ);
	//    }),
	//    EXPERIENCE(2, 270, 7.0F, 5.0F, 800, () -> {
	//        return Ingredient.of(GarnishedTags.EXPERIENCE_REPAIRABLE_ITEMS);
	//    }),
	//    BLAZING(3, 450, 12.0F, 6.5F, 2, () -> {
	//        return Ingredient.of(GarnishedTags.BLAZING_REPAIRABLE_ITEMS);
	//    }),

    WARDEN(5, 2519, 10, 5, 18, () -> {
        return Ingredient.of(GarnishedTags.WARDEN_REPAIRABLE_ITEMS);
    }),

    ROSE_GOLD(2, 900, 9.0F, 2.0F, 17, () -> {
        return Ingredient.of(GarnishedTags.COPPER_INGOTS);
    }),
    GILDED_NETHERITE(4, 2031, 10.0F, 2.0F, 20, () -> {
        return Ingredient.of(Items.NETHERITE_INGOT);
    }),

	SAPPHIRE(Tiers.NETHERITE.getLevel(), 2106, 9.0f, 4.0f, 18, () -> {
		return Ingredient.of(GarnishedTags.SAPPHIRE_GEMS);
	}),
	RUBY(Tiers.NETHERITE.getLevel(), 2106, 12.0f, 4.0f, 18, () -> {
		return Ingredient.of(GarnishedTags.RUBY_GEMS);
	}),
	JADE(Tiers.NETHERITE.getLevel(), 2106, 9.0f, 4.0f, 18, () -> {
		return Ingredient.of(GarnishedTags.JADE_GEMS);
	}),
	TOPAZ(Tiers.NETHERITE.getLevel(), 6318, 10.0f, 4.5f, 18, () -> {
		return Ingredient.of(GarnishedTags.TOPAZ_GEMS);
	}),
	AMETRINE(Tiers.NETHERITE.getLevel(), 2106, 9.0f, 4.0f, 18, () -> {
		return Ingredient.of(GarnishedTags.AMETRINE_GEMS);
	}),
	AQUAMARINE(Tiers.NETHERITE.getLevel(), 2106, 9.0f, 4.0f, 18, () -> {
		return Ingredient.of(GarnishedTags.AQUAMARINE_GEMS);
	});

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    IntegratedMaterials(int pLevel, int pUses, float pSpeed, float pDamage, int pEnchantmentValue, Supplier<Ingredient> pRepairIngredient) {
        this.level = pLevel;
        this.uses = pUses;
        this.speed = pSpeed;
        this.damage = pDamage;
        this.enchantmentValue = pEnchantmentValue;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
