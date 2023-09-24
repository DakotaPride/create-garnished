package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.NotNull;

public class WrappedCrimsonTangleFoodItem extends Item implements IGarnishedItem {
	public WrappedCrimsonTangleFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.WRAPPED_CRIMSON_TANGLE).stacksTo(16));
	}

	@Override
	public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity livingEntity) {
		super.finishUsingItem(stack, level, livingEntity);
		if (livingEntity instanceof ServerPlayer serverPlayer) {
			CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, stack);
			serverPlayer.awardStat(Stats.ITEM_USED.get(this));
		}

		if (stack.isEmpty()) {
			return new ItemStack(GarnishedItems.SILICA_HARDENED_WRAP);
		} else {
			if (livingEntity instanceof Player && !((Player)livingEntity).getAbilities().instabuild) {
				ItemStack itemStack = new ItemStack(GarnishedItems.SILICA_HARDENED_WRAP);
				Player player = (Player)livingEntity;
				if (!player.getInventory().add(itemStack)) {
					player.drop(itemStack, false);
				}
			}

			return stack;
		}

	}

	@Override
	public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, @NotNull Player player, @NotNull InteractionHand usedHand) {
		return ItemUtils.startUsingInstantly(level, player, usedHand);
	}
}
