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

	public enum MythicUpgradesTiers {
		JADE(IntegratedMaterials.JADE, "jade", ChatFormatting.GREEN),
		TOPAZ(IntegratedMaterials.TOPAZ, "topaz", ChatFormatting.GOLD),
		RUBY(IntegratedMaterials.RUBY, "ruby", ChatFormatting.RED),
		SAPPHIRE(IntegratedMaterials.SAPPHIRE, "sapphire", ChatFormatting.BLUE),
		AQUAMARINE(IntegratedMaterials.AQUAMARINE, "aquamarine", ChatFormatting.AQUA),
		AMETRINE(IntegratedMaterials.AMETRINE, "ametrine", ChatFormatting.LIGHT_PURPLE);

		final Tier tier;
		final String name;
		final ChatFormatting colour;

		MythicUpgradesTiers(Tier tier, String name, ChatFormatting colour) {
			this.tier = tier;
			this.name = name;
			this.colour = colour;
		}

		public Tier tier() {
			return tier;
		}

		public String entry() {
			return name;
		}

		public ChatFormatting getColour() {
			return colour;
		}
	}
}
