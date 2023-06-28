package net.dakotapride.garnished.item;

import java.util.List;

import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.world.effect.MobEffect;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class WithMeltedCinderFlourItem extends GarnishedFoodItem {
	public WithMeltedCinderFlourItem(Properties properties) {
		super(properties);
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.melted").withStyle(ChatFormatting.RED));
		if (getEffect() != null) {
			tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect", getEffect().getDisplayName()).withStyle(ChatFormatting.GRAY));
		}
	}

	public MobEffect getEffect() {
		MobEffect effect = null;

		if (this.getDefaultInstance().getItem() == GarnishedItems.SPEED_CINDER_CASHEW.get()) {
			effect = MobEffects.MOVEMENT_SPEED;
		} else if (this.getDefaultInstance().getItem() == GarnishedItems.STRENGTH_CINDER_WALNUT.get()) {
			effect = MobEffects.DAMAGE_BOOST;
		} else if (this.getDefaultInstance().getItem() == GarnishedItems.HASTE_CINDER_ALMOND.get()) {
			effect = MobEffects.DIG_SPEED;
		} else if (this.getDefaultInstance().getItem() == GarnishedItems.RESISTANCE_CINDER_PECAN.get()) {
			effect = MobEffects.DAMAGE_RESISTANCE;
		}

		return effect;
	}

	@Nullable
	@Override
	public FoodProperties getFoodProperties() {
		if (getEffect() != null) {
			return new FoodProperties.Builder().effect(new MobEffectInstance(getEffect(), 240, 1), 1.0F).build();
		} else {
			return new FoodProperties.Builder().saturationMod(0.3F).nutrition(6).build();
		}
	}
}
