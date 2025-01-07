package net.dakotapride.garnished.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.TooltipFlag;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FermentedCashewMixtureItem extends Item implements IGarnishedUtilities {
	private static final int DRINK_DURATION = 10;
	public FermentedCashewMixtureItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.FERMENTED_CASHEW_MIXTURE).stacksTo(16));
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
		addEffectTooltip(tooltip, MobEffects.CONFUSION, 3, cashew_mix_dur);
		addChanceForEffect(tooltip, 0.05F);
		addEffectTooltip(tooltip, MobEffects.DAMAGE_BOOST, 3, cashew_mix_dur);
		addChanceForEffect(tooltip, 0.05F);
	}

	@Override
	public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity livingEntity) {
		super.finishUsingItem(stack, level, livingEntity);

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
