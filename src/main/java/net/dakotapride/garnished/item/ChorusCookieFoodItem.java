package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedEffects;
import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ChorusCookieFoodItem extends Item implements IGarnishedUtilities {
	public ChorusCookieFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.CHORUS_COOKIE));
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
		addEffectTooltip(tooltip, MobEffects.MOVEMENT_SPEED, 2, 200F);
		addChanceForEffect(tooltip, 0.50F);
	}
}
