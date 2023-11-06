package net.dakotapride.garnished.registry;

import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class GarnishedTags {

	public static TagKey<Item> AVERSION_FOODS_TAG = itemTag("aversion_foods");
	public static TagKey<Item> HATCHETS_TAG = commonItemTag("tools/hatchets");
	public static TagKey<Fluid> GARNISHED_FLUIDS_TAG = fluidTag("fluids");
	public static final TagKey<Block> MINEABLE_WITH_HATCHET = commonBlockTag("mineable/hatchet");
	public static final TagKey<EntityType<?>> IS_AFFECTED_BY_SALVAGING = commonEntityTypeTag("affected_by/salvaging");
	public static final TagKey<EntityType<?>> IS_AFFECTED_BY_RAVAGING = commonEntityTypeTag("affected_by/ravaging");

	// Integrated Tags
	// public static TagKey<Item> ZINC_INGOTS = commonItemTag("ingots/zinc");
	//	public static TagKey<Item> BRASS_INGOTS = commonItemTag("ingots/brass");
	public static TagKey<Item> COPPER_INGOTS = commonItemTag("ingots/copper");
	//	public static TagKey<Item> ROSE_QUARTZ = commonItemTag("rose_quartz");
	//	public static TagKey<Item> EXPERIENCE_REPAIRABLE_ITEMS = commonItemTag("experience_heaps");
	//	public static TagKey<Item> BLAZING_REPAIRABLE_ITEMS = commonItemTag("blazing_repairable_items");

	public static TagKey<Item> WARDEN_REPAIRABLE_ITEMS = commonItemTag("shards/warden");

	 public static TagKey<Item> JADE_GEMS = commonItemTag("gems/jade");
	 public static TagKey<Item> TOPAZ_GEMS = commonItemTag("gems/topaz");
	 public static TagKey<Item> AQUAMARINE_GEMS = commonItemTag("gems/aquamarine");
	 public static TagKey<Item> SAPPHIRE_GEMS = commonItemTag("gems/sapphire");
	 public static TagKey<Item> RUBY_GEMS = commonItemTag("gems/ruby");
	 public static TagKey<Item> AMETRINE_GEMS = commonItemTag("gems/ametrine");

	private static TagKey<Item> itemTag(String name) {
		return TagKey.create(BuiltInRegistries.ITEM.key(), new ResourceLocation(CreateGarnished.ID, name));
	}

	private static TagKey<Item> commonItemTag(String name) {
		return TagKey.create(BuiltInRegistries.ITEM.key(), new ResourceLocation("c", name));
	}

	private static TagKey<Block> commonBlockTag(String name) {
		return TagKey.create(BuiltInRegistries.BLOCK.key(), new ResourceLocation("c", name));
	}

	private static TagKey<Fluid> fluidTag(String name) {
		return TagKey.create(BuiltInRegistries.FLUID.key(), new ResourceLocation(CreateGarnished.ID, name));
	}

	private static TagKey<EntityType<?>> commonEntityTypeTag(String name) {
		return TagKey.create(BuiltInRegistries.ENTITY_TYPE.key(), new ResourceLocation("c", name));
	}

	public static void setRegister() {}

}
