package net.dakotapride.garnished.item.tab;

import io.github.fabricators_of_create.porting_lib.util.ItemGroupUtil;
import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;

import net.minecraft.world.item.ItemStack;

import org.jetbrains.annotations.NotNull;

public class GarnishedCreativeModeTab extends CreativeModeTab {
	public GarnishedCreativeModeTab() {
		super(ItemGroupUtil.expandArrayAndGetId(), "create.garnished");
	}

	@Override
	public void fillItemList(@NotNull NonNullList<ItemStack> items) {

		items.add(GarnishedItems.CRACKED_CASHEW.asStack());
		items.add(GarnishedItems.UNGARNISHED_CASHEW.asStack());
		items.add(GarnishedItems.CASHEW.asStack());
		items.add(GarnishedItems.CINDER_FLOUR_CASHEW.asStack());
		items.add(GarnishedItems.MELTED_CINDER_FLOUR_CASHEW.asStack());
		items.add(GarnishedItems.SPEED_CINDER_CASHEW.asStack());
		items.add(GarnishedItems.SWEETENED_CASHEW.asStack());
		items.add(GarnishedItems.CHOCOLATE_GLAZED_CASHEW.asStack());
		items.add(GarnishedItems.HONEYED_CASHEW.asStack());

		items.add(GarnishedItems.CRACKED_WALNUT.asStack());
		items.add(GarnishedItems.UNGARNISHED_WALNUT.asStack());
		items.add(GarnishedItems.WALNUT.asStack());
		items.add(GarnishedItems.CINDER_FLOUR_WALNUT.asStack());
		items.add(GarnishedItems.MELTED_CINDER_FLOUR_WALNUT.asStack());
		items.add(GarnishedItems.STRENGTH_CINDER_WALNUT.asStack());
		items.add(GarnishedItems.SWEETENED_WALNUT.asStack());
		items.add(GarnishedItems.CHOCOLATE_GLAZED_WALNUT.asStack());
		items.add(GarnishedItems.HONEYED_WALNUT.asStack());

		items.add(GarnishedItems.CRACKED_ALMOND.asStack());
		items.add(GarnishedItems.UNGARNISHED_ALMOND.asStack());
		items.add(GarnishedItems.ALMOND.asStack());
		items.add(GarnishedItems.CINDER_FLOUR_ALMOND.asStack());
		items.add(GarnishedItems.MELTED_CINDER_FLOUR_ALMOND.asStack());
		items.add(GarnishedItems.HASTE_CINDER_ALMOND.asStack());
		items.add(GarnishedItems.SWEETENED_ALMOND.asStack());
		items.add(GarnishedItems.CHOCOLATE_GLAZED_ALMOND.asStack());
		items.add(GarnishedItems.HONEYED_ALMOND.asStack());

		items.add(GarnishedItems.CRACKED_PECAN.asStack());
		items.add(GarnishedItems.UNGARNISHED_PECAN.asStack());
		items.add(GarnishedItems.PECAN.asStack());
		items.add(GarnishedItems.CINDER_FLOUR_PECAN.asStack());
		items.add(GarnishedItems.MELTED_CINDER_FLOUR_PECAN.asStack());
		items.add(GarnishedItems.RESISTANCE_CINDER_PECAN.asStack());
		items.add(GarnishedItems.SWEETENED_PECAN.asStack());
		items.add(GarnishedItems.CHOCOLATE_GLAZED_PECAN.asStack());
		items.add(GarnishedItems.HONEYED_PECAN.asStack());

		items.add(GarnishedItems.CRACKED_PISTACHIO.asStack());
		items.add(GarnishedItems.UNGARNISHED_PISTACHIO.asStack());
		items.add(GarnishedItems.PISTACHIO.asStack());
		items.add(GarnishedItems.CINDER_FLOUR_PISTACHIO.asStack());
		items.add(GarnishedItems.MELTED_CINDER_FLOUR_PISTACHIO.asStack());
		items.add(GarnishedItems.NIGHT_VISION_CINDER_PISTACHIO.asStack());
		items.add(GarnishedItems.SWEETENED_PISTACHIO.asStack());
		items.add(GarnishedItems.CHOCOLATE_GLAZED_PISTACHIO.asStack());
		items.add(GarnishedItems.HONEYED_PISTACHIO.asStack());

		items.add(GarnishedItems.CRACKED_MACADAMIA.asStack());
		items.add(GarnishedItems.UNGARNISHED_MACADAMIA.asStack());
		items.add(GarnishedItems.MACADAMIA.asStack());
		items.add(GarnishedItems.CINDER_FLOUR_MACADAMIA.asStack());
		items.add(GarnishedItems.MELTED_CINDER_FLOUR_MACADAMIA.asStack());
		items.add(GarnishedItems.FIRE_RESISTANCE_CINDER_MACADAMIA.asStack());
		items.add(GarnishedItems.SWEETENED_MACADAMIA.asStack());
		items.add(GarnishedItems.CHOCOLATE_GLAZED_MACADAMIA.asStack());
		items.add(GarnishedItems.HONEYED_MACADAMIA.asStack());

		items.add(GarnishedItems.CRACKED_BUHG.asStack());
		items.add(GarnishedItems.UNGARNISHED_BUHG.asStack());
		items.add(GarnishedItems.BUHG.asStack());
		items.add(GarnishedItems.CINDER_FLOUR_BUHG.asStack());
		items.add(GarnishedItems.MELTED_CINDER_FLOUR_BUHG.asStack());
		items.add(GarnishedItems.EFFECT_CINDER_BUHG.asStack());
		items.add(GarnishedItems.SWEETENED_BUHG.asStack());
		items.add(GarnishedItems.CHOCOLATE_GLAZED_BUHG.asStack());
		items.add(GarnishedItems.HONEYED_BUHG.asStack());

		items.add(GarnishedItems.CRACKED_HAZELNUT.asStack());
		items.add(GarnishedItems.UNGARNISHED_HAZELNUT.asStack());
		items.add(GarnishedItems.HAZELNUT.asStack());
		items.add(GarnishedItems.CINDER_FLOUR_HAZELNUT.asStack());
		items.add(GarnishedItems.MELTED_CINDER_FLOUR_HAZELNUT.asStack());
		items.add(GarnishedItems.POTENT_SPEED_CINDER_HAZELNUT.asStack());
		items.add(GarnishedItems.SWEETENED_HAZELNUT.asStack());
		items.add(GarnishedItems.CHOCOLATE_GLAZED_HAZELNUT.asStack());
		items.add(GarnishedItems.HONEYED_HAZELNUT.asStack());

		items.add(GarnishedItems.CRACKED_CHESTNUT.asStack());
		items.add(GarnishedItems.UNGARNISHED_CHESTNUT.asStack());
		items.add(GarnishedItems.CHESTNUT.asStack());
		items.add(GarnishedItems.CINDER_FLOUR_CHESTNUT.asStack());
		items.add(GarnishedItems.MELTED_CINDER_FLOUR_CHESTNUT.asStack());
		items.add(GarnishedItems.SLOW_FALLING_CINDER_CHESTNUT.asStack());
		items.add(GarnishedItems.SWEETENED_CHESTNUT.asStack());
		items.add(GarnishedItems.CHOCOLATE_GLAZED_CHESTNUT.asStack());
		items.add(GarnishedItems.HONEYED_CHESTNUT.asStack());

		items.add(GarnishedItems.NUT_MIX.asStack());
		items.add(GarnishedItems.SWEETENED_NUT_MIX.asStack());
		items.add(GarnishedItems.CHOCHOLATE_GLAZED_NUT_MIX.asStack());
		items.add(GarnishedItems.HONEYED_NUT_MIX.asStack());

		items.add(GarnishedItems.GARNISHED_MEAL.asStack());

		items.add(GarnishedItems.GARNISHED_SWEET_BERRIES.asStack());
		items.add(GarnishedItems.HONEYED_SWEET_BERRIES.asStack());

		items.add(GarnishedItems.SALAD.asStack());
		items.add(GarnishedItems.PHANTOM_STEAK.asStack());
		items.add(GarnishedItems.BITTER_ALMOND.asStack());
		items.add(GarnishedItems.ALMOND_CHEESE.asStack());
		items.add(GarnishedItems.CASHEW_APPLE.asStack());
		items.add(GarnishedItems.WALNUT_BROWNIE.asStack());
		items.add(GarnishedItems.PECAN_PIE.asStack());
		items.add(GarnishedItems.CASHEW_COOKIE.asStack());

		items.add(GarnishedItems.PEANUT_OIL_AND_CINDER_SANDWICH.asStack());
		items.add(GarnishedItems.TOPHET_BREW.asStack());
		items.add(GarnishedItems.GRIM_STEW.asStack());
		items.add(GarnishedItems.SOUL_KHANA.asStack());
		items.add(GarnishedItems.SPIRITED_CONCOCTION.asStack());
		items.add(GarnishedItems.PUTRID_STEW.asStack());
		items.add(GarnishedItems.NUT_NACHO_BOWL.asStack());
		items.add(GarnishedItems.CINDER_ROLL.asStack());
		items.add(GarnishedItems.WRAPPED_CRIMSON_TANGLE.asStack());
		items.add(GarnishedItems.WRAPPED_WARPED_TANGLE.asStack());
		items.add(GarnishedItems.WRAPPED_SEPIA_TANGLE.asStack());
		items.add(GarnishedItems.WEEPING_TANGLE.asStack());
		items.add(GarnishedItems.BLAZING_DELIGHT.asStack());
		items.add(GarnishedItems.CRUSHED_CRIMSON_FUNGUS.asStack());
		items.add(GarnishedItems.CRUSHED_WARPED_FUNGUS.asStack());
		items.add(GarnishedItems.CRUSHED_SEPIA_FUNGUS.asStack());
		items.add(GarnishedItems.CRUSHED_SHROOMLIGHT.asStack());
		items.add(GarnishedItems.CRUSHED_ENDER_PEARL.asStack());
		items.add(GarnishedItems.NUT_FLOUR.asStack());
		items.add(GarnishedItems.NUT_NACHO.asStack());
		items.add(GarnishedItems.BRITTLE_DUST.asStack());
		items.add(GarnishedItems.SENILE_DUST.asStack());
		items.add(GarnishedItems.CRIMSON_TUSK.asStack());
		items.add(GarnishedItems.SILICA_HARDENED_WRAP.asStack());
		items.add(GarnishedItems.ENFLAMED_MANDIBLE.asStack());
		items.add(GarnishedItems.SENILE_SWEET_BLACKSTONE.asStack());
		items.add(GarnishedItems.SENILE_SWEET_BASALT.asStack());
		items.add(GarnishedItems.SENILE_SWEET_SCORIA.asStack());
		items.add(GarnishedItems.SENILE_SWEET_SCORCHIA.asStack());

		items.add(GarnishedItems.VOID_MIXTURE.asStack());
		items.add(GarnishedItems.ETHEREAL_CONCOCTION.asStack());
		items.add(GarnishedItems.DESOLATE_STEW.asStack());
		items.add(GarnishedItems.COSMIC_BREW.asStack());
		items.add(GarnishedItems.CHORUS_BOWL.asStack());
		items.add(GarnishedItems.CHORUS_COOKIE.asStack());
		items.add(GarnishedItems.ENDER_JELLY_BLOB.asStack());
		items.add(GarnishedItems.VOID_DUST.asStack());
		items.add(GarnishedItems.CHORUS_TUFT.asStack());
		items.add(GarnishedItems.HOLLOWED_CHORUS_FRUIT.asStack());
		items.add(GarnishedItems.ETHEREAL_COMPOUND.asStack());
		items.add(GarnishedItems.COSMIC_POWDER.asStack());
		items.add(GarnishedItems.DESOLATE_SPREAD.asStack());

		items.add(GarnishedItems.MUD_PIE.asStack());
		items.add(GarnishedItems.MULCH.asStack());

		items.add(GarnishedItems.VENERABLE_DOUGH.asStack());
		items.add(GarnishedItems.VENERABLE_DELICACY_RED.asStack());
		items.add(GarnishedItems.VENERABLE_DELICACY_ORANGE.asStack());
		items.add(GarnishedItems.VENERABLE_DELICACY_YELLOW.asStack());
		items.add(GarnishedItems.VENERABLE_DELICACY_GREEN.asStack());
		items.add(GarnishedItems.VENERABLE_DELICACY_BLUE.asStack());
		items.add(GarnishedItems.VENERABLE_DELICACY_PURPLE.asStack());
		items.add(GarnishedItems.SLIME_DROP.asStack());
		items.add(GarnishedItems.MASTIC_COVERED_SLIME_DROP_RED.asStack());
		items.add(GarnishedItems.MASTIC_COVERED_SLIME_DROP_ORANGE.asStack());
		items.add(GarnishedItems.MASTIC_COVERED_SLIME_DROP_YELLOW.asStack());
		items.add(GarnishedItems.MASTIC_COVERED_SLIME_DROP_GREEN.asStack());
		items.add(GarnishedItems.MASTIC_COVERED_SLIME_DROP_BLUE.asStack());
		items.add(GarnishedItems.MASTIC_COVERED_SLIME_DROP_PURPLE.asStack());
		items.add(GarnishedItems.MASTIC_RESIN.asStack());
		items.add(GarnishedItems.MASTIC_RESIN_RED.asStack());
		items.add(GarnishedItems.MASTIC_RESIN_ORANGE.asStack());
		items.add(GarnishedItems.MASTIC_RESIN_YELLOW.asStack());
		items.add(GarnishedItems.MASTIC_RESIN_GREEN.asStack());
		items.add(GarnishedItems.MASTIC_RESIN_BLUE.asStack());
		items.add(GarnishedItems.MASTIC_RESIN_PURPLE.asStack());
		items.add(GarnishedItems.MASTIC_PASTE.asStack());
		items.add(GarnishedItems.MASTIC_PASTE_RED.asStack());
		items.add(GarnishedItems.MASTIC_PASTE_ORANGE.asStack());
		items.add(GarnishedItems.MASTIC_PASTE_YELLOW.asStack());
		items.add(GarnishedItems.MASTIC_PASTE_GREEN.asStack());
		items.add(GarnishedItems.MASTIC_PASTE_BLUE.asStack());
		items.add(GarnishedItems.MASTIC_PASTE_PURPLE.asStack());

		items.add(GarnishedItems.BAKLAVA.asStack());
		items.add(GarnishedItems.MERRY_TREAT.asStack());
		items.add(GarnishedItems.COAL_TRUFFLE.asStack());
		items.add(GarnishedItems.GALACTIC_CANE.asStack());
		items.add(GarnishedItems.ICY_MASTIC_CHUNK.asStack());
		items.add(GarnishedItems.STURDY_WAFFLE.asStack());

		items.add(GarnishedItems.RAW_TENEBROUS_MEAT.asStack());
		items.add(GarnishedItems.COOKED_TENEBROUS_MEAT.asStack());
		items.add(GarnishedItems.CASHEW_SORBET_SCOOP.asStack());
		items.add(GarnishedItems.CASHEW_SORBET_DELIGHT.asStack());
		items.add(GarnishedItems.ACHING_TENEBROUS_CLUMP.asStack());
		items.add(GarnishedItems.GLOOMY_GATHERING.asStack());
		items.add(GarnishedItems.FISHY_SURPRISE.asStack());
		items.add(GarnishedItems.WALNUT_GORGE_CREAM.asStack());
		items.add(GarnishedItems.GHANDERCKEN.asStack());
		items.add(GarnishedItems.WHEAT_GRAZE.asStack());
		items.add(GarnishedItems.PORKCHOP_AND_GRAZE.asStack());
		items.add(GarnishedItems.MURKY_JELLY.asStack());
		items.add(GarnishedItems.CACKLING_PIE.asStack());
		items.add(GarnishedItems.YAM_O_GLOW_PUFFS.asStack());
		items.add(GarnishedItems.SHINING_DISH.asStack());
		items.add(GarnishedItems.MURKY_MACADAMIA_MALICE.asStack());
		items.add(GarnishedItems.NUTTY_MELODY.asStack());
		items.add(GarnishedItems.MUESLI.asStack());
		items.add(GarnishedItems.DUSTY_REGALE.asStack());
		items.add(GarnishedItems.INCENDIARY_STEW.asStack());

		items.add(GarnishedItems.DRIED_VERMILION_KELP.asStack());
		items.add(GarnishedItems.DRIED_DULSE_KELP.asStack());
		items.add(GarnishedItems.BEWILDERED_PASTRY.asStack());
		items.add(GarnishedItems.VERMILION_STEW.asStack());
		items.add(GarnishedItems.VAST_BREW.asStack());
		items.add(GarnishedItems.GALVANIC_HAUNTING.asStack());

		items.add(GarnishedItems.PRICKLY_PEAR.asStack());
		items.add(GarnishedItems.BAMBOO_CLOD.asStack());
		items.add(GarnishedItems.NOPALITO_WRAP.asStack());
		items.add(GarnishedItems.NOPALITO_WRAP_SUPREME.asStack());
		items.add(GarnishedItems.SINOPIA_ROCK_SWEET.asStack());
		items.add(GarnishedItems.THORN_ON_A_STICK.asStack());
		items.add(GarnishedItems.OVERGROWN_BREW.asStack());
		items.add(GarnishedItems.PRICKLY_PEAR_STEW.asStack());
		items.add(GarnishedItems.STEW_OF_THE_DAMNED.asStack());

		items.add(GarnishedItems.GHAST_TENDRIL.asStack());

		items.add(GarnishedItems.VOLATILE_DUST.asStack());

		items.add(GarnishedBlocks.VERMILION_KELP.asStack());
		items.add(GarnishedBlocks.DULSE_KELP.asStack());
		items.add(GarnishedItems.CORAL_WRAPPING.asStack());
		items.add(GarnishedItems.LUSTROUS_PEARL.asStack());

		items.add(GarnishedItems.ANTIQUE_SWATHE.asStack());
		items.add(GarnishedItems.BRISTLED_FLOUR.asStack());
		items.add(GarnishedItems.BRISTLED_TORTILLA.asStack());
		items.add(GarnishedItems.AMBER_REMNANT.asStack());
		items.add(GarnishedItems.SHATTERED_AMBER_REMNANT.asStack());

		items.add(GarnishedBlocks.SEPIA_FUNGUS.asStack());
		items.add(GarnishedBlocks.SOUL_ROOTS.asStack());

		items.add(GarnishedBlocks.BARREN_ROOTS.asStack());
		items.add(GarnishedBlocks.SMALL_CHORUS_PLANT.asStack());

		items.add(GarnishedItems.CRUSHED_SALT_COMPOUND.asStack());
		items.add(GarnishedItems.SALT_COMPOUND.asStack());

		items.add(GarnishedItems.APPLE_CIDER.asStack());
		items.add(GarnishedItems.CRYPTIC_APPLE_CIDER.asStack());
		items.add(GarnishedItems.BITTER_APPLE_CIDER.asStack());
		items.add(GarnishedItems.BOTTLED_PEANUT_OIL.asStack());
		items.add(GarnishedItems.FERMENTED_CASHEW_MIXTURE.asStack());
		items.add(GarnishedItems.BOTTLED_ENDER_JELLY.asStack());
		items.add(GarnishedItems.CHORUS_COCKTAIL.asStack());
		items.add(GarnishedItems.ILLUMINATING_COCKTAIL.asStack());
		items.add(GarnishedItems.ROSY_COCKTAIL.asStack());

		items.add(GarnishedItems.GARNISH_COMPOUND.asStack());
		items.add(GarnishedItems.GARNISH_POWDER.asStack());

		items.add(GarnishedFluids.GARNISH.get().getBucket().getDefaultInstance());
		items.add(GarnishedFluids.APPLE_CIDER.get().getBucket().getDefaultInstance());
		items.add(GarnishedFluids.PEANUT_OIL.get().getBucket().getDefaultInstance());
		items.add(GarnishedFluids.CASHEW_MIXTURE.get().getBucket().getDefaultInstance());
		items.add(GarnishedFluids.MASTIC_RESIN.get().getBucket().getDefaultInstance());
		items.add(GarnishedFluids.RED_MASTIC_RESIN.get().getBucket().getDefaultInstance());
		items.add(GarnishedFluids.ORANGE_MASTIC_RESIN.get().getBucket().getDefaultInstance());
		items.add(GarnishedFluids.YELLOW_MASTIC_RESIN.get().getBucket().getDefaultInstance());
		items.add(GarnishedFluids.GREEN_MASTIC_RESIN.get().getBucket().getDefaultInstance());
		items.add(GarnishedFluids.BLUE_MASTIC_RESIN.get().getBucket().getDefaultInstance());
		items.add(GarnishedFluids.PURPLE_MASTIC_RESIN.get().getBucket().getDefaultInstance());

		items.add(GarnishedItems.WOODEN_HATCHET.asStack());
		items.add(GarnishedItems.STONE_HATCHET.asStack());
		items.add(GarnishedItems.IRON_HATCHET.asStack());
		items.add(GarnishedItems.GOLDEN_HATCHET.asStack());
		items.add(GarnishedItems.DIAMOND_HATCHET.asStack());
		items.add(GarnishedItems.NETHERITE_HATCHET.asStack());
	}

	@Override
	public @NotNull ItemStack makeIcon() {
		return GarnishedItems.NUT_MIX.asStack();
	}

	public static class Blocks extends CreativeModeTab {
		public Blocks() {
			super(ItemGroupUtil.expandArrayAndGetId(), "create.garnished.blocks");
		}

		@Override
		public void fillItemList(NonNullList<ItemStack> items) {
			items.add(GarnishedBlocks.SOLIDIFIED_GARNISH_BLOCK.asStack());

			items.add(GarnishedBlocks.BLOCK_OF_ENDER_JELLY.asStack());
			items.add(GarnishedBlocks.UNGARNISHED_NUT_BLOCK.asStack());
			items.add(GarnishedBlocks.GARNISHED_NUT_BLOCK.asStack());
			items.add(GarnishedBlocks.GARNISH_COMPOUND_BLOCK.asStack());
			items.add(GarnishedBlocks.SALT_COMPOUND_BLOCK.asStack());
			items.add(GarnishedBlocks.ETHEREAL_COMPOUND_BLOCK.asStack());
			items.add(GarnishedBlocks.MULCH_BLOCK.asStack());

			items.add(GarnishedBlocks.SEPIA_WART_BLOCK.asStack());
			items.add(GarnishedBlocks.SEPIA_STEM.asStack());
			items.add(GarnishedBlocks.STRIPPED_SEPIA_STEM.asStack());
			items.add(GarnishedBlocks.SEPIA_HYPHAE.asStack());
			items.add(GarnishedBlocks.STRIPPED_SEPIA_HYPHAE.asStack());
			items.add(GarnishedBlocks.SEPIA_PLANKS.asStack());
			items.add(GarnishedBlocks.SEPIA_SLAB.asStack());
			items.add(GarnishedBlocks.SEPIA_STAIRS.asStack());
			items.add(GarnishedBlocks.SEPIA_TRAPDOOR.asStack());
			items.add(GarnishedBlocks.SEPIA_DOOR.asStack());
			items.add(GarnishedItems.SEPIA_SIGN.asStack());

			items.add(GarnishedBlocks.NUT_LOG.asStack());
			items.add(GarnishedBlocks.STRIPPED_NUT_LOG.asStack());
			items.add(GarnishedBlocks.NUT_WOOD.asStack());
			items.add(GarnishedBlocks.STRIPPED_NUT_WOOD.asStack());
			items.add(GarnishedBlocks.NUT_PLANKS.asStack());
			items.add(GarnishedBlocks.NUT_SLAB.asStack());
			items.add(GarnishedBlocks.NUT_STAIRS.asStack());
			items.add(GarnishedBlocks.NUT_TRAPDOOR.asStack());
			items.add(GarnishedBlocks.NUT_DOOR.asStack());
			items.add(GarnishedItems.NUT_SIGN.asStack());
			items.add(GarnishedItems.NUT_BOAT.asStack());

			items.add(GarnishedBlocks.ABYSSAL_STONE.asStack());
			items.add(GarnishedBlocks.ABYSSAL_STONE_SLAB.asStack());
			items.add(GarnishedBlocks.ABYSSAL_STONE_STAIRS.asStack());
			items.add(GarnishedBlocks.ABYSSAL_STONE_WALL.asStack());
			items.add(GarnishedBlocks.ABYSSAL_STONE_BRICKS.asStack());
			items.add(GarnishedBlocks.ABYSSAL_STONE_BRICKS_SLAB.asStack());
			items.add(GarnishedBlocks.ABYSSAL_STONE_BRICKS_STAIRS.asStack());
			items.add(GarnishedBlocks.ABYSSAL_STONE_BRICKS_WALL.asStack());
			items.add(GarnishedBlocks.POLISHED_ABYSSAL_STONE.asStack());
			items.add(GarnishedBlocks.POLISHED_ABYSSAL_STONE_SLAB.asStack());
			items.add(GarnishedBlocks.POLISHED_ABYSSAL_STONE_STAIRS.asStack());
			items.add(GarnishedBlocks.POLISHED_ABYSSAL_STONE_WALL.asStack());
			items.add(GarnishedBlocks.SMOOTH_ABYSSAL_STONE.asStack());
			items.add(GarnishedBlocks.SMOOTH_ABYSSAL_STONE_SLAB.asStack());
			items.add(GarnishedBlocks.SMOOTH_ABYSSAL_STONE_STAIRS.asStack());
			items.add(GarnishedBlocks.SMOOTH_ABYSSAL_STONE_WALL.asStack());
			items.add(GarnishedBlocks.CHISELED_ABYSSAL_STONE_BRICKS.asStack());

			items.add(GarnishedBlocks.CARNOTITE.asStack());
			items.add(GarnishedBlocks.CARNOTITE_SLAB.asStack());
			items.add(GarnishedBlocks.CARNOTITE_STAIRS.asStack());
			items.add(GarnishedBlocks.CARNOTITE_WALL.asStack());
			items.add(GarnishedBlocks.CARNOTITE_BRICKS.asStack());
			items.add(GarnishedBlocks.CARNOTITE_BRICKS_SLAB.asStack());
			items.add(GarnishedBlocks.CARNOTITE_BRICKS_STAIRS.asStack());
			items.add(GarnishedBlocks.CARNOTITE_BRICKS_WALL.asStack());
			items.add(GarnishedBlocks.POLISHED_CARNOTITE.asStack());
			items.add(GarnishedBlocks.POLISHED_CARNOTITE_SLAB.asStack());
			items.add(GarnishedBlocks.POLISHED_CARNOTITE_STAIRS.asStack());
			items.add(GarnishedBlocks.POLISHED_CARNOTITE_WALL.asStack());
			items.add(GarnishedBlocks.SMOOTH_CARNOTITE.asStack());
			items.add(GarnishedBlocks.SMOOTH_CARNOTITE_SLAB.asStack());
			items.add(GarnishedBlocks.SMOOTH_CARNOTITE_STAIRS.asStack());
			items.add(GarnishedBlocks.SMOOTH_CARNOTITE_WALL.asStack());
			items.add(GarnishedBlocks.CHISELED_CARNOTITE_BRICKS.asStack());

			items.add(GarnishedBlocks.UNSTABLE_STONE.asStack());
			items.add(GarnishedBlocks.UNSTABLE_STONE_SLAB.asStack());
			items.add(GarnishedBlocks.UNSTABLE_STONE_STAIRS.asStack());
			items.add(GarnishedBlocks.UNSTABLE_STONE_WALL.asStack());
			items.add(GarnishedBlocks.UNSTABLE_STONE_BRICKS.asStack());
			items.add(GarnishedBlocks.UNSTABLE_STONE_BRICKS_SLAB.asStack());
			items.add(GarnishedBlocks.UNSTABLE_STONE_BRICKS_STAIRS.asStack());
			items.add(GarnishedBlocks.UNSTABLE_STONE_BRICKS_WALL.asStack());
			items.add(GarnishedBlocks.POLISHED_UNSTABLE_STONE.asStack());
			items.add(GarnishedBlocks.POLISHED_UNSTABLE_STONE_SLAB.asStack());
			items.add(GarnishedBlocks.POLISHED_UNSTABLE_STONE_STAIRS.asStack());
			items.add(GarnishedBlocks.POLISHED_UNSTABLE_STONE_WALL.asStack());
			items.add(GarnishedBlocks.SMOOTH_UNSTABLE_STONE.asStack());
			items.add(GarnishedBlocks.SMOOTH_UNSTABLE_STONE_SLAB.asStack());
			items.add(GarnishedBlocks.SMOOTH_UNSTABLE_STONE_STAIRS.asStack());
			items.add(GarnishedBlocks.SMOOTH_UNSTABLE_STONE_WALL.asStack());
			items.add(GarnishedBlocks.CHISELED_UNSTABLE_STONE_BRICKS.asStack());

			items.add(GarnishedBlocks.RITUALISTIC_STONE.asStack());
			items.add(GarnishedBlocks.RITUALISTIC_STONE_SLAB.asStack());
			items.add(GarnishedBlocks.RITUALISTIC_STONE_STAIRS.asStack());
			items.add(GarnishedBlocks.RITUALISTIC_STONE_WALL.asStack());
			items.add(GarnishedBlocks.RITUALISTIC_STONE_BRICKS.asStack());
			items.add(GarnishedBlocks.RITUALISTIC_STONE_BRICKS_SLAB.asStack());
			items.add(GarnishedBlocks.RITUALISTIC_STONE_BRICKS_STAIRS.asStack());
			items.add(GarnishedBlocks.RITUALISTIC_STONE_BRICKS_WALL.asStack());
			items.add(GarnishedBlocks.POLISHED_RITUALISTIC_STONE.asStack());
			items.add(GarnishedBlocks.POLISHED_RITUALISTIC_STONE_SLAB.asStack());
			items.add(GarnishedBlocks.POLISHED_RITUALISTIC_STONE_STAIRS.asStack());
			items.add(GarnishedBlocks.POLISHED_RITUALISTIC_STONE_WALL.asStack());
			items.add(GarnishedBlocks.SMOOTH_RITUALISTIC_STONE.asStack());
			items.add(GarnishedBlocks.SMOOTH_RITUALISTIC_STONE_SLAB.asStack());
			items.add(GarnishedBlocks.SMOOTH_RITUALISTIC_STONE_STAIRS.asStack());
			items.add(GarnishedBlocks.SMOOTH_RITUALISTIC_STONE_WALL.asStack());
			items.add(GarnishedBlocks.CHISELED_RITUALISTIC_STONE_BRICKS.asStack());

			items.add(GarnishedBlocks.DRIED_VERMILION_KELP_BLOCK.asStack());
			items.add(GarnishedBlocks.DRIED_DULSE_KELP_BLOCK.asStack());
			items.add(GarnishedBlocks.VOLTAIC_SEA_GRASS.asStack());
		}

		@Override
		public @NotNull ItemStack makeIcon() {
			return GarnishedBlocks.GARNISHED_NUT_BLOCK.asStack();
		}
	}
}
