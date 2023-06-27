package net.dakotapride.garnished.registry;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.item.SweetenedNutItem;
import net.dakotapride.garnished.item.cracked.CrackedAlmondItem;
import net.dakotapride.garnished.item.cracked.CrackedCashewItem;
import net.dakotapride.garnished.item.GarnishedNutItem;
import net.dakotapride.garnished.item.GarnishedSoilItem;
import net.dakotapride.garnished.item.UngarnishedNutItem;
import net.dakotapride.garnished.item.WithCinderFlourItem;
import net.dakotapride.garnished.item.WithMeltedCinderFlourItem;
import net.dakotapride.garnished.item.cracked.CrackedWalnutItem;

@SuppressWarnings({"unused"})
public class GarnishedItems {

	private static final CreateRegistrate REGISTRATE = CreateGarnished.registrate()
			.creativeModeTab(() -> GarnishedTabs.GARNISHED);

	// Cashews
	public static final ItemEntry<CrackedCashewItem> CRACKED_CASHEW =
			REGISTRATE.item("cracked_cashew", CrackedCashewItem::new).register();

	public static final ItemEntry<UngarnishedNutItem> UNGARNISHED_CASHEW =
			REGISTRATE.item("ungarnished_cashew", UngarnishedNutItem::new).register();
	public static final ItemEntry<GarnishedNutItem> CASHEW =
			REGISTRATE.item("cashew", GarnishedNutItem::new).register();
	public static final ItemEntry<WithCinderFlourItem> CINDER_FLOUR_CASHEW =
			REGISTRATE.item("cinder_cashew", WithCinderFlourItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> MELTED_CINDER_FLOUR_CASHEW =
			REGISTRATE.item("melted_cinder_cashew", WithMeltedCinderFlourItem::new).register();
	public static final ItemEntry<SweetenedNutItem> SWEETENED_CASHEW =
			REGISTRATE.item("sweetened_cashew", SweetenedNutItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> SPEED_CINDER_CASHEW =
			REGISTRATE.item("cinder_cashew_speed", WithMeltedCinderFlourItem::new).register();

	// Walnuts
	public static final ItemEntry<CrackedWalnutItem> CRACKED_WALNUT =
			REGISTRATE.item("cracked_walnut", CrackedWalnutItem::new).register();

	public static final ItemEntry<UngarnishedNutItem> UNGARNISHED_WALNUT =
			REGISTRATE.item("ungarnished_walnut", UngarnishedNutItem::new).register();
	public static final ItemEntry<GarnishedNutItem> WALNUT =
			REGISTRATE.item("walnut", GarnishedNutItem::new).register();
	public static final ItemEntry<WithCinderFlourItem> CINDER_FLOUR_WALNUT =
			REGISTRATE.item("cinder_walnut", WithCinderFlourItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> MELTED_CINDER_FLOUR_WALNUT =
			REGISTRATE.item("melted_cinder_walnut", WithMeltedCinderFlourItem::new).register();
	public static final ItemEntry<SweetenedNutItem> SWEETENED_WALNUT =
			REGISTRATE.item("sweetened_walnut", SweetenedNutItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> SPEED_CINDER_WALNUT =
			REGISTRATE.item("cinder_walnut_strength", WithMeltedCinderFlourItem::new).register();

	// Almonds
	public static final ItemEntry<CrackedAlmondItem> CRACKED_ALMOND =
			REGISTRATE.item("cracked_almond", CrackedAlmondItem::new).register();

	public static final ItemEntry<UngarnishedNutItem> UNGARNISHED_ALMOND =
			REGISTRATE.item("ungarnished_almond", UngarnishedNutItem::new).register();
	public static final ItemEntry<GarnishedNutItem> ALMOND =
			REGISTRATE.item("almond", GarnishedNutItem::new).register();
	public static final ItemEntry<WithCinderFlourItem> CINDER_FLOUR_ALMOND =
			REGISTRATE.item("cinder_almond", WithCinderFlourItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> MELTED_CINDER_FLOUR_ALMOND =
			REGISTRATE.item("melted_cinder_almond", WithMeltedCinderFlourItem::new).register();
	public static final ItemEntry<SweetenedNutItem> SWEETENED_ALMOND =
			REGISTRATE.item("sweetened_almond", SweetenedNutItem::new).register();
	public static final ItemEntry<WithMeltedCinderFlourItem> SPEED_CINDER_ALMOND =
			REGISTRATE.item("cinder_almond_strength", WithMeltedCinderFlourItem::new).register();

	public static final ItemEntry<GarnishedSoilItem> GARNISHED_SOIL =
			REGISTRATE.item("garnished_soil", GarnishedSoilItem::new).register();

	public static void setRegister() {}

}
