package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CashewFruitItem extends Item implements IGarnishedItem {
	public CashewFruitItem(Properties properties) {
		super(properties.food(GarnishedFoods.CASHEW_FRUIT));
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
		// if (!Screen.hasShiftDown()) {
		//			tooltip.add(Component.translatable("text.garnished.hold_shift").withStyle(ChatFormatting.GRAY));
		//		}
		//
		//		if (Screen.hasShiftDown()) {
		//			tooltip.add(Component.literal(""));
		//			tooltip.add(Component.translatable("text.garnished.cashew_fruit.poisoning").withStyle(ChatFormatting.DARK_PURPLE));
		//			tooltip.add(Component.literal(""));
		//			tooltip.add(Component.translatable("text.garnished.cashew_fruit.poisoning.chance").withStyle(ChatFormatting.DARK_PURPLE));
		//		}
	}

	@Override
	public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity livingEntity) {
		if (livingEntity instanceof ServerPlayer serverPlayer) {
			CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, stack);
			serverPlayer.awardStat(Stats.ITEM_USED.get(this));
		}

		return super.finishUsingItem(stack, level, livingEntity);
	}


}
