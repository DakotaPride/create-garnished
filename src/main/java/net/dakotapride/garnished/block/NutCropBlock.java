package net.dakotapride.garnished.block;

import net.dakotapride.garnished.registry.GarnishedItems;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;

import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Material;

import org.jetbrains.annotations.NotNull;

public class NutCropBlock extends CropBlock {
	public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 3);

	public NutCropBlock(Properties properties) {
		super(FabricBlockSettings.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP));
	}

	@Override
	public boolean mayPlaceOn(BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
		return state.is(Blocks.FARMLAND);
	}

	@Override
	protected @NotNull ItemLike getBaseSeedId() {
		return GarnishedItems.CRACKED_CASHEW.get();
	}

	@Override
	public int getMaxAge() {
		return 3;
	}

	@Override
	public @NotNull IntegerProperty getAgeProperty() {
		return AGE;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(AGE);
	}
}
