package net.dakotapride.garnished.registry;

import java.util.Random;

import net.dakotapride.garnished.item.IGarnishedUtilities;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

//@SuppressWarnings({"unused"})
public enum GarnishedFoodValues implements IGarnishedUtilities {
    // Capped values may intersect with other values from other regions
    //
    // Overworld
    // Most overworld foods cannot be under 1 nutrition value
    // Most overworld foods cannot be under 0.05 saturation value
    // The absolute minimum stats are 1 and ((2 * 0.25) * 1) = (0.5 * 1) = 0.5 respectively.
    // A hard limit on most overworld foods for nutrition is set at 8
    // A hard limit on most overworld foods for saturation is set at 0.65 (65% of the nutrition value)
    OVERWORLD_MIN(1, 0.25f),
    OVERWORLD_MAX(8, 0.65f),
    // Nether
    // Most nether foods cannot be under 6 nutrition value
    // Most nether foods cannot be under 0.40 saturation value (40% of the nutrition value)
    // A hard limit on most overworld foods for nutrition is set at 12
    // A hard limit on most overworld foods for saturation is set at 0.85 (85% of the nutrition value)
    NETHER_MIN(6, 0.40f),
    NETHER_MAX(12, 0.80f),
    // End
    // Most end foods cannot be under 10 nutrition value
    // Most end foods cannot be under 0.55 saturation value (55% of the nutrition value)
    // A hard limit on most overworld foods for nutrition is set at 16
    // A hard limit on most overworld foods for saturation is set at 1.00 (100% of the nutrition value)
    END_MIN(10, 0.55f),
    END_MAX(16, 1.00f);

    public final int nutrition;
    public final float saturation;

    GarnishedFoodValues(int nutrition, float saturation) {
        this.nutrition = nutrition;
        this.saturation = saturation;
    }

    private static int mod(float value, boolean isSaturation) {
        if (isSaturation)
            return (int) (value + 0.20f);
        else return (int) (value + 2.0f);
    }

    public static boolean hasSugarHigh;
    public static boolean hasFreezing;
    public static boolean hasHunger;
    public static boolean hasLevitation;
    public static boolean hasBadOmen;
    public static boolean isOnFire;


    public static final FoodProperties.Builder GENERIC_BOTTLED_FOOD_OR_DRINK = generic(3, 0.20f);
    public static final FoodProperties GENERIC_BOTTLED_FOOD_OR_DRINK_build = generic(3, 0.20f).build();
    public static final FoodProperties.Builder GENERIC_STEW_OR_BREW = generic(8, 0.60f);
    public static final FoodProperties GENERIC_STEW_OR_BREW_build = generic(8, 0.60f).build();
    public static final FoodProperties.Builder GENERIC_COOKIE = generic(4, 0.20f);
    public static final FoodProperties GENERIC_COOKIE_build = generic(4, 0.20f).build();

    // Overworld
    public static final FoodProperties UNGARNISHED_NUT = ow_min().effect(new MobEffectInstance(MobEffects.CONFUSION, 240), 1.0f).build();
    public static final FoodProperties
            GARNISHED_NUT = generic(4, 0.20f).build(),
            SWEETENED_NUT = generic(mod(4, false), 0.20f).build(),
            CHOCOLATE_GLAZED_NUT = generic(4, mod(0.20f, true)).build(),
            HONEYED_NUT = generic(mod(4, false), mod(0.20f, true)).build();
    public static final FoodProperties
            GARNISHED_NUT_MIX = generic(7, 0.40f).build(),
            SWEETENED_NUT_MIX = generic(mod(7, false), 0.40f).build(),
            CHOCOLATE_GLAZED_NUT_MIX = generic(7, mod(0.40f, true)).build(),
            HONEYED_NUT_MIX = generic(mod(7, false), mod(0.40f, true)).build();
    public static final FoodProperties
            GARNISHED_BERRIES = generic(5, 0.30f).build(),
            HONEYED_BERRIES = generic(mod(5, false), mod(0.30f, true)).build();
    public static final FoodProperties MELTED_CINDER_FLOUR_NUT = meltedCinderFlourNut().build();
    public static final FoodProperties MELTED_CINDER_FLOUR_PEANUT = meltedCinderFlourNut()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, cinder_dur), 1.0f) // 100% chance of occurring
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, cinder_dur), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties MELTED_CINDER_FLOUR_WALNUT = meltedCinderFlourNut()
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, cinder_dur), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties MELTED_CINDER_FLOUR_ALMOND = meltedCinderFlourNut()
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, cinder_dur), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties MELTED_CINDER_FLOUR_HAZELNUT = meltedCinderFlourNut()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, cinder_dur, 1), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties MELTED_CINDER_FLOUR_CHESTNUT = meltedCinderFlourNut()
            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, cinder_dur), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties MELTED_CINDER_FLOUR_PISTACHIO = meltedCinderFlourNut()
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, cinder_dur), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties MELTED_CINDER_FLOUR_MACADAMIA = meltedCinderFlourNut()
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, cinder_dur), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties MELTED_CINDER_FLOUR_PECAN = meltedCinderFlourNut()
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, cinder_dur), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties MELTED_CINDER_FLOUR_CASHEW = meltedCinderFlourNut()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, cinder_dur), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties GARNISHED_MEAL = ow_max().build();
    public static final FoodProperties SALAD = generic(8, 0.40f).build();
    public static final FoodProperties CASHEW_APPLE = ow_min()
            .effect(new MobEffectInstance(MobEffects.POISON, cashew_dur), 0.25f).fast().build(); // 100% chance of occurring
    public static final FoodProperties BITTER_ALMOND = generic(4, 0.20f)
            .effect(new MobEffectInstance(MobEffects.POISON, almond_dur), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties WALNUT_BROWNIE = ow_max().build();
    public static final FoodProperties PECAN_PIE = ow_max().build();
    public static final FoodProperties CASHEW_COOKIE = generic(6, 0.20f).build();
    public static final FoodProperties ALMOND_CHEESE = generic(6, 0.40f).build();
    public static final FoodProperties PUTRID_STEW = GENERIC_STEW_OR_BREW
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 200), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties NUT_NACHO = ow_min().fast().build();
    public static final FoodProperties NUT_NACHO_BOWL = ow_max().build();
    public static final FoodProperties ILLUMINATING_COCKTAIL = generic(4, 0.80f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 600, 0), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties BITTER_APPLE_CIDER = GENERIC_BOTTLED_FOOD_OR_DRINK
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, bit_cider_dur, 1), 1.0f) // 100% chance of occurring
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, bit_cider_dur, 2), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties CRYPTIC_APPLE_CIDER = GENERIC_BOTTLED_FOOD_OR_DRINK
            .effect(GarnishedFoodValues.triggerCrypticEffect(), 1.0f).build();
    public static final FoodProperties MULCH = ow_min().build();
    public static final FoodProperties MUD_PIE = generic(8, 0.15f).build();
    public static final FoodProperties BAKLAVA = ow_max().build();
    public static final FoodProperties RAW_TENEBROUS_MEAT = generic(4, OVERWORLD_MAX.saturation)
            .effect(new MobEffectInstance(MobEffects.DARKNESS, 200), 1.0f).meat().build(); // 100% chance of occurring
    public static final FoodProperties COOKED_TENEBROUS_MEAT = generic(6, OVERWORLD_MAX.saturation)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 200), 0.85f).meat().build(); // 85% chance of occurring
    public static final FoodProperties GLOOMY_GATHERING = ow_max()
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 600), 1.0f) // 100% chance of occurring
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300), 1.0f).meat().build(); // 100% chance of occurring
    public static final FoodProperties ACHING_TENEBROUS_CLUMP = generic(7, OVERWORLD_MAX.saturation).meat().build();
    public static final FoodProperties GHANDERCKEN = ow_max().build(); // Not marked as meat due to bowl being lost upon feeding to wolves or other pets that rely on meat
    public static final FoodProperties FISHY_SURPRISE = new FoodProperties.Builder().nutrition(8).saturationMod(0.40f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 300), 1.0f) // 100% chance of occurring
            .effect(new MobEffectInstance(MobEffects.POISON, 40), 0.15f).build(); // 15% chance of occurring // Not marked as meat due to bowl being lost upon feeding to wolves or other pets that rely on meat
    public static final FoodProperties WHEAT_GRAZE = generic(3, 0.10f).build();
    public static final FoodProperties PORKCHOP_AND_GRAZE = ow_max().meat().build();
    public static final FoodProperties MURKY_JELLY = generic(4, 0.30f).build();
    public static final FoodProperties MURKY_MACADAMIA_MALICE = generic(6, 0.40f).build();
    public static final FoodProperties NUTTY_MELODY = end_min().build(); // Exception for being the most melodic of nutty meals
    public static final FoodProperties YAM_O_GLOW_PUFFS = generic(OVERWORLD_MIN.nutrition, 0.20f).fast().build();
    public static final FoodProperties CACKLING_PIE = ow_max().build();
    public static final FoodProperties SHINING_DISH = generic(OVERWORLD_MAX.nutrition, 0.40f)
            .effect(new MobEffectInstance(MobEffects.GLOWING), 0.45f).build(); // 45% chance of occurring
    public static final FoodProperties MUESLI = generic(OVERWORLD_MAX.nutrition, 0.60f).build();
    public static final FoodProperties GENERIC_DRIED_KELP = generic(2, 0.30f).fast().build();
    public static final FoodProperties DRIED_DULSE_KELP = generic(4, GENERIC_DRIED_KELP.getSaturationModifier()).fast().build();
    public static final FoodProperties VAST_BREW = generic(4, 0.30f).fast().build();
    public static final FoodProperties VERMILION_STEW = generic(6, 0.40f).build();
    public static final FoodProperties GALVANIC_HAUNTING = ow_max().build();
    public static final FoodProperties BEWILDERED_PASTRY = generic(6, 0.40f)
            .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, tick * 20, 0), 0.65f).build(); // 65% chance of occurring
    public static final FoodProperties INCENDIARY_STEW = ow_max().build(); // Explodes on consumption - 100% chance of occurring
    public static final FoodProperties BAMBOO_CLOD = generic(4, 0.20f).build();
    public static final FoodProperties OVERGROWN_BREW = ow_max().build();
    public static final FoodProperties MEAT_SCRAPS = ow_max()
            .effect(GarnishedFoodValues.triggerResistanceOrWeaknessFromRaids(), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties BOK_CHOY = ow_min().build();
    // Generic Sweets (other than honeyed foods)
    public static final FoodProperties COAL_TRUFFLE = generic(2, 0.40f)
            .effect(GarnishedFoodValues.triggerRegenerationFromSugarHigh(), 0.80f).build(); // 80% chance of occurring
    public static final FoodProperties MASTIC_PASTE = ow_min()
            .effect(GarnishedFoodValues.triggerRegenerationFromSugarHigh(), 0.15f).fast().build(); // 15% chance of occurring
    public static final FoodProperties SLIME_DROP = generic(4, 0.30f)
            .effect(GarnishedFoodValues.triggerRegenerationFromSugarHigh(), 0.45f).fast().build(); // 45% chance of occurring
    public static final FoodProperties MASTIC_COVERED_SLIME_DROP = generic(6, 0.40f)
            .effect(GarnishedFoodValues.triggerRegenerationFromSugarHigh(), 0.80f).fast().build(); // 80% chance of occurring
    public static final FoodProperties VENERABLE_DELICACY = ow_max()
            .effect(GarnishedFoodValues.triggerRegenerationFromSugarHigh(), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties ICY_MASTIC_CHUNK = ow_min()
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 2), 1.0f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 160, 1), 1.0f).fast().build();
    public static final FoodProperties CASHEW_SORBET_SCOOP = generic(2, 0.10f)
            .effect(GarnishedFoodValues.triggerRegenerationFromSugarHigh(), 0.65f).fast().build(); // 65% chance of occurring
    public static final FoodProperties CASHEW_SORBET_DELIGHT = generic(8, 0.40f)
            .effect(GarnishedFoodValues.triggerRegenerationFromSugarHigh(), 0.80f).build(); // 80% chance of occurring
    public static final FoodProperties WALNUT_GORGE_CREAM = GENERIC_STEW_OR_BREW
            .effect(GarnishedFoodValues.triggerRegenerationFromSugarHigh(), 0.75f).build(); // 75% chance of occurring
    // Exempt from regenerative effects from sugar high - provides the sugar high status effect
    public static final FoodProperties MERRY_TREAT = generic(6, 0.40f)
            .effect(new MobEffectInstance(GarnishedEffects.SUGAR_HIGH, sugar_high_dur, 1), 1.0f).build(); // 100% chance of occurring
    // Generic "cold" Foods
    public static final FoodProperties FROSTED_DESSERT = generic(6, 0.30f)
            .effect(GarnishedFoodValues.triggerRegenerationFromFreezing(), 0.85f).build(); // 85% chance of occurring
    public static final FoodProperties VOID_STROGANOFF = ow_max()
            .effect(GarnishedFoodValues.triggerRegenerationFromFreezing(), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties CHILLED_APPLE = generic(5, 0.40f)
            .effect(GarnishedFoodValues.triggerRegenerationFromFreezing(), 0.50f).build(); // 50% chance of occurring
    public static final FoodProperties RAW_POLAR_BEAR_MEAT = generic(5, 0.20f)
            .effect(GarnishedFoodValues.triggerRegenerationFromFreezing(), 0.05f).meat().build(); // 5% chance of occurring
    public static final FoodProperties COOKED_POLAR_BEAR_MEAT = ow_max().meat()
            .effect(GarnishedFoodValues.triggerRegenerationFromFreezing(), 0.35f).build(); // 35% chance of occurring
    // TECHNICALLY, does not qualify as they don't actually contain any ingredients from snowy biomes
    public static final FoodProperties EXPLORERS_CONCOCTION = ow_max().build();
    // Generic "desert" foods - no not dessert you fuck
    public static final FoodProperties PRICKLY_PEAR = generic(OVERWORLD_MIN.nutrition, 0.10f)
            .effect(GarnishedFoodValues.triggerThornsFromHunger(), 0.15f).build(); // 15% chance of occurring
    public static final FoodProperties NOPALITO_WRAP = generic(6, 0.65f)
            .effect(GarnishedFoodValues.triggerThornsFromHunger(), 0.65f).build(); // 65% chance of occurring
    public static final FoodProperties NOPALITO_WRAP_SUPREME = generic(8, 0.80f)
            .effect(GarnishedFoodValues.triggerThornsFromHunger(), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties PRICKLY_PEAR_STEW = generic(6, 0.35f)
            .effect(GarnishedFoodValues.triggerThornsFromHunger(), 0.45f).build(); // 45% chance of occurring
    public static final FoodProperties SINOPIA_ROCK_SWEET = generic(4, 0.20f)
            .effect(GarnishedFoodValues.triggerThornsFromHunger(), 0.25f).build(); // 25% chance of occurring
    public static final FoodProperties THORN_ON_A_STICK = generic(8, 0.40f)
            .effect(GarnishedFoodValues.triggerThornsFromHunger(), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties ROSY_COCKTAIL = ow_max()
            .effect(GarnishedFoodValues.triggerThornsFromHunger(), 0.50f) // 50% chance of occurring
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 4), 1.0F).build(); // 100% chance of occurring
    public static final FoodProperties DUSTY_REGALE = generic(6, 0.20f)
            .effect(GarnishedFoodValues.triggerThornsFromHunger(), 0.35f).build(); // 35% chance of occurring
    // Is exempt or already provides Thorns upon consumption
    public static final FoodProperties STEW_OF_THE_DAMNED = generic(OVERWORLD_MAX.nutrition, 0.40f)
            .effect(new MobEffectInstance(GarnishedEffects.THORNS, 700, 4), 1.0F).build(); // 100% chance of occurring

    // Nether
    public static final FoodProperties PEANUT_OIL_AND_CINDER_SANDWICH = generic(7, 0.70f)
            .effect(GarnishedFoodValues.triggerFireResistanceFromBeingOnFire(), 0.15f).build(); // 15% chance of occurring
    public static final FoodProperties TOPHET_BREW = generic(7, 0.60f)
            .effect(GarnishedFoodValues.triggerFireResistanceFromBeingOnFire(), 0.90f).build(); // 90% chance of occurring
    public static final FoodProperties GRIM_STEW = generic(9, 0.60f)
            .effect(GarnishedFoodValues.triggerFireResistanceFromBeingOnFire(), 0.75f).build(); // 75% chance of occurring
    public static final FoodProperties WEEPING_TANGLE = generic(8, 0.40f)
            .effect(GarnishedFoodValues.triggerFireResistanceFromBeingOnFire(), 0.60f).build(); // 60% chance of occurring
    public static final FoodProperties CINDER_ROLL = generic(6, 0.25f)
            .effect(GarnishedFoodValues.triggerFireResistanceFromBeingOnFire(), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties WARPED_BREW = generic(8, 0.70f)
            .effect(GarnishedFoodValues.triggerFireResistanceFromBeingOnFire(), 0.55f).build(); // 55% chance of occurring
    //public static final FoodProperties BOTTLE_OF_CRESTFALLEN_FLORA = GENERIC_BOTTLED_FOOD_OR_DRINK_build; // No longer a food
    public static final FoodProperties BOTTLED_MALODOROUS_MIXTURE = nether_min()
            .effect(GarnishedFoodValues.triggerFireResistanceFromBeingOnFire(), 0.15f).build(); // 15% chance of occurring
    public static final FoodProperties PIQUANT_PRETZEL = nether_min()
            .effect(GarnishedFoodValues.triggerFireResistanceFromBeingOnFire(), 1.0f).build(); // 100% chance of occurring
    // Exempt due to already providing an effect - negative or positive
    public static final FoodProperties INIQUITOUS_BREW = generic(8, 0.70f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, tick * 60, 1), 0.80f).build(); // 80% chance of occurring
    public static final FoodProperties OMNISCIENT_STEW = nether_max()
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, tick * 20, 0), 0.50f) // 50% chance of occurring
            .effect(new MobEffectInstance(GarnishedEffects.COGNATE, cognate_dur, 0), 0.75f).build(); // 75% chance of occurring
    public static final FoodProperties WARPED_TANGLE = wrappedTangle(MobEffects.DAMAGE_RESISTANCE).build();
    public static final FoodProperties CRIMSON_TANGLE = wrappedTangle(MobEffects.FIRE_RESISTANCE).build();
    public static final FoodProperties SEPIA_TANGLE = wrappedTangle(GarnishedEffects.SPIRITED_RESISTANCE).build();
    public static final FoodProperties FERMENTED_CASHEW_MIXTURE = GENERIC_BOTTLED_FOOD_OR_DRINK
            .effect(new MobEffectInstance(MobEffects.CONFUSION, cashew_mix_dur,2 ), 0.05f) // 5% chance of occurring
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, cashew_mix_dur, 2), 0.05f).build(); // 5% chance of occurring
    public static final FoodProperties SOUL_KHANA = GENERIC_STEW_OR_BREW
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 2400), 1.0f) // 100% chance of occurring
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3000), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties SPIRITED_CONCOCTION = GENERIC_STEW_OR_BREW
            .effect(new MobEffectInstance(GarnishedEffects.SPIRITED_RESISTANCE, 900), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties MOLTEN_STEW = nether_min()
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, tick * 20), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties STURDY_WAFFLE = nether_min()
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, tick * 20), 0.75f).build(); // 75% chance of occurring
    public static final FoodProperties PHANTOM_STEAK = nether_max().meat().build();
    public static final FoodProperties BLAZING_DELIGHT = nether_max().build();
    // Generic Sweets (other than honeyed foods)
    public static final FoodProperties SENILE_SWEET = senileSweet().fast().build();

    // End
    public static final FoodProperties CHORUS_COCKTAIL = end_min()
            .effect(GarnishedFoodValues.triggerSlowFallingFromLevitation(), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties CHAMPIONS_OMELETTE = end_max()
            .effect(GarnishedFoodValues.triggerSlowFallingFromLevitation(), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties FARSEER_BREW = generic(12, 0.80f)
            .effect(GarnishedFoodValues.triggerSlowFallingFromLevitation(), 0.80f).build(); // 80% chance of occurring
    public static final FoodProperties SHELLED_DUMPLING = end_min()
            .effect(GarnishedFoodValues.triggerSlowFallingFromLevitation(), 0.50f).build(); // 50% chance of occurring
    // Exempt  due to already providing an effect - negative or positive
    public static final FoodProperties BOTTLED_ENDER_JELLY = GENERIC_BOTTLED_FOOD_OR_DRINK
            .effect(new MobEffectInstance(GarnishedEffects.COGNATE, cognate_dur / 2, 1), 0.50f).build(); // 50% chance of occurring
    public static final FoodProperties COSMIC_BREW = end_min()
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, tick * 30, 0), 1.0f).build(); // 100% chance of occurring
    public static final FoodProperties DESOLATE_STEW = end_min()
            .effect(new MobEffectInstance(GarnishedEffects.COGNATE, cognate_dur, 1), 0.20f).build(); // 20% chance of occurring
    public static final FoodProperties ETHEREAL_CONCOCTION = generic(12, 0.60f)
            .effect(new MobEffectInstance(GarnishedEffects.COGNATE, cognate_dur, 1), 0.20f).build(); // 20% chance of occurring
    public static final FoodProperties VOID_MIXTURE = end_min().build();
    public static final FoodProperties CHORUS_BOWL = end_max().build();
    public static final FoodProperties CHORUS_COOKIE = generic(GENERIC_COOKIE_build.getNutrition(), GENERIC_COOKIE_build.getSaturationModifier())
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, tick * 10, 1), 0.50f).build(); // 50% chance of occurring
    // Generic Sweets (other than honeyed foods)
    public static final FoodProperties GALACTIC_CANE = end_min()
            .effect(new MobEffectInstance(GarnishedEffects.COGNATE, cane_effect_dur, 1), 1.0f)
            .effect(GarnishedFoodValues.triggerRegenerationFromSugarHigh(), 0.35f).build(); // 35% chance of occurring
    public static final FoodProperties ENDER_JELLY = generic(4, 0.30f)
            .effect(GarnishedFoodValues.triggerRegenerationFromSugarHigh(), 1.0f).build(); // 100% chance of occurring

    // Farmer's Delight
    public static final FoodProperties PECAN_PIE_SLICE = generic(3, 0.20f).build();
    public static final FoodProperties PHANTOM_BURGER = nether_max().meat().build();
    public static final FoodProperties PHANTOM_BEEF_PATTY = nether_min().meat().build();
    public static final FoodProperties GLOW_INK_ROLL = generic(10, 0.40f).fast().build();
    public static final FoodProperties GLOW_INK_ROLL_SLICE = generic(4, 0.30f).fast().build();
    // Generic Sweets (other than honeyed foods)
    public static final FoodProperties ANNIVERSARY_CAKE_SLICE = generic(4, 0.20f)
            .effect(GarnishedFoodValues.triggerRegenerationFromSugarHigh(), 1.0f).fast().build(); // 100% chance of occurring
    public static final FoodProperties BROWNIE_PIECE = generic(3, 0.20f)
            .effect(GarnishedFoodValues.triggerRegenerationFromSugarHigh(), 0.25f).fast().build(); // 25% chance of occurring

    public static FoodProperties.Builder ow_min() {
        return new FoodProperties.Builder().nutrition(OVERWORLD_MIN.nutrition).saturationMod(OVERWORLD_MIN.saturation);
    }

    public static FoodProperties.Builder ow_max() {
        return new FoodProperties.Builder().nutrition(OVERWORLD_MAX.nutrition).saturationMod(OVERWORLD_MAX.saturation);
    }

    public static FoodProperties.Builder nether_min() {
        return new FoodProperties.Builder().nutrition(NETHER_MIN.nutrition).saturationMod(NETHER_MIN.saturation);
    }

    public static FoodProperties.Builder nether_max() {
        return new FoodProperties.Builder().nutrition(NETHER_MAX.nutrition).saturationMod(NETHER_MAX.saturation);
    }

    public static FoodProperties.Builder end_min() {
        return new FoodProperties.Builder().nutrition(END_MIN.nutrition).saturationMod(END_MIN.saturation);
    }

    public static FoodProperties.Builder end_max() {
        return new FoodProperties.Builder().nutrition(END_MAX.nutrition).saturationMod(END_MAX.saturation);
    }

    public static FoodProperties.Builder generic(int nutrition, float saturation) {
        return new FoodProperties.Builder().nutrition(nutrition).saturationMod(saturation);
    }

    public static FoodProperties.Builder meltedCinderFlourNut() {
        return generic(7, 0.40f);
    }

    public static FoodProperties.Builder wrappedTangle(MobEffect effect) {
        return nether_min().effect(new MobEffectInstance(effect, tangle_dur, 1), 0.80f); // 80% chance of occurring
    }

    public static FoodProperties.Builder senileSweet() {
        return new FoodProperties.Builder().nutrition(NETHER_MIN.nutrition - 2).saturationMod(NETHER_MIN.saturation - 0.20f)
                .effect(GarnishedFoodValues.triggerRegenerationFromSugarHigh(), 1.0f); // 100% chance of occurring
    }



    public static MobEffectInstance triggerRegenerationFromSugarHigh() {
        if (hasSugarHigh) {
            return new MobEffectInstance(MobEffects.REGENERATION, tick * 12, 1);
        } else {
            // Do not collect 200 dollars, do not pass GO
            return null;
        }
    }

    public static MobEffectInstance triggerRegenerationFromFreezing() {
        if (hasFreezing) {
            return new MobEffectInstance(MobEffects.REGENERATION, tick * 12, 1);
        } else {
            // Do not collect 200 dollars, do not pass GO
            return null;
        }
    }

    public static MobEffectInstance triggerThornsFromHunger() {
        if (hasHunger) {
            return new MobEffectInstance(GarnishedEffects.THORNS, tick * 24, 1);
        } else {
            // Do not collect 200 dollars, do not pass GO
            return null;
        }
    }

    public static MobEffectInstance triggerSlowFallingFromLevitation() {
        if (hasLevitation) {
            return new MobEffectInstance(MobEffects.SLOW_FALLING, tick * 24, 1);
        } else {
            // Do not collect 200 dollars, do not pass GO
            return null;
        }
    }

    public static MobEffectInstance triggerResistanceOrWeaknessFromRaids() {
        if (hasBadOmen) {
            return new MobEffectInstance(MobEffects.WEAKNESS, tick * 36, 1);
        } else {
            // Do collect 200 dollars, and do pass GO :)
            return new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, tick * 36, 1);
        }
    }

    public static MobEffectInstance triggerFireResistanceFromBeingOnFire() {
        if (isOnFire) {
            return new MobEffectInstance(MobEffects.FIRE_RESISTANCE, tick * 24, 1);
        } else {
            // Do not collect 200 dollars, do not pass GO
            return null;
        }
    }

    public static MobEffectInstance triggerCrypticEffect() {
        int random = new Random().nextInt(2);

        if (random == 1) {
            return new MobEffectInstance(MobEffects.DAMAGE_BOOST, cr_cider_dur, 2);
        } else {
            return new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, cr_cider_dur, 2);
        }
    }


    public static void setRegister() {}
}
