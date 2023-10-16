package net.dakotapride.garnished.item;

import java.util.List;
import java.util.Random;

import net.minecraft.ChatFormatting;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class CashewFruitItem extends Item implements IGarnishedItem {
	public CashewFruitItem(Properties properties) {
		super(properties.food(GarnishedFoods.CASHEW_FRUIT));
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
		if (!Screen.hasShiftDown()) {
			tooltip.add(new TranslatableComponent("text.garnished.hold_shift").withStyle(ChatFormatting.GRAY));
		}

		if (Screen.hasShiftDown()) {
			tooltip.add(new TextComponent(""));
			tooltip.add(new TranslatableComponent("text.garnished.cashew_fruit.poisoning").withStyle(ChatFormatting.DARK_PURPLE));
			tooltip.add(new TextComponent(""));
			tooltip.add(new TranslatableComponent("text.garnished.cashew_fruit.poisoning.chance").withStyle(ChatFormatting.DARK_PURPLE));
		}
	}

	@Override
	public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity livingEntity) {
		int random = new Random().nextInt(4);

		if (livingEntity instanceof ServerPlayer serverPlayer) {
			CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, stack);
			serverPlayer.awardStat(Stats.ITEM_USED.get(this));

			if (random == 1) {
				livingEntity.addEffect(new MobEffectInstance(MobEffects.POISON, getCashewFruitEffectDuration));
			}
		}

		return super.finishUsingItem(stack, level, livingEntity);
	}


}
