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
	public void fillItemList(@NotNull NonNullList<ItemStack> output) {
		output.add(GarnishedItems.CRACKED_CASHEW.asStack());
		output.add(GarnishedItems.UNGARNISHED_CASHEW.asStack());
		output.add(GarnishedItems.CASHEW.asStack());
		output.add(GarnishedItems.CINDER_FLOUR_CASHEW.asStack());
		output.add(GarnishedItems.MELTED_CINDER_FLOUR_CASHEW.asStack());
		output.add(GarnishedItems.SPEED_CINDER_CASHEW.asStack());
		output.add(GarnishedItems.SWEETENED_CASHEW.asStack());
		output.add(GarnishedItems.CHOCOLATE_GLAZED_CASHEW.asStack());
		output.add(GarnishedItems.HONEYED_CASHEW.asStack());

		output.add(GarnishedItems.CRACKED_WALNUT.asStack());
		output.add(GarnishedItems.UNGARNISHED_WALNUT.asStack());
		output.add(GarnishedItems.WALNUT.asStack());
		output.add(GarnishedItems.CINDER_FLOUR_WALNUT.asStack());
		output.add(GarnishedItems.MELTED_CINDER_FLOUR_WALNUT.asStack());
		output.add(GarnishedItems.STRENGTH_CINDER_WALNUT.asStack());
		output.add(GarnishedItems.SWEETENED_WALNUT.asStack());
		output.add(GarnishedItems.CHOCOLATE_GLAZED_WALNUT.asStack());
		output.add(GarnishedItems.HONEYED_WALNUT.asStack());

		output.add(GarnishedItems.CRACKED_ALMOND.asStack());
		output.add(GarnishedItems.UNGARNISHED_ALMOND.asStack());
		output.add(GarnishedItems.ALMOND.asStack());
		output.add(GarnishedItems.CINDER_FLOUR_ALMOND.asStack());
		output.add(GarnishedItems.MELTED_CINDER_FLOUR_ALMOND.asStack());
		output.add(GarnishedItems.HASTE_CINDER_ALMOND.asStack());
		output.add(GarnishedItems.SWEETENED_ALMOND.asStack());
		output.add(GarnishedItems.CHOCOLATE_GLAZED_ALMOND.asStack());
		output.add(GarnishedItems.HONEYED_ALMOND.asStack());

		output.add(GarnishedItems.CRACKED_PECAN.asStack());
		output.add(GarnishedItems.UNGARNISHED_PECAN.asStack());
		output.add(GarnishedItems.PECAN.asStack());
		output.add(GarnishedItems.CINDER_FLOUR_PECAN.asStack());
		output.add(GarnishedItems.MELTED_CINDER_FLOUR_PECAN.asStack());
		output.add(GarnishedItems.RESISTANCE_CINDER_PECAN.asStack());
		output.add(GarnishedItems.SWEETENED_PECAN.asStack());
		output.add(GarnishedItems.CHOCOLATE_GLAZED_PECAN.asStack());
		output.add(GarnishedItems.HONEYED_PECAN.asStack());

		output.add(GarnishedItems.CRACKED_PISTACHIO.asStack());
		output.add(GarnishedItems.UNGARNISHED_PISTACHIO.asStack());
		output.add(GarnishedItems.PISTACHIO.asStack());
		output.add(GarnishedItems.CINDER_FLOUR_PISTACHIO.asStack());
		output.add(GarnishedItems.MELTED_CINDER_FLOUR_PISTACHIO.asStack());
		output.add(GarnishedItems.NIGHT_VISION_CINDER_PISTACHIO.asStack());
		output.add(GarnishedItems.SWEETENED_PISTACHIO.asStack());
		output.add(GarnishedItems.CHOCOLATE_GLAZED_PISTACHIO.asStack());
		output.add(GarnishedItems.HONEYED_PISTACHIO.asStack());

		output.add(GarnishedItems.CRACKED_MACADAMIA.asStack());
		output.add(GarnishedItems.UNGARNISHED_MACADAMIA.asStack());
		output.add(GarnishedItems.MACADAMIA.asStack());
		output.add(GarnishedItems.CINDER_FLOUR_MACADAMIA.asStack());
		output.add(GarnishedItems.MELTED_CINDER_FLOUR_MACADAMIA.asStack());
		output.add(GarnishedItems.FIRE_RESISTANCE_CINDER_MACADAMIA.asStack());
		output.add(GarnishedItems.SWEETENED_MACADAMIA.asStack());
		output.add(GarnishedItems.CHOCOLATE_GLAZED_MACADAMIA.asStack());
		output.add(GarnishedItems.HONEYED_MACADAMIA.asStack());

		output.add(GarnishedItems.CRACKED_BUHG.asStack());
		output.add(GarnishedItems.UNGARNISHED_BUHG.asStack());
		output.add(GarnishedItems.BUHG.asStack());
		output.add(GarnishedItems.CINDER_FLOUR_BUHG.asStack());
		output.add(GarnishedItems.MELTED_CINDER_FLOUR_BUHG.asStack());
		output.add(GarnishedItems.EFFECT_CINDER_BUHG.asStack());
		output.add(GarnishedItems.SWEETENED_BUHG.asStack());
		output.add(GarnishedItems.CHOCOLATE_GLAZED_BUHG.asStack());
		output.add(GarnishedItems.HONEYED_BUHG.asStack());

		output.add(GarnishedItems.CRACKED_HAZELNUT.asStack());
		output.add(GarnishedItems.UNGARNISHED_HAZELNUT.asStack());
		output.add(GarnishedItems.HAZELNUT.asStack());
		output.add(GarnishedItems.CINDER_FLOUR_HAZELNUT.asStack());
		output.add(GarnishedItems.MELTED_CINDER_FLOUR_HAZELNUT.asStack());
		output.add(GarnishedItems.POTENT_SPEED_CINDER_HAZELNUT.asStack());
		output.add(GarnishedItems.SWEETENED_HAZELNUT.asStack());
		output.add(GarnishedItems.CHOCOLATE_GLAZED_HAZELNUT.asStack());
		output.add(GarnishedItems.HONEYED_HAZELNUT.asStack());

		output.add(GarnishedItems.CRACKED_CHESTNUT.asStack());
		output.add(GarnishedItems.UNGARNISHED_CHESTNUT.asStack());
		output.add(GarnishedItems.CHESTNUT.asStack());
		output.add(GarnishedItems.CINDER_FLOUR_CHESTNUT.asStack());
		output.add(GarnishedItems.MELTED_CINDER_FLOUR_CHESTNUT.asStack());
		output.add(GarnishedItems.SLOW_FALLING_CINDER_CHESTNUT.asStack());
		output.add(GarnishedItems.SWEETENED_CHESTNUT.asStack());
		output.add(GarnishedItems.CHOCOLATE_GLAZED_CHESTNUT.asStack());
		output.add(GarnishedItems.HONEYED_CHESTNUT.asStack());

		output.add(GarnishedItems.NUT_MIX.asStack());
		output.add(GarnishedItems.SWEETENED_NUT_MIX.asStack());
		output.add(GarnishedItems.CHOCOLATE_GLAZED_NUT_MIX.asStack());
		output.add(GarnishedItems.HONEYED_NUT_MIX.asStack());

		output.add(GarnishedItems.GARNISHED_MEAL.asStack());

		output.add(GarnishedItems.GARNISHED_SWEET_BERRIES.asStack());
		output.add(GarnishedItems.HONEYED_SWEET_BERRIES.asStack());

		output.add(GarnishedItems.SALAD.asStack());
		output.add(GarnishedItems.PHANTOM_STEAK.asStack());
		output.add(GarnishedItems.BITTER_ALMOND.asStack());
		output.add(GarnishedItems.ALMOND_CHEESE.asStack());
		output.add(GarnishedItems.CASHEW_APPLE.asStack());
		output.add(GarnishedItems.WALNUT_BROWNIE.asStack());
		output.add(GarnishedItems.PECAN_PIE.asStack());
		output.add(GarnishedItems.CASHEW_COOKIE.asStack());

		output.add(GarnishedItems.PEANUT_OIL_AND_CINDER_SANDWICH.asStack());
		output.add(GarnishedItems.TOPHET_BREW.asStack());
		output.add(GarnishedItems.GRIM_STEW.asStack());
		output.add(GarnishedItems.SOUL_KHANA.asStack());
		output.add(GarnishedItems.OMNISCIENT_STEW.asStack());
		output.add(GarnishedItems.WARPED_BREW.asStack());
		output.add(GarnishedItems.INIQUITOUS_BREW.asStack());
		output.add(GarnishedItems.SPIRITED_CONCOCTION.asStack());
		output.add(GarnishedItems.PUTRID_STEW.asStack());
		output.add(GarnishedItems.NUT_NACHO_BOWL.asStack());
		output.add(GarnishedItems.CINDER_ROLL.asStack());
		output.add(GarnishedItems.PIQUANT_PRETZEL.asStack());
		output.add(GarnishedItems.WRAPPED_CRIMSON_TANGLE.asStack());
		output.add(GarnishedItems.WRAPPED_WARPED_TANGLE.asStack());
		output.add(GarnishedItems.WRAPPED_SEPIA_TANGLE.asStack());
		output.add(GarnishedItems.WEEPING_TANGLE.asStack());
		output.add(GarnishedItems.BLAZING_DELIGHT.asStack());
		output.add(GarnishedItems.CRUSHED_CRIMSON_FUNGUS.asStack());
		output.add(GarnishedItems.CRUSHED_WARPED_FUNGUS.asStack());
		output.add(GarnishedItems.CRUSHED_SEPIA_FUNGUS.asStack());
		output.add(GarnishedItems.CRUSHED_SHROOMLIGHT.asStack());
		output.add(GarnishedItems.CRUSHED_ENDER_PEARL.asStack());
		output.add(GarnishedItems.NUT_FLOUR.asStack());
		output.add(GarnishedItems.NUT_NACHO.asStack());
		output.add(GarnishedItems.FIENDISH_SPORE.asStack());
		output.add(GarnishedItems.BRITTLE_DUST.asStack());
		output.add(GarnishedItems.SENILE_DUST.asStack());
		output.add(GarnishedItems.TORRID_BLEND.asStack());
		output.add(GarnishedItems.MALODOROUS_MIXTURE.asStack());
		output.add(GarnishedItems.SENILE_BONE.asStack());
		output.add(GarnishedItems.SENILE_SPREAD.asStack());
		output.add(GarnishedItems.TUSK.asStack());
		output.add(GarnishedItems.IRATE_TUSK.asStack());
		output.add(GarnishedItems.CRIMSON_TUSK.asStack());
		output.add(GarnishedItems.SILICA_HARDENED_WRAP.asStack());
		output.add(GarnishedItems.ENFLAMED_MANDIBLE.asStack());
		output.add(GarnishedItems.SENILE_SWEET_BLACKSTONE.asStack());
		output.add(GarnishedItems.SENILE_SWEET_BASALT.asStack());
		output.add(GarnishedItems.SENILE_SWEET_SCORIA.asStack());
		output.add(GarnishedItems.SENILE_SWEET_SCORCHIA.asStack());
		output.add(GarnishedItems.OMNISCIENT_STEW.asStack());
		output.add(GarnishedItems.WARPED_BREW.asStack());
		output.add(GarnishedItems.INIQUITOUS_BREW.asStack());
		output.add(GarnishedItems.PIQUANT_PRETZEL.asStack());
		output.add(GarnishedItems.INCANDESCENT_PETAL.asStack());
		output.add(GarnishedItems.PANSOPHICAL_PETAL.asStack());

		output.add(GarnishedItems.VOID_MIXTURE.asStack());
		output.add(GarnishedItems.ETHEREAL_CONCOCTION.asStack());
		output.add(GarnishedItems.DESOLATE_STEW.asStack());
		output.add(GarnishedItems.COSMIC_BREW.asStack());
		output.add(GarnishedItems.FARSEER_BREW.asStack());
		output.add(GarnishedItems.SHELLED_DUMPLING.asStack());
		output.add(GarnishedItems.CHAMPIONS_OMELETTE.asStack());
		output.add(GarnishedItems.CHORUS_BOWL.asStack());
		output.add(GarnishedItems.CHORUS_COOKIE.asStack());
		output.add(GarnishedItems.ENDER_JELLY_BLOB.asStack());
		output.add(GarnishedItems.VOID_DUST.asStack());
		output.add(GarnishedItems.CHORUS_TUFT.asStack());
		output.add(GarnishedItems.HOLLOWED_CHORUS_FRUIT.asStack());
		output.add(GarnishedItems.ETHEREAL_COMPOUND.asStack());
		output.add(GarnishedItems.PRELIMINARY_NUCLEUS.asStack());
		output.add(GarnishedItems.DIMMED_SCALE.asStack());
		output.add(GarnishedItems.COSMIC_POWDER.asStack());
		output.add(GarnishedItems.DESOLATE_SPREAD.asStack());
		output.add(GarnishedItems.ENDER_DRAGON_EGG_SHELL.asStack());
		output.add(GarnishedItems.FRAIL_ENDER_DRAGON_EGG_SHELL.asStack());

		output.add(GarnishedItems.MUD_PIE.asStack());
		output.add(GarnishedItems.MULCH.asStack());

		output.add(GarnishedItems.MOLTEN_STEW.asStack());

		output.add(GarnishedItems.VENERABLE_DOUGH.asStack());
		output.add(GarnishedItems.VENERABLE_DELICACY_RED.asStack());
		output.add(GarnishedItems.VENERABLE_DELICACY_ORANGE.asStack());
		output.add(GarnishedItems.VENERABLE_DELICACY_YELLOW.asStack());
		output.add(GarnishedItems.VENERABLE_DELICACY_GREEN.asStack());
		output.add(GarnishedItems.VENERABLE_DELICACY_BLUE.asStack());
		output.add(GarnishedItems.VENERABLE_DELICACY_PURPLE.asStack());
		output.add(GarnishedItems.SLIME_DROP.asStack());
		output.add(GarnishedItems.MASTIC_COVERED_SLIME_DROP_RED.asStack());
		output.add(GarnishedItems.MASTIC_COVERED_SLIME_DROP_ORANGE.asStack());
		output.add(GarnishedItems.MASTIC_COVERED_SLIME_DROP_YELLOW.asStack());
		output.add(GarnishedItems.MASTIC_COVERED_SLIME_DROP_GREEN.asStack());
		output.add(GarnishedItems.MASTIC_COVERED_SLIME_DROP_BLUE.asStack());
		output.add(GarnishedItems.MASTIC_COVERED_SLIME_DROP_PURPLE.asStack());
		output.add(GarnishedItems.MASTIC_RESIN.asStack());
		output.add(GarnishedItems.MASTIC_RESIN_RED.asStack());
		output.add(GarnishedItems.MASTIC_RESIN_ORANGE.asStack());
		output.add(GarnishedItems.MASTIC_RESIN_YELLOW.asStack());
		output.add(GarnishedItems.MASTIC_RESIN_GREEN.asStack());
		output.add(GarnishedItems.MASTIC_RESIN_BLUE.asStack());
		output.add(GarnishedItems.MASTIC_RESIN_PURPLE.asStack());
		output.add(GarnishedItems.MASTIC_PASTE.asStack());
		output.add(GarnishedItems.MASTIC_PASTE_RED.asStack());
		output.add(GarnishedItems.MASTIC_PASTE_ORANGE.asStack());
		output.add(GarnishedItems.MASTIC_PASTE_YELLOW.asStack());
		output.add(GarnishedItems.MASTIC_PASTE_GREEN.asStack());
		output.add(GarnishedItems.MASTIC_PASTE_BLUE.asStack());
		output.add(GarnishedItems.MASTIC_PASTE_PURPLE.asStack());

		output.add(GarnishedItems.SUGAR_CUBE.asStack());
		output.add(GarnishedItems.BOK_CHOY.asStack());
		output.add(GarnishedItems.BOK_CHOY_SEEDS.asStack());

		output.add(GarnishedItems.BAKLAVA.asStack());
		output.add(GarnishedItems.MERRY_TREAT.asStack());
		output.add(GarnishedItems.COAL_TRUFFLE.asStack());
		output.add(GarnishedItems.GALACTIC_CANE.asStack());
		output.add(GarnishedItems.ICY_MASTIC_CHUNK.asStack());
		output.add(GarnishedItems.STURDY_WAFFLE.asStack());

		output.add(GarnishedItems.RAW_TENEBROUS_MEAT.asStack());
		output.add(GarnishedItems.COOKED_TENEBROUS_MEAT.asStack());
		output.add(GarnishedItems.VEX_WING.asStack());
		output.add(GarnishedItems.MEAT_SCRAPS.asStack());
		output.add(GarnishedItems.CASHEW_SORBET_SCOOP.asStack());
		output.add(GarnishedItems.CASHEW_SORBET_DELIGHT.asStack());
		output.add(GarnishedItems.ACHING_TENEBROUS_CLUMP.asStack());
		output.add(GarnishedItems.GLOOMY_GATHERING.asStack());
		output.add(GarnishedItems.FISHY_SURPRISE.asStack());
		output.add(GarnishedItems.WALNUT_GORGE_CREAM.asStack());
		output.add(GarnishedItems.GHANDERCKEN.asStack());
		output.add(GarnishedItems.WHEAT_GRAZE.asStack());
		output.add(GarnishedItems.PORKCHOP_AND_GRAZE.asStack());
		output.add(GarnishedItems.MURKY_JELLY.asStack());
		output.add(GarnishedItems.CACKLING_PIE.asStack());
		output.add(GarnishedItems.YAM_O_GLOW_PUFFS.asStack());
		output.add(GarnishedItems.SHINING_DISH.asStack());
		output.add(GarnishedItems.MURKY_MACADAMIA_MALICE.asStack());
		output.add(GarnishedItems.NUTTY_MELODY.asStack());
		output.add(GarnishedItems.MUESLI.asStack());
		output.add(GarnishedItems.DUSTY_REGALE.asStack());
		output.add(GarnishedItems.INCENDIARY_STEW.asStack());

		output.add(GarnishedItems.DRIED_VERMILION_KELP.asStack());
		output.add(GarnishedItems.DRIED_DULSE_KELP.asStack());
		output.add(GarnishedItems.BEWILDERED_PASTRY.asStack());
		output.add(GarnishedItems.VERMILION_STEW.asStack());
		output.add(GarnishedItems.VAST_BREW.asStack());
		output.add(GarnishedItems.GALVANIC_HAUNTING.asStack());

		output.add(GarnishedItems.PRICKLY_PEAR.asStack());
		output.add(GarnishedItems.BAMBOO_CLOD.asStack());
		output.add(GarnishedItems.NOPALITO_WRAP.asStack());
		output.add(GarnishedItems.NOPALITO_WRAP_SUPREME.asStack());
		output.add(GarnishedItems.SINOPIA_ROCK_SWEET.asStack());
		output.add(GarnishedItems.THORN_ON_A_STICK.asStack());
		output.add(GarnishedItems.OVERGROWN_BREW.asStack());
		output.add(GarnishedItems.PRICKLY_PEAR_STEW.asStack());
		output.add(GarnishedItems.STEW_OF_THE_DAMNED.asStack());

		output.add(GarnishedItems.RAW_POLAR_BEAR_MEAT.asStack());
		output.add(GarnishedItems.COOKED_POLAR_BEAR_MEAT.asStack());
		output.add(GarnishedItems.VOID_STROGANOFF.asStack());
		output.add(GarnishedItems.EXPLORERS_CONCOCTION.asStack());
		output.add(GarnishedItems.FROSTED_DESSERT.asStack());
		output.add(GarnishedItems.CHILLED_APPLE.asStack());

		output.add(GarnishedItems.MOLTEN_REMNANT.asStack());

		output.add(GarnishedItems.GHAST_TENDRIL.asStack());

		output.add(GarnishedItems.VOLATILE_DUST.asStack());

		output.add(GarnishedItems.SOLEMN_DUST.asStack());

		output.add(GarnishedBlocks.VERMILION_KELP.asStack());
		output.add(GarnishedBlocks.DULSE_KELP.asStack());
		output.add(GarnishedItems.CORAL_WRAPPING.asStack());
		output.add(GarnishedItems.LUSTROUS_PEARL.asStack());

		output.add(GarnishedItems.ANTIQUE_SWATHE.asStack());
		output.add(GarnishedItems.BRISTLED_FLOUR.asStack());
		output.add(GarnishedItems.BRISTLED_TORTILLA.asStack());
		output.add(GarnishedItems.AMBER_REMNANT.asStack());
		output.add(GarnishedItems.SHATTERED_AMBER_REMNANT.asStack());

		output.add(GarnishedItems.FROST.asStack());
		output.add(GarnishedItems.NUMBING_PARCHMENT.asStack());
		output.add(GarnishedItems.POLAR_BEAR_HIDE.asStack());
		output.add(GarnishedItems.POLAR_HIDE_SCRATCH_PAPER.asStack());

		output.add(GarnishedBlocks.SEPIA_FUNGUS.asStack());
		output.add(GarnishedBlocks.SOUL_ROOTS.asStack());
		output.add(GarnishedBlocks.INCANDESCENT_LILY.asStack());
		output.add(GarnishedBlocks.PANSOPHICAL_DAISY.asStack());

		output.add(GarnishedBlocks.BARREN_ROOTS.asStack());
		output.add(GarnishedBlocks.SMALL_CHORUS_PLANT.asStack());
		output.add(GarnishedBlocks.AUREATE_SHRUB.asStack());

		output.add(GarnishedItems.CRUSHED_SALT_COMPOUND.asStack());
		output.add(GarnishedItems.SALT_COMPOUND.asStack());

		output.add(GarnishedItems.APPLE_CIDER.asStack());
		output.add(GarnishedItems.CRYPTIC_APPLE_CIDER.asStack());
		output.add(GarnishedItems.BITTER_APPLE_CIDER.asStack());
		output.add(GarnishedItems.BOTTLED_PEANUT_OIL.asStack());
		output.add(GarnishedItems.FERMENTED_CASHEW_MIXTURE.asStack());
		output.add(GarnishedItems.BOTTLED_ENDER_JELLY.asStack());
		output.add(GarnishedItems.CHORUS_COCKTAIL.asStack());
		output.add(GarnishedItems.ILLUMINATING_COCKTAIL.asStack());
		output.add(GarnishedItems.ROSY_COCKTAIL.asStack());
		output.add(GarnishedItems.SWEET_TEA.asStack());
		output.add(GarnishedItems.BOTTLE_OF_CRESTFALLEN_FLORA.asStack());
		output.add(GarnishedItems.BOTTLED_MALODOROUS_MIXTURE.asStack());

		output.add(GarnishedItems.GARNISH_COMPOUND.asStack());
		output.add(GarnishedItems.GARNISH_POWDER.asStack());

		output.add(GarnishedFluids.GARNISH.getBucket().get().getDefaultInstance());
		output.add(GarnishedFluids.APPLE_CIDER.getBucket().get().getDefaultInstance());
		output.add(GarnishedFluids.PEANUT_OIL.getBucket().get().getDefaultInstance());
		output.add(GarnishedFluids.CASHEW_MIXTURE.getBucket().get().getDefaultInstance());
		output.add(GarnishedFluids.MASTIC_RESIN.getBucket().get().getDefaultInstance());
		output.add(GarnishedFluids.RED_MASTIC_RESIN.getBucket().get().getDefaultInstance());
		output.add(GarnishedFluids.ORANGE_MASTIC_RESIN.getBucket().get().getDefaultInstance());
		output.add(GarnishedFluids.YELLOW_MASTIC_RESIN.getBucket().get().getDefaultInstance());
		output.add(GarnishedFluids.GREEN_MASTIC_RESIN.getBucket().get().getDefaultInstance());
		output.add(GarnishedFluids.BLUE_MASTIC_RESIN.getBucket().get().getDefaultInstance());
		output.add(GarnishedFluids.PURPLE_MASTIC_RESIN.getBucket().get().getDefaultInstance());

		output.add(GarnishedItems.WOODEN_HATCHET.asStack());
		output.add(GarnishedItems.STONE_HATCHET.asStack());
		output.add(GarnishedItems.IRON_HATCHET.asStack());
		output.add(GarnishedItems.GOLDEN_HATCHET.asStack());
		output.add(GarnishedItems.DIAMOND_HATCHET.asStack());
		output.add(GarnishedItems.NETHERITE_HATCHET.asStack());
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
		public void fillItemList(NonNullList<ItemStack> output) {
			output.add(GarnishedBlocks.SOLIDIFIED_GARNISH_BLOCK.asStack());

			output.add(GarnishedBlocks.BLOCK_OF_ENDER_JELLY.asStack());
			output.add(GarnishedBlocks.UNGARNISHED_NUT_BLOCK.asStack());
			output.add(GarnishedBlocks.GARNISHED_NUT_BLOCK.asStack());
			output.add(GarnishedBlocks.GARNISH_COMPOUND_BLOCK.asStack());
			output.add(GarnishedBlocks.SALT_COMPOUND_BLOCK.asStack());
			output.add(GarnishedBlocks.ETHEREAL_COMPOUND_BLOCK.asStack());
			output.add(GarnishedBlocks.MULCH_BLOCK.asStack());

			output.add(GarnishedBlocks.SENILE_BONE_BLOCK.asStack());

			output.add(GarnishedBlocks.SEPIA_WART_BLOCK.asStack());
			output.add(GarnishedBlocks.SEPIA_STEM.asStack());
			output.add(GarnishedBlocks.STRIPPED_SEPIA_STEM.asStack());
			output.add(GarnishedBlocks.SEPIA_HYPHAE.asStack());
			output.add(GarnishedBlocks.STRIPPED_SEPIA_HYPHAE.asStack());
			output.add(GarnishedBlocks.SEPIA_PLANKS.asStack());
			output.add(GarnishedBlocks.SEPIA_SLAB.asStack());
			output.add(GarnishedBlocks.SEPIA_STAIRS.asStack());
			output.add(GarnishedBlocks.SEPIA_TRAPDOOR.asStack());
			output.add(GarnishedBlocks.SEPIA_DOOR.asStack());
			output.add(GarnishedItems.SEPIA_SIGN.asStack());
			// output.add(GarnishedItems.SEPIA_HANGING_SIGN.asStack());

			output.add(GarnishedBlocks.NUT_LOG.asStack());
			output.add(GarnishedBlocks.STRIPPED_NUT_LOG.asStack());
			output.add(GarnishedBlocks.NUT_WOOD.asStack());
			output.add(GarnishedBlocks.STRIPPED_NUT_WOOD.asStack());
			output.add(GarnishedBlocks.NUT_PLANKS.asStack());
			output.add(GarnishedBlocks.NUT_SLAB.asStack());
			output.add(GarnishedBlocks.NUT_STAIRS.asStack());
			output.add(GarnishedBlocks.NUT_TRAPDOOR.asStack());
			output.add(GarnishedBlocks.NUT_DOOR.asStack());
			output.add(GarnishedItems.NUT_SIGN.asStack());
			// output.add(GarnishedItems.NUT_HANGING_SIGN.asStack());
			output.add(GarnishedItems.NUT_BOAT.asStack());
			output.add(GarnishedItems.NUT_CHEST_BOAT.asStack());

			output.add(GarnishedBlocks.MASTIC_BLOCK.asStack());
			output.add(GarnishedBlocks.RED_MASTIC_BLOCK.asStack());
			output.add(GarnishedBlocks.ORANGE_MASTIC_BLOCK.asStack());
			output.add(GarnishedBlocks.YELLOW_MASTIC_BLOCK.asStack());
			output.add(GarnishedBlocks.GREEN_MASTIC_BLOCK.asStack());
			output.add(GarnishedBlocks.BLUE_MASTIC_BLOCK.asStack());
			output.add(GarnishedBlocks.PURPLE_MASTIC_BLOCK.asStack());

			output.add(GarnishedBlocks.ABYSSAL_STONE.asStack());
			output.add(GarnishedBlocks.ABYSSAL_STONE_SLAB.asStack());
			output.add(GarnishedBlocks.ABYSSAL_STONE_STAIRS.asStack());
			output.add(GarnishedBlocks.ABYSSAL_STONE_WALL.asStack());
			output.add(GarnishedBlocks.ABYSSAL_STONE_BRICKS.asStack());
			output.add(GarnishedBlocks.ABYSSAL_STONE_BRICKS_SLAB.asStack());
			output.add(GarnishedBlocks.ABYSSAL_STONE_BRICKS_STAIRS.asStack());
			output.add(GarnishedBlocks.ABYSSAL_STONE_BRICKS_WALL.asStack());
			output.add(GarnishedBlocks.POLISHED_ABYSSAL_STONE.asStack());
			output.add(GarnishedBlocks.POLISHED_ABYSSAL_STONE_SLAB.asStack());
			output.add(GarnishedBlocks.POLISHED_ABYSSAL_STONE_STAIRS.asStack());
			output.add(GarnishedBlocks.POLISHED_ABYSSAL_STONE_WALL.asStack());
			output.add(GarnishedBlocks.SMOOTH_ABYSSAL_STONE.asStack());
			output.add(GarnishedBlocks.SMOOTH_ABYSSAL_STONE_SLAB.asStack());
			output.add(GarnishedBlocks.SMOOTH_ABYSSAL_STONE_STAIRS.asStack());
			output.add(GarnishedBlocks.SMOOTH_ABYSSAL_STONE_WALL.asStack());
			output.add(GarnishedBlocks.CHISELED_ABYSSAL_STONE_BRICKS.asStack());

			output.add(GarnishedBlocks.CARNOTITE.asStack());
			output.add(GarnishedBlocks.CARNOTITE_SLAB.asStack());
			output.add(GarnishedBlocks.CARNOTITE_STAIRS.asStack());
			output.add(GarnishedBlocks.CARNOTITE_WALL.asStack());
			output.add(GarnishedBlocks.CARNOTITE_BRICKS.asStack());
			output.add(GarnishedBlocks.CARNOTITE_BRICKS_SLAB.asStack());
			output.add(GarnishedBlocks.CARNOTITE_BRICKS_STAIRS.asStack());
			output.add(GarnishedBlocks.CARNOTITE_BRICKS_WALL.asStack());
			output.add(GarnishedBlocks.POLISHED_CARNOTITE.asStack());
			output.add(GarnishedBlocks.POLISHED_CARNOTITE_SLAB.asStack());
			output.add(GarnishedBlocks.POLISHED_CARNOTITE_STAIRS.asStack());
			output.add(GarnishedBlocks.POLISHED_CARNOTITE_WALL.asStack());
			output.add(GarnishedBlocks.SMOOTH_CARNOTITE.asStack());
			output.add(GarnishedBlocks.SMOOTH_CARNOTITE_SLAB.asStack());
			output.add(GarnishedBlocks.SMOOTH_CARNOTITE_STAIRS.asStack());
			output.add(GarnishedBlocks.SMOOTH_CARNOTITE_WALL.asStack());
			output.add(GarnishedBlocks.CHISELED_CARNOTITE_BRICKS.asStack());

			output.add(GarnishedBlocks.UNSTABLE_STONE.asStack());
			output.add(GarnishedBlocks.UNSTABLE_STONE_SLAB.asStack());
			output.add(GarnishedBlocks.UNSTABLE_STONE_STAIRS.asStack());
			output.add(GarnishedBlocks.UNSTABLE_STONE_WALL.asStack());
			output.add(GarnishedBlocks.UNSTABLE_STONE_BRICKS.asStack());
			output.add(GarnishedBlocks.UNSTABLE_STONE_BRICKS_SLAB.asStack());
			output.add(GarnishedBlocks.UNSTABLE_STONE_BRICKS_STAIRS.asStack());
			output.add(GarnishedBlocks.UNSTABLE_STONE_BRICKS_WALL.asStack());
			output.add(GarnishedBlocks.POLISHED_UNSTABLE_STONE.asStack());
			output.add(GarnishedBlocks.POLISHED_UNSTABLE_STONE_SLAB.asStack());
			output.add(GarnishedBlocks.POLISHED_UNSTABLE_STONE_STAIRS.asStack());
			output.add(GarnishedBlocks.POLISHED_UNSTABLE_STONE_WALL.asStack());
			output.add(GarnishedBlocks.SMOOTH_UNSTABLE_STONE.asStack());
			output.add(GarnishedBlocks.SMOOTH_UNSTABLE_STONE_SLAB.asStack());
			output.add(GarnishedBlocks.SMOOTH_UNSTABLE_STONE_STAIRS.asStack());
			output.add(GarnishedBlocks.SMOOTH_UNSTABLE_STONE_WALL.asStack());
			output.add(GarnishedBlocks.CHISELED_UNSTABLE_STONE_BRICKS.asStack());

			output.add(GarnishedBlocks.RITUALISTIC_STONE.asStack());
			output.add(GarnishedBlocks.RITUALISTIC_STONE_SLAB.asStack());
			output.add(GarnishedBlocks.RITUALISTIC_STONE_STAIRS.asStack());
			output.add(GarnishedBlocks.RITUALISTIC_STONE_WALL.asStack());
			output.add(GarnishedBlocks.RITUALISTIC_STONE_BRICKS.asStack());
			output.add(GarnishedBlocks.RITUALISTIC_STONE_BRICKS_SLAB.asStack());
			output.add(GarnishedBlocks.RITUALISTIC_STONE_BRICKS_STAIRS.asStack());
			output.add(GarnishedBlocks.RITUALISTIC_STONE_BRICKS_WALL.asStack());
			output.add(GarnishedBlocks.POLISHED_RITUALISTIC_STONE.asStack());
			output.add(GarnishedBlocks.POLISHED_RITUALISTIC_STONE_SLAB.asStack());
			output.add(GarnishedBlocks.POLISHED_RITUALISTIC_STONE_STAIRS.asStack());
			output.add(GarnishedBlocks.POLISHED_RITUALISTIC_STONE_WALL.asStack());
			output.add(GarnishedBlocks.SMOOTH_RITUALISTIC_STONE.asStack());
			output.add(GarnishedBlocks.SMOOTH_RITUALISTIC_STONE_SLAB.asStack());
			output.add(GarnishedBlocks.SMOOTH_RITUALISTIC_STONE_STAIRS.asStack());
			output.add(GarnishedBlocks.SMOOTH_RITUALISTIC_STONE_WALL.asStack());
			output.add(GarnishedBlocks.CHISELED_RITUALISTIC_STONE_BRICKS.asStack());

			output.add(GarnishedBlocks.DRAGON_STONE.asStack());
			output.add(GarnishedBlocks.DRAGON_STONE_SLAB.asStack());
			output.add(GarnishedBlocks.DRAGON_STONE_STAIRS.asStack());
			output.add(GarnishedBlocks.DRAGON_STONE_WALL.asStack());
			output.add(GarnishedBlocks.DRAGON_STONE_BRICKS.asStack());
			output.add(GarnishedBlocks.DRAGON_STONE_BRICKS_SLAB.asStack());
			output.add(GarnishedBlocks.DRAGON_STONE_BRICKS_STAIRS.asStack());
			output.add(GarnishedBlocks.DRAGON_STONE_BRICKS_WALL.asStack());
			output.add(GarnishedBlocks.POLISHED_DRAGON_STONE.asStack());
			output.add(GarnishedBlocks.POLISHED_DRAGON_STONE_SLAB.asStack());
			output.add(GarnishedBlocks.POLISHED_DRAGON_STONE_STAIRS.asStack());
			output.add(GarnishedBlocks.POLISHED_DRAGON_STONE_WALL.asStack());
			output.add(GarnishedBlocks.SMOOTH_DRAGON_STONE.asStack());
			output.add(GarnishedBlocks.SMOOTH_DRAGON_STONE_SLAB.asStack());
			output.add(GarnishedBlocks.SMOOTH_DRAGON_STONE_STAIRS.asStack());
			output.add(GarnishedBlocks.SMOOTH_DRAGON_STONE_WALL.asStack());
			output.add(GarnishedBlocks.CHISELED_DRAGON_STONE_BRICKS.asStack());

			output.add(GarnishedBlocks.DRIED_VERMILION_KELP_BLOCK.asStack());
			output.add(GarnishedBlocks.DRIED_DULSE_KELP_BLOCK.asStack());
			output.add(GarnishedBlocks.VOLTAIC_SEA_GRASS.asStack());

			output.add(GarnishedBlocks.ANNIVERSARY_CAKE.asStack());
		}

		@Override
		public @NotNull ItemStack makeIcon() {
			return GarnishedBlocks.GARNISHED_NUT_BLOCK.asStack();
		}
	}
}
