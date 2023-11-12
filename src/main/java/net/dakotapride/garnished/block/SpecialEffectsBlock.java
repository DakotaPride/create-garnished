package net.dakotapride.garnished.block;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.dakotapride.garnished.registry.GarnishedTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

@SuppressWarnings("unused")
public class SpecialEffectsBlock {

    public static class Abyssal {
        public static void getParticles(BlockState state, Level level, BlockPos pos, RandomSource random) {
            for(int i = 0; i < 4; ++i) {
                double d0 = (double) pos.getX() + random.nextDouble();
                double d1 = (double) pos.getY() + random.nextDouble();
                double d2 = (double) pos.getZ() + random.nextDouble();
                double d3 = ((double) random.nextFloat() - 0.5D) * 0.5D;
                double d4 = ((double) random.nextFloat() - 0.5D) * 0.5D;
                double d5 = ((double) random.nextFloat() - 0.5D) * 0.5D;
                int j = random.nextInt(2) * 2 - 1;
                if (!level.getBlockState(pos.west()).is(state.getBlock()) && !level.getBlockState(pos.east()).is(state.getBlock())) {
                    d0 = (double) pos.getX() + 0.5D + 0.25D * (double) j;
                    d3 = (random.nextFloat() * 2.0F * (float) j);
                } else {
                    d2 = (double) pos.getZ() + 0.5D + 0.25D * (double) j;
                    d5 = (random.nextFloat() * 2.0F * (float) j);
                }

                level.addParticle(ParticleTypes.ASH, d0, d1, d2, d3, d4, d5);
            }
        }

        public static void getEffects(Level level, BlockPos pos, BlockState state, Entity entity) {
            if (entity instanceof LivingEntity living) {
                living.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 300, 0));
            }

        }
    }

    public static class Carnotite {

        public static void getPlacement(UseOnContext ctx) {
            RandomSource random = RandomSource.create();
            Item item = ctx.getItemInHand().getItem();
            ItemStack stack = item.getDefaultInstance();
            BlockPos pos = ctx.getClickedPos();
            Level level = ctx.getLevel();
            BlockState state = level.getBlockState(pos);
            ParticleOptions options = new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.UNSTABLE_STONE.get().defaultBlockState());

            if (state.is(GarnishedTags.CARNOTITE_BLOCKS)) {
                level.playLocalSound(pos, SoundEvents.STONE_BREAK, SoundSource.BLOCKS, 1.0F, 1.0F, true);
                stack.shrink(1);
                Unstable.getParticles(pos, random, level, state, options);
            }
        }


    }

    public static class Unstable {

        public static void getParticles(BlockPos pos, RandomSource random, Level level, BlockState state, ParticleOptions options) {
            for(int i = 0; i < 4; ++i) {
                double d0 = (double) pos.getX() + random.nextDouble();
                double d1 = (double) pos.getY() + random.nextDouble();
                double d2 = (double) pos.getZ() + random.nextDouble();
                double d3 = ((double) random.nextFloat() - 0.5D) * 0.5D;
                double d4 = ((double) random.nextFloat() - 0.5D) * 0.5D;
                double d5 = ((double) random.nextFloat() - 0.5D) * 0.5D;
                int j = random.nextInt(2) * 2 - 1;
                if (!level.getBlockState(pos.west()).is(state.getBlock()) && !level.getBlockState(pos.east()).is(state.getBlock())) {
                    d0 = (double) pos.getX() + 0.5D + 0.25D * (double) j;
                    d3 = (random.nextFloat() * 2.0F * (float) j);
                } else {
                    d2 = (double) pos.getZ() + 0.5D + 0.25D * (double) j;
                    d5 = (random.nextFloat() * 2.0F * (float) j);
                }

                level.addParticle(options, d0, d1, d2, d3, d4, d5);
            }
        }

        public static void getEffects(Level level, BlockPos pos, BlockState state, Entity entity) {
            RandomSource random = RandomSource.create();

            if (entity instanceof LivingEntity living) {
                living.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 1));
            }

        }
    }
}
