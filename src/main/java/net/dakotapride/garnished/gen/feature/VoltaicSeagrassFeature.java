package net.dakotapride.garnished.gen.feature;

import com.mojang.serialization.Codec;
import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;

public class VoltaicSeagrassFeature extends Feature<ProbabilityFeatureConfiguration> {
    public VoltaicSeagrassFeature(Codec<ProbabilityFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<ProbabilityFeatureConfiguration> ctx) {
        boolean flag = false;
        RandomSource randomsource = ctx.random();
        WorldGenLevel worldgenlevel = ctx.level();
        BlockPos blockpos = ctx.origin();
        int i = randomsource.nextInt(16) - randomsource.nextInt(4);
        int j = randomsource.nextInt(16) - randomsource.nextInt(4);
        int k = worldgenlevel.getHeight(Heightmap.Types.OCEAN_FLOOR, blockpos.getX() + i, blockpos.getZ() + j);
        BlockPos blockpos1 = new BlockPos(blockpos.getX() + i, k, blockpos.getZ() + j);
        if (worldgenlevel.getBlockState(blockpos1).is(Blocks.WATER)) {
            BlockState blockstate = GarnishedBlocks.VOLTAIC_SEA_GRASS.get().defaultBlockState();
            if (blockstate.canSurvive(worldgenlevel, blockpos1)) {
                worldgenlevel.setBlock(blockpos1, blockstate, 2);

                flag = true;
            }
        }

        return flag;
    }
}
