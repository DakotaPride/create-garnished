package net.dakotapride.garnished.item;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.ChatFormatting;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
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
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class AppleCiderFoodItem extends Item {
	private static final int DRINK_DURATION = 40;

	public AppleCiderFoodItem(Properties properties) {
		super(properties.stacksTo(8).food(GarnishedFoodValues.GENERIC_BOTTLED_FOOD_OR_DRINK_build));
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level pLevel, @NotNull List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		if (!Screen.hasShiftDown()) {
			tooltip.add(Component.translatable("text.garnished.hold_shift").withStyle(ChatFormatting.DARK_GRAY));
		} else {
			tooltip.add(Component.translatable("text.garnished.holding_shift").withStyle(ChatFormatting.DARK_GRAY));
		}

		if (Screen.hasShiftDown()) {
			tooltip.add(Component.literal(""));
			tooltip.add(Component.translatable("text.garnished.effect.clears_wither", "Wither").withStyle(Style.EMPTY.withColor(0xc7954b)));
		}
	}

	@Override
	public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity livingEntity) {
		super.finishUsingItem(stack, level, livingEntity);
		if (livingEntity instanceof ServerPlayer serverPlayer) {
			CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, stack);
			serverPlayer.awardStat(Stats.ITEM_USED.get(this));
		}

		if (!level.isClientSide) {
			livingEntity.removeEffect(MobEffects.WITHER);
		}

		if (stack.isEmpty()) {
			return new ItemStack(Items.GLASS_BOTTLE);
		} else {
			if (livingEntity instanceof Player && !((Player)livingEntity).getAbilities().instabuild) {
				ItemStack itemStack = new ItemStack(Items.GLASS_BOTTLE);
				Player player = (Player)livingEntity;
				if (!player.getInventory().add(itemStack)) {
					player.drop(itemStack, false);
				}
			}

			return super.finishUsingItem(stack, level, livingEntity);
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
