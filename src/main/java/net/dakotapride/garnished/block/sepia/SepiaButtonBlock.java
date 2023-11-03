package net.dakotapride.garnished.block.sepia;

import net.dakotapride.garnished.registry.GarnishedSetTypes;
import net.minecraft.world.level.block.ButtonBlock;

public class SepiaButtonBlock extends ButtonBlock {
    public SepiaButtonBlock(Properties pProperties) {
        super(pProperties, GarnishedSetTypes.SEPIA, 30, true);
    }
}
