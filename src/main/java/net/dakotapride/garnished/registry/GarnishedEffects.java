package net.dakotapride.garnished.registry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.effect.AversionMobEffect;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;

public class GarnishedEffects {

	public static MobEffect AVERSION = effect("aversion", new AversionMobEffect()
			.addAttributeModifier(Attributes.MOVEMENT_SPEED, "8280b3f7-933d-426e-8398-a171d2339dc6",
					-0.25, AttributeModifier.Operation.MULTIPLY_TOTAL)
			.addAttributeModifier(Attributes.ATTACK_DAMAGE, "9f2c068e-013e-4413-8df6-6a08f19cdcc2",
					-0.15, AttributeModifier.Operation.MULTIPLY_TOTAL));

	public static Potion AVERSION_POTION = potion("aversion", new Potion(
			new MobEffectInstance(AVERSION, 2400)));
	public static Potion LONG_AVERSION_POTION = potion("long_aversion", new Potion("aversion",
			new MobEffectInstance(AVERSION, 3600)));


	private static MobEffect effect(String key, MobEffect effect) {
		return Registry.register(Registry.MOB_EFFECT, new ResourceLocation(CreateGarnished.ID, key), effect);
	}

	private static Potion potion(String key, Potion potion) {
		return Registry.register(Registry.POTION, new ResourceLocation(CreateGarnished.ID, key), potion);
	}

	public static void setRegister() {

	}

}
