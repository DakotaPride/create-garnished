package net.dakotapride.garnished.mixin;

import net.dakotapride.garnished.registry.GarnishedFoodValues;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.dakotapride.garnished.registry.GarnishedDamageSource;
import net.dakotapride.garnished.registry.GarnishedEffects;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.dakotapride.garnished.registry.GarnishedTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

@Mixin(ItemStack.class)
public class ItemStackMixin {

	@Inject(method = "finishUsingItem", at = @At("HEAD"))
	private void finishUsingItem(Level level, LivingEntity entity, CallbackInfoReturnable<ItemStack> cir) {
		ItemStack activeItem = entity.getUseItem();

		if (entity.hasEffect(GarnishedEffects.AVERSION) && activeItem.is(GarnishedTags.AVERSION_FOODS_TAG)) {
			entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 400, 2));
		}

		if (activeItem.is(GarnishedItems.MULCH.get())) {
			entity.hurt(GarnishedDamageSource.MULCH_MUNCHING, 2.0F);
		}

		if (activeItem.is(GarnishedItems.MUD_PIE.get())) {
			entity.hurt(GarnishedDamageSource.MULCH_MUNCHING, 1.0F);
		}

		// Sugar High functionality
		GarnishedFoodValues.hasSugarHigh = entity.hasEffect(GarnishedEffects.SUGAR_HIGH);
		// Freezing functionality
		GarnishedFoodValues.hasFreezing = entity.hasEffect(GarnishedEffects.FREEZING) || entity.isFreezing();
		// Hunger functionality
		GarnishedFoodValues.hasHunger = entity.hasEffect(MobEffects.HUNGER);
		// Levitation functionality
		GarnishedFoodValues.hasLevitation = entity.hasEffect(MobEffects.LEVITATION);
		// Bad Omen functionality
		GarnishedFoodValues.hasBadOmen = entity.hasEffect(MobEffects.BAD_OMEN);
		// Fire functionality
		GarnishedFoodValues.isOnFire = entity.isOnFire() || !entity.fireImmune();

	}

}
