package net.dakotapride.garnished.item;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.registry.GarnishedEffects;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class SweetTeaItem extends Item implements IGarnishedUtilities {
	public SweetTeaItem(Properties properties) {
		super(properties);
	}

	@Override
	public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level world, @NotNull LivingEntity entity) {
		Player playerentity = entity instanceof Player ? (Player) entity : null;
		if (playerentity instanceof ServerPlayer)
			CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) playerentity, stack);

		// From the base BuildersTeaItem class from the Create mod
		if (!world.isClientSide)
			entity.addEffect(new MobEffectInstance(GarnishedEffects.AUGMENTED, 3 * 60 * 20, 0, false, false, false));

		if (playerentity != null) {
			playerentity.awardStat(Stats.ITEM_USED.get(this));
			playerentity.getFoodData().eat(1, .6F);
			if (!playerentity.getAbilities().instabuild)
				stack.shrink(1);
		}

		if (playerentity == null || !playerentity.getAbilities().instabuild) {
			if (stack.isEmpty())
				return new ItemStack(Items.GLASS_BOTTLE);
			if (playerentity != null)
				playerentity.getInventory().add(new ItemStack(Items.GLASS_BOTTLE));
		}

		return stack;
	}

	@Override
	public int getUseDuration(@NotNull ItemStack stack) {
		return 42;
	}

	@Override
	public @NotNull UseAnim getUseAnimation(@NotNull ItemStack stack) {
		return UseAnim.DRINK;
	}

	@Override
	public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, Player player, InteractionHand hand) {
		player.startUsingItem(hand);
		return InteractionResultHolder.success(player.getItemInHand(hand));
	}
}
