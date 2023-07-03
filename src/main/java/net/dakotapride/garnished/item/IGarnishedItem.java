package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Style;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockBehaviour;

public interface IGarnishedItem {

	default String garnishedText() {
		return "text.garnished.nut.garnished";
	}

	default ChatFormatting getStandardColouring() {
		return ChatFormatting.GRAY;
	}

	default String ungarnishedText() {
		return "text.garnished.nut.ungarnished";
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

}
