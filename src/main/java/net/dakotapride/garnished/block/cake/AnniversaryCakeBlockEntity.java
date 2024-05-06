package net.dakotapride.garnished.block.cake;

import java.util.List;

import com.simibubi.create.foundation.blockEntity.SmartBlockEntity;
import com.simibubi.create.foundation.blockEntity.behaviour.BlockEntityBehaviour;

import net.dakotapride.garnished.registry.GarnishedBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class AnniversaryCakeBlockEntity extends SmartBlockEntity {
    public AnniversaryCakeBlockEntity(BlockEntityType<?> type, BlockPos pWorldPosition, BlockState pBlockState) {
        super(type, pWorldPosition, pBlockState);
    }

	@Override
	public void addBehaviours(List<BlockEntityBehaviour> behaviours) {
		// Implemented from parent class
	}
}
