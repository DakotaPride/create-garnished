package net.dakotapride.garnished.block.kelp;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.KelpPlantBlock;

public class DulseKelpPlantBlock extends KelpPlantBlock {
    public DulseKelpPlantBlock(Properties p_54323_) {
        super(p_54323_);
    }

    @Override
    protected @NotNull GrowingPlantHeadBlock getHeadBlock() {
        return GarnishedBlocks.DULSE_KELP.get();
    }
}
