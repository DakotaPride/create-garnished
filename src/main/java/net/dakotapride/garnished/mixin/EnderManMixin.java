package net.dakotapride.garnished.mixin;

import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.dakotapride.garnished.registry.GarnishedEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.NeutralMob;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

@Mixin(EnderMan.class)
public abstract class EnderManMixin extends Monster implements NeutralMob {
    public EnderManMixin(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Inject(method = "isLookingAtMe", at = @At("HEAD"), cancellable = true)
    private void hasCognateEffect$isLookingAtMe(Player player, CallbackInfoReturnable<Boolean> cir) {
        if (player.hasEffect(GarnishedEffects.COGNATE)) {
            cir.setReturnValue(false);
        }
    }

    @Override
    public boolean isAngryAt(@NotNull LivingEntity target) {
        return target.hasEffect(GarnishedEffects.FLAGRANT);
    }


    @Inject(method = "registerGoals", at = @At("HEAD"))
    private void hasFlagrantEffect$registerGoals(CallbackInfo ci) {
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, LivingEntity.class, 10, true, false, this::isAngryAt));
    }

}
