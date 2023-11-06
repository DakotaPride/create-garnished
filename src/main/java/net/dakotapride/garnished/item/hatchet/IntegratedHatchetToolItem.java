package net.dakotapride.garnished.item.hatchet;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class IntegratedHatchetToolItem extends HatchetToolItem {
    String integratedModID;

    public IntegratedHatchetToolItem(String integratedModID, Tier tier, float damage, float speed, Properties properties) {
        super(tier, damage, speed, properties);
        this.integratedModID = integratedModID;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        if (!(FabricLoader.getInstance().isModLoaded(integratedModID))) {
            components.add(Component.translatable("text.garnished.integration." + integratedModID + ".missing").withStyle(ChatFormatting.GRAY));
        }
    }
}
