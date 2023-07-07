package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.ChatFormatting;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
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

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CrypticAppleCiderFoodItem extends Item implements IGarnishedItem {
	private static final int DRINK_DURATION = 40;
	public CrypticAppleCiderFoodItem(Properties properties) {
		super(properties.stacksTo(8).food(GarnishedFoods.CRYPTIC_APPLE_CIDER));
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
		if (!Screen.hasShiftDown()) {
			tooltip.add(Component.translatable(crypticAppleCiderText()).withStyle(getStandardColouring()));
		}

		if (Screen.hasShiftDown()) {
			tooltip.add(Component.literal(""));
			tooltip.add(Component.translatable("text.garnished.cider.cryptic.desc").withStyle(ChatFormatting.DARK_PURPLE));
			tooltip.add(Component.translatable("text.garnished.cider.cryptic.desc.secondary").withStyle(ChatFormatting.DARK_PURPLE));
			tooltip.add(Component.literal(""));
			tooltip.add(Component.translatable("text.garnished.cider.cryptic.desc.third").withStyle(ChatFormatting.DARK_PURPLE));
		}
	}

	@Override
	public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity livingEntity) {
		super.finishUsingItem(stack, level, livingEntity);

		if (livingEntity instanceof ServerPlayer serverPlayer) {
			CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, stack);
			serverPlayer.awardStat(Stats.ITEM_USED.get(this));

			livingEntity.addEffect(new MobEffectInstance(getCrypticAppleCiderEffect(), getCrypticAppleCiderEffectDuration, 2));
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
