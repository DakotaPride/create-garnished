package net.dakotapride.garnished.item;

import java.util.Random;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.registry.GarnishedEffects;
import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Style;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

public interface IGarnishedUtilities {
	int tick = 20;
	int cinder_dur = tick * 90;
	int cr_cider_dur = tick * 45;
	int bit_cider_dur = tick * 40;
	int cashew_dur = tick * 50;
	int almond_dur = tick * 25;
	int tangle_dur = tick * 45;
	int cashew_mix_dur = tick * 180;
	int cognate_dur = tick * 60;
	int cane_effect_dur = tick * 10;
	int sugar_high_dur = tick * 25;


	default String garnishedText() {
		return "text.garnished.nut.garnished";
	}

	default String ungarnishedText() {
		return "text.garnished.nut.ungarnished";
	}

	default ChatFormatting standard() {
		return ChatFormatting.GRAY;
	}

	default String sweetenedText() {
		return "text.garnished.nut.sweetened";
	}

	default ChatFormatting sweetened() {
		return ChatFormatting.AQUA;
	}

	default String honeyedText() {
		return "text.garnished.nut.honeyed";
	}

	default Style honeyed() {
		return Style.EMPTY.withColor(0xEE890F);
	}

	default String cinderFlourText() {
		return "text.garnished.nut.cinder_flour";
	}

	default String meltedCinderFlourText() {
		return "text.garnished.nut.cinder_flour.melted";
	}

	default ChatFormatting cinderFlour() {
		return ChatFormatting.RED;
	}

	default String chocolateGlazedText() {
		return "text.garnished.nut.chocolate_glazed";
	}

	default Style chocolateGlazed() {
		return Style.EMPTY.withColor(0xB1543E);
	}

	default MobEffectInstance triggerConditionalEffect(int value, float chance) {
		float floatChance = new Random().nextFloat(0.0F, 1.0F);

		if (value == 0) {
			if (GarnishedFoodValues.hasSugarHigh && floatChance < chance)
				return new MobEffectInstance(MobEffects.REGENERATION, tick * 12, 1);
		}

		if (value == 1) {
			if (GarnishedFoodValues.hasFreezing && floatChance < chance)
				return new MobEffectInstance(MobEffects.REGENERATION, tick * 12, 1);
		}
		if (value == 2) {
			if (GarnishedFoodValues.hasHunger && floatChance < chance)
				return new MobEffectInstance(GarnishedEffects.THORNS, tick * 24, 1);
		}
		if (value == 3) {
			if (GarnishedFoodValues.hasLevitation && floatChance < chance)
				return new MobEffectInstance(MobEffects.SLOW_FALLING, tick * 24, 1);
		}
		if (value == 4) {
			if (GarnishedFoodValues.hasBadOmen && floatChance < chance)
				return new MobEffectInstance(MobEffects.WEAKNESS, tick * 36, 1);
			else return new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, tick * 36, 1);
		}
		if (value == 5) {
			if (GarnishedFoodValues.isOnFire && floatChance < chance)
				return new MobEffectInstance(MobEffects.FIRE_RESISTANCE, tick * 24, 1);
		}
		if (value == 6) {
			int random = new Random().nextInt(2);

			if (random == 1) {
				return new MobEffectInstance(MobEffects.DAMAGE_BOOST, cr_cider_dur, 2);
			} else {
				return new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, cr_cider_dur, 2);
			}
		}

        //CreateGarnished.LOGGER.info("achieved float value: {}, requested value: {}", floatChance, chance);

		return new MobEffectInstance(MobEffects.REGENERATION, tick * 20, 1, false, false, false);
	}


}
