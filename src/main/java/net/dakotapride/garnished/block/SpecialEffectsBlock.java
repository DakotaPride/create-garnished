package net.dakotapride.garnished.block;

import net.dakotapride.garnished.item.IGarnishedUtilities;
import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

@SuppressWarnings("unused")
public class SpecialEffectsBlock implements IGarnishedUtilities {

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

    public static class Wyvern {

        public static void getParticles(BlockState state, Level level, BlockPos pos, RandomSource random) {
            for(int i = 0; i < 8; ++i) {
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

                level.addParticle(ParticleTypes.ENCHANT, d0, d1, d2, d3, d4, d5);
            }
        }

        public static void getEffects(Level level, BlockPos pos, BlockState state, Entity entity) {
            RandomSource random = RandomSource.create();
            int effect_list = random.nextInt(10);
            int effect_trigger = random.nextInt(6);

            if (entity instanceof LivingEntity living) {

                if (effect_trigger == 1 && effect_list >= 0 && effect_list <= 10) {
                    switch (effect_list) {
                        case 0 -> applyEffectIfNotPresent(living, MobEffects.LUCK);
                        case 1 -> applyEffectIfNotPresent(living, MobEffects.MOVEMENT_SPEED);
                        case 2 -> applyEffectIfNotPresent(living, MobEffects.JUMP);
                        case 3 -> applyEffectIfNotPresent(living, MobEffects.DAMAGE_RESISTANCE);
                        case 4 -> applyEffectIfNotPresent(living, MobEffects.REGENERATION);
                        case 5 -> applyEffectIfNotPresent(living, MobEffects.GLOWING);
                        case 6 -> applyEffectIfNotPresent(living, MobEffects.DAMAGE_BOOST);
                        case 7 -> applyEffectIfNotPresent(living, MobEffects.DIG_SPEED);
                        case 8 -> applyEffectIfNotPresent(living, MobEffects.FIRE_RESISTANCE);
                        case 9 -> applyEffectIfNotPresent(living, MobEffects.NIGHT_VISION);
                        case 10 -> applyEffectIfNotPresent(living, MobEffects.INVISIBILITY);
                        default -> throw new IllegalStateException("Unexpected value: " + effect_list);
                    }
                }

                if (living.getBlockStateOn().is(GarnishedBlocks.DRAGON_STONE.get())) {
                    System.out.println("Value provided from the mathematical equation, random.nextInt(10): " + effect_list);
                    System.out.println("Value provided from the mathematical equation, random.nextInt(6): " + effect_trigger);
                }
            }

        }

        private static void applyEffectIfNotPresent(LivingEntity living, MobEffect effect) {
            if (living.hasEffect(effect)) {
            } else {
                living.addEffect(new MobEffectInstance(effect, tick * 15, 0));
            }
        }
    }
}
