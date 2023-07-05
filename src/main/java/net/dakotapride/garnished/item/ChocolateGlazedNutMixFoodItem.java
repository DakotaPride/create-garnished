package net.dakotapride.garnished.item;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class ChocolateGlazedNutMixFoodItem extends Item implements IGarnishedItem {
	public ChocolateGlazedNutMixFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.CHOCOLATE_GLAZED_NUT_MIX).stacksTo(16));
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		tooltip.add(Component.translatable(chocolateGlazedText()).setStyle(getChocolateGlazedColouring()));
	}
}
