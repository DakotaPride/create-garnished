package net.dakotapride.garnished.registry;

import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class GarnishedTags {

	public static TagKey<Item> AVERSION_FOODS_TAG = itemTag("aversion_foods");
	public static TagKey<Fluid> GARNISHED_FLUIDS_TAG = fluidTag("fluids");
	public static TagKey<Item> HATCHETS_TAG = commonItemTag("tools/hatchets");
	public static final TagKey<Block> MINEABLE_WITH_HATCHET = commonBlockTag("mineable/hatchet");
	public static final TagKey<EntityType<?>> IS_AFFECTED_BY_SALVAGING = commonEntityTypeTag("affected_by/salvaging");
	public static final TagKey<EntityType<?>> IS_AFFECTED_BY_RAVAGING = commonEntityTypeTag("affected_by/ravaging");


	private static TagKey<Item> commonItemTag(String name) {
		return TagKey.create(Registry.ITEM.key(), new ResourceLocation("c", name));
	}

	private static TagKey<Block> commonBlockTag(String name) {
		return TagKey.create(Registry.BLOCK.key(), new ResourceLocation("c", name));
	}

	private static TagKey<EntityType<?>> commonEntityTypeTag(String name) {
		return TagKey.create(Registry.ENTITY_TYPE.key(), new ResourceLocation("c", name));
	}

	private static TagKey<Item> itemTag(String name) {
		return TagKey.create(Registry.ITEM.key(), new ResourceLocation(CreateGarnished.ID, name));
	}

	private static TagKey<Fluid> fluidTag(String name) {
		return TagKey.create(Registry.FLUID.key(), new ResourceLocation(CreateGarnished.ID, name));
	}

	public static void setRegister() {}

}
