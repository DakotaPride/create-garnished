package net.dakotapride.garnished.item;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GarnishedSoilItem extends Item {
	public GarnishedSoilItem(Properties properties) {
		super(properties);
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		if (!Screen.hasShiftDown()) {
			tooltip.add(Component.translatable("text.garnished.hold_shift").withStyle(ChatFormatting.GRAY));
		}

		if (Screen.hasShiftDown()) {
			tooltip.add(Component.translatable("text.garnished.soil.desc").withStyle(ChatFormatting.DARK_PURPLE));
		}
	}
}
