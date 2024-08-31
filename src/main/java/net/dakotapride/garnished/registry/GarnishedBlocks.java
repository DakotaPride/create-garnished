package net.dakotapride.garnished.registry;

import com.simibubi.create.content.decoration.palettes.ConnectedGlassPaneBlock;
import com.simibubi.create.content.decoration.palettes.WindowBlock;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullFunction;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.block.AbyssalStoneBlock;
import net.dakotapride.garnished.block.AbyssalStoneSlabBlock;
import net.dakotapride.garnished.block.AbyssalStoneStairsBlock;
import net.dakotapride.garnished.block.AbyssalStoneWallBlock;
import net.dakotapride.garnished.block.BokChoyPlantBlock;
import net.dakotapride.garnished.block.CarnotiteStairsBlock;
import net.dakotapride.garnished.block.DragonStoneStairsBlock;
import net.dakotapride.garnished.block.EnderJellyBlock;
import net.dakotapride.garnished.block.MasticBlock;
import net.dakotapride.garnished.block.NetherFlowerBlock;
import net.dakotapride.garnished.block.NetherLichenBlock;
import net.dakotapride.garnished.block.NumbingParchmentBlock;
import net.dakotapride.garnished.block.NutSackBlock;
import net.dakotapride.garnished.block.RitualisticStoneStairsBlock;
import net.dakotapride.garnished.block.SolidifiedGarnishBlock;
import net.dakotapride.garnished.block.SoulPlantBlock;
import net.dakotapride.garnished.block.UnstableStoneBlock;
import net.dakotapride.garnished.block.UnstableStoneSlabBlock;
import net.dakotapride.garnished.block.UnstableStoneStairsBlock;
import net.dakotapride.garnished.block.UnstableStoneWallBlock;
import net.dakotapride.garnished.block.VoltaicSeagrassBlock;
import net.dakotapride.garnished.block.ZultaniteStairsBlock;
import net.dakotapride.garnished.block.cake.AnniversaryCakeBlock;
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
import net.dakotapride.garnished.block.potted_blocks.PottedAureateShrubBlock;
import net.dakotapride.garnished.block.potted_blocks.PottedBarrenRootsBlock;
import net.dakotapride.garnished.block.potted_blocks.PottedIncandescentLilyBlock;
import net.dakotapride.garnished.block.potted_blocks.PottedPansophicalDaisyBlock;
import net.dakotapride.garnished.block.potted_blocks.PottedSepiaFungusBlock;
import net.dakotapride.garnished.block.potted_blocks.PottedSmallChorusPlantBlock;
import net.dakotapride.garnished.block.potted_blocks.PottedSoulRootsBlock;
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
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import static net.dakotapride.garnished.registry.GarnishedCT.woodenWindowBlock;
import static net.dakotapride.garnished.registry.GarnishedCT.woodenWindowPaneBlock;

@SuppressWarnings({"unused"})
public class GarnishedBlocks {
	private static final CreateRegistrate REGISTRATE = CreateGarnished.registrate()
		.setCreativeTab(GarnishedTabs.GARNISHED.key());

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

	public static final BlockEntry<NutLeavesBlock> UNASSIGNED_NUT_LEAVES =
			REGISTRATE.block("unassigned_nut_leaves", NutLeavesBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.initialProperties(() -> Blocks.OAK_LEAVES)
					.simpleItem()
					.properties(p -> p.mapColor(MapColor.GRASS).noOcclusion().strength(0.2F).randomTicks())
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

	// 2.0 - It took how many months for these windows to FINALLY be added? Damn.
	public static final BlockEntry<WindowBlock> NUT_WINDOW = woodenWindowBlock("nut", () -> GarnishedCT.NUT_WINDOW, GarnishedBlocks.NUT_PLANKS);
	public static final BlockEntry<WindowBlock> SEPIA_WINDOW = woodenWindowBlock("sepia", () -> GarnishedCT.SEPIA_WINDOW, GarnishedBlocks.SEPIA_PLANKS);

	public static final BlockEntry<ConnectedGlassPaneBlock> NUT_WINDOW_PANE =
			woodenWindowPaneBlock("nut", () -> GarnishedCT.NUT_WINDOW_PANE, GarnishedBlocks.NUT_WINDOW);
	public static final BlockEntry<ConnectedGlassPaneBlock> SEPIA_WINDOW_PANE =
			woodenWindowPaneBlock("sepia", () -> GarnishedCT.SEPIA_WINDOW_PANE, GarnishedBlocks.SEPIA_WINDOW);

	// Other
	public static final BlockEntry<NumbingParchmentBlock> NUMBING_PARCHMENT_BLOCK =
			REGISTRATE.block("numbing_parchment_block", NumbingParchmentBlock::new)
					//.onRegister(connectedTextures(() -> new SimpleCTBehaviour(GarnishedCT.NUMBING_PARCHMENT)))
					.initialProperties(() -> Blocks.WHITE_WOOL)
					.simpleItem().register();
	public static final BlockEntry<NumbingParchmentBlock.Carpet> NUMBING_PARCHMENT_CARPET =
			REGISTRATE.block("numbing_parchment_carpet", NumbingParchmentBlock.Carpet::new)
					//.onRegister(connectedTextures(() -> new SimpleCTBehaviour(GarnishedCT.NUMBING_PARCHMENT)))
					.initialProperties(() -> Blocks.WHITE_CARPET)
					.simpleItem().register();

	public static <T extends Block> BlockEntry<T> masticResinRegistration(String colour0, String block0, NonNullFunction<BlockBehaviour.Properties, T> factory, Block block1) {
		return REGISTRATE.block((colour0 == "" ? colour0 : colour0 + "_") + block0, factory)
				.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
				.simpleItem()
				.initialProperties(() -> block1)
				.properties(p -> p.noOcclusion().instabreak()).register();
	}

	public static <T extends Block> BlockEntry<T> zultaniteRegistration(String type, String colour0, String block0, NonNullFunction<BlockBehaviour.Properties, T> factory, Block block1) {
		return REGISTRATE.block((type == "" ? type : type + "_") + (colour0 == "" ? colour0 : colour0 + "_") + block0, factory)
				.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
				.simpleItem()
				.initialProperties(() -> block1)
				.properties(p -> p).register();
	}

	public static <T extends Block> BlockEntry<T> chiseledZultaniteRegistration(String colour0, String block0, NonNullFunction<BlockBehaviour.Properties, T> factory, Block block1) {
		return REGISTRATE.block("chiseled_" + (colour0 == "" ? colour0 : colour0 + "_") + block0 + "_bricks", factory)
				.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
				.simpleItem()
				.initialProperties(() -> block1)
				.properties(p -> p).register();
	}

	public static <T extends SlabBlock> BlockEntry<T> zultaniteSlabRegistration(String type, String colour0, String block0, NonNullFunction<BlockBehaviour.Properties, T> factory, Block block1) {
		return REGISTRATE.block((type == "" ? type : type + "_") + (colour0 == "" ? colour0 : colour0 + "_") + block0 + "_slab", factory)
				.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
				.simpleItem()
				.initialProperties(() -> block1)
				.properties(p -> p).register();
	}

	public static <T extends ZultaniteStairsBlock> BlockEntry<T> zultaniteStairsRegistration(String type, String colour0, String block0, NonNullFunction<BlockBehaviour.Properties, T> factory, Block block1) {
		return REGISTRATE.block((type == "" ? type : type + "_") + (colour0 == "" ? colour0 : colour0 + "_") + block0 + "_stairs", factory)
				.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
				.simpleItem()
				.initialProperties(() -> block1)
				.properties(p -> p).register();
	}

	public static <T extends WallBlock> BlockEntry<T> zultaniteWallRegistration(String type, String colour0, String block0, NonNullFunction<BlockBehaviour.Properties, T> factory, Block block1) {
		return REGISTRATE.block((type == "" ? type : type + "_") + (colour0 == "" ? colour0 : colour0 + "_") + block0 + "_wall", factory)
				.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
				.simpleItem()
				.initialProperties(() -> block1)
				.properties(p -> p).register();
	}

	public static BlockEntry<MasticBlock> masticslimelike(String colour0) {
		return masticResinRegistration(colour0, "mastic_block", MasticBlock::new, Blocks.SLIME_BLOCK);
	}

	public static BlockEntry<Block> masticchiseled(String colour0) {
		return chiseledZultaniteRegistration(colour0, "zultanite", Block::new, Blocks.CHISELED_DEEPSLATE);
	}

	public static BlockEntry<Block> masticstone(String colour0) {
		return zultaniteRegistration("", colour0, "zultanite", Block::new, Blocks.DEEPSLATE);
	}

	public static BlockEntry<SlabBlock> masticstoneslab(String colour0) {
		return zultaniteSlabRegistration("", colour0, "zultanite", SlabBlock::new, Blocks.DEEPSLATE);
	}

	public static BlockEntry<ZultaniteStairsBlock> masticstonestairs(String colour0) {
		return zultaniteStairsRegistration("", colour0, "zultanite", ZultaniteStairsBlock::new, Blocks.DEEPSLATE);
	}

	public static BlockEntry<WallBlock> masticstonewall(String colour0) {
		return zultaniteWallRegistration("", colour0, "zultanite", WallBlock::new, Blocks.DEEPSLATE);
	}

	public static BlockEntry<Block> masticpolished(String colour0) {
		return zultaniteRegistration("polished", colour0, "zultanite", Block::new, Blocks.POLISHED_DEEPSLATE);
	}

	public static BlockEntry<SlabBlock> masticpolishedslab(String colour0) {
		return zultaniteSlabRegistration("polished", colour0, "zultanite", SlabBlock::new, Blocks.POLISHED_DEEPSLATE);
	}

	public static BlockEntry<ZultaniteStairsBlock> masticpolishedstairs(String colour0) {
		return zultaniteStairsRegistration("polished", colour0, "zultanite", ZultaniteStairsBlock::new, Blocks.POLISHED_DEEPSLATE);
	}

	public static BlockEntry<WallBlock> masticpolishedwall(String colour0) {
		return zultaniteWallRegistration("polished", colour0, "zultanite", WallBlock::new, Blocks.POLISHED_DEEPSLATE);
	}

	public static BlockEntry<Block> masticbricks(String colour0) {
		return zultaniteRegistration("", colour0, "zultanite_bricks", Block::new, Blocks.DEEPSLATE_BRICKS);
	}

	public static BlockEntry<SlabBlock> masticbrickslab(String colour0) {
		return zultaniteSlabRegistration("", colour0, "zultanite_brick", SlabBlock::new, Blocks.DEEPSLATE_BRICKS);
	}

	public static BlockEntry<ZultaniteStairsBlock> masticbrickstairs(String colour0) {
		return zultaniteStairsRegistration("", colour0, "zultanite_brick", ZultaniteStairsBlock::new, Blocks.DEEPSLATE_BRICKS);
	}

	public static BlockEntry<WallBlock> masticbrickwall(String colour0) {
		return zultaniteWallRegistration("", colour0, "zultanite_brick", WallBlock::new, Blocks.DEEPSLATE_BRICKS);
	}

	public static BlockEntry<Block> masticsmooth(String colour0) {
		return zultaniteRegistration("smooth", colour0, "zultanite", Block::new, Blocks.SMOOTH_BASALT);
	}

	public static BlockEntry<SlabBlock> masticsmoothslab(String colour0) {
		return zultaniteSlabRegistration("smooth", colour0, "zultanite", SlabBlock::new, Blocks.SMOOTH_BASALT);
	}

	public static BlockEntry<ZultaniteStairsBlock> masticsmoothstairs(String colour0) {
		return zultaniteStairsRegistration("smooth", colour0, "zultanite", ZultaniteStairsBlock::new, Blocks.SMOOTH_BASALT);
	}

	public static BlockEntry<WallBlock> masticsmoothwall(String colour0) {
		return zultaniteWallRegistration("smooth", colour0, "zultanite", WallBlock::new, Blocks.SMOOTH_BASALT);
	}

	public static final BlockEntry<MasticBlock> MASTIC_BLOCK = masticslimelike("");
	public static final BlockEntry<MasticBlock> RED_MASTIC_BLOCK = masticslimelike("red");
	public static final BlockEntry<MasticBlock> ORANGE_MASTIC_BLOCK = masticslimelike("orange");
	public static final BlockEntry<MasticBlock> YELLOW_MASTIC_BLOCK = masticslimelike("yellow");
	public static final BlockEntry<MasticBlock> GREEN_MASTIC_BLOCK = masticslimelike("green");
	public static final BlockEntry<MasticBlock> LIME_MASTIC_BLOCK = masticslimelike("lime");
	public static final BlockEntry<MasticBlock> BLUE_MASTIC_BLOCK = masticslimelike("blue");
	public static final BlockEntry<MasticBlock> LIGHT_BLUE_MASTIC_BLOCK = masticslimelike("light_blue");
	public static final BlockEntry<MasticBlock> CYAN_MASTIC_BLOCK = masticslimelike("cyan");
	public static final BlockEntry<MasticBlock> PURPLE_MASTIC_BLOCK = masticslimelike("purple");
	public static final BlockEntry<MasticBlock> MAGENTA_MASTIC_BLOCK = masticslimelike("magenta");
	public static final BlockEntry<MasticBlock> PINK_MASTIC_BLOCK = masticslimelike("pink");
	public static final BlockEntry<MasticBlock> BLACK_MASTIC_BLOCK = masticslimelike("black");
	public static final BlockEntry<MasticBlock> GRAY_MASTIC_BLOCK = masticslimelike("gray");
	public static final BlockEntry<MasticBlock> LIGHT_GRAY_MASTIC_BLOCK = masticslimelike("light_gray");
	public static final BlockEntry<MasticBlock> WHITE_MASTIC_BLOCK = masticslimelike("white");
	public static final BlockEntry<MasticBlock> BROWN_MASTIC_BLOCK = masticslimelike("brown");

	public static final BlockEntry<Block> CHISELED_ZULTANITE = masticchiseled("");
	public static final BlockEntry<Block> CHISELED_RED_ZULTANITE = masticchiseled("red");
	public static final BlockEntry<Block> CHISELED_ORANGE_ZULTANITE = masticchiseled("orange");
	public static final BlockEntry<Block> CHISELED_YELLOW_ZULTANITE = masticchiseled("yellow");
	public static final BlockEntry<Block> CHISELED_GREEN_ZULTANITE = masticchiseled("green");
	public static final BlockEntry<Block> CHISELED_LIME_ZULTANITE = masticchiseled("lime");
	public static final BlockEntry<Block> CHISELED_BLUE_ZULTANITE = masticchiseled("blue");
	public static final BlockEntry<Block> CHISELED_LIGHT_BLUE_ZULTANITE = masticchiseled("light_blue");
	public static final BlockEntry<Block> CHISELED_CYAN_ZULTANITE = masticchiseled("cyan");
	public static final BlockEntry<Block> CHISELED_PURPLE_ZULTANITE = masticchiseled("purple");
	public static final BlockEntry<Block> CHISELED_MAGENTA_ZULTANITE = masticchiseled("magenta");
	public static final BlockEntry<Block> CHISELED_PINK_ZULTANITE = masticchiseled("pink");
	public static final BlockEntry<Block> CHISELED_BLACK_ZULTANITE = masticchiseled("black");
	public static final BlockEntry<Block> CHISELED_GRAY_ZULTANITE = masticchiseled("gray");
	public static final BlockEntry<Block> CHISELED_LIGHT_GRAY_ZULTANITE = masticchiseled("light_gray");
	public static final BlockEntry<Block> CHISELED_WHITE_ZULTANITE = masticchiseled("white");
	public static final BlockEntry<Block> CHISELED_BROWN_ZULTANITE = masticchiseled("brown");

	public static final BlockEntry<Block> ZULTANITE = masticstone("");
	public static final BlockEntry<Block> RED_ZULTANITE = masticstone("red");
	public static final BlockEntry<Block> ORANGE_ZULTANITE = masticstone("orange");
	public static final BlockEntry<Block> YELLOW_ZULTANITE = masticstone("yellow");
	public static final BlockEntry<Block> GREEN_ZULTANITE = masticstone("green");
	public static final BlockEntry<Block> LIME_ZULTANITE = masticstone("lime");
	public static final BlockEntry<Block> BLUE_ZULTANITE = masticstone("blue");
	public static final BlockEntry<Block> LIGHT_BLUE_ZULTANITE = masticstone("light_blue");
	public static final BlockEntry<Block> CYAN_ZULTANITE = masticstone("cyan");
	public static final BlockEntry<Block> PURPLE_ZULTANITE = masticstone("purple");
	public static final BlockEntry<Block> MAGENTA_ZULTANITE = masticstone("magenta");
	public static final BlockEntry<Block> PINK_ZULTANITE = masticstone("pink");
	public static final BlockEntry<Block> BLACK_ZULTANITE = masticstone("black");
	public static final BlockEntry<Block> GRAY_ZULTANITE = masticstone("gray");
	public static final BlockEntry<Block> LIGHT_GRAY_ZULTANITE = masticstone("light_gray");
	public static final BlockEntry<Block> WHITE_ZULTANITE = masticstone("white");
	public static final BlockEntry<Block> BROWN_ZULTANITE = masticstone("brown");

	public static final BlockEntry<SlabBlock> ZULTANITE_SLAB = masticstoneslab("");
	public static final BlockEntry<SlabBlock> RED_ZULTANITE_SLAB = masticstoneslab("red");
	public static final BlockEntry<SlabBlock> ORANGE_ZULTANITE_SLAB = masticstoneslab("orange");
	public static final BlockEntry<SlabBlock> YELLOW_ZULTANITE_SLAB = masticstoneslab("yellow");
	public static final BlockEntry<SlabBlock> GREEN_ZULTANITE_SLAB = masticstoneslab("green");
	public static final BlockEntry<SlabBlock> LIME_ZULTANITE_SLAB = masticstoneslab("lime");
	public static final BlockEntry<SlabBlock> BLUE_ZULTANITE_SLAB = masticstoneslab("blue");
	public static final BlockEntry<SlabBlock> LIGHT_BLUE_ZULTANITE_SLAB = masticstoneslab("light_blue");
	public static final BlockEntry<SlabBlock> CYAN_ZULTANITE_SLAB = masticstoneslab("cyan");
	public static final BlockEntry<SlabBlock> PURPLE_ZULTANITE_SLAB = masticstoneslab("purple");
	public static final BlockEntry<SlabBlock> MAGENTA_ZULTANITE_SLAB = masticstoneslab("magenta");
	public static final BlockEntry<SlabBlock> PINK_ZULTANITE_SLAB = masticstoneslab("pink");
	public static final BlockEntry<SlabBlock> BLACK_ZULTANITE_SLAB = masticstoneslab("black");
	public static final BlockEntry<SlabBlock> GRAY_ZULTANITE_SLAB = masticstoneslab("gray");
	public static final BlockEntry<SlabBlock> LIGHT_GRAY_ZULTANITE_SLAB = masticstoneslab("light_gray");
	public static final BlockEntry<SlabBlock> WHITE_ZULTANITE_SLAB = masticstoneslab("white");
	public static final BlockEntry<SlabBlock> BROWN_ZULTANITE_SLAB = masticstoneslab("brown");

	public static final BlockEntry<ZultaniteStairsBlock> ZULTANITE_STAIRS = masticstonestairs("");
	public static final BlockEntry<ZultaniteStairsBlock> RED_ZULTANITE_STAIRS = masticstonestairs("red");
	public static final BlockEntry<ZultaniteStairsBlock> ORANGE_ZULTANITE_STAIRS = masticstonestairs("orange");
	public static final BlockEntry<ZultaniteStairsBlock> YELLOW_ZULTANITE_STAIRS = masticstonestairs("yellow");
	public static final BlockEntry<ZultaniteStairsBlock> GREEN_ZULTANITE_STAIRS = masticstonestairs("green");
	public static final BlockEntry<ZultaniteStairsBlock> LIME_ZULTANITE_STAIRS = masticstonestairs("lime");
	public static final BlockEntry<ZultaniteStairsBlock> BLUE_ZULTANITE_STAIRS = masticstonestairs("blue");
	public static final BlockEntry<ZultaniteStairsBlock> LIGHT_BLUE_ZULTANITE_STAIRS = masticstonestairs("light_blue");
	public static final BlockEntry<ZultaniteStairsBlock> CYAN_ZULTANITE_STAIRS = masticstonestairs("cyan");
	public static final BlockEntry<ZultaniteStairsBlock> PURPLE_ZULTANITE_STAIRS = masticstonestairs("purple");
	public static final BlockEntry<ZultaniteStairsBlock> MAGENTA_ZULTANITE_STAIRS = masticstonestairs("magenta");
	public static final BlockEntry<ZultaniteStairsBlock> PINK_ZULTANITE_STAIRS = masticstonestairs("pink");
	public static final BlockEntry<ZultaniteStairsBlock> BLACK_ZULTANITE_STAIRS = masticstonestairs("black");
	public static final BlockEntry<ZultaniteStairsBlock> GRAY_ZULTANITE_STAIRS = masticstonestairs("gray");
	public static final BlockEntry<ZultaniteStairsBlock> LIGHT_GRAY_ZULTANITE_STAIRS = masticstonestairs("light_gray");
	public static final BlockEntry<ZultaniteStairsBlock> WHITE_ZULTANITE_STAIRS = masticstonestairs("white");
	public static final BlockEntry<ZultaniteStairsBlock> BROWN_ZULTANITE_STAIRS = masticstonestairs("brown");

	public static final BlockEntry<WallBlock> ZULTANITE_WALL = masticstonewall("");
	public static final BlockEntry<WallBlock> RED_ZULTANITE_WALL = masticstonewall("red");
	public static final BlockEntry<WallBlock> ORANGE_ZULTANITE_WALL = masticstonewall("orange");
	public static final BlockEntry<WallBlock> YELLOW_ZULTANITE_WALL = masticstonewall("yellow");
	public static final BlockEntry<WallBlock> GREEN_ZULTANITE_WALL = masticstonewall("green");
	public static final BlockEntry<WallBlock> LIME_ZULTANITE_WALL = masticstonewall("lime");
	public static final BlockEntry<WallBlock> BLUE_ZULTANITE_WALL = masticstonewall("blue");
	public static final BlockEntry<WallBlock> LIGHT_BLUE_ZULTANITE_WALL = masticstonewall("light_blue");
	public static final BlockEntry<WallBlock> CYAN_ZULTANITE_WALL = masticstonewall("cyan");
	public static final BlockEntry<WallBlock> PURPLE_ZULTANITE_WALL = masticstonewall("purple");
	public static final BlockEntry<WallBlock> MAGENTA_ZULTANITE_WALL = masticstonewall("magenta");
	public static final BlockEntry<WallBlock> PINK_ZULTANITE_WALL = masticstonewall("pink");
	public static final BlockEntry<WallBlock> BLACK_ZULTANITE_WALL = masticstonewall("black");
	public static final BlockEntry<WallBlock> GRAY_ZULTANITE_WALL = masticstonewall("gray");
	public static final BlockEntry<WallBlock> LIGHT_GRAY_ZULTANITE_WALL = masticstonewall("light_gray");
	public static final BlockEntry<WallBlock> WHITE_ZULTANITE_WALL = masticstonewall("white");
	public static final BlockEntry<WallBlock> BROWN_ZULTANITE_WALL = masticstonewall("brown");

	public static final BlockEntry<Block> POLISHED_ZULTANITE = masticpolished("");
	public static final BlockEntry<Block> POLISHED_RED_ZULTANITE = masticpolished("red");
	public static final BlockEntry<Block> POLISHED_ORANGE_ZULTANITE = masticpolished("orange");
	public static final BlockEntry<Block> POLISHED_YELLOW_ZULTANITE = masticpolished("yellow");
	public static final BlockEntry<Block> POLISHED_GREEN_ZULTANITE = masticpolished("green");
	public static final BlockEntry<Block> POLISHED_LIME_ZULTANITE = masticpolished("lime");
	public static final BlockEntry<Block> POLISHED_BLUE_ZULTANITE = masticpolished("blue");
	public static final BlockEntry<Block> POLISHED_LIGHT_BLUE_ZULTANITE = masticpolished("light_blue");
	public static final BlockEntry<Block> POLISHED_CYAN_ZULTANITE = masticpolished("cyan");
	public static final BlockEntry<Block> POLISHED_PURPLE_ZULTANITE = masticpolished("purple");
	public static final BlockEntry<Block> POLISHED_MAGENTA_ZULTANITE = masticpolished("magenta");
	public static final BlockEntry<Block> POLISHED_PINK_ZULTANITE = masticpolished("pink");
	public static final BlockEntry<Block> POLISHED_BLACK_ZULTANITE = masticpolished("black");
	public static final BlockEntry<Block> POLISHED_GRAY_ZULTANITE = masticpolished("gray");
	public static final BlockEntry<Block> POLISHED_LIGHT_GRAY_ZULTANITE = masticpolished("light_gray");
	public static final BlockEntry<Block> POLISHED_WHITE_ZULTANITE = masticpolished("white");
	public static final BlockEntry<Block> POLISHED_BROWN_ZULTANITE = masticpolished("brown");

	public static final BlockEntry<SlabBlock> POLISHED_ZULTANITE_SLAB = masticpolishedslab("");
	public static final BlockEntry<SlabBlock> POLISHED_RED_ZULTANITE_SLAB = masticpolishedslab("red");
	public static final BlockEntry<SlabBlock> POLISHED_ORANGE_ZULTANITE_SLAB = masticpolishedslab("orange");
	public static final BlockEntry<SlabBlock> POLISHED_YELLOW_ZULTANITE_SLAB = masticpolishedslab("yellow");
	public static final BlockEntry<SlabBlock> POLISHED_GREEN_ZULTANITE_SLAB = masticpolishedslab("green");
	public static final BlockEntry<SlabBlock> POLISHED_LIME_ZULTANITE_SLAB = masticpolishedslab("lime");
	public static final BlockEntry<SlabBlock> POLISHED_BLUE_ZULTANITE_SLAB = masticpolishedslab("blue");
	public static final BlockEntry<SlabBlock> POLISHED_LIGHT_BLUE_ZULTANITE_SLAB = masticpolishedslab("light_blue");
	public static final BlockEntry<SlabBlock> POLISHED_CYAN_ZULTANITE_SLAB = masticpolishedslab("cyan");
	public static final BlockEntry<SlabBlock> POLISHED_PURPLE_ZULTANITE_SLAB = masticpolishedslab("purple");
	public static final BlockEntry<SlabBlock> POLISHED_MAGENTA_ZULTANITE_SLAB = masticpolishedslab("magenta");
	public static final BlockEntry<SlabBlock> POLISHED_PINK_ZULTANITE_SLAB = masticpolishedslab("pink");
	public static final BlockEntry<SlabBlock> POLISHED_BLACK_ZULTANITE_SLAB = masticpolishedslab("black");
	public static final BlockEntry<SlabBlock> POLISHED_GRAY_ZULTANITE_SLAB = masticpolishedslab("gray");
	public static final BlockEntry<SlabBlock> POLISHED_LIGHT_GRAY_ZULTANITE_SLAB = masticpolishedslab("light_gray");
	public static final BlockEntry<SlabBlock> POLISHED_WHITE_ZULTANITE_SLAB = masticpolishedslab("white");
	public static final BlockEntry<SlabBlock> POLISHED_BROWN_ZULTANITE_SLAB = masticpolishedslab("brown");

	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_ZULTANITE_STAIRS = masticpolishedstairs("");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_RED_ZULTANITE_STAIRS = masticpolishedstairs("red");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_ORANGE_ZULTANITE_STAIRS = masticpolishedstairs("orange");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_YELLOW_ZULTANITE_STAIRS = masticpolishedstairs("yellow");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_GREEN_ZULTANITE_STAIRS = masticpolishedstairs("green");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_LIME_ZULTANITE_STAIRS = masticpolishedstairs("lime");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_BLUE_ZULTANITE_STAIRS = masticpolishedstairs("blue");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_LIGHT_BLUE_ZULTANITE_STAIRS = masticpolishedstairs("light_blue");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_CYAN_ZULTANITE_STAIRS = masticpolishedstairs("cyan");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_PURPLE_ZULTANITE_STAIRS = masticpolishedstairs("purple");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_MAGENTA_ZULTANITE_STAIRS = masticpolishedstairs("magenta");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_PINK_ZULTANITE_STAIRS = masticpolishedstairs("pink");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_BLACK_ZULTANITE_STAIRS = masticpolishedstairs("black");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_GRAY_ZULTANITE_STAIRS = masticpolishedstairs("gray");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_LIGHT_GRAY_ZULTANITE_STAIRS = masticpolishedstairs("light_gray");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_WHITE_ZULTANITE_STAIRS = masticpolishedstairs("white");
	public static final BlockEntry<ZultaniteStairsBlock> POLISHED_BROWN_ZULTANITE_STAIRS = masticpolishedstairs("brown");

	public static final BlockEntry<WallBlock> POLISHED_ZULTANITE_WALL = masticpolishedwall("");
	public static final BlockEntry<WallBlock> POLISHED_RED_ZULTANITE_WALL = masticpolishedwall("red");
	public static final BlockEntry<WallBlock> POLISHED_ORANGE_ZULTANITE_WALL = masticpolishedwall("orange");
	public static final BlockEntry<WallBlock> POLISHED_YELLOW_ZULTANITE_WALL = masticpolishedwall("yellow");
	public static final BlockEntry<WallBlock> POLISHED_GREEN_ZULTANITE_WALL = masticpolishedwall("green");
	public static final BlockEntry<WallBlock> POLISHED_LIME_ZULTANITE_WALL = masticpolishedwall("lime");
	public static final BlockEntry<WallBlock> POLISHED_BLUE_ZULTANITE_WALL = masticpolishedwall("blue");
	public static final BlockEntry<WallBlock> POLISHED_LIGHT_BLUE_ZULTANITE_WALL = masticpolishedwall("light_blue");
	public static final BlockEntry<WallBlock> POLISHED_CYAN_ZULTANITE_WALL = masticpolishedwall("cyan");
	public static final BlockEntry<WallBlock> POLISHED_PURPLE_ZULTANITE_WALL = masticpolishedwall("purple");
	public static final BlockEntry<WallBlock> POLISHED_MAGENTA_ZULTANITE_WALL = masticpolishedwall("magenta");
	public static final BlockEntry<WallBlock> POLISHED_PINK_ZULTANITE_WALL = masticpolishedwall("pink");
	public static final BlockEntry<WallBlock> POLISHED_BLACK_ZULTANITE_WALL = masticpolishedwall("black");
	public static final BlockEntry<WallBlock> POLISHED_GRAY_ZULTANITE_WALL = masticpolishedwall("gray");
	public static final BlockEntry<WallBlock> POLISHED_LIGHT_GRAY_ZULTANITE_WALL = masticpolishedwall("light_gray");
	public static final BlockEntry<WallBlock> POLISHED_WHITE_ZULTANITE_WALL = masticpolishedwall("white");
	public static final BlockEntry<WallBlock> POLISHED_BROWN_ZULTANITE_WALL = masticpolishedwall("brown");

	public static final BlockEntry<Block> ZULTANITE_BRICKS = masticbricks("");
	public static final BlockEntry<Block> RED_ZULTANITE_BRICKS = masticbricks("red");
	public static final BlockEntry<Block> ORANGE_ZULTANITE_BRICKS = masticbricks("orange");
	public static final BlockEntry<Block> YELLOW_ZULTANITE_BRICKS = masticbricks("yellow");
	public static final BlockEntry<Block> GREEN_ZULTANITE_BRICKS = masticbricks("green");
	public static final BlockEntry<Block> LIME_ZULTANITE_BRICKS = masticbricks("lime");
	public static final BlockEntry<Block> BLUE_ZULTANITE_BRICKS = masticbricks("blue");
	public static final BlockEntry<Block> LIGHT_BLUE_ZULTANITE_BRICKS = masticbricks("light_blue");
	public static final BlockEntry<Block> CYAN_ZULTANITE_BRICKS = masticbricks("cyan");
	public static final BlockEntry<Block> PURPLE_ZULTANITE_BRICKS = masticbricks("purple");
	public static final BlockEntry<Block> MAGENTA_ZULTANITE_BRICKS = masticbricks("magenta");
	public static final BlockEntry<Block> PINK_ZULTANITE_BRICKS = masticbricks("pink");
	public static final BlockEntry<Block> BLACK_ZULTANITE_BRICKS = masticbricks("black");
	public static final BlockEntry<Block> GRAY_ZULTANITE_BRICKS = masticbricks("gray");
	public static final BlockEntry<Block> LIGHT_GRAY_ZULTANITE_BRICKS = masticbricks("light_gray");
	public static final BlockEntry<Block> WHITE_ZULTANITE_BRICKS = masticbricks("white");
	public static final BlockEntry<Block> BROWN_ZULTANITE_BRICKS = masticbricks("brown");

	public static final BlockEntry<SlabBlock> ZULTANITE_BRICK_SLAB = masticbrickslab("");
	public static final BlockEntry<SlabBlock> RED_ZULTANITE_BRICK_SLAB = masticbrickslab("red");
	public static final BlockEntry<SlabBlock> ORANGE_ZULTANITE_BRICK_SLAB = masticbrickslab("orange");
	public static final BlockEntry<SlabBlock> YELLOW_ZULTANITE_BRICK_SLAB = masticbrickslab("yellow");
	public static final BlockEntry<SlabBlock> GREEN_ZULTANITE_BRICK_SLAB = masticbrickslab("green");
	public static final BlockEntry<SlabBlock> LIME_ZULTANITE_BRICK_SLAB = masticbrickslab("lime");
	public static final BlockEntry<SlabBlock> BLUE_ZULTANITE_BRICK_SLAB = masticbrickslab("blue");
	public static final BlockEntry<SlabBlock> LIGHT_BLUE_ZULTANITE_BRICK_SLAB = masticbrickslab("light_blue");
	public static final BlockEntry<SlabBlock> CYAN_ZULTANITE_BRICK_SLAB = masticbrickslab("cyan");
	public static final BlockEntry<SlabBlock> PURPLE_ZULTANITE_BRICK_SLAB = masticbrickslab("purple");
	public static final BlockEntry<SlabBlock> MAGENTA_ZULTANITE_BRICK_SLAB = masticbrickslab("magenta");
	public static final BlockEntry<SlabBlock> PINK_ZULTANITE_BRICK_SLAB = masticbrickslab("pink");
	public static final BlockEntry<SlabBlock> BLACK_ZULTANITE_BRICK_SLAB = masticbrickslab("black");
	public static final BlockEntry<SlabBlock> GRAY_ZULTANITE_BRICK_SLAB = masticbrickslab("gray");
	public static final BlockEntry<SlabBlock> LIGHT_GRAY_ZULTANITE_BRICK_SLAB = masticbrickslab("light_gray");
	public static final BlockEntry<SlabBlock> WHITE_ZULTANITE_BRICK_SLAB = masticbrickslab("white");
	public static final BlockEntry<SlabBlock> BROWN_ZULTANITE_BRICK_SLAB = masticbrickslab("brown");

	public static final BlockEntry<ZultaniteStairsBlock> ZULTANITE_BRICK_STAIRS = masticbrickstairs("");
	public static final BlockEntry<ZultaniteStairsBlock> RED_ZULTANITE_BRICK_STAIRS = masticbrickstairs("red");
	public static final BlockEntry<ZultaniteStairsBlock> ORANGE_ZULTANITE_BRICK_STAIRS = masticbrickstairs("orange");
	public static final BlockEntry<ZultaniteStairsBlock> YELLOW_ZULTANITE_BRICK_STAIRS = masticbrickstairs("yellow");
	public static final BlockEntry<ZultaniteStairsBlock> GREEN_ZULTANITE_BRICK_STAIRS = masticbrickstairs("green");
	public static final BlockEntry<ZultaniteStairsBlock> LIME_ZULTANITE_BRICK_STAIRS = masticbrickstairs("lime");
	public static final BlockEntry<ZultaniteStairsBlock> BLUE_ZULTANITE_BRICK_STAIRS = masticbrickstairs("blue");
	public static final BlockEntry<ZultaniteStairsBlock> LIGHT_BLUE_ZULTANITE_BRICK_STAIRS = masticbrickstairs("light_blue");
	public static final BlockEntry<ZultaniteStairsBlock> CYAN_ZULTANITE_BRICK_STAIRS = masticbrickstairs("cyan");
	public static final BlockEntry<ZultaniteStairsBlock> PURPLE_ZULTANITE_BRICK_STAIRS = masticbrickstairs("purple");
	public static final BlockEntry<ZultaniteStairsBlock> MAGENTA_ZULTANITE_BRICK_STAIRS = masticbrickstairs("magenta");
	public static final BlockEntry<ZultaniteStairsBlock> PINK_ZULTANITE_BRICK_STAIRS = masticbrickstairs("pink");
	public static final BlockEntry<ZultaniteStairsBlock> BLACK_ZULTANITE_BRICK_STAIRS = masticbrickstairs("black");
	public static final BlockEntry<ZultaniteStairsBlock> GRAY_ZULTANITE_BRICK_STAIRS = masticbrickstairs("gray");
	public static final BlockEntry<ZultaniteStairsBlock> LIGHT_GRAY_ZULTANITE_BRICK_STAIRS = masticbrickstairs("light_gray");
	public static final BlockEntry<ZultaniteStairsBlock> WHITE_ZULTANITE_BRICK_STAIRS = masticbrickstairs("white");
	public static final BlockEntry<ZultaniteStairsBlock> BROWN_ZULTANITE_BRICK_STAIRS = masticbrickstairs("brown");

	public static final BlockEntry<WallBlock> ZULTANITE_BRICK_WALL = masticbrickwall("");
	public static final BlockEntry<WallBlock> RED_ZULTANITE_BRICK_WALL = masticbrickwall("red");
	public static final BlockEntry<WallBlock> ORANGE_ZULTANITE_BRICK_WALL = masticbrickwall("orange");
	public static final BlockEntry<WallBlock> YELLOW_ZULTANITE_BRICK_WALL = masticbrickwall("yellow");
	public static final BlockEntry<WallBlock> GREEN_ZULTANITE_BRICK_WALL = masticbrickwall("green");
	public static final BlockEntry<WallBlock> LIME_ZULTANITE_BRICK_WALL = masticbrickwall("lime");
	public static final BlockEntry<WallBlock> BLUE_ZULTANITE_BRICK_WALL = masticbrickwall("blue");
	public static final BlockEntry<WallBlock> LIGHT_BLUE_ZULTANITE_BRICK_WALL = masticbrickwall("light_blue");
	public static final BlockEntry<WallBlock> CYAN_ZULTANITE_BRICK_WALL = masticbrickwall("cyan");
	public static final BlockEntry<WallBlock> PURPLE_ZULTANITE_BRICK_WALL = masticbrickwall("purple");
	public static final BlockEntry<WallBlock> MAGENTA_ZULTANITE_BRICK_WALL = masticbrickwall("magenta");
	public static final BlockEntry<WallBlock> PINK_ZULTANITE_BRICK_WALL = masticbrickwall("pink");
	public static final BlockEntry<WallBlock> BLACK_ZULTANITE_BRICK_WALL = masticbrickwall("black");
	public static final BlockEntry<WallBlock> GRAY_ZULTANITE_BRICK_WALL = masticbrickwall("gray");
	public static final BlockEntry<WallBlock> LIGHT_GRAY_ZULTANITE_BRICK_WALL = masticbrickwall("light_gray");
	public static final BlockEntry<WallBlock> WHITE_ZULTANITE_BRICK_WALL = masticbrickwall("white");
	public static final BlockEntry<WallBlock> BROWN_ZULTANITE_BRICK_WALL = masticbrickwall("brown");

	public static final BlockEntry<Block> SMOOTH_ZULTANITE = masticsmooth("");
	public static final BlockEntry<Block> SMOOTH_RED_ZULTANITE = masticsmooth("red");
	public static final BlockEntry<Block> SMOOTH_ORANGE_ZULTANITE = masticsmooth("orange");
	public static final BlockEntry<Block> SMOOTH_YELLOW_ZULTANITE = masticsmooth("yellow");
	public static final BlockEntry<Block> SMOOTH_GREEN_ZULTANITE = masticsmooth("green");
	public static final BlockEntry<Block> SMOOTH_LIME_ZULTANITE = masticsmooth("lime");
	public static final BlockEntry<Block> SMOOTH_BLUE_ZULTANITE = masticsmooth("blue");
	public static final BlockEntry<Block> SMOOTH_LIGHT_BLUE_ZULTANITE = masticsmooth("light_blue");
	public static final BlockEntry<Block> SMOOTH_CYAN_ZULTANITE = masticsmooth("cyan");
	public static final BlockEntry<Block> SMOOTH_PURPLE_ZULTANITE = masticsmooth("purple");
	public static final BlockEntry<Block> SMOOTH_MAGENTA_ZULTANITE = masticsmooth("magenta");
	public static final BlockEntry<Block> SMOOTH_PINK_ZULTANITE = masticsmooth("pink");
	public static final BlockEntry<Block> SMOOTH_BLACK_ZULTANITE = masticsmooth("black");
	public static final BlockEntry<Block> SMOOTH_GRAY_ZULTANITE = masticsmooth("gray");
	public static final BlockEntry<Block> SMOOTH_LIGHT_GRAY_ZULTANITE = masticsmooth("light_gray");
	public static final BlockEntry<Block> SMOOTH_WHITE_ZULTANITE = masticsmooth("white");
	public static final BlockEntry<Block> SMOOTH_BROWN_ZULTANITE = masticsmooth("brown");

	public static final BlockEntry<SlabBlock> SMOOTH_ZULTANITE_SLAB = masticsmoothslab("");
	public static final BlockEntry<SlabBlock> SMOOTH_RED_ZULTANITE_SLAB = masticsmoothslab("red");
	public static final BlockEntry<SlabBlock> SMOOTH_ORANGE_ZULTANITE_SLAB = masticsmoothslab("orange");
	public static final BlockEntry<SlabBlock> SMOOTH_YELLOW_ZULTANITE_SLAB = masticsmoothslab("yellow");
	public static final BlockEntry<SlabBlock> SMOOTH_GREEN_ZULTANITE_SLAB = masticsmoothslab("green");
	public static final BlockEntry<SlabBlock> SMOOTH_LIME_ZULTANITE_SLAB = masticsmoothslab("lime");
	public static final BlockEntry<SlabBlock> SMOOTH_BLUE_ZULTANITE_SLAB = masticsmoothslab("blue");
	public static final BlockEntry<SlabBlock> SMOOTH_LIGHT_BLUE_ZULTANITE_SLAB = masticsmoothslab("light_blue");
	public static final BlockEntry<SlabBlock> SMOOTH_CYAN_ZULTANITE_SLAB = masticsmoothslab("cyan");
	public static final BlockEntry<SlabBlock> SMOOTH_PURPLE_ZULTANITE_SLAB = masticsmoothslab("purple");
	public static final BlockEntry<SlabBlock> SMOOTH_MAGENTA_ZULTANITE_SLAB = masticsmoothslab("magenta");
	public static final BlockEntry<SlabBlock> SMOOTH_PINK_ZULTANITE_SLAB = masticsmoothslab("pink");
	public static final BlockEntry<SlabBlock> SMOOTH_BLACK_ZULTANITE_SLAB = masticsmoothslab("black");
	public static final BlockEntry<SlabBlock> SMOOTH_GRAY_ZULTANITE_SLAB = masticsmoothslab("gray");
	public static final BlockEntry<SlabBlock> SMOOTH_LIGHT_GRAY_ZULTANITE_SLAB = masticsmoothslab("light_gray");
	public static final BlockEntry<SlabBlock> SMOOTH_WHITE_ZULTANITE_SLAB = masticsmoothslab("white");
	public static final BlockEntry<SlabBlock> SMOOTH_BROWN_ZULTANITE_SLAB = masticsmoothslab("brown");

	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_ZULTANITE_STAIRS = masticsmoothstairs("");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_RED_ZULTANITE_STAIRS = masticsmoothstairs("red");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_ORANGE_ZULTANITE_STAIRS = masticsmoothstairs("orange");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_YELLOW_ZULTANITE_STAIRS = masticsmoothstairs("yellow");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_GREEN_ZULTANITE_STAIRS = masticsmoothstairs("green");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_LIME_ZULTANITE_STAIRS = masticsmoothstairs("lime");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_BLUE_ZULTANITE_STAIRS = masticsmoothstairs("blue");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_LIGHT_BLUE_ZULTANITE_STAIRS = masticsmoothstairs("light_blue");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_CYAN_ZULTANITE_STAIRS = masticsmoothstairs("cyan");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_PURPLE_ZULTANITE_STAIRS = masticsmoothstairs("purple");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_MAGENTA_ZULTANITE_STAIRS = masticsmoothstairs("magenta");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_PINK_ZULTANITE_STAIRS = masticsmoothstairs("pink");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_BLACK_ZULTANITE_STAIRS = masticsmoothstairs("black");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_GRAY_ZULTANITE_STAIRS = masticsmoothstairs("gray");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_LIGHT_GRAY_ZULTANITE_STAIRS = masticsmoothstairs("light_gray");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_WHITE_ZULTANITE_STAIRS = masticsmoothstairs("white");
	public static final BlockEntry<ZultaniteStairsBlock> SMOOTH_BROWN_ZULTANITE_STAIRS = masticsmoothstairs("brown");

	public static final BlockEntry<WallBlock> SMOOTH_ZULTANITE_WALL = masticsmoothwall("");
	public static final BlockEntry<WallBlock> SMOOTH_RED_ZULTANITE_WALL = masticsmoothwall("red");
	public static final BlockEntry<WallBlock> SMOOTH_ORANGE_ZULTANITE_WALL = masticsmoothwall("orange");
	public static final BlockEntry<WallBlock> SMOOTH_YELLOW_ZULTANITE_WALL = masticsmoothwall("yellow");
	public static final BlockEntry<WallBlock> SMOOTH_GREEN_ZULTANITE_WALL = masticsmoothwall("green");
	public static final BlockEntry<WallBlock> SMOOTH_LIME_ZULTANITE_WALL = masticsmoothwall("lime");
	public static final BlockEntry<WallBlock> SMOOTH_BLUE_ZULTANITE_WALL = masticsmoothwall("blue");
	public static final BlockEntry<WallBlock> SMOOTH_LIGHT_BLUE_ZULTANITE_WALL = masticsmoothwall("light_blue");
	public static final BlockEntry<WallBlock> SMOOTH_CYAN_ZULTANITE_WALL = masticsmoothwall("cyan");
	public static final BlockEntry<WallBlock> SMOOTH_PURPLE_ZULTANITE_WALL = masticsmoothwall("purple");
	public static final BlockEntry<WallBlock> SMOOTH_MAGENTA_ZULTANITE_WALL = masticsmoothwall("magenta");
	public static final BlockEntry<WallBlock> SMOOTH_PINK_ZULTANITE_WALL = masticsmoothwall("pink");
	public static final BlockEntry<WallBlock> SMOOTH_BLACK_ZULTANITE_WALL = masticsmoothwall("black");
	public static final BlockEntry<WallBlock> SMOOTH_GRAY_ZULTANITE_WALL = masticsmoothwall("gray");
	public static final BlockEntry<WallBlock> SMOOTH_LIGHT_GRAY_ZULTANITE_WALL = masticsmoothwall("light_gray");
	public static final BlockEntry<WallBlock> SMOOTH_WHITE_ZULTANITE_WALL = masticsmoothwall("white");
	public static final BlockEntry<WallBlock> SMOOTH_BROWN_ZULTANITE_WALL = masticsmoothwall("brown");

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
	public static final BlockEntry<AbyssalStoneSlabBlock> ABYSSAL_STONE_BRICK_SLAB =
			REGISTRATE.block("abyssal_stone_brick_slab", AbyssalStoneSlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OBSIDIAN)
					.properties(p -> p.sound(SoundType.STONE).destroyTime(35.0F).explosionResistance(6.0F)).register();
	public static final BlockEntry<AbyssalStoneStairsBlock> ABYSSAL_STONE_BRICK_STAIRS =
			REGISTRATE.block("abyssal_stone_brick_stairs", AbyssalStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OBSIDIAN)
					.properties(p -> p.sound(SoundType.STONE).destroyTime(35.0F).explosionResistance(6.0F)).register();
	public static final BlockEntry<AbyssalStoneWallBlock> ABYSSAL_STONE_BRICK_WALL =
			REGISTRATE.block("abyssal_stone_brick_wall", AbyssalStoneWallBlock::new)
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
	public static final BlockEntry<SlabBlock> CARNOTITE_BRICK_SLAB =
			REGISTRATE.block("carnotite_brick_slab", SlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<CarnotiteStairsBlock> CARNOTITE_BRICK_STAIRS =
			REGISTRATE.block("carnotite_brick_stairs", CarnotiteStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<WallBlock> CARNOTITE_BRICK_WALL =
			REGISTRATE.block("carnotite_brick_wall", WallBlock::new)
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
	public static final BlockEntry<UnstableStoneSlabBlock> UNSTABLE_STONE_BRICK_SLAB =
			REGISTRATE.block("unstable_stone_brick_slab", UnstableStoneSlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneStairsBlock> UNSTABLE_STONE_BRICK_STAIRS =
			REGISTRATE.block("unstable_stone_brick_stairs", UnstableStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneWallBlock> UNSTABLE_STONE_BRICK_WALL =
			REGISTRATE.block("unstable_stone_brick_wall", UnstableStoneWallBlock::new)
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

	// v1.6
	public static final BlockEntry<Block> RITUALISTIC_STONE =
			REGISTRATE.block("ritualistic_stone", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<SlabBlock> RITUALISTIC_STONE_SLAB =
			REGISTRATE.block("ritualistic_stone_slab", SlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<RitualisticStoneStairsBlock> RITUALISTIC_STONE_STAIRS =
			REGISTRATE.block("ritualistic_stone_stairs", RitualisticStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<WallBlock> RITUALISTIC_STONE_WALL =
			REGISTRATE.block("ritualistic_stone_wall", WallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<Block> POLISHED_RITUALISTIC_STONE =
			REGISTRATE.block("polished_ritualistic_stone", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<SlabBlock> POLISHED_RITUALISTIC_STONE_SLAB =
			REGISTRATE.block("polished_ritualistic_stone_slab", SlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<RitualisticStoneStairsBlock> POLISHED_RITUALISTIC_STONE_STAIRS =
			REGISTRATE.block("polished_ritualistic_stone_stairs", RitualisticStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<WallBlock> POLISHED_RITUALISTIC_STONE_WALL =
			REGISTRATE.block("polished_ritualistic_stone_wall", WallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<Block> RITUALISTIC_STONE_BRICKS =
			REGISTRATE.block("ritualistic_stone_bricks", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<SlabBlock> RITUALISTIC_STONE_BRICK_SLAB =
			REGISTRATE.block("ritualistic_stone_brick_slab", SlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<RitualisticStoneStairsBlock> RITUALISTIC_STONE_BRICK_STAIRS =
			REGISTRATE.block("ritualistic_stone_brick_stairs", RitualisticStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<WallBlock> RITUALISTIC_STONE_BRICK_WALL =
			REGISTRATE.block("ritualistic_stone_brick_wall", WallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<Block> SMOOTH_RITUALISTIC_STONE =
			REGISTRATE.block("smooth_ritualistic_stone", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<SlabBlock> SMOOTH_RITUALISTIC_STONE_SLAB =
			REGISTRATE.block("smooth_ritualistic_stone_slab", SlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<RitualisticStoneStairsBlock> SMOOTH_RITUALISTIC_STONE_STAIRS =
			REGISTRATE.block("smooth_ritualistic_stone_stairs", RitualisticStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<WallBlock> SMOOTH_RITUALISTIC_STONE_WALL =
			REGISTRATE.block("smooth_ritualistic_stone_wall", WallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<Block> CHISELED_RITUALISTIC_STONE_BRICKS =
			REGISTRATE.block("chiseled_ritualistic_stone_bricks", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();

	public static final BlockEntry<UnstableStoneBlock> SMOOTH_UNSTABLE_STONE =
			REGISTRATE.block("smooth_unstable_stone", UnstableStoneBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneSlabBlock> SMOOTH_UNSTABLE_STONE_SLAB =
			REGISTRATE.block("smooth_unstable_stone_slab", UnstableStoneSlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneStairsBlock> SMOOTH_UNSTABLE_STONE_STAIRS =
			REGISTRATE.block("smooth_unstable_stone_stairs", UnstableStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<UnstableStoneWallBlock> SMOOTH_UNSTABLE_STONE_WALL =
			REGISTRATE.block("smooth_unstable_stone_wall", UnstableStoneWallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();

	public static final BlockEntry<Block> SMOOTH_CARNOTITE =
			REGISTRATE.block("smooth_carnotite", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<SlabBlock> SMOOTH_CARNOTITE_SLAB =
			REGISTRATE.block("smooth_carnotite_slab", SlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<CarnotiteStairsBlock> SMOOTH_CARNOTITE_STAIRS =
			REGISTRATE.block("smooth_carnotite_stairs", CarnotiteStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<WallBlock> SMOOTH_CARNOTITE_WALL =
			REGISTRATE.block("smooth_carnotite_wall", WallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();

	public static final BlockEntry<AbyssalStoneBlock> SMOOTH_ABYSSAL_STONE =
			REGISTRATE.block("smooth_abyssal_stone", AbyssalStoneBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<AbyssalStoneSlabBlock> SMOOTH_ABYSSAL_STONE_SLAB =
			REGISTRATE.block("smooth_abyssal_stone_slab", AbyssalStoneSlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<AbyssalStoneStairsBlock> SMOOTH_ABYSSAL_STONE_STAIRS =
			REGISTRATE.block("smooth_abyssal_stone_stairs", AbyssalStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<AbyssalStoneWallBlock> SMOOTH_ABYSSAL_STONE_WALL =
			REGISTRATE.block("smooth_abyssal_stone_wall", AbyssalStoneWallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();

	public static final BlockEntry<Block> GARNISH_COMPOUND_BLOCK =
			REGISTRATE.block("garnish_compound_block", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.BONE_BLOCK).register();
	public static final BlockEntry<Block> SALT_COMPOUND_BLOCK =
			REGISTRATE.block("salt_compound_block", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.BONE_BLOCK).register();
	public static final BlockEntry<Block> ETHEREAL_COMPOUND_BLOCK =
			REGISTRATE.block("ethereal_compound_block", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.BONE_BLOCK).register();
	public static final BlockEntry<Block> MULCH_BLOCK =
			REGISTRATE.block("mulch_block", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.OAK_WOOD).register();

	public static final BlockEntry<NetherFlowerBlock> PANSOPHICAL_DAISY =
			REGISTRATE.block("pansophical_daisy", NetherFlowerBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.WARPED_FUNGUS).register();
	public static final BlockEntry<NetherFlowerBlock> INCANDESCENT_LILY =
			REGISTRATE.block("incandescent_lily", NetherFlowerBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CRIMSON_FUNGUS).register();
	public static final BlockEntry<NetherLichenBlock> SORROWFUL_LICHEN =
			REGISTRATE.block("sorrowful_lichen", NetherLichenBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.properties(p -> p.lightLevel(NetherLichenBlock.emission(4)).mapColor(MapColor.GLOW_LICHEN)
							.replaceable().noCollission().strength(0.2F).sound(SoundType.GLOW_LICHEN)
							.pushReaction(PushReaction.DESTROY)).register();
	public static final BlockEntry<RotatedPillarBlock> SENILE_BONE_BLOCK =
			REGISTRATE.block("senile_bone_block", RotatedPillarBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.BONE_BLOCK).register();

	public static final BlockEntry<EndPlantBlock> AUREATE_SHRUB =
			REGISTRATE.block("aureate_shrub", EndPlantBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.WARPED_ROOTS).register();

	public static final BlockEntry<PottedSepiaFungusBlock> POTTED_SEPIA_FUNGUS =
			REGISTRATE.block("potted_sepia_fungus", PottedSepiaFungusBlock::new)
					.initialProperties(() -> Blocks.POTTED_CRIMSON_FUNGUS).register();
	public static final BlockEntry<PottedSoulRootsBlock> POTTED_SOUL_ROOTS =
			REGISTRATE.block("potted_soul_roots", PottedSoulRootsBlock::new)
					.initialProperties(() -> Blocks.POTTED_CRIMSON_FUNGUS).register();
	public static final BlockEntry<PottedBarrenRootsBlock> POTTED_BARREN_ROOTS =
			REGISTRATE.block("potted_barren_roots", PottedBarrenRootsBlock::new)
					.initialProperties(() -> Blocks.POTTED_CRIMSON_FUNGUS).register();
	public static final BlockEntry<PottedSmallChorusPlantBlock> POTTED_SMALL_CHORUS_PLANT =
			REGISTRATE.block("potted_small_chorus_plant", PottedSmallChorusPlantBlock::new)
					.initialProperties(() -> Blocks.POTTED_CRIMSON_FUNGUS).register();
	public static final BlockEntry<PottedPansophicalDaisyBlock> POTTED_PANSOPHICAL_DAISY =
			REGISTRATE.block("potted_pansophical_daisy", PottedPansophicalDaisyBlock::new)
					.initialProperties(() -> Blocks.POTTED_CRIMSON_FUNGUS).register();
	public static final BlockEntry<PottedIncandescentLilyBlock> POTTED_INCANDESCENT_LILY =
			REGISTRATE.block("potted_incandescent_lily", PottedIncandescentLilyBlock::new)
					.initialProperties(() -> Blocks.POTTED_CRIMSON_FUNGUS).register();

	public static final BlockEntry<PottedAureateShrubBlock> POTTED_AUREATE_SHRUB =
			REGISTRATE.block("potted_aureate_shrub", PottedAureateShrubBlock::new)
					.initialProperties(() -> Blocks.POTTED_CRIMSON_FUNGUS).register();


	public static final BlockEntry<Block> DRAGON_STONE =
			REGISTRATE.block("dragon_stone", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<SlabBlock> DRAGON_STONE_SLAB =
			REGISTRATE.block("dragon_stone_slab", SlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<DragonStoneStairsBlock> DRAGON_STONE_STAIRS =
			REGISTRATE.block("dragon_stone_stairs", DragonStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<WallBlock> DRAGON_STONE_WALL =
			REGISTRATE.block("dragon_stone_wall", WallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<Block> POLISHED_DRAGON_STONE =
			REGISTRATE.block("polished_dragon_stone", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<SlabBlock> POLISHED_DRAGON_STONE_SLAB =
			REGISTRATE.block("polished_dragon_stone_slab", SlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<DragonStoneStairsBlock> POLISHED_DRAGON_STONE_STAIRS =
			REGISTRATE.block("polished_dragon_stone_stairs", DragonStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<WallBlock> POLISHED_DRAGON_STONE_WALL =
			REGISTRATE.block("polished_dragon_stone_wall", WallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<Block> DRAGON_STONE_BRICKS =
			REGISTRATE.block("dragon_stone_bricks", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<SlabBlock> DRAGON_STONE_BRICK_SLAB =
			REGISTRATE.block("dragon_stone_brick_slab", SlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<DragonStoneStairsBlock> DRAGON_STONE_BRICK_STAIRS =
			REGISTRATE.block("dragon_stone_brick_stairs", DragonStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<WallBlock> DRAGON_STONE_BRICK_WALL =
			REGISTRATE.block("dragon_stone_brick_wall", WallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<Block> CHISELED_DRAGON_STONE_BRICKS =
			REGISTRATE.block("chiseled_dragon_stone_bricks", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<Block> SMOOTH_DRAGON_STONE =
			REGISTRATE.block("smooth_dragon_stone", Block::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<SlabBlock> SMOOTH_DRAGON_STONE_SLAB =
			REGISTRATE.block("smooth_dragon_stone_slab", SlabBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<DragonStoneStairsBlock> SMOOTH_DRAGON_STONE_STAIRS =
			REGISTRATE.block("smooth_dragon_stone_stairs", DragonStoneStairsBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();
	public static final BlockEntry<WallBlock> SMOOTH_DRAGON_STONE_WALL =
			REGISTRATE.block("smooth_dragon_stone_wall", WallBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.STONE)
					.properties(p -> p.explosionResistance(12.0F)).register();

	public static final BlockEntry<AnniversaryCakeBlock> ANNIVERSARY_CAKE =
			REGISTRATE.block("anniversary_cake", AnniversaryCakeBlock::new)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.simpleItem()
					.initialProperties(() -> Blocks.CAKE).register();

	public static final BlockEntry<BokChoyPlantBlock> BOK_CHOY_PLANT =
			REGISTRATE.block("bok_choy_plant", BokChoyPlantBlock::new)
					.initialProperties(() -> Blocks.WHEAT)
					.blockstate((ctx, pov) -> pov.simpleBlock(ctx.get(), AssetLookup.standardModel(ctx, pov)))
					.properties(p -> p.mapColor(MapColor.GRASS).noCollission().instabreak().sound(SoundType.GRASS))
					.register();

	public static void setRegister() {}
}
