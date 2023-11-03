package net.dakotapride.garnished.block.sepia;

import net.dakotapride.garnished.registry.GarnishedSetTypes;
import net.minecraft.world.level.block.PressurePlateBlock;

public class SepiaPressurePlateBlock extends PressurePlateBlock {
    public SepiaPressurePlateBlock(Properties pProperties) {
        super(Sensitivity.EVERYTHING, pProperties, GarnishedSetTypes.SEPIA);
    }
}
