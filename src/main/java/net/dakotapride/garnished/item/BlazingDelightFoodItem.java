package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.NotNull;

public class BlazingDelightFoodItem extends Item implements IGarnishedItem {
	private static final int DRINK_DURATION = 60;

	public BlazingDelightFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.BLAZING_DELIGHT).stacksTo(16));
	}

	@Override
	public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity livingEntity) {
		super.finishUsingItem(stack, level, livingEntity);
		if (livingEntity instanceof ServerPlayer serverPlayer) {
			CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, stack);
			serverPlayer.awardStat(Stats.ITEM_USED.get(this));
		}

		if (stack.isEmpty()) {
			return new ItemStack(GarnishedItems.EMPTY_CRIMSON_TUSK.get());
		} else {
			if (livingEntity instanceof Player && !((Player)livingEntity).getAbilities().instabuild) {
				ItemStack itemStack = new ItemStack(GarnishedItems.EMPTY_CRIMSON_TUSK.get());
				Player player = (Player)livingEntity;
				if (!player.getInventory().add(itemStack)) {
					player.drop(itemStack, false);
				}
			}

			return stack;
		}

	}

	@Override
	public int getUseDuration(@NotNull ItemStack stack) {
		return DRINK_DURATION;
	}

	@Override
	public @NotNull UseAnim getUseAnimation(ItemStack stack) {
		return UseAnim.DRINK;
	}

	@Override
	public @NotNull SoundEvent getDrinkingSound() {
		return SoundEvents.GENERIC_DRINK;
	}

	@Override
	public @NotNull SoundEvent getEatingSound() {
		return SoundEvents.GENERIC_DRINK;
	}

	@Override
	public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, @NotNull Player player, @NotNull InteractionHand usedHand) {
		return ItemUtils.startUsingInstantly(level, player, usedHand);
	}
}
