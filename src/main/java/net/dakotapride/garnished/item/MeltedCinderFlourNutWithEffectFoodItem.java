package net.dakotapride.garnished.item;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class MeltedCinderFlourNutWithEffectFoodItem extends Item implements IGarnishedItem {
	public MeltedCinderFlourNutWithEffectFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.MELTED_CINDER_FLOUR_NUT));
	}

	@Override
	public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity livingEntity) {
		if (!stack.is(GarnishedItems.EFFECT_CINDER_BUHG.get()) && !stack.is(GarnishedItems.POTENT_SPEED_CINDER_HAZELNUT.get())) {
			livingEntity.addEffect(new MobEffectInstance(getCinderEffect(stack), getCinderEffectDuration));
		}

		if (stack.is(GarnishedItems.EFFECT_CINDER_BUHG.get())) {
			livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, getCinderEffectDuration));
			livingEntity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, getCinderEffectDuration));
		}

		if (stack.is(GarnishedItems.POTENT_SPEED_CINDER_HAZELNUT.get())) {
			livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, getCinderEffectDuration, 1));
		}

		return super.finishUsingItem(stack, level, livingEntity);
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		tooltip.add(new TranslatableComponent(meltedCinderFlourText()).withStyle(getCinderFlourColouring()));

		if (!Screen.hasShiftDown()) {
			tooltip.add(new TextComponent(""));
			tooltip.add(new TranslatableComponent("text.garnished.hold_shift").withStyle(ChatFormatting.DARK_GRAY));
		} else {
			tooltip.add(new TextComponent(""));
			tooltip.add(new TranslatableComponent("text.garnished.holding_shift").withStyle(ChatFormatting.DARK_GRAY));
		}

		if (Screen.hasShiftDown()) {
			tooltip.add(new TextComponent(""));
			tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list").withStyle(Style.EMPTY.withColor(0xeeda78)));
			if (stack.is(GarnishedItems.STRENGTH_CINDER_WALNUT.get())) {
				// tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.strength").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.strength.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.RESISTANCE_CINDER_PECAN.get())) {
				// tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.resistance").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.resistance.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.SPEED_CINDER_CASHEW.get())) {
				// tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.speed").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.speed.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.POTENT_SPEED_CINDER_HAZELNUT.get())) {
				// tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.potent_speed").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.potent_speed.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.SLOW_FALLING_CINDER_CHESTNUT.get())) {
				// tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.slow_falling").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.slow_falling.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.NIGHT_VISION_CINDER_PISTACHIO.get())) {
				// tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.night_vision").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.night_vision.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.FIRE_RESISTANCE_CINDER_MACADAMIA.get())) {
				// tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.fire_resistance").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.fire_resistance.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.HASTE_CINDER_ALMOND.get())) {
				// tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.haste").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.haste.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.EFFECT_CINDER_BUHG.get())) {
				// tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.buhg_effects").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.buhg_effects.desc.1").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect_list.buhg_effects.desc.2").withStyle(Style.EMPTY.withColor(0xc7954b)));
			}
		}

		// if (getCinderEffect(stack) != null && !stack.is(GarnishedItems.EFFECT_CINDER_BUHG.get()) && !stack.is(GarnishedItems.POTENT_SPEED_CINDER_HAZELNUT.get())) {
		//			tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect",
		//					getCinderEffect(stack).getDisplayName()).withStyle(getStandardColouring()));
		//		} else if (stack.is(GarnishedItems.EFFECT_CINDER_BUHG.get())) {
		//			tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect.multiple").withStyle(getStandardColouring()));
		//		} else if (stack.is(GarnishedItems.POTENT_SPEED_CINDER_HAZELNUT.get())) {
		//			tooltip.add(new TranslatableComponent("text.garnished.nut.cinder_flour.effect.hazelnut").withStyle(getStandardColouring()));
		//		}
	}
}
