package net.dakotapride.garnished.item;

import java.util.List;

import net.minecraft.network.chat.TranslatableComponent;

import org.jetbrains.annotations.Nullable;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class FarmersDelightItem extends Item {
    public FarmersDelightItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

        if (!FabricLoader.getInstance().isModLoaded("farmersdelight")) {
            components.add(new TranslatableComponent("text.garnished.integration.farmersdelight.missing").withStyle(ChatFormatting.GRAY));
        }

        super.appendHoverText(stack, level, components, flag);

    }
}
