package net.dakotapride.garnished.item.cracked;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CrackedNutItem extends BlockItem {
	public CrackedNutItem(Block block, Properties properties) {
		super(block, properties);
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
			tooltip.add(Component.translatable("text.garnished.nut.cracked.desc.third").withStyle(ChatFormatting.DARK_PURPLE));
		}
	}
}
