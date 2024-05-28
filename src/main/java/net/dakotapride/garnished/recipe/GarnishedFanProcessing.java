package net.dakotapride.garnished.recipe;

import java.util.List;
import java.util.Optional;

import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

import com.simibubi.create.content.kinetics.fan.processing.FanProcessingType;
import com.simibubi.create.content.kinetics.fan.processing.FanProcessingTypeRegistry;
import com.simibubi.create.foundation.recipe.RecipeApplier;
import com.simibubi.create.foundation.utility.Color;

import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.dakotapride.garnished.registry.GarnishedDamageSource;
import net.dakotapride.garnished.registry.GarnishedFluids;
import net.dakotapride.garnished.registry.GarnishedRecipeTypes;
import net.dakotapride.garnished.registry.GarnishedTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;

public class GarnishedFanProcessing {
    public static final FreezingType FREEZING = register("freezing", new FreezingType());
    public static final RedDyeBlowingType RED_DYE_BLOWING = register("red_dye_blowing", new RedDyeBlowingType());
    public static final OrangeDyeBlowingType ORANGE_DYE_BLOWING = register("orange_dye_blowing", new OrangeDyeBlowingType());
    public static final YellowDyeBlowingType YELLOW_DYE_BLOWING = register("yellow_dye_blowing", new YellowDyeBlowingType());
    public static final GreenDyeBlowingType GREEN_DYE_BLOWING = register("green_dye_blowing", new GreenDyeBlowingType());
    public static final BlueDyeBlowingType BLUE_DYE_BLOWING = register("blue_dye_blowing", new BlueDyeBlowingType());
    public static final PurpleDyeBlowingType PURPLE_DYE_BLOWING = register("purple_dye_blowing", new PurpleDyeBlowingType());

    static {
        Object2ReferenceOpenHashMap<String, FanProcessingType> map = new Object2ReferenceOpenHashMap<>();
        map.put("FREEZING", FREEZING);
        map.put("RED_DYE_BLOWING", RED_DYE_BLOWING);
        map.put("ORANGE_DYE_BLOWING", ORANGE_DYE_BLOWING);
        map.put("YELLOW_DYE_BLOWING", YELLOW_DYE_BLOWING);
        map.put("GREEN_DYE_BLOWING", GREEN_DYE_BLOWING);
        map.put("BLUE_DYE_BLOWING", BLUE_DYE_BLOWING);
        map.put("PURPLE_DYE_BLOWING", PURPLE_DYE_BLOWING);
        map.trim();
    }

    private static <T extends FanProcessingType> T register(String id, T type) {
        FanProcessingTypeRegistry.register(CreateGarnished.asResource(id), type);
        return type;
    }

    public static class FreezingType implements FanProcessingType {
        private static final FreezingFanRecipe.FreezingWrapper FREEZING_WRAPPER = new FreezingFanRecipe.FreezingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            if (fluidState.is(GarnishedTags.FAN_FREEZING_PROCESSING_FLUID_TAG)) {
                return true;
            }
            BlockState blockState = level.getBlockState(pos);
            return blockState.is(GarnishedTags.FAN_FREEZING_PROCESSING_TAG);
        }

        @Override
        public int getPriority() {
            return 2000;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            FREEZING_WRAPPER.setItem(0, stack);
            Optional<FreezingFanRecipe> recipe = GarnishedRecipeTypes.FREEZING.find(FREEZING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            FREEZING_WRAPPER.setItem(0, stack);
            Optional<FreezingFanRecipe> recipe = GarnishedRecipeTypes.FREEZING.find(FREEZING_WRAPPER, level);
            return recipe.map(freezingFanRecipe -> RecipeApplier.applyRecipeOn(level, stack, freezingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            Vector3f color = new Color(0xDDE8FF).asVectorF();
            level.addParticle(new DustParticleOptions(color, 1), pos.x + (level.random.nextFloat() - .5f) * .5f,
                    pos.y + .5f, pos.z + (level.random.nextFloat() - .5f) * .5f, 0, 1 / 8f, 0);
            level.addParticle(ParticleTypes.SNOWFLAKE, pos.x + (level.random.nextFloat() - .5f) * .5f, pos.y + .5f,
                    pos.z + (level.random.nextFloat() - .5f) * .5f, 0, 1 / 8f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0xEEEEFF, 0xDDE8FF, random.nextFloat()));
            particleAccess.setAlpha(1f);
            if (random.nextFloat() < 1 / 128f)
                particleAccess.spawnExtraParticle(ParticleTypes.SNOWFLAKE, .125f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.canFreeze()) {
                entity.setTicksFrozen(120);
                entity.hurt(entity.damageSources().source(GarnishedDamageSource.FAN_FREEZING), 2.0F);
            }

            if (entity.isOnFire()) {
                entity.extinguishFire();
            }
        }
    }

    public static class RedDyeBlowingType implements FanProcessingType {
        private static final RedDyeBlowingFanRecipe.RedDyeBlowingWrapper RED_DYE_BLOWING_WRAPPER = new RedDyeBlowingFanRecipe.RedDyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.RED_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.RED_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 2100;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            RED_DYE_BLOWING_WRAPPER.setItem(0, stack);
            Optional<RedDyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.RED_DYE_BLOWING.find(RED_DYE_BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            RED_DYE_BLOWING_WRAPPER.setItem(0, stack);
            Optional<RedDyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.RED_DYE_BLOWING.find(RED_DYE_BLOWING_WRAPPER, level);
            return recipe.map(redDyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(level, stack, redDyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x54010A, 0xA53B32, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.RED_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.extinguishFire();
            }
        }
    }

    public static class OrangeDyeBlowingType implements FanProcessingType {
        private static final OrangeDyeBlowingFanRecipe.OrangeDyeBlowingWrapper ORANGE_DYE_BLOWING_WRAPPER = new OrangeDyeBlowingFanRecipe.OrangeDyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.ORANGE_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.ORANGE_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 2200;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            ORANGE_DYE_BLOWING_WRAPPER.setItem(0, stack);
            Optional<OrangeDyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.ORANGE_DYE_BLOWING.find(ORANGE_DYE_BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            ORANGE_DYE_BLOWING_WRAPPER.setItem(0, stack);
            Optional<OrangeDyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.ORANGE_DYE_BLOWING.find(ORANGE_DYE_BLOWING_WRAPPER, level);
            return recipe.map(orangeDyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(level, stack, orangeDyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x825721, 0xD39149, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.ORANGE_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.extinguishFire();
            }
        }
    }

    public static class YellowDyeBlowingType implements FanProcessingType {
        private static final YellowDyeBlowingFanRecipe.YellowDyeBlowingWrapper YELLOW_DYE_BLOWING_WRAPPER = new YellowDyeBlowingFanRecipe.YellowDyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.YELLOW_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.YELLOW_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 2300;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            YELLOW_DYE_BLOWING_WRAPPER.setItem(0, stack);
            Optional<YellowDyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.YELLOW_DYE_BLOWING.find(YELLOW_DYE_BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            YELLOW_DYE_BLOWING_WRAPPER.setItem(0, stack);
            Optional<YellowDyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.YELLOW_DYE_BLOWING.find(YELLOW_DYE_BLOWING_WRAPPER, level);
            return recipe.map(yellowDyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(level, stack, yellowDyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x827C21, 0xD3B649, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.YELLOW_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.extinguishFire();
            }
        }
    }

    public static class GreenDyeBlowingType implements FanProcessingType {
        private static final GreenDyeBlowingFanRecipe.GreenDyeBlowingWrapper GREEN_DYE_BLOWING_WRAPPER = new GreenDyeBlowingFanRecipe.GreenDyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.GREEN_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.GREEN_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 2400;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            GREEN_DYE_BLOWING_WRAPPER.setItem(0, stack);
            Optional<GreenDyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.GREEN_DYE_BLOWING.find(GREEN_DYE_BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            GREEN_DYE_BLOWING_WRAPPER.setItem(0, stack);
            Optional<GreenDyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.GREEN_DYE_BLOWING.find(GREEN_DYE_BLOWING_WRAPPER, level);
            return recipe.map(greenDyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(level, stack, greenDyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x498221, 0x9ABC49, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.GREEN_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.extinguishFire();
            }
        }
    }

    public static class BlueDyeBlowingType implements FanProcessingType {
        private static final BlueDyeBlowingFanRecipe.BlueDyeBlowingWrapper BLUE_DYE_BLOWING_WRAPPER = new BlueDyeBlowingFanRecipe.BlueDyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.BLUE_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.BLUE_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 2500;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            BLUE_DYE_BLOWING_WRAPPER.setItem(0, stack);
            Optional<BlueDyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.BLUE_DYE_BLOWING.find(BLUE_DYE_BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLUE_DYE_BLOWING_WRAPPER.setItem(0, stack);
            Optional<BlueDyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.BLUE_DYE_BLOWING.find(BLUE_DYE_BLOWING_WRAPPER, level);
            return recipe.map(blueDyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(level, stack, blueDyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x18556D, 0x698F95, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.BLUE_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.extinguishFire();
            }
        }
    }

    public static class PurpleDyeBlowingType implements FanProcessingType {
        private static final PurpleDyeBlowingFanRecipe.PurpleDyeBlowingWrapper PURPLE_DYE_BLOWING_WRAPPER = new PurpleDyeBlowingFanRecipe.PurpleDyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.PURPLE_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.PURPLE_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 2600;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            PURPLE_DYE_BLOWING_WRAPPER.setItem(0, stack);
            Optional<PurpleDyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.PURPLE_DYE_BLOWING.find(PURPLE_DYE_BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            PURPLE_DYE_BLOWING_WRAPPER.setItem(0, stack);
            Optional<PurpleDyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.PURPLE_DYE_BLOWING.find(PURPLE_DYE_BLOWING_WRAPPER, level);
            return recipe.map(purpleDyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(level, stack, purpleDyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x5A2A76, 0xAB649E, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.PURPLE_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.extinguishFire();
            }
        }
    }

    public static void register() {}
}
