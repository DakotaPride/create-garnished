package net.dakotapride.garnished.registry;

import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;

import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.block.GarnishingStandBlock;
import net.dakotapride.garnished.block.NutCropBlock;

@SuppressWarnings({"unused"})
public class GarnishedBlocks {
	private static final CreateRegistrate REGISTRATE = CreateGarnished.registrate()
		.creativeModeTab(() -> GarnishedTabs.GARNISHED);

	public static final BlockEntry<NutCropBlock> CASHEW_CROP =
			REGISTRATE.block("cashew_crop", NutCropBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();

	public static final BlockEntry<GarnishingStandBlock> GARNISHING_STAND =
			REGISTRATE.block("garnishing_stand", GarnishingStandBlock::new)
			.initialProperties(SharedProperties::copperMetal)
			.transform(pickaxeOnly())
			.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
			.simpleItem()
			.register();

	public static void setRegister() {}
}
