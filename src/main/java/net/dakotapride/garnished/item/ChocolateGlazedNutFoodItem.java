package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ChocolateGlazedNutFoodItem extends Item implements IGarnishedItem {
	public ChocolateGlazedNutFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.CHOCOLATE_GLAZED_NUT));
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		tooltip.add(Component.translatable(chocolateGlazedText()).setStyle(getChocolateGlazedColouring()));
	}
}
