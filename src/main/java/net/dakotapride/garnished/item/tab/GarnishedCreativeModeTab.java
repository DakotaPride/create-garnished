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

		items.add(GarnishedBlocks.SEPIA_FUNGUS.asStack());
		items.add(GarnishedBlocks.SOUL_ROOTS.asStack());

		items.add(GarnishedItems.CRUSHED_SALT_COMPOUND.asStack());
		items.add(GarnishedItems.SALT_COMPOUND.asStack());

		items.add(GarnishedItems.APPLE_CIDER.asStack());
		items.add(GarnishedItems.CRYPTIC_APPLE_CIDER.asStack());
		items.add(GarnishedItems.BITTER_APPLE_CIDER.asStack());
		items.add(GarnishedItems.BOTTLED_PEANUT_OIL.asStack());
		items.add(GarnishedItems.FERMENTED_CASHEW_MIXTURE.asStack());

		items.add(GarnishedItems.GARNISH_COMPOUND.asStack());
		items.add(GarnishedItems.GARNISH_POWDER.asStack());
		items.add(GarnishedBlocks.SOLIDIFIED_GARNISH_BLOCK.asStack());

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

		items.add(GarnishedFluids.GARNISH.getBucket().get().getDefaultInstance());
		items.add(GarnishedFluids.APPLE_CIDER.getBucket().get().getDefaultInstance());
		items.add(GarnishedFluids.PEANUT_OIL.getBucket().get().getDefaultInstance());
		items.add(GarnishedFluids.CASHEW_MIXTURE.getBucket().get().getDefaultInstance());
	}

	@Override
	public @NotNull ItemStack makeIcon() {
		return GarnishedItems.NUT_MIX.asStack();
	}
}
