package net.dakotapride.garnished.effect;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class MummificationMobEffect extends MobEffect {
    public MummificationMobEffect() {
        super(MobEffectCategory.HARMFUL, 0xB2FF8E);
    }

    @Override
    public void removeAttributeModifiers(LivingEntity entity, AttributeMap pAttributeMap, int amplifier) {
        entity.hurt(DamageSource.MAGIC, (float)(6 << amplifier));
    }
}
