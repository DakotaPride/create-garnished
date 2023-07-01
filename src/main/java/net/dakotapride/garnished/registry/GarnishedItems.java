package net.dakotapride.garnished.registry;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.item.*;
import net.dakotapride.garnished.item.cracked.*;

@SuppressWarnings({"unused"})
public class GarnishedItems {

	private static final CreateRegistrate REGISTRATE = CreateGarnished.registrate()
			.creativeModeTab(() -> GarnishedTabs.GARNISHED);

	// Cashews
	public static final ItemEntry<CrackedCashewItem> CRACKED_CASHEW =
			REGISTRATE.item("cracked_cashew", CrackedCashewItem::new).register();

	public static final ItemEntry<UngarnishedNutItem> UNGARNISHED_CASHEW =
			REGISTRATE.item("ungarnished_cashew", UngarnishedNutItem::new).register();
	public static final ItemEntry<GarnishedNutFoodItem> CASHEW =
			REGISTRATE.item("cashew", GarnishedNutFoodItem::new).register();
	public static final ItemEntry<WithCinderFlourItem> CINDER_FLOUR_CASHEW =
			REGISTRATE.item("cinder_cashew", WithCinderFlourItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> MELTED_CINDER_FLOUR_CASHEW =
			REGISTRATE.item("melted_cinder_cashew", WithMeltedCinderFlourItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> SPEED_CINDER_CASHEW =
			REGISTRATE.item("cinder_cashew_speed", WithMeltedCinderFlourItem::new).register();
	public static final ItemEntry<SweetenedNutItem> SWEETENED_CASHEW =
			REGISTRATE.item("sweetened_cashew", SweetenedNutItem::new).register();

	// Walnuts
	public static final ItemEntry<CrackedWalnutItem> CRACKED_WALNUT =
			REGISTRATE.item("cracked_walnut", CrackedWalnutItem::new).register();

	public static final ItemEntry<UngarnishedNutItem> UNGARNISHED_WALNUT =
			REGISTRATE.item("ungarnished_walnut", UngarnishedNutItem::new).register();
	public static final ItemEntry<GarnishedNutFoodItem> WALNUT =
			REGISTRATE.item("walnut", GarnishedNutFoodItem::new).register();
	public static final ItemEntry<WithCinderFlourItem> CINDER_FLOUR_WALNUT =
			REGISTRATE.item("cinder_walnut", WithCinderFlourItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> MELTED_CINDER_FLOUR_WALNUT =
			REGISTRATE.item("melted_cinder_walnut", WithMeltedCinderFlourItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> STRENGTH_CINDER_WALNUT =
			REGISTRATE.item("cinder_walnut_strength", WithMeltedCinderFlourItem::new).register();
	public static final ItemEntry<SweetenedNutItem> SWEETENED_WALNUT =
			REGISTRATE.item("sweetened_walnut", SweetenedNutItem::new).register();

	// Almonds
	public static final ItemEntry<CrackedAlmondItem> CRACKED_ALMOND =
			REGISTRATE.item("cracked_almond", CrackedAlmondItem::new).register();

	public static final ItemEntry<UngarnishedNutItem> UNGARNISHED_ALMOND =
			REGISTRATE.item("ungarnished_almond", UngarnishedNutItem::new).register();
	public static final ItemEntry<GarnishedNutFoodItem> ALMOND =
			REGISTRATE.item("almond", GarnishedNutFoodItem::new).register();
	public static final ItemEntry<WithCinderFlourItem> CINDER_FLOUR_ALMOND =
			REGISTRATE.item("cinder_almond", WithCinderFlourItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> MELTED_CINDER_FLOUR_ALMOND =
			REGISTRATE.item("melted_cinder_almond", WithMeltedCinderFlourItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> HASTE_CINDER_ALMOND =
			REGISTRATE.item("cinder_almond_haste", WithMeltedCinderFlourItem::new).register();
	public static final ItemEntry<SweetenedNutItem> SWEETENED_ALMOND =
			REGISTRATE.item("sweetened_almond", SweetenedNutItem::new).register();

	// Pecans
	public static final ItemEntry<CrackedPecanItem> CRACKED_PECAN =
			REGISTRATE.item("cracked_pecan", CrackedPecanItem::new).register();

	public static final ItemEntry<UngarnishedNutItem> UNGARNISHED_PECAN =
			REGISTRATE.item("ungarnished_pecan", UngarnishedNutItem::new).register();
	public static final ItemEntry<GarnishedNutFoodItem> PECAN =
			REGISTRATE.item("pecan", GarnishedNutFoodItem::new).register();
	public static final ItemEntry<WithCinderFlourItem> CINDER_FLOUR_PECAN =
			REGISTRATE.item("cinder_pecan", WithCinderFlourItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> MELTED_CINDER_FLOUR_PECAN =
			REGISTRATE.item("melted_cinder_pecan", WithMeltedCinderFlourItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> RESISTANCE_CINDER_PECAN =
			REGISTRATE.item("cinder_pecan_resistance", WithMeltedCinderFlourItem::new).register();
	public static final ItemEntry<SweetenedNutItem> SWEETENED_PECAN =
			REGISTRATE.item("sweetened_pecan", SweetenedNutItem::new).register();

	// Pistachios
	public static final ItemEntry<CrackedPistachioItem> CRACKED_PISTACHIO =
			REGISTRATE.item("cracked_pistachio", CrackedPistachioItem::new).register();

	public static final ItemEntry<UngarnishedNutItem> UNGARNISHED_PISTACHIO =
			REGISTRATE.item("ungarnished_pistachio", UngarnishedNutItem::new).register();
	public static final ItemEntry<GarnishedNutFoodItem> PISTACHIO =
			REGISTRATE.item("pistachio", GarnishedNutFoodItem::new).register();
	public static final ItemEntry<WithCinderFlourItem> CINDER_FLOUR_PISTACHIO =
			REGISTRATE.item("cinder_pistachio", WithCinderFlourItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> MELTED_CINDER_FLOUR_PISTACHIO =
			REGISTRATE.item("melted_cinder_pistachio", WithMeltedCinderFlourItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> NIGHT_VISION_CINDER_PISTACHIO =
			REGISTRATE.item("cinder_pistachio_night_vision", WithMeltedCinderFlourItem::new).register();
	public static final ItemEntry<SweetenedNutItem> SWEETENED_PISTACHIO =
			REGISTRATE.item("sweetened_pistachio", SweetenedNutItem::new).register();

	// Macadamia
	public static final ItemEntry<CrackedMacadamiaItem> CRACKED_MACADAMIA =
			REGISTRATE.item("cracked_macadamia", CrackedMacadamiaItem::new).register();

	public static final ItemEntry<UngarnishedNutItem> UNGARNISHED_MACADAMIA =
			REGISTRATE.item("ungarnished_macadamia", UngarnishedNutItem::new).register();
	public static final ItemEntry<GarnishedNutFoodItem> MACADAMIA =
			REGISTRATE.item("macadamia", GarnishedNutFoodItem::new).register();
	public static final ItemEntry<WithCinderFlourItem> CINDER_FLOUR_MACADAMIA =
			REGISTRATE.item("cinder_macadamia", WithCinderFlourItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> MELTED_CINDER_FLOUR_MACADAMIA =
			REGISTRATE.item("melted_cinder_macadamia", WithMeltedCinderFlourItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> NIGHT_VISION_CINDER_MACADAMIA =
			REGISTRATE.item("cinder_macadamia_fire_resistance", WithMeltedCinderFlourItem::new).register();
	public static final ItemEntry<SweetenedNutItem> SWEETENED_MACADAMIA =
			REGISTRATE.item("sweetened_macadamia", SweetenedNutItem::new).register();

	// Nut mix
	public static final ItemEntry<NutMixItem> NUT_MIX =
			REGISTRATE.item("nut_mix", NutMixItem::new).register();
	public static final ItemEntry<SweetenedNutMixItem> SWEETENED_NUT_MIX =
			REGISTRATE.item("sweetened_nut_mix", SweetenedNutMixItem::new).register();

	public static final ItemEntry<HoneyedNutMixItem> HONEYED_NUT_MIX =
			REGISTRATE.item("honeyed_nut_mix", HoneyedNutMixItem::new).register();

	// Sweet Berries
	public static final ItemEntry<GarnishedFoodItem> GARNISHED_SWEET_BERRIES =
			REGISTRATE.item("garnished_sweet_berries", GarnishedFoodItem::new).register();
	public static final ItemEntry<HoneyedSweetBerriesItem> HONEYED_SWEET_BERRIES =
			REGISTRATE.item("honeyed_sweet_berries", HoneyedSweetBerriesItem::new).register();

	public static void setRegister() {
	}

}
