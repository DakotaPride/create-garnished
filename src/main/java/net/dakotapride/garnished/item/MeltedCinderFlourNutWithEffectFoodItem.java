package net.dakotapride.garnished.item;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class MeltedCinderFlourNutWithEffectFoodItem extends Item implements IGarnishedItem {
	public MeltedCinderFlourNutWithEffectFoodItem(FoodProperties foodProperties, Properties properties) {
		super(properties.food(foodProperties));
	}

	public static class Peanut extends MeltedCinderFlourNutWithEffectFoodItem {
		public Peanut(Properties properties) {
			super(GarnishedFoods.MELTED_CINDER_FLOUR_PEANUT, properties);
		}
	}
	public static class Walnut extends MeltedCinderFlourNutWithEffectFoodItem {
		public Walnut(Properties properties) {
			super(GarnishedFoods.MELTED_CINDER_FLOUR_WALNUT, properties);
		}
	}
	public static class Chestnut extends MeltedCinderFlourNutWithEffectFoodItem {
		public Chestnut(Properties properties) {
			super(GarnishedFoods.MELTED_CINDER_FLOUR_CHESTNUT, properties);
		}
	}
	public static class Hazelnut extends MeltedCinderFlourNutWithEffectFoodItem {
		public Hazelnut(Properties properties) {
			super(GarnishedFoods.MELTED_CINDER_FLOUR_HAZELNUT, properties);
		}
	}
	public static class Macadamia extends MeltedCinderFlourNutWithEffectFoodItem {
		public Macadamia(Properties properties) {
			super(GarnishedFoods.MELTED_CINDER_FLOUR_MACADAMIA, properties);
		}
	}
	public static class Cashew extends MeltedCinderFlourNutWithEffectFoodItem {
		public Cashew(Properties properties) {
			super(GarnishedFoods.MELTED_CINDER_FLOUR_CASHEW, properties);
		}
	}
	public static class Pistachio extends MeltedCinderFlourNutWithEffectFoodItem {
		public Pistachio(Properties properties) {
			super(GarnishedFoods.MELTED_CINDER_FLOUR_PISTACHIO, properties);
		}
	}
	public static class Almond extends MeltedCinderFlourNutWithEffectFoodItem {
		public Almond(Properties properties) {
			super(GarnishedFoods.MELTED_CINDER_FLOUR_ALMOND, properties);
		}
	}
	public static class Pecan extends MeltedCinderFlourNutWithEffectFoodItem {
		public Pecan(Properties properties) {
			super(GarnishedFoods.MELTED_CINDER_FLOUR_PECAN, properties);
		}
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag isAdvanced) {
		tooltip.add(Component.translatable(meltedCinderFlourText()).withStyle(getCinderFlourColouring()));

		if (!Screen.hasShiftDown()) {
			tooltip.add(Component.literal(""));
			tooltip.add(Component.translatable("text.garnished.hold_shift").withStyle(ChatFormatting.DARK_GRAY));
		} else {
			tooltip.add(Component.literal(""));
			tooltip.add(Component.translatable("text.garnished.holding_shift").withStyle(ChatFormatting.DARK_GRAY));
		}

		if (Screen.hasShiftDown()) {
			tooltip.add(Component.literal(""));
			tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list").withStyle(Style.EMPTY.withColor(0xeeda78)));
			if (stack.is(GarnishedItems.STRENGTH_CINDER_WALNUT.get())) {
				// tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.strength").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.strength.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.RESISTANCE_CINDER_PECAN.get())) {
				// tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.resistance").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.resistance.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.SPEED_CINDER_CASHEW.get())) {
				// tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.speed").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.speed.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.POTENT_SPEED_CINDER_HAZELNUT.get())) {
				// tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.potent_speed").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.potent_speed.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.SLOW_FALLING_CINDER_CHESTNUT.get())) {
				// tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.slow_falling").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.slow_falling.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.NIGHT_VISION_CINDER_PISTACHIO.get())) {
				// tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.night_vision").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.night_vision.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.FIRE_RESISTANCE_CINDER_MACADAMIA.get())) {
				// tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.fire_resistance").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.fire_resistance.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.HASTE_CINDER_ALMOND.get())) {
				// tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.haste").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.haste.desc").withStyle(Style.EMPTY.withColor(0xc7954b)));
			} else if (stack.is(GarnishedItems.EFFECT_CINDER_BUHG.get())) {
				// tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.buhg_effects").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.buhg_effects.desc.1").withStyle(Style.EMPTY.withColor(0xc7954b)));
				tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect_list.buhg_effects.desc.2").withStyle(Style.EMPTY.withColor(0xc7954b)));
			}
		}

		// if (getCinderEffect(stack) != null && !stack.is(GarnishedItems.EFFECT_CINDER_BUHG.get()) && !stack.is(GarnishedItems.POTENT_SPEED_CINDER_HAZELNUT.get())) {
		//			tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect",
		//					getCinderEffect(stack).getDisplayName()).withStyle(getStandardColouring()));
		//		} else if (stack.is(GarnishedItems.EFFECT_CINDER_BUHG.get())) {
		//			tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect.multiple").withStyle(getStandardColouring()));
		//		} else if (stack.is(GarnishedItems.POTENT_SPEED_CINDER_HAZELNUT.get())) {
		//			tooltip.add(Component.translatable("text.garnished.nut.cinder_flour.effect.hazelnut").withStyle(getStandardColouring()));
		//		}
	}
}
