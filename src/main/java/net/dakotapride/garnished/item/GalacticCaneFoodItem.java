package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedEffects;
import net.dakotapride.garnished.registry.GarnishedFoodValues;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GalacticCaneFoodItem extends ConditionalEffectItem implements IGarnishedUtilities {
    public GalacticCaneFoodItem(Properties properties) {
        super(0, 0.35F, properties.stacksTo(16).food(GarnishedFoodValues.GALACTIC_CANE));
    }

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
		addEffectTooltip(tooltip, GarnishedEffects.COGNATE, 2, cane_effect_dur);
	}
}
