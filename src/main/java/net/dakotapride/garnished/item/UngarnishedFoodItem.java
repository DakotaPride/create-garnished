package net.dakotapride.garnished.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UngarnishedFoodItem extends Item {
	public UngarnishedFoodItem(Properties properties) {
		super(properties.food(new FoodProperties.Builder().saturationMod(0.3F).nutrition(4)
				.effect(new MobEffectInstance(MobEffects.CONFUSION, 240), 1.0F).build()));
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltipComponents, @NotNull TooltipFlag isAdvanced) {
		tooltipComponents.add(Component.translatable("text.garnished.nut.ungarnished").withStyle(ChatFormatting.GRAY));
	}
}
