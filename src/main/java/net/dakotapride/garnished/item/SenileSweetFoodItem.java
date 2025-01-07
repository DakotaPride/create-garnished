package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SenileSweetFoodItem extends ConditionalEffectItem implements IGarnishedUtilities {
	public SenileSweetFoodItem(Properties properties) {
		super(0, 1.0F, properties.food(GarnishedFoodValues.SENILE_SWEET));
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
		MobEffect effect = MobEffects.BLINDNESS;

		//addEffectTooltip(tooltip, MobEffects.REGENERATION, 5, 700F);
		if (stack.is(GarnishedItems.SENILE_SWEET_BLACKSTONE.get())) {
			effect = MobEffects.BLINDNESS;
		}
		else if (stack.is(GarnishedItems.SENILE_SWEET_BASALT.get())) {
			effect = MobEffects.WEAKNESS;
		}
		else if (stack.is(GarnishedItems.SENILE_SWEET_SCORIA.get())) {
			effect = MobEffects.POISON;
		}
		else if (stack.is(GarnishedItems.SENILE_SWEET_SCORCHIA.get())) {
			effect = MobEffects.MOVEMENT_SLOWDOWN;
		}

		tooltip.add(Component.translatable("text.garnished.senile_sweet.brew_potion", Component.translatable(effect.getDescriptionId())).withStyle(ChatFormatting.GOLD));
	}

}
