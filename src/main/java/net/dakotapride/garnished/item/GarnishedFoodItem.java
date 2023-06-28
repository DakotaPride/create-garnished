package net.dakotapride.garnished.item;

import java.util.List;

import net.minecraft.world.food.FoodProperties;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class GarnishedFoodItem extends Item {
	public GarnishedFoodItem(Properties properties) {
		super(properties.food(new FoodProperties.Builder().saturationMod(0.4F).nutrition(6).build()));
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltipComponents, @NotNull TooltipFlag isAdvanced) {
		tooltipComponents.add(Component.translatable("text.garnished.nut.garnished").withStyle(ChatFormatting.GRAY));
	}
}
