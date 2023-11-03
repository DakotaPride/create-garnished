package net.dakotapride.garnished.item.wood;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.SignItem;

public class SepiaSignItem extends SignItem {
    public SepiaSignItem(Properties pProperties) {
        super(pProperties.stacksTo(16), GarnishedBlocks.SEPIA_SIGN.get(), GarnishedBlocks.SEPIA_WALL_SIGN.get());
    }

    public static class Hanging extends HangingSignItem {
        public Hanging(Properties pProperties) {
            super(GarnishedBlocks.SEPIA_HANGING_SIGN.get(), GarnishedBlocks.SEPIA_WALL_HANGING_SIGN.get(), pProperties.stacksTo(16));
        }
    }
}
