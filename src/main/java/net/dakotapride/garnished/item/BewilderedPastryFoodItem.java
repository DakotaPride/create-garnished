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

public class BewilderedPastryFoodItem extends Item implements IGarnishedUtilities {
	public BewilderedPastryFoodItem(Properties properties) {
		super(properties.food(GarnishedFoodValues.BEWILDERED_PASTRY).stacksTo(16));
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
		addEffectTooltip(tooltip, MobEffects.DOLPHINS_GRACE, 400F);
		addChanceForEffect(tooltip, 0.65F);
	}
}
