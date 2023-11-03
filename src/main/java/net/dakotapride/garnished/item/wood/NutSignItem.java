package net.dakotapride.garnished.item.wood;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.SignItem;

public class NutSignItem extends SignItem {
    public NutSignItem(Properties pProperties) {
        super(pProperties.stacksTo(16), GarnishedBlocks.NUT_SIGN.get(), GarnishedBlocks.NUT_WALL_SIGN.get());
    }

    public static class Hanging extends HangingSignItem {
        public Hanging(Properties pProperties) {
            super(GarnishedBlocks.NUT_HANGING_SIGN.get(), GarnishedBlocks.NUT_WALL_HANGING_SIGN.get(), pProperties.stacksTo(16));
        }
    }
}
