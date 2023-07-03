package net.dakotapride.garnished.registry;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.item.CinderFlourNutFoodItem;
import net.dakotapride.garnished.item.GarnishedNutFoodItem;
import net.dakotapride.garnished.item.GarnishedSweetBerriesFoodItem;
import net.dakotapride.garnished.item.HoneyedNutFoodItem;
import net.dakotapride.garnished.item.HoneyedNutMixFoodItem;
import net.dakotapride.garnished.item.HoneyedSweetBerriesFoodItem;
import net.dakotapride.garnished.item.MeltedCinderFlourNutFoodItem;
import net.dakotapride.garnished.item.NutMixFoodItem;
import net.dakotapride.garnished.item.SweetenedNutFoodItem;
import net.dakotapride.garnished.item.SweetenedNutMixFoodItem;
import net.dakotapride.garnished.item.UngarnishedNutFoodItem;
import net.dakotapride.garnished.item.cracked.*;

@SuppressWarnings({"unused"})
public class GarnishedItems {

	private static final CreateRegistrate REGISTRATE = CreateGarnished.registrate()
			.creativeModeTab(() -> GarnishedTabs.GARNISHED);

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
	public static final ItemEntry<MeltedCinderFlourNutFoodItem> SPEED_CINDER_CASHEW =
			REGISTRATE.item("cinder_cashew_speed", MeltedCinderFlourNutFoodItem::new).register();
	public static final ItemEntry<SweetenedNutFoodItem> SWEETENED_CASHEW =
			REGISTRATE.item("sweetened_cashew", SweetenedNutFoodItem::new).register();
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
	public static final ItemEntry<MeltedCinderFlourNutFoodItem> STRENGTH_CINDER_WALNUT =
			REGISTRATE.item("cinder_walnut_strength", MeltedCinderFlourNutFoodItem::new).register();
	public static final ItemEntry<SweetenedNutFoodItem> SWEETENED_WALNUT =
			REGISTRATE.item("sweetened_walnut", SweetenedNutFoodItem::new).register();
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
	public static final ItemEntry<MeltedCinderFlourNutFoodItem> HASTE_CINDER_ALMOND =
			REGISTRATE.item("cinder_almond_haste", MeltedCinderFlourNutFoodItem::new).register();
	public static final ItemEntry<SweetenedNutFoodItem> SWEETENED_ALMOND =
			REGISTRATE.item("sweetened_almond", SweetenedNutFoodItem::new).register();
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
	public static final ItemEntry<MeltedCinderFlourNutFoodItem> RESISTANCE_CINDER_PECAN =
			REGISTRATE.item("cinder_pecan_resistance", MeltedCinderFlourNutFoodItem::new).register();
	public static final ItemEntry<SweetenedNutFoodItem> SWEETENED_PECAN =
			REGISTRATE.item("sweetened_pecan", SweetenedNutFoodItem::new).register();
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
	public static final ItemEntry<MeltedCinderFlourNutFoodItem> NIGHT_VISION_CINDER_PISTACHIO =
			REGISTRATE.item("cinder_pistachio_night_vision", MeltedCinderFlourNutFoodItem::new).register();
	public static final ItemEntry<SweetenedNutFoodItem> SWEETENED_PISTACHIO =
			REGISTRATE.item("sweetened_pistachio", SweetenedNutFoodItem::new).register();
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
	public static final ItemEntry<MeltedCinderFlourNutFoodItem> FIRE_RESISTANCE_CINDER_MACADAMIA =
			REGISTRATE.item("cinder_macadamia_fire_resistance", MeltedCinderFlourNutFoodItem::new).register();
	public static final ItemEntry<SweetenedNutFoodItem> SWEETENED_MACADAMIA =
			REGISTRATE.item("sweetened_macadamia", SweetenedNutFoodItem::new).register();
	public static final ItemEntry<HoneyedNutFoodItem> HONEYED_MACADAMIA =
			REGISTRATE.item("honeyed_macadamia", HoneyedNutFoodItem::new).register();

	// Nut mix
	public static final ItemEntry<NutMixFoodItem> NUT_MIX =
			REGISTRATE.item("nut_mix", NutMixFoodItem::new).register();
	public static final ItemEntry<SweetenedNutMixFoodItem> SWEETENED_NUT_MIX =
			REGISTRATE.item("sweetened_nut_mix", SweetenedNutMixFoodItem::new).register();
	public static final ItemEntry<HoneyedNutMixFoodItem> HONEYED_NUT_MIX =
			REGISTRATE.item("honeyed_nut_mix", HoneyedNutMixFoodItem::new).register();

	// Sweet Berries
	public static final ItemEntry<GarnishedSweetBerriesFoodItem> GARNISHED_SWEET_BERRIES =
			REGISTRATE.item("garnished_sweet_berries", GarnishedSweetBerriesFoodItem::new).register();
	public static final ItemEntry<HoneyedSweetBerriesFoodItem> HONEYED_SWEET_BERRIES =
			REGISTRATE.item("honeyed_sweet_berries", HoneyedSweetBerriesFoodItem::new).register();

	public static void setRegister() {
	}

}
