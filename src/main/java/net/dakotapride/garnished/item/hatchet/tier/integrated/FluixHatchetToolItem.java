package net.dakotapride.garnished.item.hatchet.tier.integrated;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import net.dakotapride.garnished.GarnishedUtils;
import net.dakotapride.garnished.item.hatchet.IntegratedHatchetToolItem;
import net.dakotapride.garnished.item.hatchet.IntegratedMaterials;
import net.dakotapride.garnished.registry.GarnishedEnchantments;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;

public class FluixHatchetToolItem extends IntegratedHatchetToolItem {
    public FluixHatchetToolItem(Properties properties) {
        super(GarnishedUtils.ae2(), IntegratedMaterials.FLUIX, 4.5F, -2.6F, properties);
    }

    public int getIntrinsicEnchantLevel(ItemStack stack, Enchantment enchantment) {
        return enchantment == GarnishedEnchantments.RAVAGING.get() ? 1 : 0;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.literal("Always has at least §7Ravaging 1"));
        super.appendHoverText(stack, level, components, tooltipFlag);

        // components.add(GuiText.IntrinsicEnchant.text(Enchantments.BLOCK_FORTUNE.getFullname(1)));
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
