package net.dakotapride.garnished.registry;

import java.util.function.Supplier;

import org.jetbrains.annotations.NotNull;

import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.Create;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

@SuppressWarnings({"unused"})
public class GarnishedTabs {

	public static final AllCreativeModeTabs.TabInfo GARNISHED = register("create.garnished",
			() -> FabricItemGroup.builder().title(Component.translatable("itemGroup.create.garnished"))
					.icon(() -> GarnishedItems.NUT_MIX.get().getDefaultInstance())
					.displayItems(new GarnishedDisplayItemsGenerator()).build());

	public static void setRegister() {}

	private static AllCreativeModeTabs.TabInfo register(String name, Supplier<CreativeModeTab> supplier) {
		ResourceLocation id = Create.asResource(name);
		ResourceKey<CreativeModeTab> key = ResourceKey.create(Registries.CREATIVE_MODE_TAB, id);
		CreativeModeTab tab = supplier.get();
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, key, tab);
		return new AllCreativeModeTabs.TabInfo(key, tab);
	}

	public static class GarnishedDisplayItemsGenerator implements CreativeModeTab.DisplayItemsGenerator {

		@Override
		public void accept(CreativeModeTab.@NotNull ItemDisplayParameters parameters, CreativeModeTab.@NotNull Output output) {
			output.accept(GarnishedItems.CRACKED_CASHEW.asStack());
			output.accept(GarnishedItems.UNGARNISHED_CASHEW.asStack());
			output.accept(GarnishedItems.CASHEW.asStack());
			output.accept(GarnishedItems.CINDER_FLOUR_CASHEW.asStack());
			output.accept(GarnishedItems.MELTED_CINDER_FLOUR_CASHEW.asStack());
			output.accept(GarnishedItems.SPEED_CINDER_CASHEW.asStack());
			output.accept(GarnishedItems.SWEETENED_CASHEW.asStack());
			output.accept(GarnishedItems.CHOCOLATE_GLAZED_CASHEW.asStack());
			output.accept(GarnishedItems.HONEYED_CASHEW.asStack());

			output.accept(GarnishedItems.CRACKED_WALNUT.asStack());
			output.accept(GarnishedItems.UNGARNISHED_WALNUT.asStack());
			output.accept(GarnishedItems.WALNUT.asStack());
			output.accept(GarnishedItems.CINDER_FLOUR_WALNUT.asStack());
			output.accept(GarnishedItems.MELTED_CINDER_FLOUR_WALNUT.asStack());
			output.accept(GarnishedItems.STRENGTH_CINDER_WALNUT.asStack());
			output.accept(GarnishedItems.SWEETENED_WALNUT.asStack());
			output.accept(GarnishedItems.CHOCOLATE_GLAZED_WALNUT.asStack());
			output.accept(GarnishedItems.HONEYED_WALNUT.asStack());

			output.accept(GarnishedItems.CRACKED_ALMOND.asStack());
			output.accept(GarnishedItems.UNGARNISHED_ALMOND.asStack());
			output.accept(GarnishedItems.ALMOND.asStack());
			output.accept(GarnishedItems.CINDER_FLOUR_ALMOND.asStack());
			output.accept(GarnishedItems.MELTED_CINDER_FLOUR_ALMOND.asStack());
			output.accept(GarnishedItems.HASTE_CINDER_ALMOND.asStack());
			output.accept(GarnishedItems.SWEETENED_ALMOND.asStack());
			output.accept(GarnishedItems.CHOCOLATE_GLAZED_ALMOND.asStack());
			output.accept(GarnishedItems.HONEYED_ALMOND.asStack());

			output.accept(GarnishedItems.CRACKED_PECAN.asStack());
			output.accept(GarnishedItems.UNGARNISHED_PECAN.asStack());
			output.accept(GarnishedItems.PECAN.asStack());
			output.accept(GarnishedItems.CINDER_FLOUR_PECAN.asStack());
			output.accept(GarnishedItems.MELTED_CINDER_FLOUR_PECAN.asStack());
			output.accept(GarnishedItems.RESISTANCE_CINDER_PECAN.asStack());
			output.accept(GarnishedItems.SWEETENED_PECAN.asStack());
			output.accept(GarnishedItems.CHOCOLATE_GLAZED_PECAN.asStack());
			output.accept(GarnishedItems.HONEYED_PECAN.asStack());

			output.accept(GarnishedItems.CRACKED_PISTACHIO.asStack());
			output.accept(GarnishedItems.UNGARNISHED_PISTACHIO.asStack());
			output.accept(GarnishedItems.PISTACHIO.asStack());
			output.accept(GarnishedItems.CINDER_FLOUR_PISTACHIO.asStack());
			output.accept(GarnishedItems.MELTED_CINDER_FLOUR_PISTACHIO.asStack());
			output.accept(GarnishedItems.NIGHT_VISION_CINDER_PISTACHIO.asStack());
			output.accept(GarnishedItems.SWEETENED_PISTACHIO.asStack());
			output.accept(GarnishedItems.CHOCOLATE_GLAZED_PISTACHIO.asStack());
			output.accept(GarnishedItems.HONEYED_PISTACHIO.asStack());

			output.accept(GarnishedItems.CRACKED_MACADAMIA.asStack());
			output.accept(GarnishedItems.UNGARNISHED_MACADAMIA.asStack());
			output.accept(GarnishedItems.MACADAMIA.asStack());
			output.accept(GarnishedItems.CINDER_FLOUR_MACADAMIA.asStack());
			output.accept(GarnishedItems.MELTED_CINDER_FLOUR_MACADAMIA.asStack());
			output.accept(GarnishedItems.FIRE_RESISTANCE_CINDER_MACADAMIA.asStack());
			output.accept(GarnishedItems.SWEETENED_MACADAMIA.asStack());
			output.accept(GarnishedItems.CHOCOLATE_GLAZED_MACADAMIA.asStack());
			output.accept(GarnishedItems.HONEYED_MACADAMIA.asStack());

			output.accept(GarnishedItems.CRACKED_BUHG.asStack());
			output.accept(GarnishedItems.UNGARNISHED_BUHG.asStack());
			output.accept(GarnishedItems.BUHG.asStack());
			output.accept(GarnishedItems.CINDER_FLOUR_BUHG.asStack());
			output.accept(GarnishedItems.MELTED_CINDER_FLOUR_BUHG.asStack());
			output.accept(GarnishedItems.EFFECT_CINDER_BUHG.asStack());
			output.accept(GarnishedItems.SWEETENED_BUHG.asStack());
			output.accept(GarnishedItems.CHOCOLATE_GLAZED_BUHG.asStack());
			output.accept(GarnishedItems.HONEYED_BUHG.asStack());

			output.accept(GarnishedItems.CRACKED_HAZELNUT.asStack());
			output.accept(GarnishedItems.UNGARNISHED_HAZELNUT.asStack());
			output.accept(GarnishedItems.HAZELNUT.asStack());
			output.accept(GarnishedItems.CINDER_FLOUR_HAZELNUT.asStack());
			output.accept(GarnishedItems.MELTED_CINDER_FLOUR_HAZELNUT.asStack());
			output.accept(GarnishedItems.POTENT_SPEED_CINDER_HAZELNUT.asStack());
			output.accept(GarnishedItems.SWEETENED_HAZELNUT.asStack());
			output.accept(GarnishedItems.CHOCOLATE_GLAZED_HAZELNUT.asStack());
			output.accept(GarnishedItems.HONEYED_HAZELNUT.asStack());

			output.accept(GarnishedItems.CRACKED_CHESTNUT.asStack());
			output.accept(GarnishedItems.UNGARNISHED_CHESTNUT.asStack());
			output.accept(GarnishedItems.CHESTNUT.asStack());
			output.accept(GarnishedItems.CINDER_FLOUR_CHESTNUT.asStack());
			output.accept(GarnishedItems.MELTED_CINDER_FLOUR_CHESTNUT.asStack());
			output.accept(GarnishedItems.SLOW_FALLING_CINDER_CHESTNUT.asStack());
			output.accept(GarnishedItems.SWEETENED_CHESTNUT.asStack());
			output.accept(GarnishedItems.CHOCOLATE_GLAZED_CHESTNUT.asStack());
			output.accept(GarnishedItems.HONEYED_CHESTNUT.asStack());

			output.accept(GarnishedItems.NUT_MIX.asStack());
			output.accept(GarnishedItems.SWEETENED_NUT_MIX.asStack());
			output.accept(GarnishedItems.CHOCHOLATE_GLAZED_NUT_MIX.asStack());
			output.accept(GarnishedItems.HONEYED_NUT_MIX.asStack());

			output.accept(GarnishedItems.GARNISHED_MEAL.asStack());

			output.accept(GarnishedItems.GARNISHED_SWEET_BERRIES.asStack());
			output.accept(GarnishedItems.HONEYED_SWEET_BERRIES.asStack());

			output.accept(GarnishedItems.SALAD.asStack());
			output.accept(GarnishedItems.PHANTOM_STEAK.asStack());
			output.accept(GarnishedItems.BITTER_ALMOND.asStack());
			output.accept(GarnishedItems.CASHEW_APPLE.asStack());
			output.accept(GarnishedItems.WALNUT_BROWNIE.asStack());
			output.accept(GarnishedItems.PECAN_PIE.asStack());
			output.accept(GarnishedItems.CASHEW_COOKIE.asStack());

			output.accept(GarnishedItems.PEANUT_OIL_AND_CINDER_SANDWICH.asStack());
			output.accept(GarnishedItems.TOPHET_BREW.asStack());
			output.accept(GarnishedItems.GRIM_STEW.asStack());
			output.accept(GarnishedItems.SOUL_KHANA.asStack());
			output.accept(GarnishedItems.SPIRITED_CONCOCTION.asStack());
			output.accept(GarnishedItems.PUTRID_STEW.asStack());
			output.accept(GarnishedItems.NUT_NACHO_BOWL.asStack());
			output.accept(GarnishedItems.CINDER_ROLL.asStack());
			output.accept(GarnishedItems.WRAPPED_CRIMSON_TANGLE.asStack());
			output.accept(GarnishedItems.WRAPPED_WARPED_TANGLE.asStack());
			output.accept(GarnishedItems.WRAPPED_SEPIA_TANGLE.asStack());
			output.accept(GarnishedItems.WEEPING_TANGLE.asStack());
			output.accept(GarnishedItems.BLAZING_DELIGHT.asStack());
			output.accept(GarnishedItems.CRUSHED_CRIMSON_FUNGUS.asStack());
			output.accept(GarnishedItems.CRUSHED_WARPED_FUNGUS.asStack());
			output.accept(GarnishedItems.CRUSHED_SEPIA_FUNGUS.asStack());
			output.accept(GarnishedItems.CRUSHED_SHROOMLIGHT.asStack());
			output.accept(GarnishedItems.CRUSHED_ENDER_PEARL.asStack());
			output.accept(GarnishedItems.NUT_FLOUR.asStack());
			output.accept(GarnishedItems.NUT_NACHO.asStack());
			output.accept(GarnishedItems.BRITTLE_DUST.asStack());
			output.accept(GarnishedItems.SENILE_DUST.asStack());
			output.accept(GarnishedItems.CRIMSON_TUSK.asStack());
			output.accept(GarnishedItems.SILICA_HARDENED_WRAP.asStack());
			output.accept(GarnishedItems.ENFLAMED_MANDIBLE.asStack());
			output.accept(GarnishedItems.SENILE_SWEET_BLACKSTONE.asStack());
			output.accept(GarnishedItems.SENILE_SWEET_BASALT.asStack());
			output.accept(GarnishedItems.SENILE_SWEET_SCORIA.asStack());
			output.accept(GarnishedItems.SENILE_SWEET_SCORCHIA.asStack());

			output.accept(GarnishedItems.VOID_MIXTURE.asStack());
			output.accept(GarnishedItems.ETHEREAL_CONCOCTION.asStack());
			output.accept(GarnishedItems.DESOLATE_STEW.asStack());
			output.accept(GarnishedItems.COSMIC_BREW.asStack());
			output.accept(GarnishedItems.CHORUS_BOWL.asStack());
			output.accept(GarnishedItems.CHORUS_COOKIE.asStack());
			output.accept(GarnishedItems.ENDER_JELLY_BLOB.asStack());
			output.accept(GarnishedItems.VOID_DUST.asStack());
			output.accept(GarnishedItems.CHORUS_TUFT.asStack());
			output.accept(GarnishedItems.HOLLOWED_CHORUS_FRUIT.asStack());
			output.accept(GarnishedItems.ETHEREAL_COMPOUND.asStack());
			output.accept(GarnishedItems.COSMIC_POWDER.asStack());
			output.accept(GarnishedItems.DESOLATE_SPREAD.asStack());

			output.accept(GarnishedItems.MUD_PIE.asStack());
			output.accept(GarnishedItems.MULCH.asStack());

			output.accept(GarnishedItems.VENERABLE_DOUGH);
			output.accept(GarnishedItems.VENERABLE_DELICACY_RED);
			output.accept(GarnishedItems.VENERABLE_DELICACY_ORANGE);
			output.accept(GarnishedItems.VENERABLE_DELICACY_YELLOW);
			output.accept(GarnishedItems.VENERABLE_DELICACY_GREEN);
			output.accept(GarnishedItems.VENERABLE_DELICACY_BLUE);
			output.accept(GarnishedItems.VENERABLE_DELICACY_PURPLE);
			output.accept(GarnishedItems.SLIME_DROP);
			output.accept(GarnishedItems.MASTIC_COVERED_SLIME_DROP_RED);
			output.accept(GarnishedItems.MASTIC_COVERED_SLIME_DROP_ORANGE);
			output.accept(GarnishedItems.MASTIC_COVERED_SLIME_DROP_YELLOW);
			output.accept(GarnishedItems.MASTIC_COVERED_SLIME_DROP_GREEN);
			output.accept(GarnishedItems.MASTIC_COVERED_SLIME_DROP_BLUE);
			output.accept(GarnishedItems.MASTIC_COVERED_SLIME_DROP_PURPLE);
			output.accept(GarnishedItems.MASTIC_RESIN);
			output.accept(GarnishedItems.MASTIC_RESIN_RED);
			output.accept(GarnishedItems.MASTIC_RESIN_ORANGE);
			output.accept(GarnishedItems.MASTIC_RESIN_YELLOW);
			output.accept(GarnishedItems.MASTIC_RESIN_GREEN);
			output.accept(GarnishedItems.MASTIC_RESIN_BLUE);
			output.accept(GarnishedItems.MASTIC_RESIN_PURPLE);
			output.accept(GarnishedItems.MASTIC_PASTE);
			output.accept(GarnishedItems.MASTIC_PASTE_RED);
			output.accept(GarnishedItems.MASTIC_PASTE_ORANGE);
			output.accept(GarnishedItems.MASTIC_PASTE_YELLOW);
			output.accept(GarnishedItems.MASTIC_PASTE_GREEN);
			output.accept(GarnishedItems.MASTIC_PASTE_BLUE);
			output.accept(GarnishedItems.MASTIC_PASTE_PURPLE);

			output.accept(GarnishedItems.BAKLAVA);
			output.accept(GarnishedItems.MERRY_TREAT);
			output.accept(GarnishedItems.COAL_TRUFFLE);
			output.accept(GarnishedItems.GALACTIC_CANE);
			output.accept(GarnishedItems.ICY_MASTIC_CHUNK);
			output.accept(GarnishedItems.STURDY_WAFFLE);

			output.accept(GarnishedItems.RAW_TENEBROUS_MEAT);
			output.accept(GarnishedItems.COOKED_TENEBROUS_MEAT);
			output.accept(GarnishedItems.CASHEW_SORBET_SCOOP);
			output.accept(GarnishedItems.CASHEW_SORBET_DELIGHT);
			output.accept(GarnishedItems.ACHING_TENEBROUS_CLUMP);
			output.accept(GarnishedItems.GLOOMY_GATHERING);
			output.accept(GarnishedItems.FISHY_SURPRISE);
			output.accept(GarnishedItems.WALNUT_GORGE_CREAM);
			output.accept(GarnishedItems.GHANDERCKEN);
			output.accept(GarnishedItems.WHEAT_GRAZE);
			output.accept(GarnishedItems.PORKCHOP_AND_GRAZE);

			output.accept(GarnishedItems.GHAST_TENDRIL);

			output.accept(GarnishedItems.VOLATILE_DUST);

			output.accept(GarnishedBlocks.SEPIA_FUNGUS.asStack());
			output.accept(GarnishedBlocks.SOUL_ROOTS.asStack());

			output.accept(GarnishedBlocks.BARREN_ROOTS.asStack());
			output.accept(GarnishedBlocks.SMALL_CHORUS_PLANT.asStack());

			output.accept(GarnishedItems.CRUSHED_SALT_COMPOUND.asStack());
			output.accept(GarnishedItems.SALT_COMPOUND.asStack());

			output.accept(GarnishedItems.APPLE_CIDER.asStack());
			output.accept(GarnishedItems.CRYPTIC_APPLE_CIDER.asStack());
			output.accept(GarnishedItems.BITTER_APPLE_CIDER.asStack());
			output.accept(GarnishedItems.BOTTLED_PEANUT_OIL.asStack());
			output.accept(GarnishedItems.FERMENTED_CASHEW_MIXTURE.asStack());
			output.accept(GarnishedItems.BOTTLED_ENDER_JELLY.asStack());
			output.accept(GarnishedItems.CHORUS_COCKTAIL.asStack());
			output.accept(GarnishedItems.ILLUMINATING_COCKTAIL.asStack());

			output.accept(GarnishedItems.GARNISH_COMPOUND.asStack());
			output.accept(GarnishedItems.GARNISH_POWDER.asStack());
			output.accept(GarnishedBlocks.SOLIDIFIED_GARNISH_BLOCK.asStack());

			output.accept(GarnishedBlocks.BLOCK_OF_ENDER_JELLY.asStack());
			output.accept(GarnishedBlocks.UNGARNISHED_NUT_BLOCK.asStack());
			output.accept(GarnishedBlocks.GARNISHED_NUT_BLOCK.asStack());

			output.accept(GarnishedBlocks.SEPIA_WART_BLOCK.asStack());
			output.accept(GarnishedBlocks.SEPIA_STEM.asStack());
			output.accept(GarnishedBlocks.STRIPPED_SEPIA_STEM.asStack());
			output.accept(GarnishedBlocks.SEPIA_HYPHAE.asStack());
			output.accept(GarnishedBlocks.STRIPPED_SEPIA_HYPHAE.asStack());
			output.accept(GarnishedBlocks.SEPIA_PLANKS.asStack());
			output.accept(GarnishedBlocks.SEPIA_SLAB.asStack());
			output.accept(GarnishedBlocks.SEPIA_STAIRS.asStack());
			output.accept(GarnishedBlocks.SEPIA_TRAPDOOR.asStack());
			output.accept(GarnishedBlocks.SEPIA_DOOR.asStack());
			output.accept(GarnishedItems.SEPIA_SIGN.asStack());
			output.accept(GarnishedItems.SEPIA_HANGING_SIGN.asStack());

			output.accept(GarnishedBlocks.NUT_LOG.asStack());
			output.accept(GarnishedBlocks.STRIPPED_NUT_LOG.asStack());
			output.accept(GarnishedBlocks.NUT_WOOD.asStack());
			output.accept(GarnishedBlocks.STRIPPED_NUT_WOOD.asStack());
			output.accept(GarnishedBlocks.NUT_PLANKS.asStack());
			output.accept(GarnishedBlocks.NUT_SLAB.asStack());
			output.accept(GarnishedBlocks.NUT_STAIRS.asStack());
			output.accept(GarnishedBlocks.NUT_TRAPDOOR.asStack());
			output.accept(GarnishedBlocks.NUT_DOOR.asStack());
			output.accept(GarnishedItems.NUT_SIGN.asStack());
			output.accept(GarnishedItems.NUT_HANGING_SIGN.asStack());
			output.accept(GarnishedItems.NUT_BOAT.asStack());
			output.accept(GarnishedItems.NUT_CHEST_BOAT.asStack());

			output.accept(GarnishedBlocks.ABYSSAL_STONE.asStack());
			output.accept(GarnishedBlocks.ABYSSAL_STONE_SLAB.asStack());
			output.accept(GarnishedBlocks.ABYSSAL_STONE_STAIRS.asStack());
			output.accept(GarnishedBlocks.ABYSSAL_STONE_WALL.asStack());
			output.accept(GarnishedBlocks.ABYSSAL_STONE_BRICKS.asStack());
			output.accept(GarnishedBlocks.ABYSSAL_STONE_BRICKS_SLAB.asStack());
			output.accept(GarnishedBlocks.ABYSSAL_STONE_BRICKS_STAIRS.asStack());
			output.accept(GarnishedBlocks.ABYSSAL_STONE_BRICKS_WALL.asStack());
			output.accept(GarnishedBlocks.POLISHED_ABYSSAL_STONE.asStack());
			output.accept(GarnishedBlocks.POLISHED_ABYSSAL_STONE_SLAB.asStack());
			output.accept(GarnishedBlocks.POLISHED_ABYSSAL_STONE_STAIRS.asStack());
			output.accept(GarnishedBlocks.POLISHED_ABYSSAL_STONE_WALL.asStack());
			output.accept(GarnishedBlocks.CHISELED_ABYSSAL_STONE_BRICKS.asStack());

			output.accept(GarnishedBlocks.CARNOTITE.asStack());
			output.accept(GarnishedBlocks.CARNOTITE_SLAB.asStack());
			output.accept(GarnishedBlocks.CARNOTITE_STAIRS.asStack());
			output.accept(GarnishedBlocks.CARNOTITE_WALL.asStack());
			output.accept(GarnishedBlocks.CARNOTITE_BRICKS.asStack());
			output.accept(GarnishedBlocks.CARNOTITE_BRICKS_SLAB.asStack());
			output.accept(GarnishedBlocks.CARNOTITE_BRICKS_STAIRS.asStack());
			output.accept(GarnishedBlocks.CARNOTITE_BRICKS_WALL.asStack());
			output.accept(GarnishedBlocks.POLISHED_CARNOTITE.asStack());
			output.accept(GarnishedBlocks.POLISHED_CARNOTITE_SLAB.asStack());
			output.accept(GarnishedBlocks.POLISHED_CARNOTITE_STAIRS.asStack());
			output.accept(GarnishedBlocks.POLISHED_CARNOTITE_WALL.asStack());
			output.accept(GarnishedBlocks.CHISELED_CARNOTITE_BRICKS.asStack());

			output.accept(GarnishedBlocks.UNSTABLE_STONE.asStack());
			output.accept(GarnishedBlocks.UNSTABLE_STONE_SLAB.asStack());
			output.accept(GarnishedBlocks.UNSTABLE_STONE_STAIRS.asStack());
			output.accept(GarnishedBlocks.UNSTABLE_STONE_WALL.asStack());
			output.accept(GarnishedBlocks.UNSTABLE_STONE_BRICKS.asStack());
			output.accept(GarnishedBlocks.UNSTABLE_STONE_BRICKS_SLAB.asStack());
			output.accept(GarnishedBlocks.UNSTABLE_STONE_BRICKS_STAIRS.asStack());
			output.accept(GarnishedBlocks.UNSTABLE_STONE_BRICKS_WALL.asStack());
			output.accept(GarnishedBlocks.POLISHED_UNSTABLE_STONE.asStack());
			output.accept(GarnishedBlocks.POLISHED_UNSTABLE_STONE_SLAB.asStack());
			output.accept(GarnishedBlocks.POLISHED_UNSTABLE_STONE_STAIRS.asStack());
			output.accept(GarnishedBlocks.POLISHED_UNSTABLE_STONE_WALL.asStack());
			output.accept(GarnishedBlocks.CHISELED_UNSTABLE_STONE_BRICKS.asStack());

			output.accept(GarnishedFluids.GARNISH.getBucket().get().getDefaultInstance());
			output.accept(GarnishedFluids.APPLE_CIDER.getBucket().get().getDefaultInstance());
			output.accept(GarnishedFluids.PEANUT_OIL.getBucket().get().getDefaultInstance());
			output.accept(GarnishedFluids.CASHEW_MIXTURE.getBucket().get().getDefaultInstance());
			output.accept(GarnishedFluids.MASTIC_RESIN.getBucket().get().getDefaultInstance());
			output.accept(GarnishedFluids.RED_MASTIC_RESIN.getBucket().get().getDefaultInstance());
			output.accept(GarnishedFluids.ORANGE_MASTIC_RESIN.getBucket().get().getDefaultInstance());
			output.accept(GarnishedFluids.YELLOW_MASTIC_RESIN.getBucket().get().getDefaultInstance());
			output.accept(GarnishedFluids.GREEN_MASTIC_RESIN.getBucket().get().getDefaultInstance());
			output.accept(GarnishedFluids.BLUE_MASTIC_RESIN.getBucket().get().getDefaultInstance());
			output.accept(GarnishedFluids.PURPLE_MASTIC_RESIN.getBucket().get().getDefaultInstance());

			output.accept(GarnishedItems.WOODEN_HATCHET.asStack());
			output.accept(GarnishedItems.STONE_HATCHET.asStack());
			output.accept(GarnishedItems.IRON_HATCHET.asStack());
			output.accept(GarnishedItems.GOLDEN_HATCHET.asStack());
			output.accept(GarnishedItems.DIAMOND_HATCHET.asStack());
			output.accept(GarnishedItems.NETHERITE_HATCHET.asStack());
		}
	}
}
