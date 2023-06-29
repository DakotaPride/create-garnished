package net.dakotapride.garnished.item.tab;

import net.dakotapride.garnished.registry.GarnishedBlocks;

import org.jetbrains.annotations.NotNull;

import io.github.fabricators_of_create.porting_lib.util.ItemGroupUtil;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class GarnishedCreativeModeTab extends CreativeModeTab {
	public GarnishedCreativeModeTab() {
		super(ItemGroupUtil.expandArrayAndGetId(), "create.garnished");
	}

	@Override
	public @NotNull ItemStack makeIcon() {
		return GarnishedItems.GARNISHMENT_TEMPLATE.asStack();
	}
}
