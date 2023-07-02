package net.dakotapride.garnished.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class GarnishedFoods {
	// Ungarnished
	public static final FoodProperties UNGARNISHED_NUT = new FoodProperties.Builder().nutrition(3).saturationMod(0.2F)
			.effect(new MobEffectInstance(MobEffects.CONFUSION, 240), 1.0F).build();

	// Garnished
	public static final FoodProperties GARNISHED_NUT = new FoodProperties.Builder().nutrition(6).saturationMod(0.4F).build();
	public static final FoodProperties GARNISHED_NUT_MIX = new FoodProperties.Builder().nutrition(9).saturationMod(0.6F).build();
	public static final FoodProperties GARNISHED_BERRIES = new FoodProperties.Builder().nutrition(6).saturationMod(0.4F).build();

	// Cinder Flour (Melted)
	public static final FoodProperties MELTED_CINDER_FLOUR_NUT = new FoodProperties.Builder().nutrition(7).saturationMod(0.5F).build();

	// Sweetened
	public static final FoodProperties SWEETENED_NUT = new FoodProperties.Builder().nutrition(7).saturationMod(0.5F).build();
	public static final FoodProperties SWEETENED_NUT_MIX = new FoodProperties.Builder().nutrition(10).saturationMod(0.6F).build();

	// Honeyed
	public static final FoodProperties HONEYED_NUT = new FoodProperties.Builder().nutrition(8).saturationMod(0.5F).build();
	public static final FoodProperties HONEYED_NUT_MIX = new FoodProperties.Builder().nutrition(12).saturationMod(0.7F).build();
	public static final FoodProperties HONEYED_BERRIES = new FoodProperties.Builder().nutrition(8).saturationMod(0.6F).build();

}
