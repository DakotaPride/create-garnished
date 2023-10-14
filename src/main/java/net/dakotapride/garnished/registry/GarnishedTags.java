package net.dakotapride.garnished.registry;

import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class GarnishedTags {

	public static TagKey<Item> AVERSION_FOODS_TAG = itemTag("aversion_foods");
	public static TagKey<Item> HATCHETS_TAG = forgeItemTag("tools/hatchets");
	public static TagKey<Fluid> GARNISHED_FLUIDS_TAG = fluidTag("fluids");
	public static final TagKey<Block> MINEABLE_WITH_HATCHET = forgeBlockTag("mineable/hatchet");
	public static final TagKey<EntityType<?>> IS_AFFECTED_BY_SALVAGING = forgeEntityTypeTag("affected_by/salvaging");
	public static final TagKey<EntityType<?>> IS_AFFECTED_BY_RAVAGING = forgeEntityTypeTag("affected_by/ravaging");

	private static TagKey<Item> itemTag(String name) {
		return TagKey.create(BuiltInRegistries.ITEM.key(), new ResourceLocation(CreateGarnished.ID, name));
	}

	private static TagKey<Item> forgeItemTag(String name) {
		return TagKey.create(BuiltInRegistries.ITEM.key(), new ResourceLocation("forge", name));
	}

	private static TagKey<Block> forgeBlockTag(String name) {
		return TagKey.create(BuiltInRegistries.BLOCK.key(), new ResourceLocation("forge", name));
	}

	private static TagKey<Fluid> fluidTag(String name) {
		return TagKey.create(BuiltInRegistries.FLUID.key(), new ResourceLocation(CreateGarnished.ID, name));
	}

	private static TagKey<EntityType<?>> forgeEntityTypeTag(String name) {
		return TagKey.create(BuiltInRegistries.ENTITY_TYPE.key(), new ResourceLocation("forge", name));
	}

	public static void setRegister() {}

}
