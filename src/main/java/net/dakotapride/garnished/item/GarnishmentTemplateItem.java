package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedItems;
import net.fabricmc.loader.api.FabricLoader;
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

public class GarnishmentTemplateItem extends Item {
	public GarnishmentTemplateItem(Properties properties) {
		super(properties);
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		getNutMouldToString(stack, tooltip);

		if (!Screen.hasShiftDown()) {
			tooltip.add(Component.translatable("text.garnished.hold_shift").withStyle(ChatFormatting.GRAY));
		}

		if (Screen.hasShiftDown()) {
			tooltip.add(Component.literal(""));
			// tooltip.add(Component.translatable("text.garnished.template.applying").withStyle(ChatFormatting.YELLOW));
			if (FabricLoader.getInstance().isModLoaded("polymorph")) {
				tooltip.add(Component.translatable("text.garnished.template.desc").withStyle(ChatFormatting.GRAY));
			}
			tooltip.add(Component.translatable("text.garnished.template.desc.secondary").withStyle(ChatFormatting.DARK_PURPLE));
		}
	}

	private void getNutMouldToString(ItemStack stack, List<Component> tooltip) {
		String templateIdentifier;
		if (stack.is(GarnishedItems.GARNISHMENT_TEMPLATE.get())) {
			templateIdentifier = "standard";
		} else if (stack.is(GarnishedItems.CASHEW_TEMPLATE.get())) {
			templateIdentifier = "cashew";
		} else if (stack.is(GarnishedItems.WALNUT_TEMPLATE.get())) {
			templateIdentifier = "walnut";
		} else if (stack.is(GarnishedItems.ALMOND_TEMPLATE.get())) {
			templateIdentifier = "almond";
		} else if (stack.is(GarnishedItems.PECAN_TEMPLATE.get())) {
			templateIdentifier = "pecan";
		} else {
			templateIdentifier = "null";
		}

		tooltip.add(Component.translatable("text.garnished.template." + templateIdentifier).withStyle(ChatFormatting.GRAY));
	}
}
