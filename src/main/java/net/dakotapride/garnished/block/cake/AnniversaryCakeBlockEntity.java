package net.dakotapride.garnished.block.cake;

import net.dakotapride.garnished.registry.GarnishedBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class AnniversaryCakeBlockEntity extends BlockEntity {
    public AnniversaryCakeBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(GarnishedBlockEntities.CAKE.get(), pos, state);
    }
}
