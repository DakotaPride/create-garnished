package net.dakotapride.garnished.item.hatchet.tier.integrated.head;

import net.dakotapride.garnished.GarnishedUtils;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class IntegratedToolHeadItem extends Item {
	String integratedModID;

	public IntegratedToolHeadItem(Properties properties) {
		super(properties);
		this.integratedModID = GarnishedUtils.betterEnd();
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
		if (!(FabricLoader.getInstance().isModLoaded(integratedModID))) {
			components.add(Component.translatable("text.garnished.integration." + integratedModID + ".missing").withStyle(ChatFormatting.GRAY));
		}
	}
}
