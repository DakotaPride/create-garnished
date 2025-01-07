package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedEffects;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.TooltipFlag;

import org.jetbrains.annotations.NotNull;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ConditionalEffectItem extends Item implements IGarnishedUtilities {
    int value;
    float chance;

    public ConditionalEffectItem(int value, float chance, Properties pProperties) {
        super(pProperties);
        this.value = value;
        this.chance = chance;
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level world, @NotNull LivingEntity entity) {
        Player playerentity = entity instanceof Player ? (Player) entity : null;
        if (playerentity instanceof ServerPlayer)
            CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) playerentity, stack);

        if (!world.isClientSide)
            entity.addEffect(triggerConditionalEffect(value, chance));

        return super.finishUsingItem(stack, world, entity);
    }

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {

		if (value == 0) {
			tooltip.add(Component.literal(""));
			tooltip.add(Component.translatable("text.garnished.conditional_effect.from_sugar_high").withStyle(ChatFormatting.GRAY));
			addEffectTooltipConditionalPositive(tooltip, MobEffects.REGENERATION, tick * 12);
		}
		if (value == 1) {
			tooltip.add(Component.literal(""));
			tooltip.add(Component.translatable("text.garnished.conditional_effect.from_freezing").withStyle(ChatFormatting.GRAY));
			addEffectTooltipConditionalPositive(tooltip, MobEffects.REGENERATION, tick * 12);
		}
		if (value == 2) {
			tooltip.add(Component.literal(""));
			tooltip.add(Component.translatable("text.garnished.conditional_effect.from_hunger").withStyle(ChatFormatting.GRAY));
			addEffectTooltipConditionalPositive(tooltip, GarnishedEffects.THORNS, tick * 24);
		}
		if (value == 3) {
			tooltip.add(Component.literal(""));
			tooltip.add(Component.translatable("text.garnished.conditional_effect.from_levitation").withStyle(ChatFormatting.GRAY));
			addEffectTooltipConditionalPositive(tooltip, MobEffects.SLOW_FALLING, tick * 24);
		}
		if (value == 4) {
			tooltip.add(Component.literal(""));
			tooltip.add(Component.translatable("text.garnished.conditional_effect.from_bad_omen_conditions.not_present").withStyle(ChatFormatting.GRAY));
			addEffectTooltipConditionalPositive(tooltip, MobEffects.DAMAGE_RESISTANCE, tick * 36);
			tooltip.add(Component.literal(""));
			tooltip.add(Component.translatable("text.garnished.conditional_effect.from_bad_omen_conditions.present").withStyle(ChatFormatting.GRAY));
			addEffectTooltipConditionalNegative(tooltip, MobEffects.WEAKNESS, tick * 36);
		}
		if (value == 5) {
			tooltip.add(Component.literal(""));
			tooltip.add(Component.translatable("text.garnished.conditional_effect.from_flame").withStyle(ChatFormatting.GRAY));
			addEffectTooltipConditionalPositive(tooltip, MobEffects.FIRE_RESISTANCE, tick * 24);
		}



		if (value == 6) {
			tooltip.add(Component.literal(""));
			//addChanceForEffect(tooltip, MobEffects.REGENERATION, tick * 12);
			tooltip.add(Component.translatable("text.garnished.conditional_effect.upon_consumption").withStyle(ChatFormatting.GRAY));
			tooltip.add(Component.translatable("text.garnished.conditional_effect.cryptic_apple_cider"));
		}
	}

}
