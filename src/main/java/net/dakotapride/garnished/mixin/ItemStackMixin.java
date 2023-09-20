package net.dakotapride.garnished.mixin;

import net.dakotapride.garnished.registry.GarnishedEffects;
import net.dakotapride.garnished.registry.GarnishedTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import net.minecraft.world.level.Level;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public class ItemStackMixin {

	@Inject(method = "finishUsingItem", at = @At("HEAD"))
	private void finishUsingItem(Level level, LivingEntity entity, CallbackInfoReturnable<ItemStack> cir) {
		ItemStack activeItem = entity.getUseItem();


		if (entity.hasEffect(GarnishedEffects.AVERSION) && activeItem.is(GarnishedTags.AVERSION_FOODS_TAG)) {

			entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 400, 2));



		}

	}

}
