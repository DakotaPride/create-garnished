package net.dakotapride.garnished.block.sapling;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.gen.SepiaFungusGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SepiaFungusBlock extends SaplingBlock {
	protected static final VoxelShape SHAPE = Block.box(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
	public SepiaFungusBlock(Properties properties) {
		super(new SepiaFungusGrower(), properties);
	}

	@Override
	public @NotNull VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}

	@Override
	public boolean mayPlaceOn(BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
		return state.is(BlockTags.SOUL_FIRE_BASE_BLOCKS);
	}
}
