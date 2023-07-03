package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MeltedCinderFlourNutFoodItem extends Item implements IGarnishedItem {
	public MeltedCinderFlourNutFoodItem(Properties properties) {
		super(properties);
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		tooltip.add(Component.translatable(meltedCinderFlourText()).withStyle(getCinderFlourColouring()));
		if (getEffect() != null) {
			tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect",
					getEffect().getDisplayName()).withStyle(getStandardColouring()));
		}
	}

	public MobEffect getEffect() {
		MobEffect effect = null;
		Item item = this.getDefaultInstance().getItem();

		if (item == GarnishedItems.SPEED_CINDER_CASHEW.get()) {
			effect = MobEffects.MOVEMENT_SPEED;
		} else if (item == GarnishedItems.STRENGTH_CINDER_WALNUT.get()) {
			effect = MobEffects.DAMAGE_BOOST;
		} else if (item == GarnishedItems.HASTE_CINDER_ALMOND.get()) {
			effect = MobEffects.DIG_SPEED;
		} else if (item == GarnishedItems.RESISTANCE_CINDER_PECAN.get()) {
			effect = MobEffects.DAMAGE_RESISTANCE;
		} else if (item == GarnishedItems.NIGHT_VISION_CINDER_PISTACHIO.get()) {
			effect = MobEffects.NIGHT_VISION;
		} else if (item == GarnishedItems.FIRE_RESISTANCE_CINDER_MACADAMIA.get()) {
			effect = MobEffects.FIRE_RESISTANCE;
		}

		return effect;
	}

	@Nullable
	@Override
	public FoodProperties getFoodProperties() {
		return new FoodProperties.Builder().saturationMod(GarnishedFoods.MELTED_CINDER_FLOUR_NUT.getSaturationModifier())
				.nutrition(GarnishedFoods.MELTED_CINDER_FLOUR_NUT.getNutrition()).effect(new MobEffectInstance(getEffect()), 1.0F).build();
	}
}
