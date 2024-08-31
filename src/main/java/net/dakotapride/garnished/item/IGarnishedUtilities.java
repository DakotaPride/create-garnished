package net.dakotapride.garnished.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Style;

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


}
