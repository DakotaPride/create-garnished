package net.dakotapride.garnished.registry;

import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.core.DefaultedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class GarnishedTags {

	public static final TagKey<Item> AVERSION_FOODS_TAG = garnishedTag("aversion_foods", BuiltInRegistries.ITEM);
	public static final TagKey<Item> HATCHETS_TAG = commonTag("tools/hatchets", BuiltInRegistries.ITEM);
	public static final TagKey<Fluid> GARNISHED_FLUIDS_TAG = garnishedTag("fluids", BuiltInRegistries.FLUID);
	public static final TagKey<Block> MINEABLE_WITH_HATCHET = commonTag("mineable/hatchet", BuiltInRegistries.BLOCK);
	public static final TagKey<EntityType<?>> IS_AFFECTED_BY_SALVAGING = commonTag("affected_by/salvaging", BuiltInRegistries.ENTITY_TYPE);
	public static final TagKey<EntityType<?>> IS_AFFECTED_BY_RAVAGING = commonTag("affected_by/ravaging", BuiltInRegistries.ENTITY_TYPE);
	public static final TagKey<Block> CARNOTITE_BLOCKS = garnishedTag("carnotite", BuiltInRegistries.BLOCK);
	public static final TagKey<Item> ENDER_DUSTS_TAG = commonTag("ender_dusts", BuiltInRegistries.ITEM);
	public static final TagKey<Biome> HAS_REMNANT_TAG = garnishedTag("has_remnant", Registries.BIOME);
	public static final TagKey<Block> FAN_FREEZING_PROCESSING_TAG = garnishedTag("fan_processing_catalysts/freezing", Registries.BLOCK);
	public static final TagKey<Fluid> FAN_FREEZING_PROCESSING_FLUID_TAG = garnishedTag("fan_processing_catalysts/freezing", Registries.FLUID);

	// Integrated Tags
	// public static TagKey<Item> ZINC_INGOTS = commonItemTag("ingots/zinc");
	//	public static TagKey<Item> BRASS_INGOTS = commonItemTag("ingots/brass");
	public static final TagKey<Item> COPPER_INGOTS = commonTag("ingots/copper", BuiltInRegistries.ITEM);
	//	public static TagKey<Item> ROSE_QUARTZ = commonItemTag("rose_quartz");
	//	public static TagKey<Item> EXPERIENCE_REPAIRABLE_ITEMS = commonItemTag("experience_heaps");
	//	public static TagKey<Item> BLAZING_REPAIRABLE_ITEMS = commonItemTag("blazing_repairable_items");

	public static final TagKey<Item> WARDEN_REPAIRABLE_ITEMS = commonTag("shards/warden", BuiltInRegistries.ITEM);

	 public static final TagKey<Item> JADE_GEMS = commonTag("ingots/jade", BuiltInRegistries.ITEM);
	 public static final TagKey<Item> TOPAZ_GEMS = commonTag("ingots/topaz", BuiltInRegistries.ITEM);
	 public static final TagKey<Item> AQUAMARINE_GEMS = commonTag("ingots/aquamarine", BuiltInRegistries.ITEM);
	 public static final TagKey<Item> SAPPHIRE_GEMS = commonTag("ingots/sapphire", BuiltInRegistries.ITEM);
	 public static final TagKey<Item> RUBY_GEMS = commonTag("ingots/ruby", BuiltInRegistries.ITEM);
	 public static final TagKey<Item> AMETRINE_GEMS = commonTag("ingots/ametrine", BuiltInRegistries.ITEM);

	private static <T> TagKey<T> garnishedTag(String name, DefaultedRegistry<T> registry) {
		return TagKey.create(registry.key(), new ResourceLocation(CreateGarnished.ID, name));
	}

	private static <T> TagKey<T> garnishedTag(String name, ResourceKey<Registry<T>> registry) {
		return TagKey.create(registry, new ResourceLocation(CreateGarnished.ID, name));
	}

	private static <T> TagKey<T> commonTag(String name, DefaultedRegistry<T> registry) {
		return TagKey.create(registry.key(), new ResourceLocation("c", name));
	}

	public static void setRegister() {}

}
