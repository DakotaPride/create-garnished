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

public class WalnutBrownieFoodItem extends Item implements IGarnishedItem {
	public WalnutBrownieFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.WALNUT_BROWNIE));
	}
}
