package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.NotNull;

public class CrypticAppleCiderFoodItem extends Item implements IGarnishedItem {
	public CrypticAppleCiderFoodItem(Properties properties) {
		super(properties.stacksTo(8).food(GarnishedFoods.APPLE_CIDER));
	}

	@Override
	public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity livingEntity) {

		livingEntity.addEffect(new MobEffectInstance(getCrypticAppleCiderEffect(), getCrypticAppleCiderEffectDuration, 2));

		return super.finishUsingItem(stack, level, livingEntity);
	}
}
