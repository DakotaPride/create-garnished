package net.dakotapride.garnished.modifier;

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

	private static final ResourceLocation BURIED_TREASURE_CHEST_ID =
			new ResourceLocation("minecraft", "chests/buried_treasure");

	public static void modifyLootTables() {
		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if(BURIED_TREASURE_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(1.0F).build()) // Drops 35% of the time
						.add(LootItem.lootTableItem(GarnishedItems.LUSTROUS_PEARL.get()))
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)).build());

				tableBuilder.pool(poolBuilder.build());
			}
		});
	}
}
