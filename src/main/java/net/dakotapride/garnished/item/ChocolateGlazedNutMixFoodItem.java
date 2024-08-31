package net.dakotapride.garnished.item;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class ChocolateGlazedNutMixFoodItem extends Item implements IGarnishedUtilities {
	public ChocolateGlazedNutMixFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.CHOCOLATE_GLAZED_NUT_MIX).stacksTo(16));
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		tooltip.add(Component.translatable(chocolateGlazedText()).setStyle(chocolateGlazed()));
	}
}
