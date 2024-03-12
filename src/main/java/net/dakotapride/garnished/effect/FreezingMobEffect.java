package net.dakotapride.garnished.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

import org.jetbrains.annotations.Nullable;

public class FreezingMobEffect extends MobEffect {
	public FreezingMobEffect() {
		super(MobEffectCategory.HARMFUL, 0xBEF0F0);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(@Nullable Entity pSource, @Nullable Entity pIndirectSource, LivingEntity living, int amplifier, double pHealth) {
		living.setTicksFrozen(400 * (amplifier + 1));
	}
}
