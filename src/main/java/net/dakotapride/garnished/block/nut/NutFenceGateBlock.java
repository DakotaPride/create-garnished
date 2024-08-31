package net.dakotapride.garnished.block.nut;

import net.dakotapride.garnished.registry.GarnishedWoodType;
import net.minecraft.world.level.block.FenceGateBlock;

public class NutFenceGateBlock extends FenceGateBlock {
    public NutFenceGateBlock(Properties pProperties) {
        super(pProperties, GarnishedWoodType.NUT);
    }
}
