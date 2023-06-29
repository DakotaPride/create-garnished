package net.dakotapride.garnished.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SweetenedNutMixItem extends NutMixItem {
	public SweetenedNutMixItem(Properties properties) {
		super(properties.food(new FoodProperties.Builder().saturationMod(0.7F).nutrition(11).build()));
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		tooltip.add(Component.translatable("text.garnished.nut.sweetened").withStyle(ChatFormatting.AQUA));
	}
}
