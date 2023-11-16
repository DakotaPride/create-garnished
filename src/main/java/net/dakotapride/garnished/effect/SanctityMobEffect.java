package net.dakotapride.garnished.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class SanctityMobEffect extends MobEffect {
	public SanctityMobEffect() {
		super(MobEffectCategory.BENEFICIAL, 0x857599);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity pLivingEntity, AttributeMap pAttributeMap, int pAmplifier) {
		pLivingEntity.setAbsorptionAmount(pLivingEntity.getAbsorptionAmount() - (float)(4 * (pAmplifier + 1)));
		super.removeAttributeModifiers(pLivingEntity, pAttributeMap, pAmplifier);
	}

	@Override
	public void addAttributeModifiers(LivingEntity pLivingEntity, AttributeMap pAttributeMap, int pAmplifier) {
		pLivingEntity.setAbsorptionAmount(pLivingEntity.getAbsorptionAmount() + (float)(4 * (pAmplifier + 1)));
		super.addAttributeModifiers(pLivingEntity, pAttributeMap, pAmplifier);
	}
}
