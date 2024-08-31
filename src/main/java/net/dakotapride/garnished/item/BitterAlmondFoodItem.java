package net.dakotapride.garnished.item;

import java.util.List;

import javax.annotation.Nullable;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class BitterAlmondFoodItem extends Item implements IGarnishedUtilities {
	public BitterAlmondFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.BITTER_ALMOND));
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		tooltip.add(Component.translatable(garnishedText()).withStyle(standard()));
	}
}
