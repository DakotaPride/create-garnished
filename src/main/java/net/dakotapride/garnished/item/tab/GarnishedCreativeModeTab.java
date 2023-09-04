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
		items.add(0, GarnishedItems.CRACKED_CASHEW.asStack());
		items.add(1, GarnishedItems.UNGARNISHED_CASHEW.asStack());
		items.add(2, GarnishedItems.CASHEW.asStack());
		items.add(3, GarnishedItems.CINDER_FLOUR_CASHEW.asStack());
		items.add(4, GarnishedItems.MELTED_CINDER_FLOUR_CASHEW.asStack());
		items.add(5, GarnishedItems.SPEED_CINDER_CASHEW.asStack());
		items.add(6, GarnishedItems.SWEETENED_CASHEW.asStack());
		items.add(7, GarnishedItems.CHOCOLATE_GLAZED_CASHEW.asStack());
		items.add(8, GarnishedItems.HONEYED_CASHEW.asStack());

		items.add(9, GarnishedItems.CRACKED_WALNUT.asStack());
		items.add(10, GarnishedItems.UNGARNISHED_WALNUT.asStack());
		items.add(11, GarnishedItems.WALNUT.asStack());
		items.add(12, GarnishedItems.CINDER_FLOUR_WALNUT.asStack());
		items.add(13, GarnishedItems.MELTED_CINDER_FLOUR_WALNUT.asStack());
		items.add(14, GarnishedItems.STRENGTH_CINDER_WALNUT.asStack());
		items.add(15, GarnishedItems.SWEETENED_WALNUT.asStack());
		items.add(16, GarnishedItems.CHOCOLATE_GLAZED_WALNUT.asStack());
		items.add(17, GarnishedItems.HONEYED_WALNUT.asStack());

		items.add(18, GarnishedItems.CRACKED_ALMOND.asStack());
		items.add(19, GarnishedItems.UNGARNISHED_ALMOND.asStack());
		items.add(20, GarnishedItems.ALMOND.asStack());
		items.add(21, GarnishedItems.CINDER_FLOUR_ALMOND.asStack());
		items.add(22, GarnishedItems.MELTED_CINDER_FLOUR_ALMOND.asStack());
		items.add(23, GarnishedItems.HASTE_CINDER_ALMOND.asStack());
		items.add(24, GarnishedItems.SWEETENED_ALMOND.asStack());
		items.add(25, GarnishedItems.CHOCOLATE_GLAZED_ALMOND.asStack());
		items.add(26, GarnishedItems.HONEYED_ALMOND.asStack());

		items.add(27, GarnishedItems.CRACKED_PECAN.asStack());
		items.add(28, GarnishedItems.UNGARNISHED_PECAN.asStack());
		items.add(29, GarnishedItems.PECAN.asStack());
		items.add(30, GarnishedItems.CINDER_FLOUR_PECAN.asStack());
		items.add(31, GarnishedItems.MELTED_CINDER_FLOUR_PECAN.asStack());
		items.add(32, GarnishedItems.RESISTANCE_CINDER_PECAN.asStack());
		items.add(33, GarnishedItems.SWEETENED_PECAN.asStack());
		items.add(34, GarnishedItems.CHOCOLATE_GLAZED_PECAN.asStack());
		items.add(35, GarnishedItems.HONEYED_PECAN.asStack());

		items.add(36, GarnishedItems.CRACKED_PISTACHIO.asStack());
		items.add(37, GarnishedItems.UNGARNISHED_PISTACHIO.asStack());
		items.add(38, GarnishedItems.PISTACHIO.asStack());
		items.add(39, GarnishedItems.CINDER_FLOUR_PISTACHIO.asStack());
		items.add(40, GarnishedItems.MELTED_CINDER_FLOUR_PISTACHIO.asStack());
		items.add(41, GarnishedItems.NIGHT_VISION_CINDER_PISTACHIO.asStack());
		items.add(42, GarnishedItems.SWEETENED_PISTACHIO.asStack());
		items.add(43, GarnishedItems.CHOCOLATE_GLAZED_PISTACHIO.asStack());
		items.add(44, GarnishedItems.HONEYED_PISTACHIO.asStack());

		items.add(45, GarnishedItems.CRACKED_MACADAMIA.asStack());
		items.add(46, GarnishedItems.UNGARNISHED_MACADAMIA.asStack());
		items.add(47, GarnishedItems.MACADAMIA.asStack());
		items.add(48, GarnishedItems.CINDER_FLOUR_MACADAMIA.asStack());
		items.add(49, GarnishedItems.MELTED_CINDER_FLOUR_MACADAMIA.asStack());
		items.add(50, GarnishedItems.FIRE_RESISTANCE_CINDER_MACADAMIA.asStack());
		items.add(51, GarnishedItems.SWEETENED_MACADAMIA.asStack());
		items.add(52, GarnishedItems.CHOCOLATE_GLAZED_MACADAMIA.asStack());
		items.add(53, GarnishedItems.HONEYED_MACADAMIA.asStack());

		items.add(54, GarnishedItems.CRACKED_BUHG.asStack());
		items.add(55, GarnishedItems.UNGARNISHED_BUHG.asStack());
		items.add(56, GarnishedItems.BUHG.asStack());
		items.add(57, GarnishedItems.CINDER_FLOUR_BUHG.asStack());
		items.add(58, GarnishedItems.MELTED_CINDER_FLOUR_BUHG.asStack());
		items.add(59, GarnishedItems.EFFECT_CINDER_BUHG.asStack());
		items.add(60, GarnishedItems.SWEETENED_BUHG.asStack());
		items.add(61, GarnishedItems.CHOCOLATE_GLAZED_BUHG.asStack());
		items.add(62, GarnishedItems.HONEYED_BUHG.asStack());

		items.add(63, GarnishedItems.CRACKED_HAZELNUT.asStack());
		items.add(64, GarnishedItems.UNGARNISHED_HAZELNUT.asStack());
		items.add(65, GarnishedItems.HAZELNUT.asStack());
		items.add(66, GarnishedItems.CINDER_FLOUR_HAZELNUT.asStack());
		items.add(67, GarnishedItems.MELTED_CINDER_FLOUR_HAZELNUT.asStack());
		items.add(68, GarnishedItems.POTENT_SPEED_CINDER_HAZELNUT.asStack());
		items.add(69, GarnishedItems.SWEETENED_HAZELNUT.asStack());
		items.add(70, GarnishedItems.CHOCOLATE_GLAZED_HAZELNUT.asStack());
		items.add(71, GarnishedItems.HONEYED_HAZELNUT.asStack());

		items.add(72, GarnishedItems.NUT_MIX.asStack());
		items.add(73, GarnishedItems.SWEETENED_NUT_MIX.asStack());
		items.add(74, GarnishedItems.CHOCHOLATE_GLAZED_NUT_MIX.asStack());
		items.add(75, GarnishedItems.HONEYED_NUT_MIX.asStack());

		items.add(76, GarnishedItems.GARNISHED_MEAL.asStack());

		items.add(77, GarnishedItems.GARNISHED_SWEET_BERRIES.asStack());
		items.add(78, GarnishedItems.HONEYED_SWEET_BERRIES.asStack());

		items.add(79, GarnishedItems.SALAD.asStack());
		items.add(80, GarnishedItems.PHANTOM_STEAK.asStack());

		items.add(81, GarnishedItems.CRUSHED_SALT_COMPOUND.asStack());
		items.add(82, GarnishedItems.SALT_COMPOUND.asStack());

		items.add(83, GarnishedItems.APPLE_CIDER.asStack());
		items.add(84, GarnishedItems.CRYPTIC_APPLE_CIDER.asStack());

		items.add(85, GarnishedItems.GARNISH_COMPOUND.asStack());
		items.add(86, GarnishedBlocks.SOLIDIFIED_GARNISH_BLOCK.asStack());

		items.add(87, GarnishedFluids.GARNISH.getBucket().get().getDefaultInstance());
		items.add(88, GarnishedFluids.APPLE_CIDER.getBucket().get().getDefaultInstance());
	}

	@Override
	public @NotNull ItemStack makeIcon() {
		return GarnishedItems.NUT_MIX.asStack();
	}
}
