package net.dakotapride.garnished.modifier;

import com.tterrag.registrate.util.entry.ItemEntry;

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

	private static final ResourceLocation ANCIENTY_CITY_CHEST_ID =
			new ResourceLocation("minecraft", "chests/ancient_city");

	public static void modifyLootTables() {
		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if(ANCIENTY_CITY_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.35F).build()) // Drops 35% of the time
						.add(LootItem.lootTableItem(GarnishedItems.RAW_TENEBROUS_MEAT.get()))
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)).build());

				tableBuilder.pool(poolBuilder.build());
			}
		});
	}
}
