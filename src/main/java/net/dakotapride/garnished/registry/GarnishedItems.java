package net.dakotapride.garnished.registry;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.item.*;
import net.dakotapride.garnished.item.cracked.*;
import net.minecraft.world.item.Item;

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

	// Salt Compounds
	public static final ItemEntry<Item> CRUSHED_SALT_COMPOUND =
			REGISTRATE.item("crushed_salt", Item::new).register();
	public static final ItemEntry<Item> SALT_COMPOUND =
			REGISTRATE.item("salt_compound", Item::new).register();
	public static final ItemEntry<Item> UNPROCESSED_SALT_COMPOUND =
			REGISTRATE.item("unprocessed_salt_compound", Item::new).register();

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

	public static void setRegister() {}

}
