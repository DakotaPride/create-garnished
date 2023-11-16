package net.dakotapride.garnished.registry;

import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.core.DefaultedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class GarnishedTags {

	public static TagKey<Item> AVERSION_FOODS_TAG = garnishedTag("aversion_foods", Registry.ITEM);
	public static TagKey<Item> HATCHETS_TAG = commonTag("tools/hatchets", Registry.ITEM);
	public static TagKey<Fluid> GARNISHED_FLUIDS_TAG = garnishedTag("fluids", Registry.FLUID);
	public static final TagKey<Block> MINEABLE_WITH_HATCHET = commonTag("mineable/hatchet", Registry.BLOCK);
	public static final TagKey<EntityType<?>> IS_AFFECTED_BY_SALVAGING = commonTag("affected_by/salvaging", Registry.ENTITY_TYPE);
	public static final TagKey<EntityType<?>> IS_AFFECTED_BY_RAVAGING = commonTag("affected_by/ravaging", Registry.ENTITY_TYPE);
	public static final TagKey<Block> CARNOTITE_BLOCKS = garnishedTag("carnotite", Registry.BLOCK);

	// Integrated Tags
	// public static TagKey<Item> ZINC_INGOTS = commonItemTag("ingots/zinc");
	//	public static TagKey<Item> BRASS_INGOTS = commonItemTag("ingots/brass");
	public static TagKey<Item> COPPER_INGOTS = commonTag("ingots/copper", Registry.ITEM);
	//	public static TagKey<Item> ROSE_QUARTZ = commonItemTag("rose_quartz");
	//	public static TagKey<Item> EXPERIENCE_REPAIRABLE_ITEMS = commonItemTag("experience_heaps");
	//	public static TagKey<Item> BLAZING_REPAIRABLE_ITEMS = commonItemTag("blazing_repairable_items");

	public static TagKey<Item> WARDEN_REPAIRABLE_ITEMS = commonTag("shards/warden", Registry.ITEM);

	public static TagKey<Item> JADE_GEMS = commonTag("ingots/jade", Registry.ITEM);
	public static TagKey<Item> TOPAZ_GEMS = commonTag("ingots/topaz", Registry.ITEM);
	public static TagKey<Item> AQUAMARINE_GEMS = commonTag("ingots/aquamarine", Registry.ITEM);
	public static TagKey<Item> SAPPHIRE_GEMS = commonTag("ingots/sapphire", Registry.ITEM);
	public static TagKey<Item> RUBY_GEMS = commonTag("ingots/ruby", Registry.ITEM);
	public static TagKey<Item> AMETRINE_GEMS = commonTag("ingots/ametrine", Registry.ITEM);

	private static <T> TagKey<T> garnishedTag(String name, DefaultedRegistry<T> registry) {
		return TagKey.create(registry.key(), new ResourceLocation(CreateGarnished.ID, name));
	}

	private static <T> TagKey<T> commonTag(String name, DefaultedRegistry<T> registry) {
		return TagKey.create(registry.key(), new ResourceLocation("c", name));
	}

	public static void setRegister() {}

}
