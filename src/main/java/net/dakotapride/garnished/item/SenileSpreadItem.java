package net.dakotapride.garnished.item;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.block.ISenileSpread;
import net.dakotapride.garnished.registry.GarnishedFeatures;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class SenileSpreadItem extends Item {
    public static final int SPREAD_WIDTH = 3;
    public static final int SPREAD_HEIGHT = 1;
    public static final int COUNT_MULTIPLIER = 3;

    public SenileSpreadItem(Properties pProperties) {
        super(pProperties);
    }

    /**
     * Called when this item is used when targeting a Block
     */
    @Override
    public @NotNull InteractionResult useOn(UseOnContext ctx) {
        Level level = ctx.getLevel();
        BlockPos pos = ctx.getClickedPos();
        if (applySpread(ctx.getItemInHand(), level, pos)) {
            if (!level.isClientSide) {
                // getParticles(level, pos, 0);
            }

            getParticles(level, pos, 0);

            return InteractionResult.sidedSuccess(level.isClientSide);
        } else {
            return InteractionResult.PASS;
        }
    }

    public boolean applySpread(ItemStack stack, Level level, BlockPos pos) {
        BlockState blockstate = level.getBlockState(pos);
        if (level.getBlockState(pos.above()).is(Blocks.AIR)) {
            if (blockstate.getBlock().defaultBlockState().is(BlockTags.SOUL_FIRE_BASE_BLOCKS) || blockstate.getBlock().defaultBlockState().is(Blocks.WARPED_NYLIUM) || blockstate.getBlock().defaultBlockState().is(Blocks.CRIMSON_NYLIUM)) {
                if (level instanceof ServerLevel) {
                    if (this.isSuccessful()) {
                        this.performSpread((ServerLevel)level, level.random, pos);
                    }

                    stack.shrink(1);
                }

                return true;
            }
        }

        if (blockstate.getBlock() instanceof ISenileSpread spreadableBlock) {
            if (spreadableBlock.isValidTarget(level, pos, blockstate, level.isClientSide)) {
                if (level instanceof ServerLevel) {
                    if (spreadableBlock.isSuccess(level, level.random, pos, blockstate)) {
                        spreadableBlock.performSpread((ServerLevel)level, level.random, pos, blockstate);
                    }

                    stack.shrink(1);
                }

                return true;
            }
        }

        return false;
    }

    public boolean isSuccessful() {
        return true;
    }

    public void performSpread(ServerLevel level, RandomSource random, BlockPos pos) {
        BlockState blockstate = level.getBlockState(pos);
        BlockPos blockpos = pos.above();
        ChunkGenerator chunkgenerator = level.getChunkSource().getGenerator();
        Registry<ConfiguredFeature<?, ?>> registry = level.registryAccess().registryOrThrow(Registry.CONFIGURED_FEATURE_REGISTRY);
        if (blockstate.is(BlockTags.SOUL_FIRE_BASE_BLOCKS)  || blockstate.is(Blocks.WARPED_NYLIUM) || blockstate.is(Blocks.CRIMSON_NYLIUM)) {
            this.place(blockstate, registry, level, chunkgenerator, random, blockpos);
        }

    }

    private void place(BlockState blockstate, Registry<ConfiguredFeature<?, ?>> registry, ServerLevel level, ChunkGenerator generator, RandomSource random, BlockPos pos) {
        if (blockstate.is(BlockTags.SOUL_FIRE_BASE_BLOCKS)) {
            registry.getHolder(GarnishedFeatures.SOUL_SAND_VEGETATION_SPREAD_CONFIGURED).ifPresent((feature) -> {
                feature.value().place(level, generator, random, pos);
            });
        } else if (blockstate.is(Blocks.WARPED_NYLIUM)) {
            registry.getHolder(GarnishedFeatures.WARPED_VEGETATION_SPREAD_CONFIGURED).ifPresent((feature) -> {
                feature.value().place(level, generator, random, pos);
            });
        } else if (blockstate.is(Blocks.CRIMSON_NYLIUM)) {
            registry.getHolder(GarnishedFeatures.CRIMSON_VEGETATION_SPREAD_CONFIGURED).ifPresent((feature) -> {
                feature.value().place(level, generator, random, pos);
            });
        }
    }

    public static void getParticles(LevelAccessor level, BlockPos pos, int data) {
        if (data == 0) {
            data = 15;
        }

        BlockState blockstate = level.getBlockState(pos);
        if (!blockstate.isAir()) {
            double d0 = 0.5D;
            double d1;
            if (blockstate.isSolidRender(level, pos)) {
                pos = pos.above();
                data *= 3;
                d0 = 3.0D;
                d1 = 1.0D;
            } else {
                d1 = blockstate.getShape(level, pos).max(Direction.Axis.Y);
            }

            if (blockstate.getBlock() instanceof ISenileSpread spreadableBlock) {
                level.addParticle(spreadableBlock.getParticle(), (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, 0.0D, 0.0D, 0.0D);
                RandomSource randomsource = level.getRandom();

                for(int i = 0; i < data; ++i) {
                    double d2 = randomsource.nextGaussian() * 0.02D;
                    double d3 = randomsource.nextGaussian() * 0.02D;
                    double d4 = randomsource.nextGaussian() * 0.02D;
                    double d5 = 0.5D - d0;
                    double d6 = (double)pos.getX() + d5 + randomsource.nextDouble() * d0 * 2.0D;
                    double d7 = (double)pos.getY() + randomsource.nextDouble() * d1;
                    double d8 = (double)pos.getZ() + d5 + randomsource.nextDouble() * d0 * 2.0D;
                    if (!level.getBlockState(new BlockPos(d6, d7, d8).below()).isAir()) {
                        level.addParticle(spreadableBlock.getParticle(), d6, d7, d8, d2, d3, d4);
                    }
                }
            } else {
                level.addParticle(ParticleTypes.SOUL, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, 0.0D, 0.0D, 0.0D);
                RandomSource randomsource = level.getRandom();

                for(int i = 0; i < data; ++i) {
                    double d2 = randomsource.nextGaussian() * 0.02D;
                    double d3 = randomsource.nextGaussian() * 0.02D;
                    double d4 = randomsource.nextGaussian() * 0.02D;
                    double d5 = 0.5D - d0;
                    double d6 = (double)pos.getX() + d5 + randomsource.nextDouble() * d0 * 2.0D;
                    double d7 = (double)pos.getY() + randomsource.nextDouble() * d1;
                    double d8 = (double)pos.getZ() + d5 + randomsource.nextDouble() * d0 * 2.0D;
                    if (!level.getBlockState(new BlockPos(d6, d7, d8).below()).isAir()) {
                        level.addParticle(ParticleTypes.SOUL, d6, d7, d8, d2, d3, d4);
                    }
                }
            }

        }
    }

}
