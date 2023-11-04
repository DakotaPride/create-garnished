package net.dakotapride.garnished.block.nut;

import net.dakotapride.garnished.registry.GarnishedSetTypes;
import net.minecraft.world.level.block.ButtonBlock;

public class NutButtonBlock extends ButtonBlock {
    public NutButtonBlock(Properties pProperties) {
        super(pProperties, GarnishedSetTypes.NUT, 30, true);
    }
}
