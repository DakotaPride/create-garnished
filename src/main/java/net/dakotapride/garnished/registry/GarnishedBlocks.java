package net.dakotapride.garnished.registry;

import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.block.NutCropBlock;
import net.dakotapride.garnished.block.NutPlantBlock;
import net.dakotapride.garnished.block.SolidifiedGarnishBlock;
import net.minecraft.world.level.block.Block;

@SuppressWarnings({"unused"})
public class GarnishedBlocks {
	private static final CreateRegistrate REGISTRATE = CreateGarnished.registrate()
		.creativeModeTab(() -> GarnishedTabs.GARNISHED);

	public static final BlockEntry<NutCropBlock> CASHEW_CROP =
			REGISTRATE.block("cashew_crop", NutCropBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();

	public static final BlockEntry<NutCropBlock> WALNUT_CROP =
			REGISTRATE.block("walnut_crop", NutCropBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();

	public static final BlockEntry<NutCropBlock> ALMOND_CROP =
			REGISTRATE.block("almond_crop", NutCropBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();

	public static final BlockEntry<NutCropBlock> PECAN_CROP =
			REGISTRATE.block("pecan_crop", NutCropBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();

	public static final BlockEntry<NutCropBlock> PISTACHIO_CROP =
			REGISTRATE.block("pistachio_crop", NutCropBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();

	public static final BlockEntry<NutCropBlock> MACADAMIA_CROP =
			REGISTRATE.block("macadamia_crop", NutCropBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();

	public static final BlockEntry<NutPlantBlock> NUT_PLANT =
			REGISTRATE.block("nut_plant", NutPlantBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();

	public static final BlockEntry<SolidifiedGarnishBlock> SOLIDIFIED_GARNISH_BLOCK =
			REGISTRATE.block("solidified_garnish", SolidifiedGarnishBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem().register();

	public static void setRegister() {}
}
