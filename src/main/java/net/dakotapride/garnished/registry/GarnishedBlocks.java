package net.dakotapride.garnished.registry;

import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.block.NutLeavesBlock;
import net.dakotapride.garnished.block.SolidifiedGarnishBlock;
import net.dakotapride.garnished.block.sapling.AlmondSaplingBlock;
import net.dakotapride.garnished.block.sapling.BuhgSaplingBlock;
import net.dakotapride.garnished.block.sapling.CashewSaplingBlock;
import net.dakotapride.garnished.block.sapling.HazelnutSaplingBlock;
import net.dakotapride.garnished.block.sapling.MacadamiaSaplingBlock;
import net.dakotapride.garnished.block.sapling.PecanSaplingBlock;
import net.dakotapride.garnished.block.sapling.PistachioSaplingBlock;
import net.dakotapride.garnished.block.sapling.WalnutSaplingBlock;
import net.minecraft.world.level.block.Block;

@SuppressWarnings({"unused"})
public class GarnishedBlocks {
	private static final CreateRegistrate REGISTRATE = CreateGarnished.registrate()
		.creativeModeTab(() -> GarnishedTabs.GARNISHED);

	public static final BlockEntry<Block> NUT_PLANT =
			REGISTRATE.block("nut_plant", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();

	public static final BlockEntry<BuhgSaplingBlock> BUHG_SAPLING =
			REGISTRATE.block("peanut_sapling", BuhgSaplingBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();
	public static final BlockEntry<WalnutSaplingBlock> WALNUT_SAPLING =
			REGISTRATE.block("walnut_sapling", WalnutSaplingBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();
	public static final BlockEntry<CashewSaplingBlock> CASHEW_SAPLING =
			REGISTRATE.block("cashew_sapling", CashewSaplingBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();
	public static final BlockEntry<MacadamiaSaplingBlock> MACADAMIA_SAPLING =
			REGISTRATE.block("macadamia_sapling", MacadamiaSaplingBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();
	public static final BlockEntry<PistachioSaplingBlock> PISTACHIO_SAPLING =
			REGISTRATE.block("pistachio_sapling", PistachioSaplingBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();
	public static final BlockEntry<AlmondSaplingBlock> ALMOND_SAPLING =
			REGISTRATE.block("almond_sapling", AlmondSaplingBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();
	public static final BlockEntry<PecanSaplingBlock> PECAN_SAPLING =
			REGISTRATE.block("pecan_sapling", PecanSaplingBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();
	public static final BlockEntry<HazelnutSaplingBlock> HAZELNUT_SAPLING =
			REGISTRATE.block("hazelnut_sapling", HazelnutSaplingBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();

	public static final BlockEntry<NutLeavesBlock> NUT_LEAVES =
			REGISTRATE.block("nut_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();

	public static final BlockEntry<NutLeavesBlock> BUHG_LEAVES =
			REGISTRATE.block("peanut_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();
	public static final BlockEntry<NutLeavesBlock> WALNUT_LEAVES =
			REGISTRATE.block("walnut_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();
	public static final BlockEntry<NutLeavesBlock> CASHEW_LEAVES =
			REGISTRATE.block("cashew_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();
	public static final BlockEntry<NutLeavesBlock> MACADAMIA_LEAVES =
			REGISTRATE.block("macadamia_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();
	public static final BlockEntry<NutLeavesBlock> PISTACHIO_LEAVES =
			REGISTRATE.block("pistachio_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();
	public static final BlockEntry<NutLeavesBlock> ALMOND_LEAVES =
			REGISTRATE.block("almond_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();
	public static final BlockEntry<NutLeavesBlock> PECAN_LEAVES =
			REGISTRATE.block("pecan_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();
	public static final BlockEntry<NutLeavesBlock> HAZELNUT_LEAVES =
			REGISTRATE.block("hazelnut_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();

	public static final BlockEntry<SolidifiedGarnishBlock> SOLIDIFIED_GARNISH_BLOCK =
			REGISTRATE.block("solidified_garnish", SolidifiedGarnishBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.register();

	public static void setRegister() {}
}
