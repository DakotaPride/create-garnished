package net.dakotapride.garnished.registry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.effect.AversionMobEffect;
import net.dakotapride.garnished.effect.CognateMobEffect;
import net.dakotapride.garnished.effect.FlagrantMobEffect;
import net.dakotapride.garnished.effect.SpiritedResistanceMobEffect;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.alchemy.Potion;

public class GarnishedEffects {

	public static MobEffect AVERSION = effect("aversion", new AversionMobEffect()
			.addAttributeModifier(Attributes.MOVEMENT_SPEED, "8280b3f7-933d-426e-8398-a171d2339dc6",
					-0.25, AttributeModifier.Operation.MULTIPLY_TOTAL)
			.addAttributeModifier(Attributes.ATTACK_DAMAGE, "9f2c068e-013e-4413-8df6-6a08f19cdcc2",
					-0.15, AttributeModifier.Operation.MULTIPLY_TOTAL));

	public static MobEffect SPIRITED_RESISTANCE = effect("spirited_resistance", new SpiritedResistanceMobEffect());

	public static MobEffect COGNATE = effect("cognate", new CognateMobEffect());
	public static MobEffect FLAGRANT = effect("flagrant", new FlagrantMobEffect());

	public static Potion AVERSION_POTION = potion("aversion", new Potion(
			new MobEffectInstance(AVERSION, 2400)));
	public static Potion LONG_AVERSION_POTION = potion("long_aversion", new Potion("aversion",
			new MobEffectInstance(AVERSION, 3600)));

	public static final Potion FLAGRANT_POTION = potion("flagrant",
			new Potion(new MobEffectInstance(FLAGRANT, 2400)));

	public static final Potion BLINDNESS_POTION = vanillaPotion("blindness",
			new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 2400)));


	private static MobEffect effect(String key, MobEffect effect) {
		return Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(CreateGarnished.ID, key), effect);
	}

	private static Potion potion(String key, Potion potion) {
		return Registry.register(BuiltInRegistries.POTION, new ResourceLocation(CreateGarnished.ID, key), potion);
	}

	private static Potion vanillaPotion(String key, Potion potion) {
		return Registry.register(BuiltInRegistries.POTION, new ResourceLocation(key), potion);
	}

	public static void setRegister() {}

}
