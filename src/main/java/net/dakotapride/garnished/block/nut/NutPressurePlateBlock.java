package net.dakotapride.garnished.block.nut;

import net.dakotapride.garnished.registry.GarnishedSetTypes;
import net.minecraft.world.level.block.PressurePlateBlock;

public class NutPressurePlateBlock extends PressurePlateBlock {
    public NutPressurePlateBlock(Properties pProperties) {
        super(Sensitivity.EVERYTHING, pProperties, GarnishedSetTypes.NUT);
    }
}
