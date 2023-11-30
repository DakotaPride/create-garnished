package net.dakotapride.garnished.registry;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.item.*;
import net.dakotapride.garnished.item.cracked.*;
import net.dakotapride.garnished.item.hatchet.tier.DiamondHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.GoldHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.IronHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.NetheriteHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.StoneHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.WoodenHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.GildedNetheriteHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.RoseGoldHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.WardenHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades.AmetrineHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades.AquamarineHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades.JadeHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades.RubyHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades.SapphireHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades.TopazHatchetToolItem;
import net.dakotapride.garnished.item.wood.NutBoatItem;
import net.dakotapride.garnished.item.wood.NutChestBoatItem;
import net.dakotapride.garnished.item.wood.NutSignItem;
import net.dakotapride.garnished.item.wood.SepiaSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

@SuppressWarnings({"unused"})
public class GarnishedItems {

	private static final CreateRegistrate REGISTRATE = CreateGarnished.registrate()
			.useCreativeTab(GarnishedTabs.GARNISHED.key());

	// Cashews
	public static final ItemEntry<CrackedCashewItem> CRACKED_CASHEW =
			REGISTRATE.item("cracked_cashew", CrackedCashewItem::new).register();

	public static final ItemEntry<UngarnishedNutFoodItem> UNGARNISHED_CASHEW =
			REGISTRATE.item("ungarnished_cashew", UngarnishedNutFoodItem::new).register();
	public static final ItemEntry<GarnishedNutFoodItem> CASHEW =
			REGISTRATE.item("cashew", GarnishedNutFoodItem::new).register();
	public static final ItemEntry<CinderFlourNutFoodItem> CINDER_FLOUR_CASHEW =
			REGISTRATE.item("cinder_cashew", CinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutFoodItem> MELTED_CINDER_FLOUR_CASHEW =
			REGISTRATE.item("melted_cinder_cashew", MeltedCinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutWithEffectFoodItem> SPEED_CINDER_CASHEW =
			REGISTRATE.item("cinder_cashew_speed", MeltedCinderFlourNutWithEffectFoodItem::new).register();
	public static final ItemEntry<SweetenedNutFoodItem> SWEETENED_CASHEW =
			REGISTRATE.item("sweetened_cashew", SweetenedNutFoodItem::new).register();
	public static final ItemEntry<ChocholateGlazedNutFoodItem> CHOCOLATE_GLAZED_CASHEW =
			REGISTRATE.item("chocolate_glazed_cashew", ChocholateGlazedNutFoodItem::new).register();
	public static final ItemEntry<HoneyedNutFoodItem> HONEYED_CASHEW =
			REGISTRATE.item("honeyed_cashew", HoneyedNutFoodItem::new).register();

	// Walnuts
	public static final ItemEntry<CrackedWalnutItem> CRACKED_WALNUT =
			REGISTRATE.item("cracked_walnut", CrackedWalnutItem::new).register();

	public static final ItemEntry<UngarnishedNutFoodItem> UNGARNISHED_WALNUT =
			REGISTRATE.item("ungarnished_walnut", UngarnishedNutFoodItem::new).register();
	public static final ItemEntry<GarnishedNutFoodItem> WALNUT =
			REGISTRATE.item("walnut", GarnishedNutFoodItem::new).register();
	public static final ItemEntry<CinderFlourNutFoodItem> CINDER_FLOUR_WALNUT =
			REGISTRATE.item("cinder_walnut", CinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutFoodItem> MELTED_CINDER_FLOUR_WALNUT =
			REGISTRATE.item("melted_cinder_walnut", MeltedCinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutWithEffectFoodItem> STRENGTH_CINDER_WALNUT =
			REGISTRATE.item("cinder_walnut_strength", MeltedCinderFlourNutWithEffectFoodItem::new).register();
	public static final ItemEntry<SweetenedNutFoodItem> SWEETENED_WALNUT =
			REGISTRATE.item("sweetened_walnut", SweetenedNutFoodItem::new).register();
	public static final ItemEntry<ChocholateGlazedNutFoodItem> CHOCOLATE_GLAZED_WALNUT =
			REGISTRATE.item("chocolate_glazed_walnut", ChocholateGlazedNutFoodItem::new).register();
	public static final ItemEntry<HoneyedNutFoodItem> HONEYED_WALNUT =
			REGISTRATE.item("honeyed_walnut", HoneyedNutFoodItem::new).register();

	// Almonds
	public static final ItemEntry<CrackedAlmondItem> CRACKED_ALMOND =
			REGISTRATE.item("cracked_almond", CrackedAlmondItem::new).register();

	public static final ItemEntry<UngarnishedNutFoodItem> UNGARNISHED_ALMOND =
			REGISTRATE.item("ungarnished_almond", UngarnishedNutFoodItem::new).register();
	public static final ItemEntry<GarnishedNutFoodItem> ALMOND =
			REGISTRATE.item("almond", GarnishedNutFoodItem::new).register();
	public static final ItemEntry<CinderFlourNutFoodItem> CINDER_FLOUR_ALMOND =
			REGISTRATE.item("cinder_almond", CinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutFoodItem> MELTED_CINDER_FLOUR_ALMOND =
			REGISTRATE.item("melted_cinder_almond", MeltedCinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutWithEffectFoodItem> HASTE_CINDER_ALMOND =
			REGISTRATE.item("cinder_almond_haste", MeltedCinderFlourNutWithEffectFoodItem::new).register();
	public static final ItemEntry<SweetenedNutFoodItem> SWEETENED_ALMOND =
			REGISTRATE.item("sweetened_almond", SweetenedNutFoodItem::new).register();
	public static final ItemEntry<ChocholateGlazedNutFoodItem> CHOCOLATE_GLAZED_ALMOND =
			REGISTRATE.item("chocolate_glazed_almond", ChocholateGlazedNutFoodItem::new).register();
	public static final ItemEntry<HoneyedNutFoodItem> HONEYED_ALMOND =
			REGISTRATE.item("honeyed_almond", HoneyedNutFoodItem::new).register();

	// Pecans
	public static final ItemEntry<CrackedPecanItem> CRACKED_PECAN =
			REGISTRATE.item("cracked_pecan", CrackedPecanItem::new).register();

	public static final ItemEntry<UngarnishedNutFoodItem> UNGARNISHED_PECAN =
			REGISTRATE.item("ungarnished_pecan", UngarnishedNutFoodItem::new).register();
	public static final ItemEntry<GarnishedNutFoodItem> PECAN =
			REGISTRATE.item("pecan", GarnishedNutFoodItem::new).register();
	public static final ItemEntry<CinderFlourNutFoodItem> CINDER_FLOUR_PECAN =
			REGISTRATE.item("cinder_pecan", CinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutFoodItem> MELTED_CINDER_FLOUR_PECAN =
			REGISTRATE.item("melted_cinder_pecan", MeltedCinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutWithEffectFoodItem> RESISTANCE_CINDER_PECAN =
			REGISTRATE.item("cinder_pecan_resistance", MeltedCinderFlourNutWithEffectFoodItem::new).register();
	public static final ItemEntry<SweetenedNutFoodItem> SWEETENED_PECAN =
			REGISTRATE.item("sweetened_pecan", SweetenedNutFoodItem::new).register();
	public static final ItemEntry<ChocholateGlazedNutFoodItem> CHOCOLATE_GLAZED_PECAN =
			REGISTRATE.item("chocolate_glazed_pecan", ChocholateGlazedNutFoodItem::new).register();
	public static final ItemEntry<HoneyedNutFoodItem> HONEYED_PECAN =
			REGISTRATE.item("honeyed_pecan", HoneyedNutFoodItem::new).register();

	// Pistachios
	public static final ItemEntry<CrackedPistachioItem> CRACKED_PISTACHIO =
			REGISTRATE.item("cracked_pistachio", CrackedPistachioItem::new).register();

	public static final ItemEntry<UngarnishedNutFoodItem> UNGARNISHED_PISTACHIO =
			REGISTRATE.item("ungarnished_pistachio", UngarnishedNutFoodItem::new).register();
	public static final ItemEntry<GarnishedNutFoodItem> PISTACHIO =
			REGISTRATE.item("pistachio", GarnishedNutFoodItem::new).register();
	public static final ItemEntry<CinderFlourNutFoodItem> CINDER_FLOUR_PISTACHIO =
			REGISTRATE.item("cinder_pistachio", CinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutFoodItem> MELTED_CINDER_FLOUR_PISTACHIO =
			REGISTRATE.item("melted_cinder_pistachio", MeltedCinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutWithEffectFoodItem> NIGHT_VISION_CINDER_PISTACHIO =
			REGISTRATE.item("cinder_pistachio_night_vision", MeltedCinderFlourNutWithEffectFoodItem::new).register();
	public static final ItemEntry<SweetenedNutFoodItem> SWEETENED_PISTACHIO =
			REGISTRATE.item("sweetened_pistachio", SweetenedNutFoodItem::new).register();
	public static final ItemEntry<ChocholateGlazedNutFoodItem> CHOCOLATE_GLAZED_PISTACHIO =
			REGISTRATE.item("chocolate_glazed_pistachio", ChocholateGlazedNutFoodItem::new).register();
	public static final ItemEntry<HoneyedNutFoodItem> HONEYED_PISTACHIO =
			REGISTRATE.item("honeyed_pistachio", HoneyedNutFoodItem::new).register();

	// Macadamia
	public static final ItemEntry<CrackedMacadamiaItem> CRACKED_MACADAMIA =
			REGISTRATE.item("cracked_macadamia", CrackedMacadamiaItem::new).register();

	public static final ItemEntry<UngarnishedNutFoodItem> UNGARNISHED_MACADAMIA =
			REGISTRATE.item("ungarnished_macadamia", UngarnishedNutFoodItem::new).register();
	public static final ItemEntry<GarnishedNutFoodItem> MACADAMIA =
			REGISTRATE.item("macadamia", GarnishedNutFoodItem::new).register();
	public static final ItemEntry<CinderFlourNutFoodItem> CINDER_FLOUR_MACADAMIA =
			REGISTRATE.item("cinder_macadamia", CinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutFoodItem> MELTED_CINDER_FLOUR_MACADAMIA =
			REGISTRATE.item("melted_cinder_macadamia", MeltedCinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutWithEffectFoodItem> FIRE_RESISTANCE_CINDER_MACADAMIA =
			REGISTRATE.item("cinder_macadamia_fire_resistance", MeltedCinderFlourNutWithEffectFoodItem::new).register();
	public static final ItemEntry<SweetenedNutFoodItem> SWEETENED_MACADAMIA =
			REGISTRATE.item("sweetened_macadamia", SweetenedNutFoodItem::new).register();
	public static final ItemEntry<ChocholateGlazedNutFoodItem> CHOCOLATE_GLAZED_MACADAMIA =
			REGISTRATE.item("chocolate_glazed_macadamia", ChocholateGlazedNutFoodItem::new).register();
	public static final ItemEntry<HoneyedNutFoodItem> HONEYED_MACADAMIA =
			REGISTRATE.item("honeyed_macadamia", HoneyedNutFoodItem::new).register();

	// Hazelnut
	public static final ItemEntry<CrackedHazelnutItem> CRACKED_HAZELNUT =
			REGISTRATE.item("cracked_hazelnut", CrackedHazelnutItem::new).register();

	public static final ItemEntry<UngarnishedNutFoodItem> UNGARNISHED_HAZELNUT =
			REGISTRATE.item("ungarnished_hazelnut", UngarnishedNutFoodItem::new).register();
	public static final ItemEntry<GarnishedNutFoodItem> HAZELNUT =
			REGISTRATE.item("hazelnut", GarnishedNutFoodItem::new).register();
	public static final ItemEntry<CinderFlourNutFoodItem> CINDER_FLOUR_HAZELNUT =
			REGISTRATE.item("cinder_hazelnut", CinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutFoodItem> MELTED_CINDER_FLOUR_HAZELNUT =
			REGISTRATE.item("melted_cinder_hazelnut", MeltedCinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutWithEffectFoodItem> POTENT_SPEED_CINDER_HAZELNUT =
			REGISTRATE.item("cinder_hazelnut_speed_potent", MeltedCinderFlourNutWithEffectFoodItem::new).register();
	public static final ItemEntry<SweetenedNutFoodItem> SWEETENED_HAZELNUT =
			REGISTRATE.item("sweetened_hazelnut", SweetenedNutFoodItem::new).register();
	public static final ItemEntry<ChocholateGlazedNutFoodItem> CHOCOLATE_GLAZED_HAZELNUT =
			REGISTRATE.item("chocolate_glazed_hazelnut", ChocholateGlazedNutFoodItem::new).register();
	public static final ItemEntry<HoneyedNutFoodItem> HONEYED_HAZELNUT =
			REGISTRATE.item("honeyed_hazelnut", HoneyedNutFoodItem::new).register();

	// Ina, why?
	// Buhgs
	public static final ItemEntry<CrackedBuhgItem> CRACKED_BUHG =
			REGISTRATE.item("cracked_peanut", CrackedBuhgItem::new).register();

	public static final ItemEntry<UngarnishedNutFoodItem> UNGARNISHED_BUHG =
			REGISTRATE.item("ungarnished_peanut", UngarnishedNutFoodItem::new).register();
	public static final ItemEntry<GarnishedNutFoodItem> BUHG =
			REGISTRATE.item("peanut", GarnishedNutFoodItem::new).register();
	public static final ItemEntry<CinderFlourNutFoodItem> CINDER_FLOUR_BUHG =
			REGISTRATE.item("cinder_peanut", CinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutFoodItem> MELTED_CINDER_FLOUR_BUHG =
			REGISTRATE.item("melted_cinder_peanut", MeltedCinderFlourNutFoodItem::new).register();
	public static final ItemEntry<MeltedCinderFlourNutWithEffectFoodItem> EFFECT_CINDER_BUHG =
			REGISTRATE.item("cinder_peanut_effect", MeltedCinderFlourNutWithEffectFoodItem::new).register();
	public static final ItemEntry<SweetenedNutFoodItem> SWEETENED_BUHG =
			REGISTRATE.item("sweetened_peanut", SweetenedNutFoodItem::new).register();
	public static final ItemEntry<ChocholateGlazedNutFoodItem> CHOCOLATE_GLAZED_BUHG =
			REGISTRATE.item("chocolate_glazed_peanut", ChocholateGlazedNutFoodItem::new).register();
	public static final ItemEntry<HoneyedNutFoodItem> HONEYED_BUHG =
			REGISTRATE.item("honeyed_peanut", HoneyedNutFoodItem::new).register();

	// Nut mix
	public static final ItemEntry<NutMixFoodItem> NUT_MIX =
			REGISTRATE.item("nut_mix", NutMixFoodItem::new).register();
	public static final ItemEntry<SweetenedNutMixFoodItem> SWEETENED_NUT_MIX =
			REGISTRATE.item("sweetened_nut_mix", SweetenedNutMixFoodItem::new).register();
	public static final ItemEntry<ChocolateGlazedNutMixFoodItem> CHOCHOLATE_GLAZED_NUT_MIX =
			REGISTRATE.item("chocolate_glazed_nut_mix", ChocolateGlazedNutMixFoodItem::new).register();
	public static final ItemEntry<HoneyedNutMixFoodItem> HONEYED_NUT_MIX =
			REGISTRATE.item("honeyed_nut_mix", HoneyedNutMixFoodItem::new).register();

	public static final ItemEntry<GarnishedMealFoodItem> GARNISHED_MEAL =
			REGISTRATE.item("garnished_meal", GarnishedMealFoodItem::new).register();

	// Sweet Berries
	public static final ItemEntry<GarnishedSweetBerriesFoodItem> GARNISHED_SWEET_BERRIES =
			REGISTRATE.item("garnished_sweet_berries", GarnishedSweetBerriesFoodItem::new).register();
	public static final ItemEntry<HoneyedSweetBerriesFoodItem> HONEYED_SWEET_BERRIES =
			REGISTRATE.item("honeyed_sweet_berries", HoneyedSweetBerriesFoodItem::new).register();

	// Apple Cider
	public static final ItemEntry<AppleCiderFoodItem> APPLE_CIDER =
			REGISTRATE.item("apple_cider", AppleCiderFoodItem::new).register();
	public static final ItemEntry<CrypticAppleCiderFoodItem> CRYPTIC_APPLE_CIDER =
			REGISTRATE.item("cryptic_apple_cider", CrypticAppleCiderFoodItem::new).register();
	public static final ItemEntry<BitterAppleCiderFoodItem> BITTER_APPLE_CIDER =
			REGISTRATE.item("bitter_apple_cider", BitterAppleCiderFoodItem::new).register();

	// Salt Compounds
	public static final ItemEntry<Item> CRUSHED_SALT_COMPOUND =
			REGISTRATE.item("crushed_salt", Item::new).register();
	public static final ItemEntry<Item> SALT_COMPOUND =
			REGISTRATE.item("salt_compound", Item::new).register();
	public static final ItemEntry<Item> UNPROCESSED_SALT_COMPOUND =
			REGISTRATE.item("unprocessed_salt_compound", Item::new).register();

	// Unique Uses
	public static final ItemEntry<BottledPeanutOilItem> BOTTLED_PEANUT_OIL =
			REGISTRATE.item("peanut_oil", BottledPeanutOilItem::new).register();
	public static final ItemEntry<CashewFruitItem> CASHEW_APPLE =
			REGISTRATE.item("cashew_fruit", CashewFruitItem::new).register();
	public static final ItemEntry<BitterAlmondFoodItem> BITTER_ALMOND =
			REGISTRATE.item("bitter_almond", BitterAlmondFoodItem::new).register();
	public static final ItemEntry<WalnutBrownieFoodItem> WALNUT_BROWNIE =
			REGISTRATE.item("brownie_walnuts", WalnutBrownieFoodItem::new).register();
	public static final ItemEntry<PecanPieFoodItem> PECAN_PIE =
			REGISTRATE.item("pecan_pie", PecanPieFoodItem::new).register();
	public static final ItemEntry<CashewCookieFoodItem> CASHEW_COOKIE =
			REGISTRATE.item("cashew_cookie", CashewCookieFoodItem::new).register();
	public static final ItemEntry<AlmondCheeseFoodItem> ALMOND_CHEESE =
			REGISTRATE.item("almond_cheese", AlmondCheeseFoodItem::new).register();

	// Misc
	public static final ItemEntry<Item> GARNISH_COMPOUND =
			REGISTRATE.item("garnish_compound", Item::new).register();
	public static final ItemEntry<Item> GARNISH_POWDER =
			REGISTRATE.item("garnish_powder", Item::new).register();

	// Misc Foods
	public static final ItemEntry<SaladFoodItem> SALAD =
			REGISTRATE.item("salad", SaladFoodItem::new).register();
	public static final ItemEntry<SaltedFoodItem> INCOMPLETE_PHANTOM_STEAK =
			REGISTRATE.item("incomplete_phantom_steak", SaltedFoodItem::new).register();
	public static final ItemEntry<PhantomSteakFoodItem> PHANTOM_STEAK =
			REGISTRATE.item("phantom_steak", PhantomSteakFoodItem::new).register();
	public static final ItemEntry<Item> INCOMPLETE_WALNUT_BROWNIE =
			REGISTRATE.item("incomplete_brownie_walnuts", Item::new).register();
	public static final ItemEntry<Item> INCOMPLETE_COOKIE =
			REGISTRATE.item("incomplete_cookie", Item::new).register();
	public static final ItemEntry<Item> INCOMPLETE_CASHEW_COOKIE =
			REGISTRATE.item("incomplete_cashew_cookie", Item::new).register();

	// Garnished v0.9: Incineration
	public static final ItemEntry<PeanutOilAndCinderSandwichFoodItem> PEANUT_OIL_AND_CINDER_SANDWICH =
			REGISTRATE.item("peanut_cinder_sandwich", PeanutOilAndCinderSandwichFoodItem::new).register();
	public static final ItemEntry<Item> INCOMPLETE_PEANUT_OIL_AND_CINDER_SANDWICH =
			REGISTRATE.item("incomplete_peanut_cinder_sandwich", Item::new).register();
	public static final ItemEntry<TophetBrewFoodItem> TOPHET_BREW =
			REGISTRATE.item("tophet_brew", TophetBrewFoodItem::new).register();
	public static final ItemEntry<Item> INCOMPLETE_TOPHET_BREW =
			REGISTRATE.item("incomplete_tophet_brew", Item::new).register();
	public static final ItemEntry<GrimStewFoodItem> GRIM_STEW =
			REGISTRATE.item("grim_stew", GrimStewFoodItem::new).register();
	public static final ItemEntry<WrappedWarpedTangleFoodItem> WRAPPED_WARPED_TANGLE =
			REGISTRATE.item("wrapped_warped_tangle", WrappedWarpedTangleFoodItem::new).register();
	public static final ItemEntry<WrappedCrimsonTangleFoodItem> WRAPPED_CRIMSON_TANGLE =
			REGISTRATE.item("wrapped_crimson_tangle", WrappedCrimsonTangleFoodItem::new).register();
	public static final ItemEntry<WeepingTangleFoodItem> WEEPING_TANGLE =
			REGISTRATE.item("weeping_tangle", WeepingTangleFoodItem::new).register();
	public static final ItemEntry<Item> INCOMPLETE_TANGLE =
			REGISTRATE.item("incomplete_tangle", Item::new).register();
	public static final ItemEntry<CinderRollFoodItem> CINDER_ROLL =
			REGISTRATE.item("cinder_roll", CinderRollFoodItem::new).register();
	public static final ItemEntry<Item> INCOMPLETE_CINDER_ROLL =
			REGISTRATE.item("incomplete_cinder_roll", Item::new).register();
	public static final ItemEntry<BlazingDelightFoodItem> BLAZING_DELIGHT =
			REGISTRATE.item("blazing_delight", BlazingDelightFoodItem::new).register();
	public static final ItemEntry<Item> INCOMPLETE_FERMENTED_CASHEW_MIXTURE =
			REGISTRATE.item("incomplete_cashew_mixture", Item::new).register();
	public static final ItemEntry<FermentedCashewMixtureItem> FERMENTED_CASHEW_MIXTURE =
			REGISTRATE.item("cashew_mixture", FermentedCashewMixtureItem::new).register();
	public static final ItemEntry<PutridStewFoodItem> PUTRID_STEW =
			REGISTRATE.item("putrid_stew", PutridStewFoodItem::new).register();

	public static final ItemEntry<Item> CRUSHED_SHROOMLIGHT =
			REGISTRATE.item("crushed_shroomlight", Item::new).register();
	public static final ItemEntry<Item> ENFLAMED_MANDIBLE =
			REGISTRATE.item("enflamed_mandible", Item::new).register();
	public static final ItemEntry<Item> CRIMSON_TUSK =
			REGISTRATE.item("crimson_tusk", Item::new).register();
	public static final ItemEntry<Item> INCOMPLETE_CRIMSON_TUSK =
			REGISTRATE.item("incomplete_crimson_tusk", Item::new).register();
	public static final ItemEntry<Item> EMPTY_CRIMSON_TUSK =
			REGISTRATE.item("empty_crimson_tusk", Item::new).register();
	public static final ItemEntry<Item> CRUSHED_ENDER_PEARL =
			REGISTRATE.item("crushed_ender_pearl", Item::new).register();
	public static final ItemEntry<Item> SILICA_HARDENED_WRAP =
			REGISTRATE.item("hardened_wrap", Item::new).register();
	public static final ItemEntry<Item> INCOMPLETE_SILICA_HARDENED_WRAP =
			REGISTRATE.item("incomplete_hardened_wrap", Item::new).register();
	public static final ItemEntry<Item> CRUSHED_WARPED_FUNGUS =
			REGISTRATE.item("crushed_warped_fungus", Item::new).register();
	public static final ItemEntry<Item> CRUSHED_CRIMSON_FUNGUS =
			REGISTRATE.item("crushed_crimson_fungus", Item::new).register();
	public static final ItemEntry<Item> BRITTLE_DUST =
			REGISTRATE.item("brittle_dust", Item::new).register();
	public static final ItemEntry<Item> SENILE_DUST =
			REGISTRATE.item("senile_dust", Item::new).register();
	public static final ItemEntry<SenileSpreadItem> SENILE_SPREAD =
			REGISTRATE.item("senile_spread", SenileSpreadItem::new).register();

	public static final ItemEntry<Item> CRUSHED_SEPIA_FUNGUS =
			REGISTRATE.item("crushed_sepia_fungus", Item::new).register();
	public static final ItemEntry<WrappedSepiaTangleFoodItem> WRAPPED_SEPIA_TANGLE =
			REGISTRATE.item("wrapped_sepia_tangle", WrappedSepiaTangleFoodItem::new).register();
	public static final ItemEntry<SoulKhanaFoodItem> SOUL_KHANA =
			REGISTRATE.item("soul_khana", SoulKhanaFoodItem::new).register();
	public static final ItemEntry<SpiritedConcoctionFoodItem> SPIRITED_CONCOCTION =
			REGISTRATE.item("spirited_concoction", SpiritedConcoctionFoodItem::new).register();

	public static final ItemEntry<SenileSweetFoodItem> SENILE_SWEET_BLACKSTONE =
			REGISTRATE.item("senile_sweet_blackstone", SenileSweetFoodItem::new).register();
	public static final ItemEntry<SenileSweetFoodItem> SENILE_SWEET_BASALT =
			REGISTRATE.item("senile_sweet_basalt", SenileSweetFoodItem::new).register();
	public static final ItemEntry<SenileSweetFoodItem> SENILE_SWEET_SCORIA =
			REGISTRATE.item("senile_sweet_scoria", SenileSweetFoodItem::new).register();
	public static final ItemEntry<SenileSweetFoodItem> SENILE_SWEET_SCORCHIA =
			REGISTRATE.item("senile_sweet_scorchia", SenileSweetFoodItem::new).register();
	public static final ItemEntry<Item> INCOMPLETE_SENILE_SWEET_BLACKSTONE =
			REGISTRATE.item("incomplete_senile_sweet_blackstone", Item::new).register();
	public static final ItemEntry<Item> INCOMPLETE_SENILE_SWEET_BASALT =
			REGISTRATE.item("incomplete_senile_sweet_basalt", Item::new).register();
	public static final ItemEntry<Item> INCOMPLETE_SENILE_SWEET_SCORIA =
			REGISTRATE.item("incomplete_senile_sweet_scoria", Item::new).register();
	public static final ItemEntry<Item> INCOMPLETE_SENILE_SWEET_SCORCHIA =
			REGISTRATE.item("incomplete_senile_sweet_scorchia", Item::new).register();

	public static final ItemEntry<Item> NUT_FLOUR =
			REGISTRATE.item("nut_flour", Item::new).register();
	public static final ItemEntry<NutNachoFoodItem> NUT_NACHO =
			REGISTRATE.item("nut_nacho", NutNachoFoodItem::new).register();
	public static final ItemEntry<NutNachoBowlFoodItem> NUT_NACHO_BOWL =
			REGISTRATE.item("nut_nacho_bowl", NutNachoBowlFoodItem::new).register();

	// Garnished v1.0: Desolation
	public static final ItemEntry<BottledEnderJellyFoodItem> BOTTLED_ENDER_JELLY =
			REGISTRATE.item("ender_jelly_bottle", BottledEnderJellyFoodItem::new).register();
	public static final ItemEntry<ChorusCocktailItem> CHORUS_COCKTAIL =
			REGISTRATE.item("chorus_cocktail", ChorusCocktailItem::new).register();
	public static final ItemEntry<CosmicBrewFoodItem> COSMIC_BREW =
			REGISTRATE.item("cosmic_brew", CosmicBrewFoodItem::new).register();
	public static final ItemEntry<DesolateStewFoodItem> DESOLATE_STEW =
			REGISTRATE.item("desolate_stew", DesolateStewFoodItem::new).register();
	public static final ItemEntry<EtherealConcoctionFoodItem> ETHEREAL_CONCOCTION =
			REGISTRATE.item("ethereal_concoction", EtherealConcoctionFoodItem::new).register();
	public static final ItemEntry<VoidMixtureFoodItem> VOID_MIXTURE =
			REGISTRATE.item("void_mixture", VoidMixtureFoodItem::new).register();
	public static final ItemEntry<ChorusBowlFoodItem> CHORUS_BOWL =
			REGISTRATE.item("chorus_bowl", ChorusBowlFoodItem::new).register();
	public static final ItemEntry<ChorusCookieFoodItem> CHORUS_COOKIE =
			REGISTRATE.item("chorus_cookie", ChorusCookieFoodItem::new).register();
	public static final ItemEntry<EnderJellyFoodItem> ENDER_JELLY_BLOB =
			REGISTRATE.item("ender_jelly", EnderJellyFoodItem::new).register();

	public static final ItemEntry<IlluminatingCocktailItem> ILLUMINATING_COCKTAIL =
			REGISTRATE.item("illuminating_cocktail", IlluminatingCocktailItem::new).register();

	public static final ItemEntry<Item> VOID_DUST =
			REGISTRATE.item("void_dust", Item::new).register();
	public static final ItemEntry<Item> CHORUS_TUFT =
			REGISTRATE.item("chorus_tuft", Item::new).register();
	public static final ItemEntry<Item> HOLLOWED_CHORUS_FRUIT =
			REGISTRATE.item("hollowed_chorus_fruit", Item::new).register();
	public static final ItemEntry<Item> ETHEREAL_COMPOUND =
			REGISTRATE.item("ethereal_compound", Item::new).register();
	public static final ItemEntry<Item> COSMIC_POWDER =
			REGISTRATE.item("cosmic_powder", Item::new).register();
	public static final ItemEntry<DesolateSpreadItem> DESOLATE_SPREAD =
			REGISTRATE.item("desolate_spread", DesolateSpreadItem::new).register();

	public static final ItemEntry<MulchItem> MULCH =
			REGISTRATE.item("mulch", MulchItem::new).register();
	public static final ItemEntry<MudPieFoodItem> MUD_PIE =
			REGISTRATE.item("mud_pie", MudPieFoodItem::new).register();

	// Garnished v1.1: Snare & Tear
	public static final ItemEntry<Item> MOLTEN_REMNANT =
			REGISTRATE.item("molten_remnant", Item::new).register();
	public static final ItemEntry<MoltenStewFoodItem> MOLTEN_STEW =
			REGISTRATE.item("molten_stew", MoltenStewFoodItem::new).register();

	// Hatchets
	public static final ItemEntry<WoodenHatchetToolItem> WOODEN_HATCHET =
			REGISTRATE.item("wooden_hatchet", WoodenHatchetToolItem::new).register();
	public static final ItemEntry<StoneHatchetToolItem> STONE_HATCHET =
			REGISTRATE.item("stone_hatchet", StoneHatchetToolItem::new).register();
	public static final ItemEntry<IronHatchetToolItem> IRON_HATCHET =
			REGISTRATE.item("iron_hatchet", IronHatchetToolItem::new).register();
	public static final ItemEntry<GoldHatchetToolItem> GOLDEN_HATCHET =
			REGISTRATE.item("golden_hatchet", GoldHatchetToolItem::new).register();
	public static final ItemEntry<DiamondHatchetToolItem> DIAMOND_HATCHET =
			REGISTRATE.item("diamond_hatchet", DiamondHatchetToolItem::new).register();
	public static final ItemEntry<NetheriteHatchetToolItem> NETHERITE_HATCHET =
			REGISTRATE.item("netherite_hatchet", NetheriteHatchetToolItem::new).register();

	// Garnished v1.3: Sugarcoated
	public static final ItemEntry<Item> VENERABLE_DOUGH =
			REGISTRATE.item("venerable_dough", Item::new).register();

	public static final ItemEntry<Item> UNFINISHED_VENERABLE_DELICACY =
			REGISTRATE.item("unfinished_venerable_delicacy", Item::new).register();
	public static final ItemEntry<VenerableDelicacyFoodItem> VENERABLE_DELICACY_RED =
			REGISTRATE.item("venerable_delicacy_red", VenerableDelicacyFoodItem::new).register();
	public static final ItemEntry<VenerableDelicacyFoodItem> VENERABLE_DELICACY_ORANGE =
			REGISTRATE.item("venerable_delicacy_orange", VenerableDelicacyFoodItem::new).register();
	public static final ItemEntry<VenerableDelicacyFoodItem> VENERABLE_DELICACY_YELLOW =
			REGISTRATE.item("venerable_delicacy_yellow", VenerableDelicacyFoodItem::new).register();
	public static final ItemEntry<VenerableDelicacyFoodItem> VENERABLE_DELICACY_GREEN =
			REGISTRATE.item("venerable_delicacy_green", VenerableDelicacyFoodItem::new).register();
	public static final ItemEntry<VenerableDelicacyFoodItem> VENERABLE_DELICACY_BLUE =
			REGISTRATE.item("venerable_delicacy_blue", VenerableDelicacyFoodItem::new).register();
	public static final ItemEntry<VenerableDelicacyFoodItem> VENERABLE_DELICACY_PURPLE =
			REGISTRATE.item("venerable_delicacy_purple", VenerableDelicacyFoodItem::new).register();

	public static final ItemEntry<SlimeDropFoodItem> SLIME_DROP =
			REGISTRATE.item("slime_drop", SlimeDropFoodItem::new).register();
	public static final ItemEntry<MasticCoveredSlimeDropFoodItem> MASTIC_COVERED_SLIME_DROP_RED =
			REGISTRATE.item("slime_drop_red", MasticCoveredSlimeDropFoodItem::new).register();
	public static final ItemEntry<MasticCoveredSlimeDropFoodItem> MASTIC_COVERED_SLIME_DROP_ORANGE =
			REGISTRATE.item("slime_drop_orange", MasticCoveredSlimeDropFoodItem::new).register();
	public static final ItemEntry<MasticCoveredSlimeDropFoodItem> MASTIC_COVERED_SLIME_DROP_YELLOW =
			REGISTRATE.item("slime_drop_yellow", MasticCoveredSlimeDropFoodItem::new).register();
	public static final ItemEntry<MasticCoveredSlimeDropFoodItem> MASTIC_COVERED_SLIME_DROP_GREEN =
			REGISTRATE.item("slime_drop_green", MasticCoveredSlimeDropFoodItem::new).register();
	public static final ItemEntry<MasticCoveredSlimeDropFoodItem> MASTIC_COVERED_SLIME_DROP_BLUE =
			REGISTRATE.item("slime_drop_blue", MasticCoveredSlimeDropFoodItem::new).register();
	public static final ItemEntry<MasticCoveredSlimeDropFoodItem> MASTIC_COVERED_SLIME_DROP_PURPLE =
			REGISTRATE.item("slime_drop_purple", MasticCoveredSlimeDropFoodItem::new).register();

	public static final ItemEntry<Item> MASTIC_RESIN =
			REGISTRATE.item("mastic_resin", Item::new).register();
	public static final ItemEntry<Item> MASTIC_RESIN_RED =
			REGISTRATE.item("mastic_resin_red", Item::new).register();
	public static final ItemEntry<Item> MASTIC_RESIN_ORANGE =
			REGISTRATE.item("mastic_resin_orange", Item::new).register();
	public static final ItemEntry<Item> MASTIC_RESIN_YELLOW =
			REGISTRATE.item("mastic_resin_yellow", Item::new).register();
	public static final ItemEntry<Item> MASTIC_RESIN_GREEN =
			REGISTRATE.item("mastic_resin_green", Item::new).register();
	public static final ItemEntry<Item> MASTIC_RESIN_BLUE =
			REGISTRATE.item("mastic_resin_blue", Item::new).register();
	public static final ItemEntry<Item> MASTIC_RESIN_PURPLE =
			REGISTRATE.item("mastic_resin_purple", Item::new).register();
	public static final ItemEntry<MasticPasteFoodItem> MASTIC_PASTE =
			REGISTRATE.item("mastic_paste", MasticPasteFoodItem::new).register();
	public static final ItemEntry<MasticPasteFoodItem> MASTIC_PASTE_RED =
			REGISTRATE.item("mastic_paste_red", MasticPasteFoodItem::new).register();
	public static final ItemEntry<MasticPasteFoodItem> MASTIC_PASTE_ORANGE =
			REGISTRATE.item("mastic_paste_orange", MasticPasteFoodItem::new).register();
	public static final ItemEntry<MasticPasteFoodItem> MASTIC_PASTE_YELLOW =
			REGISTRATE.item("mastic_paste_yellow", MasticPasteFoodItem::new).register();
	public static final ItemEntry<MasticPasteFoodItem> MASTIC_PASTE_GREEN =
			REGISTRATE.item("mastic_paste_green", MasticPasteFoodItem::new).register();
	public static final ItemEntry<MasticPasteFoodItem> MASTIC_PASTE_BLUE =
			REGISTRATE.item("mastic_paste_blue", MasticPasteFoodItem::new).register();
	public static final ItemEntry<MasticPasteFoodItem> MASTIC_PASTE_PURPLE =
			REGISTRATE.item("mastic_paste_purple", MasticPasteFoodItem::new).register();

	public static final ItemEntry<Item> VOLATILE_DUST =
			REGISTRATE.item("volatile_dust", Item::new).register();

	public static final ItemEntry<GalacticCaneFoodItem> GALACTIC_CANE =
			REGISTRATE.item("galactic_cane", GalacticCaneFoodItem::new).register();
	public static final ItemEntry<MerryTreatFoodItem> MERRY_TREAT =
			REGISTRATE.item("merry_treat", MerryTreatFoodItem::new).register();
	public static final ItemEntry<IcyMasticChunkFoodItem> ICY_MASTIC_CHUNK =
			REGISTRATE.item("icy_mastic_chunk", IcyMasticChunkFoodItem::new).register();
	public static final ItemEntry<CoalTruffleFoodItem> COAL_TRUFFLE =
			REGISTRATE.item("coal_truffle", CoalTruffleFoodItem::new).register();
	public static final ItemEntry<BaklavaFoodItem> BAKLAVA =
			REGISTRATE.item("baklava", BaklavaFoodItem::new).register();
	public static final ItemEntry<SturdyWaffleFoodItem> STURDY_WAFFLE =
			REGISTRATE.item("sturdy_waffle", SturdyWaffleFoodItem::new).register();

	public static final ItemEntry<SepiaSignItem> SEPIA_SIGN =
			REGISTRATE.item("sepia_sign", SepiaSignItem::new).register();
	public static final ItemEntry<SepiaSignItem.Hanging> SEPIA_HANGING_SIGN =
			REGISTRATE.item("sepia_hanging_sign", SepiaSignItem.Hanging::new).register();

	public static final ItemEntry<NutSignItem> NUT_SIGN =
			REGISTRATE.item("nut_sign", NutSignItem::new).register();
	public static final ItemEntry<NutSignItem.Hanging> NUT_HANGING_SIGN =
			REGISTRATE.item("nut_hanging_sign", NutSignItem.Hanging::new).register();

	public static final ItemEntry<NutBoatItem> NUT_BOAT =
			REGISTRATE.item("nut_boat", NutBoatItem::new).register();
	public static final ItemEntry<NutChestBoatItem> NUT_CHEST_BOAT =
			REGISTRATE.item("nut_chest_boat", NutChestBoatItem::new).register();

	// Farmer's Delight Items
	public static final ItemEntry<PecanPieSliceFoodItem> PECAN_PIE_SLICE =
			REGISTRATE.item("pecan_pie_slice", PecanPieSliceFoodItem::new).register();
	public static final ItemEntry<PhantomBurgerFoodItem> PHANTOM_BURGER =
			REGISTRATE.item("phantom_burger", PhantomBurgerFoodItem::new).register();
	public static final ItemEntry<PhantomBeefPattyFoodItem> PHANTOM_BEEF_PATTY =
			REGISTRATE.item("phantom_beef_patty", PhantomBeefPattyFoodItem::new).register();

	public static final ItemEntry<GlowInkRollFoodItem> GLOW_INK_ROLL =
			REGISTRATE.item("glow_ink_roll", GlowInkRollFoodItem::new).register();
	public static final ItemEntry<GlowInkRollSliceFoodItem> GLOW_INK_ROLL_SLICE =
			REGISTRATE.item("glow_ink_roll_slice", GlowInkRollSliceFoodItem::new).register();

	// Integrated Hatchets
	public static final ItemEntry<JadeHatchetToolItem> JADE_HATCHET =
			REGISTRATE.item("jade_hatchet", JadeHatchetToolItem::new).register();
	public static final ItemEntry<TopazHatchetToolItem> TOPAZ_HATCHET =
			REGISTRATE.item("topaz_hatchet", TopazHatchetToolItem::new).register();
	public static final ItemEntry<SapphireHatchetToolItem> SAPPHIRE_HATCHET =
			REGISTRATE.item("sapphire_hatchet", SapphireHatchetToolItem::new).register();
	public static final ItemEntry<RubyHatchetToolItem> RUBY_HATCHET =
			REGISTRATE.item("ruby_hatchet", RubyHatchetToolItem::new).register();
	public static final ItemEntry<AmetrineHatchetToolItem> AMETRINE_HATCHET =
			REGISTRATE.item("ametrine_hatchet", AmetrineHatchetToolItem::new).register();
	public static final ItemEntry<AquamarineHatchetToolItem> AQUAMARINE_HATCHET =
			REGISTRATE.item("aquamarine_hatchet", AquamarineHatchetToolItem::new).register();

	public static final ItemEntry<WardenHatchetToolItem> WARDEN_HATCHET =
			REGISTRATE.item("warden_hatchet", WardenHatchetToolItem::new).properties((p) -> p.rarity(Rarity.RARE).fireResistant()).register();

	public static final ItemEntry<RoseGoldHatchetToolItem> ROSE_GOLD_HATCHET =
			REGISTRATE.item("rose_gold_hatchet", RoseGoldHatchetToolItem::new).register();
	public static final ItemEntry<GildedNetheriteHatchetToolItem> GILDED_NETHERITE_HATCHET =
			REGISTRATE.item("gilded_netherite_hatchet", GildedNetheriteHatchetToolItem::new).register();


	public static void setRegister() {}

}
