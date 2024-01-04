package net.dakotapride.garnished.registry;

import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.block.AbyssalStoneBlock;
import net.dakotapride.garnished.block.AbyssalStoneSlabBlock;
import net.dakotapride.garnished.block.AbyssalStoneStairsBlock;
import net.dakotapride.garnished.block.AbyssalStoneWallBlock;
import net.dakotapride.garnished.block.CarnotiteStairsBlock;
import net.dakotapride.garnished.block.EnderJellyBlock;
import net.dakotapride.garnished.block.MasticBlock;
import net.dakotapride.garnished.block.NutSackBlock;
import net.dakotapride.garnished.block.SolidifiedGarnishBlock;
import net.dakotapride.garnished.block.SoulPlantBlock;
import net.dakotapride.garnished.block.UnstableStoneBlock;
import net.dakotapride.garnished.block.UnstableStoneSlabBlock;
import net.dakotapride.garnished.block.UnstableStoneStairsBlock;
import net.dakotapride.garnished.block.UnstableStoneWallBlock;
import net.dakotapride.garnished.block.VoltaicSeagrassBlock;
import net.dakotapride.garnished.block.kelp.DulseKelpBlock;
import net.dakotapride.garnished.block.kelp.DulseKelpPlantBlock;
import net.dakotapride.garnished.block.kelp.VermilionKelpBlock;
import net.dakotapride.garnished.block.kelp.VermilionKelpPlantBlock;
import net.dakotapride.garnished.block.nut.NutButtonBlock;
import net.dakotapride.garnished.block.nut.NutDoorBlock;
import net.dakotapride.garnished.block.nut.NutFenceGateBlock;
import net.dakotapride.garnished.block.nut.NutHangingSignBlock;
import net.dakotapride.garnished.block.nut.NutLeavesBlock;
import net.dakotapride.garnished.block.nut.NutLogBlock;
import net.dakotapride.garnished.block.nut.NutPressurePlateBlock;
import net.dakotapride.garnished.block.nut.NutSignBlock;
import net.dakotapride.garnished.block.nut.NutStairsBlock;
import net.dakotapride.garnished.block.nut.NutTrapdoorBlock;
import net.dakotapride.garnished.block.nut.NutWallHangingSignBlock;
import net.dakotapride.garnished.block.nut.NutWallSignBlock;
import net.dakotapride.garnished.block.sapling.AlmondSaplingBlock;
import net.dakotapride.garnished.block.sapling.BuhgSaplingBlock;
import net.dakotapride.garnished.block.sapling.CashewSaplingBlock;
import net.dakotapride.garnished.block.sapling.ChestnutSaplingBlock;
import net.dakotapride.garnished.block.sapling.EndPlantBlock;
import net.dakotapride.garnished.block.sapling.HazelnutSaplingBlock;
import net.dakotapride.garnished.block.sapling.MacadamiaSaplingBlock;
import net.dakotapride.garnished.block.sapling.PecanSaplingBlock;
import net.dakotapride.garnished.block.sapling.PistachioSaplingBlock;
import net.dakotapride.garnished.block.sapling.SepiaFungusBlock;
import net.dakotapride.garnished.block.sapling.WalnutSaplingBlock;
import net.dakotapride.garnished.block.sepia.SepiaButtonBlock;
import net.dakotapride.garnished.block.sepia.SepiaDoorBlock;
import net.dakotapride.garnished.block.sepia.SepiaFenceGateBlock;
import net.dakotapride.garnished.block.sepia.SepiaHangingSignBlock;
import net.dakotapride.garnished.block.sepia.SepiaPressurePlateBlock;
import net.dakotapride.garnished.block.sepia.SepiaSignBlock;
import net.dakotapride.garnished.block.sepia.SepiaStairsBlock;
import net.dakotapride.garnished.block.sepia.SepiaStemBlock;
import net.dakotapride.garnished.block.sepia.SepiaTrapdoorBlock;
import net.dakotapride.garnished.block.sepia.SepiaWallHangingSignBlock;
import net.dakotapride.garnished.block.sepia.SepiaWallSignBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

@SuppressWarnings({"unused"})
public class GarnishedBlocks {
	private static final CreateRegistrate REGISTRATE = CreateGarnished.registrate()
		.useCreativeTab(GarnishedTabs.GARNISHED.key());

	public static final BlockEntry<Block> NUT_PLANT =
			REGISTRATE.block("nut_plant", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.properties(p -> p.mapColor(MapColor.GRASS).noCollission().instabreak().sound(SoundType.GRASS))
					.register();

	public static final BlockEntry<NutSackBlock> BUHG_SACK =
			REGISTRATE.block("peanut_sack", NutSackBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.WHITE_WOOL)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN))
					.simpleItem()
					.register();
	public static final BlockEntry<NutSackBlock> WALNUT_SACK =
			REGISTRATE.block("walnut_sack", NutSackBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.WHITE_WOOL)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN))
					.simpleItem()
					.register();
	public static final BlockEntry<NutSackBlock> CASHEW_SACK =
			REGISTRATE.block("cashew_sack", NutSackBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.WHITE_WOOL)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN))
					.simpleItem()
					.register();
	public static final BlockEntry<NutSackBlock> MACADAMIA_SACK =
			REGISTRATE.block("macadamia_sack", NutSackBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.WHITE_WOOL)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN))
					.simpleItem()
					.register();
	public static final BlockEntry<NutSackBlock> PISTACHIO_SACK =
			REGISTRATE.block("pistachio_sack", NutSackBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.WHITE_WOOL)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN))
					.simpleItem()
					.register();
	public static final BlockEntry<NutSackBlock> ALMOND_SACK =
			REGISTRATE.block("almond_sack", NutSackBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.WHITE_WOOL)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN))
					.simpleItem()
					.register();
	public static final BlockEntry<NutSackBlock> PECAN_SACK =
			REGISTRATE.block("pecan_sack", NutSackBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.WHITE_WOOL)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN))
					.simpleItem()
					.register();
	public static final BlockEntry<NutSackBlock> HAZELNUT_SACK =
			REGISTRATE.block("hazelnut_sack", NutSackBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.WHITE_WOOL)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN))
					.simpleItem()
					.register();
	public static final BlockEntry<NutSackBlock> CHESTNUT_SACK =
			REGISTRATE.block("chestnut_sack", NutSackBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.WHITE_WOOL)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN))
					.simpleItem()
					.register();

	public static final BlockEntry<BuhgSaplingBlock> BUHG_SAPLING =
			REGISTRATE.block("peanut_sapling", BuhgSaplingBlock::new)
					.initialProperties(() -> Blocks.OAK_SAPLING)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.properties(p -> p.mapColor(MapColor.GRASS).noCollission().instabreak().sound(SoundType.GRASS))
					.register();
	public static final BlockEntry<WalnutSaplingBlock> WALNUT_SAPLING =
			REGISTRATE.block("walnut_sapling", WalnutSaplingBlock::new)
					.initialProperties(() -> Blocks.OAK_SAPLING)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.properties(p -> p.mapColor(MapColor.GRASS).noCollission().instabreak().sound(SoundType.GRASS))
					.register();
	public static final BlockEntry<CashewSaplingBlock> CASHEW_SAPLING =
			REGISTRATE.block("cashew_sapling", CashewSaplingBlock::new)
					.initialProperties(() -> Blocks.OAK_SAPLING)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.properties(p -> p.mapColor(MapColor.GRASS).noCollission().instabreak().sound(SoundType.GRASS))
					.register();
	public static final BlockEntry<MacadamiaSaplingBlock> MACADAMIA_SAPLING =
			REGISTRATE.block("macadamia_sapling", MacadamiaSaplingBlock::new)
					.initialProperties(() -> Blocks.OAK_SAPLING)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.properties(p -> p.mapColor(MapColor.GRASS).noCollission().instabreak().sound(SoundType.GRASS))
					.register();
	public static final BlockEntry<PistachioSaplingBlock> PISTACHIO_SAPLING =
			REGISTRATE.block("pistachio_sapling", PistachioSaplingBlock::new)
					.initialProperties(() -> Blocks.OAK_SAPLING)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.properties(p -> p.mapColor(MapColor.GRASS).noCollission().instabreak().sound(SoundType.GRASS))
					.register();
	public static final BlockEntry<AlmondSaplingBlock> ALMOND_SAPLING =
			REGISTRATE.block("almond_sapling", AlmondSaplingBlock::new)
					.initialProperties(() -> Blocks.OAK_SAPLING)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.properties(p -> p.mapColor(MapColor.GRASS).noCollission().instabreak().sound(SoundType.GRASS))
					.register();
	public static final BlockEntry<PecanSaplingBlock> PECAN_SAPLING =
			REGISTRATE.block("pecan_sapling", PecanSaplingBlock::new)
					.initialProperties(() -> Blocks.OAK_SAPLING)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.properties(p -> p.mapColor(MapColor.GRASS).noCollission().instabreak().sound(SoundType.GRASS))
					.register();
	public static final BlockEntry<HazelnutSaplingBlock> HAZELNUT_SAPLING =
			REGISTRATE.block("hazelnut_sapling", HazelnutSaplingBlock::new)
					.initialProperties(() -> Blocks.OAK_SAPLING)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.properties(p -> p.mapColor(MapColor.GRASS).noCollission().instabreak().sound(SoundType.GRASS))
					.register();
	public static final BlockEntry<ChestnutSaplingBlock> CHESTNUT_SAPLING =
			REGISTRATE.block("chestnut_sapling", ChestnutSaplingBlock::new)
					.initialProperties(() -> Blocks.OAK_SAPLING)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.properties(p -> p.mapColor(MapColor.GRASS).noCollission().instabreak().sound(SoundType.GRASS))
					.register();

	public static final BlockEntry<NutLeavesBlock> NUT_LEAVES =
			REGISTRATE.block("nut_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.OAK_LEAVES)
					.simpleItem()
					.properties(p -> p.mapColor(MapColor.GRASS).noOcclusion().strength(0.2F).randomTicks())
					.register();

	public static final BlockEntry<NutLeavesBlock> BUHG_LEAVES =
			REGISTRATE.block("peanut_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.OAK_LEAVES)
					.simpleItem()
					.properties(p -> p.mapColor(MapColor.GRASS).noOcclusion().strength(0.2F).randomTicks())
					.register();
	public static final BlockEntry<NutLeavesBlock> WALNUT_LEAVES =
			REGISTRATE.block("walnut_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.OAK_LEAVES)
					.simpleItem()
					.properties(p -> p.mapColor(MapColor.GRASS).noOcclusion().strength(0.2F).randomTicks())
					.register();
	public static final BlockEntry<NutLeavesBlock> CASHEW_LEAVES =
			REGISTRATE.block("cashew_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.OAK_LEAVES)
					.simpleItem()
					.properties(p -> p.mapColor(MapColor.GRASS).noOcclusion().strength(0.2F).randomTicks())
					.register();
	public static final BlockEntry<NutLeavesBlock> MACADAMIA_LEAVES =
			REGISTRATE.block("macadamia_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.OAK_LEAVES)
					.simpleItem()
					.properties(p -> p.mapColor(MapColor.GRASS).noOcclusion().strength(0.2F).randomTicks())
					.register();
	public static final BlockEntry<NutLeavesBlock> PISTACHIO_LEAVES =
			REGISTRATE.block("pistachio_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.OAK_LEAVES)
					.simpleItem()
					.properties(p -> p.mapColor(MapColor.GRASS).noOcclusion().strength(0.2F).randomTicks())
					.register();
	public static final BlockEntry<NutLeavesBlock> ALMOND_LEAVES =
			REGISTRATE.block("almond_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.OAK_LEAVES)
					.simpleItem()
					.properties(p -> p.mapColor(MapColor.GRASS).noOcclusion().strength(0.2F).randomTicks())
					.register();
	public static final BlockEntry<NutLeavesBlock> PECAN_LEAVES =
			REGISTRATE.block("pecan_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.OAK_LEAVES)
					.simpleItem()
					.properties(p -> p.mapColor(MapColor.GRASS).noOcclusion().strength(0.2F).randomTicks())
					.register();
	public static final BlockEntry<NutLeavesBlock> HAZELNUT_LEAVES =
			REGISTRATE.block("hazelnut_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.OAK_LEAVES)
					.simpleItem()
					.properties(p -> p.mapColor(MapColor.GRASS).noOcclusion().strength(0.2F).randomTicks())
					.register();
	public static final BlockEntry<NutLeavesBlock> CHESTNUT_LEAVES =
			REGISTRATE.block("chestnut_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.OAK_LEAVES)
					.simpleItem()
					.properties(p -> p.mapColor(MapColor.GRASS).noOcclusion().strength(0.2F).randomTicks())
					.register();

	public static final BlockEntry<SolidifiedGarnishBlock> SOLIDIFIED_GARNISH_BLOCK =
			REGISTRATE.block("solidified_garnish", SolidifiedGarnishBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem().register();

	public static final BlockEntry<SepiaFungusBlock> SEPIA_FUNGUS =
			REGISTRATE.block("sepia_fungus", SepiaFungusBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_FUNGUS)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN).noCollission().noOcclusion()
							.pushReaction(PushReaction.DESTROY).instabreak()).register();

	public static final BlockEntry<SepiaStemBlock> SEPIA_STEM =
			REGISTRATE.block("sepia_stem", SepiaStemBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_STEM).register();
	public static final BlockEntry<SepiaStemBlock> STRIPPED_SEPIA_STEM =
			REGISTRATE.block("stripped_sepia_stem", SepiaStemBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STRIPPED_CRIMSON_STEM)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();
	public static final BlockEntry<SepiaStemBlock> SEPIA_HYPHAE =
			REGISTRATE.block("sepia_hyphae", SepiaStemBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_HYPHAE).register();
	public static final BlockEntry<SepiaStemBlock> STRIPPED_SEPIA_HYPHAE =
			REGISTRATE.block("stripped_sepia_hyphae", SepiaStemBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STRIPPED_CRIMSON_HYPHAE)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();
	public static final BlockEntry<Block> SEPIA_WART_BLOCK =
			REGISTRATE.block("sepia_wart_block", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.NETHER_WART_BLOCK)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();
	public static final BlockEntry<SepiaTrapdoorBlock> SEPIA_TRAPDOOR =
			REGISTRATE.block("sepia_trapdoor", SepiaTrapdoorBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_TRAPDOOR)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();
	public static final BlockEntry<SepiaDoorBlock> SEPIA_DOOR =
			REGISTRATE.block("sepia_door", SepiaDoorBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_DOOR)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();
	public static final BlockEntry<Block> SEPIA_PLANKS =
			REGISTRATE.block("sepia_planks", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_PLANKS)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();
	public static final BlockEntry<SlabBlock> SEPIA_SLAB =
			REGISTRATE.block("sepia_slab", SlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_SLAB)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();
	public static final BlockEntry<SepiaStairsBlock> SEPIA_STAIRS =
			REGISTRATE.block("sepia_stairs", SepiaStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_STAIRS)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();
	// v1.3
	public static final BlockEntry<SepiaSignBlock> SEPIA_SIGN =
			REGISTRATE.block("sepia_sign", SepiaSignBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.CRIMSON_SIGN)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();
	public static final BlockEntry<SepiaWallSignBlock> SEPIA_WALL_SIGN =
			REGISTRATE.block("sepia_wall_sign", SepiaWallSignBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.CRIMSON_WALL_SIGN)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();
	public static final BlockEntry<SepiaHangingSignBlock> SEPIA_HANGING_SIGN =
			REGISTRATE.block("sepia_hanging_sign", SepiaHangingSignBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.CRIMSON_HANGING_SIGN)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();
	public static final BlockEntry<SepiaWallHangingSignBlock> SEPIA_WALL_HANGING_SIGN =
			REGISTRATE.block("sepia_wall_hanging_sign", SepiaWallHangingSignBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.CRIMSON_WALL_HANGING_SIGN)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();
	public static final BlockEntry<FenceBlock> SEPIA_FENCE =
			REGISTRATE.block("sepia_fence", FenceBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_FENCE)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();
	public static final BlockEntry<SepiaFenceGateBlock> SEPIA_FENCE_GATE =
			REGISTRATE.block("sepia_fence_gate", SepiaFenceGateBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_FENCE_GATE)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();
	public static final BlockEntry<SepiaButtonBlock> SEPIA_BUTTON =
			REGISTRATE.block("sepia_button", SepiaButtonBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_BUTTON)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();
	public static final BlockEntry<SepiaPressurePlateBlock> SEPIA_PRESSURE_PLATE =
			REGISTRATE.block("sepia_pressure_plate", SepiaPressurePlateBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_PRESSURE_PLATE)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN)).register();

	public static final BlockEntry<SoulPlantBlock> SOUL_ROOTS =
			REGISTRATE.block("soul_roots", SoulPlantBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_ROOTS)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).noCollission().noOcclusion()
							.pushReaction(PushReaction.DESTROY).instabreak()).register();

	public static final BlockEntry<EnderJellyBlock> BLOCK_OF_ENDER_JELLY =
			REGISTRATE.block("ender_jelly_block", EnderJellyBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.HONEY_BLOCK)
					.properties(p -> p.mapColor(MapColor.COLOR_CYAN).noOcclusion().instabreak()).register();

	public static final BlockEntry<EndPlantBlock> BARREN_ROOTS =
			REGISTRATE.block("barren_roots", EndPlantBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_ROOTS)
					.properties(p -> p.mapColor(MapColor.TERRACOTTA_WHITE).noCollission().noOcclusion().instabreak()).register();

	public static final BlockEntry<EndPlantBlock> SMALL_CHORUS_PLANT =
			REGISTRATE.block("small_chorus_plant", EndPlantBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_ROOTS)
					.properties(p -> p.mapColor(MapColor.COLOR_PURPLE).noCollission().noOcclusion().instabreak()).register();

	public static final BlockEntry<Block> UNGARNISHED_NUT_BLOCK =
			REGISTRATE.block("ungarnished_nut_block", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OAK_WOOD).register();
	public static final BlockEntry<Block> GARNISHED_NUT_BLOCK =
			REGISTRATE.block("garnished_nut_block", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OAK_WOOD).register();

	public static final BlockEntry<Block> NUT_PLANKS =
			REGISTRATE.block("nut_planks", Block::new)
					.initialProperties(() -> Blocks.OAK_PLANKS).simpleItem().register();
	public static final BlockEntry<NutLogBlock> NUT_LOG =
			REGISTRATE.block("nut_log", NutLogBlock::new)
					.initialProperties(() -> Blocks.OAK_LOG).simpleItem().register();
	public static final BlockEntry<NutLogBlock> STRIPPED_NUT_LOG =
			REGISTRATE.block("stripped_nut_log", NutLogBlock::new)
					.initialProperties(() -> Blocks.STRIPPED_OAK_LOG).simpleItem().register();
	public static final BlockEntry<NutLogBlock> NUT_WOOD =
			REGISTRATE.block("nut_wood", NutLogBlock::new)
					.initialProperties(() -> Blocks.OAK_WOOD).simpleItem().register();
	public static final BlockEntry<NutLogBlock> STRIPPED_NUT_WOOD =
			REGISTRATE.block("stripped_nut_wood", NutLogBlock::new)
					.initialProperties(() -> Blocks.STRIPPED_OAK_WOOD).simpleItem().register();
	public static final BlockEntry<SlabBlock> NUT_SLAB =
			REGISTRATE.block("nut_slab", SlabBlock::new)
					.initialProperties(() -> Blocks.OAK_SLAB).simpleItem().register();
	public static final BlockEntry<NutStairsBlock> NUT_STAIRS =
			REGISTRATE.block("nut_stairs", NutStairsBlock::new)
					.initialProperties(() -> Blocks.OAK_STAIRS).simpleItem().register();
	public static final BlockEntry<NutDoorBlock> NUT_DOOR =
			REGISTRATE.block("nut_door", NutDoorBlock::new)
					.initialProperties(() -> Blocks.OAK_DOOR).simpleItem().register();
	public static final BlockEntry<NutTrapdoorBlock> NUT_TRAPDOOR =
			REGISTRATE.block("nut_trapdoor", NutTrapdoorBlock::new)
					.initialProperties(() -> Blocks.OAK_TRAPDOOR).simpleItem().register();
	// v1.3
	public static final BlockEntry<NutSignBlock> NUT_SIGN =
			REGISTRATE.block("nut_sign", NutSignBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.OAK_SIGN)
					.properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GREEN)).register();
	public static final BlockEntry<NutWallSignBlock> NUT_WALL_SIGN =
			REGISTRATE.block("nut_wall_sign", NutWallSignBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.OAK_WALL_SIGN)
					.properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GREEN)).register();
	public static final BlockEntry<NutHangingSignBlock> NUT_HANGING_SIGN =
			REGISTRATE.block("nut_hanging_sign", NutHangingSignBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.OAK_HANGING_SIGN)
					.properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GREEN)).register();
	public static final BlockEntry<NutWallHangingSignBlock> NUT_WALL_HANGING_SIGN =
			REGISTRATE.block("nut_wall_hanging_sign", NutWallHangingSignBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.OAK_WALL_HANGING_SIGN)
					.properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GREEN)).register();
	public static final BlockEntry<FenceBlock> NUT_FENCE =
			REGISTRATE.block("nut_fence", FenceBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OAK_FENCE)
					.properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GREEN)).register();
	public static final BlockEntry<NutFenceGateBlock> NUT_FENCE_GATE =
			REGISTRATE.block("nut_fence_gate", NutFenceGateBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OAK_FENCE_GATE)
					.properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GREEN)).register();
	public static final BlockEntry<NutButtonBlock> NUT_BUTTON =
			REGISTRATE.block("nut_button", NutButtonBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OAK_BUTTON)
					.properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GREEN)).register();
	public static final BlockEntry<NutPressurePlateBlock> NUT_PRESSURE_PLATE =
			REGISTRATE.block("nut_pressure_plate", NutPressurePlateBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OAK_PRESSURE_PLATE)
					.properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GREEN)).register();

	public static final BlockEntry<MasticBlock> MASTIC_BLOCK =
			REGISTRATE.block("mastic_block", MasticBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.SLIME_BLOCK)
					.properties(p -> p.noOcclusion().instabreak()).register();
	public static final BlockEntry<MasticBlock> RED_MASTIC_BLOCK =
			REGISTRATE.block("red_mastic_block", MasticBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.SLIME_BLOCK)
					.properties(p -> p.noOcclusion().instabreak()).register();
	public static final BlockEntry<MasticBlock> ORANGE_MASTIC_BLOCK =
			REGISTRATE.block("orange_mastic_block", MasticBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.SLIME_BLOCK)
					.properties(p -> p.noOcclusion().instabreak()).register();
	public static final BlockEntry<MasticBlock> YELLOW_MASTIC_BLOCK =
			REGISTRATE.block("yellow_mastic_block", MasticBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.SLIME_BLOCK)
					.properties(p -> p.noOcclusion().instabreak()).register();
	public static final BlockEntry<MasticBlock> GREEN_MASTIC_BLOCK =
			REGISTRATE.block("green_mastic_block", MasticBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.SLIME_BLOCK)
					.properties(p -> p.noOcclusion().instabreak()).register();
	public static final BlockEntry<MasticBlock> BLUE_MASTIC_BLOCK =
			REGISTRATE.block("blue_mastic_block", MasticBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.SLIME_BLOCK)
					.properties(p -> p.noOcclusion().instabreak()).register();
	public static final BlockEntry<MasticBlock> PURPLE_MASTIC_BLOCK =
			REGISTRATE.block("purple_mastic_block", MasticBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.SLIME_BLOCK)
					.properties(p -> p.noOcclusion().instabreak()).register();

	public static final BlockEntry<AbyssalStoneBlock> ABYSSAL_STONE =
			REGISTRATE.block("abyssal_stone", AbyssalStoneBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OBSIDIAN)
					.properties(p -> p.sound(SoundType.STONE).destroyTime(35.0F).explosionResistance(6.0F)).register();
	public static final BlockEntry<AbyssalStoneSlabBlock> ABYSSAL_STONE_SLAB =
			REGISTRATE.block("abyssal_stone_slab", AbyssalStoneSlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OBSIDIAN)
					.properties(p -> p.sound(SoundType.STONE).destroyTime(35.0F).explosionResistance(6.0F)).register();
	public static final BlockEntry<AbyssalStoneStairsBlock> ABYSSAL_STONE_STAIRS =
			REGISTRATE.block("abyssal_stone_stairs", AbyssalStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OBSIDIAN)
					.properties(p -> p.sound(SoundType.STONE).destroyTime(35.0F).explosionResistance(6.0F)).register();
	public static final BlockEntry<AbyssalStoneWallBlock> ABYSSAL_STONE_WALL =
			REGISTRATE.block("abyssal_stone_wall", AbyssalStoneWallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OBSIDIAN)
					.properties(p -> p.sound(SoundType.STONE).destroyTime(35.0F).explosionResistance(6.0F)).register();
	public static final BlockEntry<AbyssalStoneBlock> POLISHED_ABYSSAL_STONE =
			REGISTRATE.block("polished_abyssal_stone", AbyssalStoneBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OBSIDIAN)
					.properties(p -> p.sound(SoundType.STONE).destroyTime(35.0F).explosionResistance(6.0F)).register();
	public static final BlockEntry<AbyssalStoneSlabBlock> POLISHED_ABYSSAL_STONE_SLAB =
			REGISTRATE.block("polished_abyssal_stone_slab", AbyssalStoneSlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OBSIDIAN)
					.properties(p -> p.sound(SoundType.STONE).destroyTime(35.0F).explosionResistance(6.0F)).register();
	public static final BlockEntry<AbyssalStoneStairsBlock> POLISHED_ABYSSAL_STONE_STAIRS =
			REGISTRATE.block("polished_abyssal_stone_stairs", AbyssalStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OBSIDIAN)
					.properties(p -> p.sound(SoundType.STONE).destroyTime(35.0F).explosionResistance(6.0F)).register();
	public static final BlockEntry<AbyssalStoneWallBlock> POLISHED_ABYSSAL_STONE_WALL =
			REGISTRATE.block("polished_abyssal_stone_wall", AbyssalStoneWallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OBSIDIAN)
					.properties(p -> p.sound(SoundType.STONE).destroyTime(35.0F).explosionResistance(6.0F)).register();
	public static final BlockEntry<AbyssalStoneBlock> ABYSSAL_STONE_BRICKS =
			REGISTRATE.block("abyssal_stone_bricks", AbyssalStoneBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OBSIDIAN)
					.properties(p -> p.sound(SoundType.STONE).destroyTime(35.0F).explosionResistance(6.0F)).register();
	public static final BlockEntry<AbyssalStoneSlabBlock> ABYSSAL_STONE_BRICKS_SLAB =
			REGISTRATE.block("abyssal_stone_bricks_slab", AbyssalStoneSlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OBSIDIAN)
					.properties(p -> p.sound(SoundType.STONE).destroyTime(35.0F).explosionResistance(6.0F)).register();
	public static final BlockEntry<AbyssalStoneStairsBlock> ABYSSAL_STONE_BRICKS_STAIRS =
			REGISTRATE.block("abyssal_stone_bricks_stairs", AbyssalStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OBSIDIAN)
					.properties(p -> p.sound(SoundType.STONE).destroyTime(35.0F).explosionResistance(6.0F)).register();
	public static final BlockEntry<AbyssalStoneWallBlock> ABYSSAL_STONE_BRICKS_WALL =
			REGISTRATE.block("abyssal_stone_bricks_wall", AbyssalStoneWallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OBSIDIAN)
					.properties(p -> p.sound(SoundType.STONE).destroyTime(35.0F).explosionResistance(6.0F)).register();
	public static final BlockEntry<AbyssalStoneBlock> CHISELED_ABYSSAL_STONE_BRICKS =
			REGISTRATE.block("chiseled_abyssal_stone_bricks", AbyssalStoneBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OBSIDIAN)
					.properties(p -> p.sound(SoundType.STONE).destroyTime(35.0F).explosionResistance(6.0F)).register();


	public static final BlockEntry<Block> CARNOTITE =
			REGISTRATE.block("carnotite", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<SlabBlock> CARNOTITE_SLAB =
			REGISTRATE.block("carnotite_slab", SlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<CarnotiteStairsBlock> CARNOTITE_STAIRS =
			REGISTRATE.block("carnotite_stairs", CarnotiteStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<WallBlock> CARNOTITE_WALL =
			REGISTRATE.block("carnotite_wall", WallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<Block> POLISHED_CARNOTITE =
			REGISTRATE.block("polished_carnotite", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<SlabBlock> POLISHED_CARNOTITE_SLAB =
			REGISTRATE.block("polished_carnotite_slab", SlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<CarnotiteStairsBlock> POLISHED_CARNOTITE_STAIRS =
			REGISTRATE.block("polished_carnotite_stairs", CarnotiteStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<WallBlock> POLISHED_CARNOTITE_WALL =
			REGISTRATE.block("polished_carnotite_wall", WallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<Block> CARNOTITE_BRICKS =
			REGISTRATE.block("carnotite_bricks", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<SlabBlock> CARNOTITE_BRICKS_SLAB =
			REGISTRATE.block("carnotite_bricks_slab", SlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<CarnotiteStairsBlock> CARNOTITE_BRICKS_STAIRS =
			REGISTRATE.block("carnotite_bricks_stairs", CarnotiteStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<WallBlock> CARNOTITE_BRICKS_WALL =
			REGISTRATE.block("carnotite_bricks_wall", WallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<Block> CHISELED_CARNOTITE_BRICKS =
			REGISTRATE.block("chiseled_carnotite_bricks", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();

	public static final BlockEntry<UnstableStoneBlock> UNSTABLE_STONE =
			REGISTRATE.block("unstable_stone", UnstableStoneBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneSlabBlock> UNSTABLE_STONE_SLAB =
			REGISTRATE.block("unstable_stone_slab", UnstableStoneSlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneStairsBlock> UNSTABLE_STONE_STAIRS =
			REGISTRATE.block("unstable_stone_stairs", UnstableStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneWallBlock> UNSTABLE_STONE_WALL =
			REGISTRATE.block("unstable_stone_wall", UnstableStoneWallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneBlock> POLISHED_UNSTABLE_STONE =
			REGISTRATE.block("polished_unstable_stone", UnstableStoneBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneSlabBlock> POLISHED_UNSTABLE_STONE_SLAB =
			REGISTRATE.block("polished_unstable_stone_slab", UnstableStoneSlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneStairsBlock> POLISHED_UNSTABLE_STONE_STAIRS =
			REGISTRATE.block("polished_unstable_stone_stairs", UnstableStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneWallBlock> POLISHED_UNSTABLE_STONE_WALL =
			REGISTRATE.block("polished_unstable_stone_wall", UnstableStoneWallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneBlock> UNSTABLE_STONE_BRICKS =
			REGISTRATE.block("unstable_stone_bricks", UnstableStoneBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneSlabBlock> UNSTABLE_STONE_BRICKS_SLAB =
			REGISTRATE.block("unstable_stone_bricks_slab", UnstableStoneSlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneStairsBlock> UNSTABLE_STONE_BRICKS_STAIRS =
			REGISTRATE.block("unstable_stone_bricks_stairs", UnstableStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneWallBlock> UNSTABLE_STONE_BRICKS_WALL =
			REGISTRATE.block("unstable_stone_bricks_wall", UnstableStoneWallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneBlock> CHISELED_UNSTABLE_STONE_BRICKS =
			REGISTRATE.block("chiseled_unstable_stone_bricks", UnstableStoneBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();

	// v1.5
	public static final BlockEntry<VermilionKelpBlock> VERMILION_KELP =
			REGISTRATE.block("vermilion_kelp", VermilionKelpBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.KELP).register();
	public static final BlockEntry<VermilionKelpPlantBlock> VERMILION_KELP_PLANT =
			REGISTRATE.block("vermilion_kelp_plant", VermilionKelpPlantBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.KELP_PLANT).register();
	public static final BlockEntry<Block> DRIED_VERMILION_KELP_BLOCK =
			REGISTRATE.block("dried_vermilion_kelp_block", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.DRIED_KELP_BLOCK).register();

	public static final BlockEntry<DulseKelpBlock> DULSE_KELP =
			REGISTRATE.block("dulse_kelp", DulseKelpBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.KELP).register();
	public static final BlockEntry<DulseKelpPlantBlock> DULSE_KELP_PLANT =
			REGISTRATE.block("dulse_kelp_plant", DulseKelpPlantBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.KELP_PLANT).register();
	public static final BlockEntry<Block> DRIED_DULSE_KELP_BLOCK =
			REGISTRATE.block("dried_dulse_kelp_block", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.DRIED_KELP_BLOCK).register();

	public static final BlockEntry<VoltaicSeagrassBlock> VOLTAIC_SEA_GRASS =
			REGISTRATE.block("voltaic_sea_grass", VoltaicSeagrassBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.SEAGRASS).register();

	public static void setRegister() {}
}
