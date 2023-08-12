package net.dakotapride.garnished.item;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class MeltedCinderFlourNutWithEffectFoodItem extends Item implements IGarnishedItem {
	public MeltedCinderFlourNutWithEffectFoodItem(Properties properties) {
		super(properties.food(new FoodProperties.Builder().saturationMod(GarnishedFoods.MELTED_CINDER_FLOUR_NUT.getSaturationModifier()).nutrition(7).build()));
	}

	@Override
	public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity livingEntity) {

		if (!stack.is(GarnishedItems.EFFECT_CINDER_BUHG.get())) {
			livingEntity.addEffect(new MobEffectInstance(getCinderEffect(stack), getCinderEffectDuration));
		} else {
			livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, getCinderEffectDuration));
			livingEntity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, getCinderEffectDuration));
		}

		return super.finishUsingItem(stack, level, livingEntity);
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		tooltip.add(Component.translatable(meltedCinderFlourText()).withStyle(getCinderFlourColouring()));
		if (getCinderEffect(stack) != null && !stack.is(GarnishedItems.EFFECT_CINDER_BUHG.get())) {
			tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect",
					getCinderEffect(stack).getDisplayName()).withStyle(getStandardColouring()));
		} else if (stack.is(GarnishedItems.EFFECT_CINDER_BUHG.get())) {
			tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect.multiple").withStyle(getStandardColouring()));
		}
	}
}
