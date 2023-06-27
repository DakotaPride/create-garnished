package net.dakotapride.garnished.registry;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.item.CrackedCashewItem;
import net.dakotapride.garnished.item.GarnishedNutItem;
import net.dakotapride.garnished.item.GarnishedSoilItem;
import net.dakotapride.garnished.item.UngarnishedNutItem;
import net.dakotapride.garnished.item.WithCinderFlourItem;
import net.dakotapride.garnished.item.WithMeltedCinderFlourItem;

@SuppressWarnings({"unused"})
public class GarnishedItems {

	private static final CreateRegistrate REGISTRATE = CreateGarnished.registrate()
			.creativeModeTab(() -> GarnishedTabs.GARNISHED);

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
	public static final ItemEntry<WithMeltedCinderFlourItem> SPEED_CINDER_CASHEW =
			REGISTRATE.item("cinder_cashew_speed", WithMeltedCinderFlourItem::new).register();

	public static final ItemEntry<GarnishedSoilItem> GARNISHED_SOIL =
			REGISTRATE.item("garnished_soil", GarnishedSoilItem::new).register();

	public static void setRegister() {}

}
