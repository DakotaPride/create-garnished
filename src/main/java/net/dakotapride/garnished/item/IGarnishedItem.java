package net.dakotapride.garnished.item;

import java.util.Random;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Style;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;

public interface IGarnishedItem {
	int baseTick = 20;
	int getCinderEffectDuration = baseTick * 90;
	int getCrypticAppleCiderEffectDuration = baseTick * 45;
	int getBitterAppleCiderEffectDuration = baseTick * 40;
	int getCashewFruitEffectDuration = baseTick * 50;
	int getBitterAlmondEffectDuration = baseTick * 25;
	int getWrappedTangleEffectDuration = baseTick * 45;
	int getFermentedCashewMixtureEffectDuration = baseTick * 180;
	int getCognateEffectBaseTick = baseTick * 60;
	int getGalacticCaneEffectTick = baseTick * 10;
	int getSugarHighEffectBaseTick = baseTick * 25;


	default String garnishedText() {
		return "text.garnished.nut.garnished";
	}

	default String ungarnishedText() {
		return "text.garnished.nut.ungarnished";
	}

	default ChatFormatting getStandardColouring() {
		return ChatFormatting.GRAY;
	}

	default String sweetenedText() {
		return "text.garnished.nut.sweetened";
	}

	default ChatFormatting getSweetenedColouring() {
		return ChatFormatting.AQUA;
	}

	default String honeyedText() {
		return "text.garnished.nut.honeyed";
	}

	default Style getHoneyedColouring() {
		return Style.EMPTY.withColor(0xEE890F);
	}

	default String cinderFlourText() {
		return "text.garnished.nut.cinder_flour";
	}

	default String meltedCinderFlourText() {
		return "text.garnished.nut.cinder_flour.melted";
	}

	default ChatFormatting getCinderFlourColouring() {
		return ChatFormatting.RED;
	}

	default String chocolateGlazedText() {
		return "text.garnished.nut.chocolate_glazed";
	}

	default Style getChocolateGlazedColouring() {
		return Style.EMPTY.withColor(0xB1543E);
	}

	default MobEffect getCrypticAppleCiderEffect() {
		int random = new Random().nextInt(2);

		if (random == 1) {
			return MobEffects.DAMAGE_BOOST;
		} else {
			return MobEffects.MOVEMENT_SLOWDOWN;
		}
	}


}
