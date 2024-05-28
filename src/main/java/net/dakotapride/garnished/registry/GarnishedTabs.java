package net.dakotapride.garnished.registry;

import java.util.function.Supplier;

import com.tterrag.registrate.util.entry.ItemEntry;

import net.dakotapride.garnished.item.hatchet.tier.integrated.GildedNetheriteHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.RoseGoldHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.WardenHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades.AmetrineHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades.AquamarineHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades.JadeHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades.RubyHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades.SapphireHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades.TopazHatchetToolItem;
import net.minecraft.world.item.Rarity;

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
	public static final AllCreativeModeTabs.TabInfo GARNISHED_BLOCKS = register("create.garnished.blocks",
			() -> FabricItemGroup.builder().title(Component.translatable("itemGroup.create.garnished.blocks"))
					.icon(() -> GarnishedBlocks.GARNISHED_NUT_BLOCK.get().asItem().getDefaultInstance())
					.displayItems(new BlocksDisplayItemsGenerator()).build());

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
			output.accept(GarnishedItems.CHOCOLATE_GLAZED_NUT_MIX.asStack());
			output.accept(GarnishedItems.HONEYED_NUT_MIX.asStack());

			output.accept(GarnishedItems.GARNISHED_MEAL.asStack());

			output.accept(GarnishedItems.GARNISHED_SWEET_BERRIES.asStack());
			output.accept(GarnishedItems.HONEYED_SWEET_BERRIES.asStack());

			output.accept(GarnishedItems.SALAD.asStack());
			output.accept(GarnishedItems.PHANTOM_STEAK.asStack());
			output.accept(GarnishedItems.BITTER_ALMOND.asStack());
			output.accept(GarnishedItems.ALMOND_CHEESE.asStack());
			output.accept(GarnishedItems.CASHEW_APPLE.asStack());
			output.accept(GarnishedItems.WALNUT_BROWNIE.asStack());
			output.accept(GarnishedItems.PECAN_PIE.asStack());
			output.accept(GarnishedItems.CASHEW_COOKIE.asStack());

			output.accept(GarnishedItems.PEANUT_OIL_AND_CINDER_SANDWICH.asStack());
			output.accept(GarnishedItems.TOPHET_BREW.asStack());
			output.accept(GarnishedItems.GRIM_STEW.asStack());
			output.accept(GarnishedItems.SOUL_KHANA.asStack());
			output.accept(GarnishedItems.OMNISCIENT_STEW.asStack());
			output.accept(GarnishedItems.WARPED_BREW.asStack());
			output.accept(GarnishedItems.INIQUITOUS_BREW.asStack());
			output.accept(GarnishedItems.SPIRITED_CONCOCTION.asStack());
			output.accept(GarnishedItems.PUTRID_STEW.asStack());
			output.accept(GarnishedItems.NUT_NACHO_BOWL.asStack());
			output.accept(GarnishedItems.CINDER_ROLL.asStack());
			output.accept(GarnishedItems.PIQUANT_PRETZEL.asStack());
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
			output.accept(GarnishedItems.FIENDISH_SPORE.asStack());
			output.accept(GarnishedItems.BRITTLE_DUST.asStack());
			output.accept(GarnishedItems.SENILE_DUST.asStack());
			output.accept(GarnishedItems.TORRID_BLEND.asStack());
			output.accept(GarnishedItems.MALODOROUS_MIXTURE.asStack());
			output.accept(GarnishedItems.SENILE_BONE.asStack());
			output.accept(GarnishedItems.SENILE_SPREAD.asStack());
			output.accept(GarnishedItems.TUSK.asStack());
			output.accept(GarnishedItems.IRATE_TUSK.asStack());
			output.accept(GarnishedItems.CRIMSON_TUSK.asStack());
			output.accept(GarnishedItems.SILICA_HARDENED_WRAP.asStack());
			output.accept(GarnishedItems.ENFLAMED_MANDIBLE.asStack());
			output.accept(GarnishedItems.SENILE_SWEET_BLACKSTONE.asStack());
			output.accept(GarnishedItems.SENILE_SWEET_BASALT.asStack());
			output.accept(GarnishedItems.SENILE_SWEET_SCORIA.asStack());
			output.accept(GarnishedItems.SENILE_SWEET_SCORCHIA.asStack());
			output.accept(GarnishedItems.INCANDESCENT_PETAL.asStack());
			output.accept(GarnishedItems.PANSOPHICAL_PETAL.asStack());

			output.accept(GarnishedItems.VOID_MIXTURE.asStack());
			output.accept(GarnishedItems.ETHEREAL_CONCOCTION.asStack());
			output.accept(GarnishedItems.DESOLATE_STEW.asStack());
			output.accept(GarnishedItems.COSMIC_BREW.asStack());
			output.accept(GarnishedItems.FARSEER_BREW.asStack());
			output.accept(GarnishedItems.SHELLED_DUMPLING.asStack());
			output.accept(GarnishedItems.CHAMPIONS_OMELETTE.asStack());
			output.accept(GarnishedItems.CHORUS_BOWL.asStack());
			output.accept(GarnishedItems.CHORUS_COOKIE.asStack());
			output.accept(GarnishedItems.ENDER_JELLY_BLOB.asStack());
			output.accept(GarnishedItems.VOID_DUST.asStack());
			output.accept(GarnishedItems.CHORUS_TUFT.asStack());
			output.accept(GarnishedItems.HOLLOWED_CHORUS_FRUIT.asStack());
			output.accept(GarnishedItems.ETHEREAL_COMPOUND.asStack());
			output.accept(GarnishedItems.PRELIMINARY_NUCLEUS.asStack());
			output.accept(GarnishedItems.DIMMED_SCALE.asStack());
			output.accept(GarnishedItems.COSMIC_POWDER.asStack());
			output.accept(GarnishedItems.DESOLATE_SPREAD.asStack());
			output.accept(GarnishedItems.ENDER_DRAGON_EGG_SHELL.asStack());
			output.accept(GarnishedItems.FRAIL_ENDER_DRAGON_EGG_SHELL.asStack());

			output.accept(GarnishedItems.MUD_PIE.asStack());
			output.accept(GarnishedItems.MULCH.asStack());

			output.accept(GarnishedItems.MOLTEN_STEW.asStack());

			output.accept(GarnishedItems.VENERABLE_DOUGH.asStack());
			output.accept(GarnishedItems.VENERABLE_DELICACY_RED.asStack());
			output.accept(GarnishedItems.VENERABLE_DELICACY_ORANGE.asStack());
			output.accept(GarnishedItems.VENERABLE_DELICACY_YELLOW.asStack());
			output.accept(GarnishedItems.VENERABLE_DELICACY_GREEN.asStack());
			output.accept(GarnishedItems.VENERABLE_DELICACY_BLUE.asStack());
			output.accept(GarnishedItems.VENERABLE_DELICACY_PURPLE.asStack());
			output.accept(GarnishedItems.SLIME_DROP.asStack());
			output.accept(GarnishedItems.MASTIC_COVERED_SLIME_DROP_RED.asStack());
			output.accept(GarnishedItems.MASTIC_COVERED_SLIME_DROP_ORANGE.asStack());
			output.accept(GarnishedItems.MASTIC_COVERED_SLIME_DROP_YELLOW.asStack());
			output.accept(GarnishedItems.MASTIC_COVERED_SLIME_DROP_GREEN.asStack());
			output.accept(GarnishedItems.MASTIC_COVERED_SLIME_DROP_BLUE.asStack());
			output.accept(GarnishedItems.MASTIC_COVERED_SLIME_DROP_PURPLE.asStack());
			output.accept(GarnishedItems.MASTIC_RESIN.asStack());
			output.accept(GarnishedItems.MASTIC_RESIN_RED.asStack());
			output.accept(GarnishedItems.MASTIC_RESIN_ORANGE.asStack());
			output.accept(GarnishedItems.MASTIC_RESIN_YELLOW.asStack());
			output.accept(GarnishedItems.MASTIC_RESIN_GREEN.asStack());
			output.accept(GarnishedItems.MASTIC_RESIN_BLUE.asStack());
			output.accept(GarnishedItems.MASTIC_RESIN_PURPLE.asStack());
			output.accept(GarnishedItems.MASTIC_PASTE.asStack());
			output.accept(GarnishedItems.MASTIC_PASTE_RED.asStack());
			output.accept(GarnishedItems.MASTIC_PASTE_ORANGE.asStack());
			output.accept(GarnishedItems.MASTIC_PASTE_YELLOW.asStack());
			output.accept(GarnishedItems.MASTIC_PASTE_GREEN.asStack());
			output.accept(GarnishedItems.MASTIC_PASTE_BLUE.asStack());
			output.accept(GarnishedItems.MASTIC_PASTE_PURPLE.asStack());

			output.accept(GarnishedItems.SUGAR_CUBE.asStack());
			output.accept(GarnishedItems.BOK_CHOY.asStack());
			output.accept(GarnishedItems.BOK_CHOY_SEEDS.asStack());

			output.accept(GarnishedItems.BAKLAVA.asStack());
			output.accept(GarnishedItems.MERRY_TREAT.asStack());
			output.accept(GarnishedItems.COAL_TRUFFLE.asStack());
			output.accept(GarnishedItems.GALACTIC_CANE.asStack());
			output.accept(GarnishedItems.ICY_MASTIC_CHUNK.asStack());
			output.accept(GarnishedItems.STURDY_WAFFLE.asStack());

			output.accept(GarnishedItems.RAW_TENEBROUS_MEAT.asStack());
			output.accept(GarnishedItems.COOKED_TENEBROUS_MEAT.asStack());
			output.accept(GarnishedItems.VEX_WING.asStack());
			output.accept(GarnishedItems.MEAT_SCRAPS.asStack());
			output.accept(GarnishedItems.CASHEW_SORBET_SCOOP.asStack());
			output.accept(GarnishedItems.CASHEW_SORBET_DELIGHT.asStack());
			output.accept(GarnishedItems.ACHING_TENEBROUS_CLUMP.asStack());
			output.accept(GarnishedItems.GLOOMY_GATHERING.asStack());
			output.accept(GarnishedItems.FISHY_SURPRISE.asStack());
			output.accept(GarnishedItems.WALNUT_GORGE_CREAM.asStack());
			output.accept(GarnishedItems.GHANDERCKEN.asStack());
			output.accept(GarnishedItems.WHEAT_GRAZE.asStack());
			output.accept(GarnishedItems.PORKCHOP_AND_GRAZE.asStack());
			output.accept(GarnishedItems.MURKY_JELLY.asStack());
			output.accept(GarnishedItems.CACKLING_PIE.asStack());
			output.accept(GarnishedItems.YAM_O_GLOW_PUFFS.asStack());
			output.accept(GarnishedItems.SHINING_DISH.asStack());
			output.accept(GarnishedItems.MURKY_MACADAMIA_MALICE.asStack());
			output.accept(GarnishedItems.NUTTY_MELODY.asStack());
			output.accept(GarnishedItems.MUESLI.asStack());
			output.accept(GarnishedItems.DUSTY_REGALE.asStack());
			output.accept(GarnishedItems.INCENDIARY_STEW.asStack());

			output.accept(GarnishedItems.DRIED_VERMILION_KELP.asStack());
			output.accept(GarnishedItems.DRIED_DULSE_KELP.asStack());
			output.accept(GarnishedItems.BEWILDERED_PASTRY.asStack());
			output.accept(GarnishedItems.VERMILION_STEW.asStack());
			output.accept(GarnishedItems.VAST_BREW.asStack());
			output.accept(GarnishedItems.GALVANIC_HAUNTING.asStack());

			output.accept(GarnishedItems.PRICKLY_PEAR.asStack());
			output.accept(GarnishedItems.BAMBOO_CLOD.asStack());
			output.accept(GarnishedItems.NOPALITO_WRAP.asStack());
			output.accept(GarnishedItems.NOPALITO_WRAP_SUPREME.asStack());
			output.accept(GarnishedItems.SINOPIA_ROCK_SWEET.asStack());
			output.accept(GarnishedItems.THORN_ON_A_STICK.asStack());
			output.accept(GarnishedItems.OVERGROWN_BREW.asStack());
			output.accept(GarnishedItems.PRICKLY_PEAR_STEW.asStack());
			output.accept(GarnishedItems.STEW_OF_THE_DAMNED.asStack());

			output.accept(GarnishedItems.RAW_POLAR_BEAR_MEAT.asStack());
			output.accept(GarnishedItems.COOKED_POLAR_BEAR_MEAT.asStack());
			output.accept(GarnishedItems.VOID_STROGANOFF.asStack());
			output.accept(GarnishedItems.EXPLORERS_CONCOCTION.asStack());
			output.accept(GarnishedItems.FROSTED_DESSERT.asStack());
			output.accept(GarnishedItems.CHILLED_APPLE.asStack());

			output.accept(GarnishedItems.MOLTEN_REMNANT.asStack());

			output.accept(GarnishedItems.GHAST_TENDRIL.asStack());

			output.accept(GarnishedItems.VOLATILE_DUST.asStack());

			output.accept(GarnishedItems.SOLEMN_DUST.asStack());

			output.accept(GarnishedBlocks.VERMILION_KELP.asStack());
			output.accept(GarnishedBlocks.DULSE_KELP.asStack());
			output.accept(GarnishedItems.CORAL_WRAPPING.asStack());
			output.accept(GarnishedItems.LUSTROUS_PEARL.asStack());

			output.accept(GarnishedItems.ANTIQUE_SWATHE.asStack());
			output.accept(GarnishedItems.BRISTLED_FLOUR.asStack());
			output.accept(GarnishedItems.BRISTLED_TORTILLA.asStack());
			output.accept(GarnishedItems.AMBER_REMNANT.asStack());
			output.accept(GarnishedItems.SHATTERED_AMBER_REMNANT.asStack());

			output.accept(GarnishedItems.FROST.asStack());
			output.accept(GarnishedItems.NUMBING_PARCHMENT.asStack());
			output.accept(GarnishedItems.POLAR_BEAR_HIDE.asStack());
			output.accept(GarnishedItems.POLAR_HIDE_SCRATCH_PAPER.asStack());

			output.accept(GarnishedBlocks.SEPIA_FUNGUS.asStack());
			output.accept(GarnishedBlocks.SOUL_ROOTS.asStack());
			output.accept(GarnishedBlocks.INCANDESCENT_LILY.asStack());
			output.accept(GarnishedBlocks.PANSOPHICAL_DAISY.asStack());

			output.accept(GarnishedBlocks.BARREN_ROOTS.asStack());
			output.accept(GarnishedBlocks.SMALL_CHORUS_PLANT.asStack());
			output.accept(GarnishedBlocks.AUREATE_SHRUB.asStack());

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
			output.accept(GarnishedItems.ROSY_COCKTAIL.asStack());
			output.accept(GarnishedItems.SWEET_TEA.asStack());
			output.accept(GarnishedItems.BOTTLE_OF_CRESTFALLEN_FLORA.asStack());
			output.accept(GarnishedItems.BOTTLED_MALODOROUS_MIXTURE.asStack());

			output.accept(GarnishedItems.GARNISH_COMPOUND.asStack());
			output.accept(GarnishedItems.GARNISH_POWDER.asStack());

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
			output.accept(GarnishedFluids.DRAGON_BREATH.getBucket().get().getDefaultInstance());
			output.accept(GarnishedFluids.SWEET_TEA.getBucket().get().getDefaultInstance());

			output.accept(GarnishedItems.WOODEN_HATCHET.asStack());
			output.accept(GarnishedItems.STONE_HATCHET.asStack());
			output.accept(GarnishedItems.IRON_HATCHET.asStack());
			output.accept(GarnishedItems.GOLDEN_HATCHET.asStack());
			output.accept(GarnishedItems.DIAMOND_HATCHET.asStack());
			output.accept(GarnishedItems.NETHERITE_HATCHET.asStack());

			output.accept(GarnishedItems.JADE_HATCHET.asStack());
			output.accept(GarnishedItems.TOPAZ_HATCHET.asStack());
			output.accept(GarnishedItems.SAPPHIRE_HATCHET.asStack());
			output.accept(GarnishedItems.RUBY_HATCHET.asStack());
			output.accept(GarnishedItems.AMETRINE_HATCHET.asStack());
			output.accept(GarnishedItems.AQUAMARINE_HATCHET.asStack());
			output.accept(GarnishedItems.WARDEN_HATCHET.asStack());
			output.accept(GarnishedItems.ROSE_GOLD_HATCHET.asStack());
			output.accept(GarnishedItems.GILDED_NETHERITE_HATCHET.asStack());
			output.accept(GarnishedItems.NETHER_RUBY_HATCHET.asStack());
			output.accept(GarnishedItems.FLAMING_RUBY_HATCHET.asStack());
			output.accept(GarnishedItems.CINCINNASITE_HATCHET.asStack());
			output.accept(GarnishedItems.CINCINNASITE_DIAMOND_HATCHET.asStack());
			output.accept(GarnishedItems.THALLASIUM_HATCHET.asStack());
			output.accept(GarnishedItems.TERMINITE_HATCHET.asStack());
			output.accept(GarnishedItems.AETERNIUM_HATCHET.asStack());
			output.accept(GarnishedItems.THALLASIUM_HATCHET_HEAD.asStack());
			output.accept(GarnishedItems.TERMINITE_HATCHET_HEAD.asStack());
			output.accept(GarnishedItems.AETERNIUM_HATCHET_HEAD.asStack());
			output.accept(GarnishedItems.NETHER_QUARTZ_HATCHET.asStack());
			output.accept(GarnishedItems.CERTUS_QUARTZ_HATCHET.asStack());
			output.accept(GarnishedItems.FLUIX_HATCHET.asStack());
		}
	}

	public static class BlocksDisplayItemsGenerator implements CreativeModeTab.DisplayItemsGenerator {

		@Override
		public void accept(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output) {
			output.accept(GarnishedBlocks.SOLIDIFIED_GARNISH_BLOCK.asStack());

			output.accept(GarnishedBlocks.BLOCK_OF_ENDER_JELLY.asStack());
			output.accept(GarnishedBlocks.UNGARNISHED_NUT_BLOCK.asStack());
			output.accept(GarnishedBlocks.GARNISHED_NUT_BLOCK.asStack());
			output.accept(GarnishedBlocks.GARNISH_COMPOUND_BLOCK.asStack());
			output.accept(GarnishedBlocks.SALT_COMPOUND_BLOCK.asStack());
			output.accept(GarnishedBlocks.ETHEREAL_COMPOUND_BLOCK.asStack());
			output.accept(GarnishedBlocks.MULCH_BLOCK.asStack());

			output.accept(GarnishedBlocks.SENILE_BONE_BLOCK.asStack());

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
			// output.accept(GarnishedItems.SEPIA_HANGING_SIGN.asStack());

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
			// output.accept(GarnishedItems.NUT_HANGING_SIGN.asStack());
			output.accept(GarnishedItems.NUT_BOAT.asStack());
			output.accept(GarnishedItems.NUT_CHEST_BOAT.asStack());

			output.accept(GarnishedBlocks.MASTIC_BLOCK.asStack());
			output.accept(GarnishedBlocks.RED_MASTIC_BLOCK.asStack());
			output.accept(GarnishedBlocks.ORANGE_MASTIC_BLOCK.asStack());
			output.accept(GarnishedBlocks.YELLOW_MASTIC_BLOCK.asStack());
			output.accept(GarnishedBlocks.GREEN_MASTIC_BLOCK.asStack());
			output.accept(GarnishedBlocks.BLUE_MASTIC_BLOCK.asStack());
			output.accept(GarnishedBlocks.PURPLE_MASTIC_BLOCK.asStack());

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
			output.accept(GarnishedBlocks.SMOOTH_ABYSSAL_STONE.asStack());
			output.accept(GarnishedBlocks.SMOOTH_ABYSSAL_STONE_SLAB.asStack());
			output.accept(GarnishedBlocks.SMOOTH_ABYSSAL_STONE_STAIRS.asStack());
			output.accept(GarnishedBlocks.SMOOTH_ABYSSAL_STONE_WALL.asStack());
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
			output.accept(GarnishedBlocks.SMOOTH_CARNOTITE.asStack());
			output.accept(GarnishedBlocks.SMOOTH_CARNOTITE_SLAB.asStack());
			output.accept(GarnishedBlocks.SMOOTH_CARNOTITE_STAIRS.asStack());
			output.accept(GarnishedBlocks.SMOOTH_CARNOTITE_WALL.asStack());
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
			output.accept(GarnishedBlocks.SMOOTH_UNSTABLE_STONE.asStack());
			output.accept(GarnishedBlocks.SMOOTH_UNSTABLE_STONE_SLAB.asStack());
			output.accept(GarnishedBlocks.SMOOTH_UNSTABLE_STONE_STAIRS.asStack());
			output.accept(GarnishedBlocks.SMOOTH_UNSTABLE_STONE_WALL.asStack());
			output.accept(GarnishedBlocks.CHISELED_UNSTABLE_STONE_BRICKS.asStack());

			output.accept(GarnishedBlocks.RITUALISTIC_STONE.asStack());
			output.accept(GarnishedBlocks.RITUALISTIC_STONE_SLAB.asStack());
			output.accept(GarnishedBlocks.RITUALISTIC_STONE_STAIRS.asStack());
			output.accept(GarnishedBlocks.RITUALISTIC_STONE_WALL.asStack());
			output.accept(GarnishedBlocks.RITUALISTIC_STONE_BRICKS.asStack());
			output.accept(GarnishedBlocks.RITUALISTIC_STONE_BRICKS_SLAB.asStack());
			output.accept(GarnishedBlocks.RITUALISTIC_STONE_BRICKS_STAIRS.asStack());
			output.accept(GarnishedBlocks.RITUALISTIC_STONE_BRICKS_WALL.asStack());
			output.accept(GarnishedBlocks.POLISHED_RITUALISTIC_STONE.asStack());
			output.accept(GarnishedBlocks.POLISHED_RITUALISTIC_STONE_SLAB.asStack());
			output.accept(GarnishedBlocks.POLISHED_RITUALISTIC_STONE_STAIRS.asStack());
			output.accept(GarnishedBlocks.POLISHED_RITUALISTIC_STONE_WALL.asStack());
			output.accept(GarnishedBlocks.SMOOTH_RITUALISTIC_STONE.asStack());
			output.accept(GarnishedBlocks.SMOOTH_RITUALISTIC_STONE_SLAB.asStack());
			output.accept(GarnishedBlocks.SMOOTH_RITUALISTIC_STONE_STAIRS.asStack());
			output.accept(GarnishedBlocks.SMOOTH_RITUALISTIC_STONE_WALL.asStack());
			output.accept(GarnishedBlocks.CHISELED_RITUALISTIC_STONE_BRICKS.asStack());

			output.accept(GarnishedBlocks.DRAGON_STONE.asStack());
			output.accept(GarnishedBlocks.DRAGON_STONE_SLAB.asStack());
			output.accept(GarnishedBlocks.DRAGON_STONE_STAIRS.asStack());
			output.accept(GarnishedBlocks.DRAGON_STONE_WALL.asStack());
			output.accept(GarnishedBlocks.DRAGON_STONE_BRICKS.asStack());
			output.accept(GarnishedBlocks.DRAGON_STONE_BRICKS_SLAB.asStack());
			output.accept(GarnishedBlocks.DRAGON_STONE_BRICKS_STAIRS.asStack());
			output.accept(GarnishedBlocks.DRAGON_STONE_BRICKS_WALL.asStack());
			output.accept(GarnishedBlocks.POLISHED_DRAGON_STONE.asStack());
			output.accept(GarnishedBlocks.POLISHED_DRAGON_STONE_SLAB.asStack());
			output.accept(GarnishedBlocks.POLISHED_DRAGON_STONE_STAIRS.asStack());
			output.accept(GarnishedBlocks.POLISHED_DRAGON_STONE_WALL.asStack());
			output.accept(GarnishedBlocks.SMOOTH_DRAGON_STONE.asStack());
			output.accept(GarnishedBlocks.SMOOTH_DRAGON_STONE_SLAB.asStack());
			output.accept(GarnishedBlocks.SMOOTH_DRAGON_STONE_STAIRS.asStack());
			output.accept(GarnishedBlocks.SMOOTH_DRAGON_STONE_WALL.asStack());
			output.accept(GarnishedBlocks.CHISELED_DRAGON_STONE_BRICKS.asStack());

			output.accept(GarnishedBlocks.DRIED_VERMILION_KELP_BLOCK.asStack());
			output.accept(GarnishedBlocks.DRIED_DULSE_KELP_BLOCK.asStack());
			output.accept(GarnishedBlocks.VOLTAIC_SEA_GRASS.asStack());

			output.accept(GarnishedBlocks.ANNIVERSARY_CAKE.asStack());
		}

	}
}
