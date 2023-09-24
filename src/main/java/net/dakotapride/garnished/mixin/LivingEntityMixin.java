package net.dakotapride.garnished.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.dakotapride.garnished.registry.GarnishedEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.level.Level;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {
	@Unique
	LivingEntity entity = (LivingEntity) (Object) this;

	public LivingEntityMixin(EntityType<?> entityType, Level level) {
		super(entityType, level);
	}

	@Inject(method = "tickEffects", at = @At("HEAD"))
	private void spiritedResistanceImmunity$tickEffects(CallbackInfo ci) {
		if (entity.hasEffect(GarnishedEffects.SPIRITED_RESISTANCE)) {
			if (entity.hasEffect(MobEffects.WITHER))
				entity.removeEffect(MobEffects.WITHER);
			if (entity.hasEffect(MobEffects.CONFUSION))
				entity.removeEffect(MobEffects.CONFUSION);
			if (entity.hasEffect(MobEffects.BLINDNESS))
				entity.removeEffect(MobEffects.BLINDNESS);
		}
	}

	@Inject(method = "getDamageAfterMagicAbsorb", at = @At("HEAD"))
	private void d(DamageSource source, float amount, CallbackInfoReturnable<Float> cir) {
		LivingEntity attacker = (LivingEntity) source.getEntity();

		boolean isSkeleton = attacker instanceof Skeleton;
		boolean isWitherSkeleton = attacker instanceof WitherSkeleton;
		boolean isWither = attacker instanceof WitherBoss;
		boolean isGhast = attacker instanceof Ghast;

		if(entity.hasEffect(GarnishedEffects.SPIRITED_RESISTANCE)) {
			if (isSkeleton || isWitherSkeleton || isWither || isGhast) {
				attacker.hurt(source, amount * 1.336745F);
			}
		}
	}

}
