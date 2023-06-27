package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CrackedCashewItem extends BlockItem {
	public CrackedCashewItem(Properties properties) {
		super(GarnishedBlocks.CASHEW_CROP.get(), properties);
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		if (!Screen.hasShiftDown()) {
			tooltip.add(Component.translatable("text.garnished.nut.cracked").withStyle(ChatFormatting.GRAY));
		}

		if (Screen.hasShiftDown()) {
			tooltip.add(Component.literal(""));
			tooltip.add(Component.translatable("text.garnished.nut.cracked.desc").withStyle(ChatFormatting.DARK_PURPLE));
			tooltip.add(Component.translatable("text.garnished.nut.cracked.desc.secondary").withStyle(ChatFormatting.DARK_PURPLE));
		}
	}
}
