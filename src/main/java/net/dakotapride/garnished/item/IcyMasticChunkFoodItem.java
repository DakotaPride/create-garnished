package net.dakotapride.garnished.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.TooltipFlag;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class IcyMasticChunkFoodItem extends Item implements IGarnishedUtilities {
    public IcyMasticChunkFoodItem(Properties properties) {
        super(properties.stacksTo(16).food(GarnishedFoodValues.ICY_MASTIC_CHUNK));
    }

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
		addEffectTooltip(tooltip, MobEffects.MOVEMENT_SLOWDOWN, 3, 100F);
		addEffectTooltip(tooltip, MobEffects.REGENERATION, 2, 160F);
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
