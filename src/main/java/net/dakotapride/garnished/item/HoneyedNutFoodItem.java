package net.dakotapride.garnished.item;

import java.util.List;

import net.minecraft.network.chat.TranslatableComponent;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class HoneyedNutFoodItem extends Item implements IGarnishedItem {
	public HoneyedNutFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.HONEYED_NUT));
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		tooltip.add(new TranslatableComponent(honeyedText()).setStyle(getHoneyedColouring()));
	}
}
