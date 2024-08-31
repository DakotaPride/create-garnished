package net.dakotapride.garnished.item;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class MeltedCinderFlourNutFoodItem extends Item implements IGarnishedUtilities {
	public MeltedCinderFlourNutFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.MELTED_CINDER_FLOUR_NUT));
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
		tooltip.add(Component.translatable(meltedCinderFlourText()).withStyle(cinderFlour()));
	}
}
