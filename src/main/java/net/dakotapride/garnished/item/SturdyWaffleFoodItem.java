package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SturdyWaffleFoodItem extends Item implements IGarnishedUtilities {
    public SturdyWaffleFoodItem(Properties properties) {
        super(properties.stacksTo(16).food(GarnishedFoodValues.STURDY_WAFFLE));
    }

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
		addEffectTooltip(tooltip, MobEffects.DAMAGE_RESISTANCE, 400F);
		addChanceForEffect(tooltip, 0.75F);
	}
}
