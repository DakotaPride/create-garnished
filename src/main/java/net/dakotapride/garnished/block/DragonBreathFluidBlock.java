package net.dakotapride.garnished.block;

import net.dakotapride.garnished.registry.GarnishedFluids;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;

public class DragonBreathFluidBlock extends LiquidBlock {
    public DragonBreathFluidBlock(Properties pProperties) {
        super((FlowingFluid) GarnishedFluids.DRAGON_BREATH.get().getFlowing(), pProperties);
    }

    @Override
    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        pEntity.lavaHurt();
    }
}
