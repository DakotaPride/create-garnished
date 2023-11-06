package net.dakotapride.garnished.mixin;

import net.dakotapride.garnished.GarnishedUtils;
import net.dakotapride.garnished.item.hatchet.IntegratedHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.tier.integrated.mythicupgrades.MythicUpgradesHatchetToolItem;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Mob.class)
public abstract class MobMixin extends LivingEntity {
	public MobMixin(EntityType<? extends LivingEntity> entityType, Level level) {
		super(entityType, level);
	}

	@Inject(method = "doHurtTarget", at = @At(value = "RETURN"))
	public void applySapphirePercentageDamage(Entity target, CallbackInfoReturnable<Boolean> cir) {
		boolean wasAttacked = cir.getReturnValue();
		if (wasAttacked) {
			if (target instanceof LivingEntity entity) {
				this.getItemBySlot(EquipmentSlot.MAINHAND);

				if (this.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof MythicUpgradesHatchetToolItem item &&
						item.getTier().equals(IntegratedHatchetToolItem.MythicUpgradesTiers.SAPPHIRE.tier())) {
					// Allow for similar effects to occur to "percentile damage"
					DamageSource source = GarnishedUtils.genericDamageType(entity);

					entity.hurt(source, 0.05f * entity.getMaxHealth());
				}
			}
		}
	}

}
