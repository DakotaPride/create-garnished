package net.dakotapride.garnished.item.cracked;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class CrackedNutItem extends BlockItem {
	public CrackedNutItem(Block block, Properties properties) {
		super(block, properties);
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		tooltip.add(Component.translatable("text.garnished.nut.cracked").withStyle(ChatFormatting.GRAY));
	}
}
