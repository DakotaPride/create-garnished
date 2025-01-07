package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CookedTenebrousMeatFoodItem extends Item implements IGarnishedUtilities {
	public CookedTenebrousMeatFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.COOKED_TENEBROUS_MEAT));
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
		addEffectTooltip(tooltip, MobEffects.REGENERATION, 200F);
		addChanceForEffect(tooltip, 0.85F);
	}
}
