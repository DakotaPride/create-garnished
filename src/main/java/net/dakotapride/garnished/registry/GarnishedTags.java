package net.dakotapride.garnished.registry;

import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;

public class GarnishedTags {

	public static TagKey<Item> AVERSION_FOODS_TAG = itemTag("aversion_foods");
	public static TagKey<Fluid> GARNISHED_FLUIDS_TAG = fluidTag("fluids");

	private static TagKey<Item> itemTag(String name) {
		return TagKey.create(Registry.ITEM.key(), new ResourceLocation(CreateGarnished.ID, name));
	}

	private static TagKey<Fluid> fluidTag(String name) {
		return TagKey.create(Registry.FLUID.key(), new ResourceLocation(CreateGarnished.ID, name));
	}

	public static void setRegister() {}

}
