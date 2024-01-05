package net.dakotapride.garnished.gen.feature;

import java.util.Random;

import com.mojang.serialization.Codec;

import net.dakotapride.garnished.block.kelp.VermilionKelpBlock;
import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class VermilionKelpFeature extends Feature<NoneFeatureConfiguration> {
    public VermilionKelpFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> ctx) {
        int i = 0;
        WorldGenLevel worldgenlevel = ctx.level();
        BlockPos blockpos = ctx.origin();
        Random randomsource = ctx.random();
        int j = worldgenlevel.getHeight(Heightmap.Types.OCEAN_FLOOR, blockpos.getX(), blockpos.getZ());
        BlockPos blockpos1 = new BlockPos(blockpos.getX(), j, blockpos.getZ());
        if (worldgenlevel.getBlockState(blockpos1).is(Blocks.WATER)) {
            BlockState blockstate = GarnishedBlocks.VERMILION_KELP.get().defaultBlockState();
            BlockState blockstate1 = GarnishedBlocks.VERMILION_KELP_PLANT.get().defaultBlockState();
            int k = 1 + randomsource.nextInt(20);

            for(int l = 0; l <= k; ++l) {
                if (worldgenlevel.getBlockState(blockpos1).is(Blocks.WATER) && worldgenlevel.getBlockState(blockpos1.above()).is(Blocks.WATER) && blockstate1.canSurvive(worldgenlevel, blockpos1)) {
                    if (l == k) {
                        worldgenlevel.setBlock(blockpos1, blockstate.setValue(VermilionKelpBlock.AGE, Integer.valueOf(randomsource.nextInt(4) + 20)), 2);
                        ++i;
                    } else {
                        worldgenlevel.setBlock(blockpos1, blockstate1, 2);
                    }
                } else if (l > 0) {
                    BlockPos blockpos2 = blockpos1.below();
                    if (blockstate.canSurvive(worldgenlevel, blockpos2) && !worldgenlevel.getBlockState(blockpos2.below()).is(GarnishedBlocks.VERMILION_KELP.get())) {
                        worldgenlevel.setBlock(blockpos2, blockstate.setValue(VermilionKelpBlock.AGE, Integer.valueOf(randomsource.nextInt(4) + 20)), 2);
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
