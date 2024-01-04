package net.dakotapride.garnished.gen.feature;

import com.mojang.serialization.Codec;

import net.dakotapride.garnished.block.kelp.DulseKelpBlock;
import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class DulseKelpFeature extends Feature<NoneFeatureConfiguration> {
    public DulseKelpFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }


    public boolean isValidBlock(LevelAccessor world, BlockPos pos) {
        return (world.isEmptyBlock(pos) || world.getBlockState(pos).getFluidState().is(FluidTags.WATER))
                && !(world.getBlockState(pos).getBlock().defaultBlockState().is(Blocks.KELP) || world.getBlockState(pos).getBlock().defaultBlockState().is(GarnishedBlocks.VERMILION_KELP.get())
                || world.getBlockState(pos).getBlock().defaultBlockState().is(GarnishedBlocks.DULSE_KELP.get()))
                && !(world.getBlockState(pos.above()).getBlock().defaultBlockState().is(Blocks.AIR));
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> ctx) {
        int i = 0;
        WorldGenLevel worldgenlevel = ctx.level();
        BlockPos blockpos = ctx.origin();
        RandomSource randomsource = ctx.random();
        int j = worldgenlevel.getHeight(Heightmap.Types.OCEAN_FLOOR, blockpos.getX(), blockpos.getZ());
        BlockPos blockpos1 = new BlockPos(blockpos.getX(), j, blockpos.getZ());
        if (isValidBlock(worldgenlevel, blockpos1)) {
            BlockState blockstate = GarnishedBlocks.DULSE_KELP.get().defaultBlockState();
            BlockState blockstate1 = GarnishedBlocks.DULSE_KELP_PLANT.get().defaultBlockState();
            int k = 1 + randomsource.nextInt(20);

            for(int l = 0; l <= k; ++l) {
                if (worldgenlevel.getBlockState(blockpos1).is(Blocks.WATER) && worldgenlevel.getBlockState(blockpos1.above()).is(Blocks.WATER) && blockstate1.canSurvive(worldgenlevel, blockpos1)) {
                    if (l == k) {
                        worldgenlevel.setBlock(blockpos1, blockstate.setValue(DulseKelpBlock.AGE, Integer.valueOf(randomsource.nextInt(4) + 20)), 2);
                        ++i;
                    } else {
                        worldgenlevel.setBlock(blockpos1, blockstate1, 2);
                    }
                } else if (l > 0) {
                    BlockPos blockpos2 = blockpos1.below();
                    if (blockstate.canSurvive(worldgenlevel, blockpos2) && !worldgenlevel.getBlockState(blockpos2.below()).is(GarnishedBlocks.DULSE_KELP.get())) {
                        worldgenlevel.setBlock(blockpos2, blockstate.setValue(DulseKelpBlock.AGE, Integer.valueOf(randomsource.nextInt(4) + 20)), 2);
                        ++i;
                    }
                    break;
                }

                blockpos1 = blockpos1.above();
            }
        }

        return i > 0;
    }
}
