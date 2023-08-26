package net.dakotapride.garnished.item;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class PhantomSteakFoodItem extends Item implements IGarnishedItem {
	public PhantomSteakFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.PHANTOM_STEAK));
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
		tooltip.add(Component.translatable("text.garnished.salted_food").withStyle(getStandardColouring()));
	}
}
