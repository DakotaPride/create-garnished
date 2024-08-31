package net.dakotapride.garnished.modifier;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class LootTableModifiers {

	private static final ResourceLocation ANCIENT_CITY_CHEST_ID =
			new ResourceLocation("minecraft", "chests/ancient_city");
	private static final ResourceLocation TREASURE_CHEST_ID =
			new ResourceLocation("minecraft", "chests/buried_treasure");
	private static final ResourceLocation DESERT_PYRAMID_CHEST_ID =
			new ResourceLocation("minecraft", "chests/desert_pyramid");
	private static final ResourceLocation JUNGLE_TEMPLE_CHEST_ID =
			new ResourceLocation("minecraft", "chests/jungle_temple");
	private static final ResourceLocation SAVANNA_CHEST_ID =
			new ResourceLocation("minecraft", "chests/village/village_savanna_house");
	private static final ResourceLocation NETHER_FORTRESS_CHEST_ID =
			new ResourceLocation("minecraft", "chests/nether_fortress");

	public static void modifyLootTables() {
		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if(ANCIENT_CITY_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.35F).build()) // Drops 35% of the time
						.add(LootItem.lootTableItem(GarnishedItems.RAW_TENEBROUS_MEAT.get()))
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)).build());

				tableBuilder.pool(poolBuilder.build());
			}
		});

		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if(TREASURE_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(1.0F).build()) // Drops 100% of the time
						.add(LootItem.lootTableItem(GarnishedItems.LUSTROUS_PEARL.get()))
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)).build());

				tableBuilder.pool(poolBuilder.build());
			}
		});

		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if(DESERT_PYRAMID_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.70F).build()) // Drops 70% of the time
						.add(LootItem.lootTableItem(GarnishedItems.ANTIQUE_SWATHE.get()))
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)).build());

				tableBuilder.pool(poolBuilder.build());
			}
		});

		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if(DESERT_PYRAMID_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.45F).build()) // Drops 45% of the time
						.add(LootItem.lootTableItem(GarnishedItems.AMBER_REMNANT.get()))
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)).build());

				tableBuilder.pool(poolBuilder.build());
			}
		});

		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if(JUNGLE_TEMPLE_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.75F).build()) // Drops 75% of the time
						.add(LootItem.lootTableItem(GarnishedItems.BOK_CHOY.get()))
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)).build());

				tableBuilder.pool(poolBuilder.build());
			}
		});

		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if(JUNGLE_TEMPLE_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.25F).build()) // Drops 25% of the time
						.add(LootItem.lootTableItem(GarnishedItems.BOK_CHOY_SEEDS.get()))
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)).build());

				tableBuilder.pool(poolBuilder.build());
			}
		});

		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if(NETHER_FORTRESS_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.15F).build()) // Drops 15% of the time
						.add(LootItem.lootTableItem(GarnishedBlocks.PANSOPHICAL_DAISY.get()))
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)).build());

				tableBuilder.pool(poolBuilder.build());
			}
		});
		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if(NETHER_FORTRESS_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.15F).build()) // Drops 15% of the time
						.add(LootItem.lootTableItem(GarnishedBlocks.INCANDESCENT_LILY.get()))
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)).build());

				tableBuilder.pool(poolBuilder.build());
			}
		});
		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if(NETHER_FORTRESS_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.15F).build()) // Drops 15% of the time
						.add(LootItem.lootTableItem(GarnishedBlocks.SORROWFUL_LICHEN.get()))
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)).build());

				tableBuilder.pool(poolBuilder.build());
			}
		});
	}
}
