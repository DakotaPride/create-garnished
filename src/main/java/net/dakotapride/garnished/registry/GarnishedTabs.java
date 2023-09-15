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
			output.accept(GarnishedItems.TROPHET_BREW.asStack());
			output.accept(GarnishedItems.GRIM_STEW.asStack());
			output.accept(GarnishedItems.CINDER_ROLL.asStack());
			output.accept(GarnishedItems.WRAPPED_CRIMSON_TANGLE.asStack());
			output.accept(GarnishedItems.WRAPPED_WARPED_TANGLE.asStack());
			output.accept(GarnishedItems.WEEPING_TANGLE.asStack());
			output.accept(GarnishedItems.BLAZING_DELIGHT.asStack());
			output.accept(GarnishedItems.CRUSHED_CRIMSON_FUNGUS.asStack());
			output.accept(GarnishedItems.CRUSHED_WARPED_FUNGUS.asStack());
			output.accept(GarnishedItems.CRUSHED_SHROOMLIGHT.asStack());
			output.accept(GarnishedItems.CRUSHED_ENDER_PEARL.asStack());
			output.accept(GarnishedItems.CRIMSON_TUSK.asStack());
			output.accept(GarnishedItems.SILICA_HARDENED_WRAP.asStack());
			output.accept(GarnishedItems.ENFLAMED_MANDIBLE.asStack());

			output.accept(GarnishedItems.CRUSHED_SALT_COMPOUND.asStack());
			output.accept(GarnishedItems.SALT_COMPOUND.asStack());

			output.accept(GarnishedItems.APPLE_CIDER.asStack());
			output.accept(GarnishedItems.CRYPTIC_APPLE_CIDER.asStack());
			output.accept(GarnishedItems.BITTER_APPLE_CIDER.asStack());
			output.accept(GarnishedItems.BOTTLED_PEANUT_OIL.asStack());

			output.accept(GarnishedItems.GARNISH_COMPOUND.asStack());
			output.accept(GarnishedBlocks.SOLIDIFIED_GARNISH_BLOCK.asStack());

			output.accept(GarnishedFluids.GARNISH.getBucket().get());
			output.accept(GarnishedFluids.APPLE_CIDER.getBucket().get());
			output.accept(GarnishedFluids.PEANUT_OIL.getBucket().get());
		}
	}
}
