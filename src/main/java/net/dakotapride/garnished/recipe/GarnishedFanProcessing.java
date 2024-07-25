package net.dakotapride.garnished.recipe;

import java.util.List;
import java.util.Optional;

import org.jetbrains.annotations.Nullable;

import com.mojang.math.Vector3f;
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
    public static final RedDyeBlowingFanProcessingType RED_DYE_BLOWING = register("red_dye_blowing", new RedDyeBlowingFanProcessingType());
    public static final OrangeDyeBlowingFanProcessingType ORANGE_DYE_BLOWING = register("orange_dye_blowing", new OrangeDyeBlowingFanProcessingType());
    public static final YellowDyeBlowingFanProcessingType YELLOW_DYE_BLOWING = register("yellow_dye_blowing", new YellowDyeBlowingFanProcessingType());
    public static final GreenDyeBlowingFanProcessingType GREEN_DYE_BLOWING = register("green_dye_blowing", new GreenDyeBlowingFanProcessingType());
    public static final LimeDyeBlowingFanProcessingType LIME_DYE_BLOWING = register("lime_dye_blowing", new LimeDyeBlowingFanProcessingType());
    public static final BlueDyeBlowingFanProcessingType BLUE_DYE_BLOWING = register("blue_dye_blowing", new BlueDyeBlowingFanProcessingType());
    public static final LightBlueDyeBlowingFanProcessingType LIGHT_BLUE_DYE_BLOWING = register("light_blue_dye_blowing", new LightBlueDyeBlowingFanProcessingType());
    public static final CyanDyeBlowingFanProcessingType CYAN_DYE_BLOWING = register("cyan_dye_blowing", new CyanDyeBlowingFanProcessingType());
    public static final PurpleDyeBlowingFanProcessingType PURPLE_DYE_BLOWING = register("purple_dye_blowing", new PurpleDyeBlowingFanProcessingType());
    public static final MagentaDyeBlowingFanProcessingType MAGENTA_DYE_BLOWING = register("magenta_dye_blowing", new MagentaDyeBlowingFanProcessingType());
    public static final PinkDyeBlowingFanProcessingType PINK_DYE_BLOWING = register("pink_dye_blowing", new PinkDyeBlowingFanProcessingType());
    public static final BlackDyeBlowingFanProcessingType BLACK_DYE_BLOWING = register("black_dye_blowing", new BlackDyeBlowingFanProcessingType());
    public static final GrayDyeBlowingFanProcessingType GRAY_DYE_BLOWING = register("gray_dye_blowing", new GrayDyeBlowingFanProcessingType());
    public static final LightGrayDyeBlowingFanProcessingType LIGHT_GRAY_DYE_BLOWING = register("light_gray_dye_blowing", new LightGrayDyeBlowingFanProcessingType());
    public static final WhiteDyeBlowingFanProcessingType WHITE_DYE_BLOWING = register("white_dye_blowing", new WhiteDyeBlowingFanProcessingType());
    public static final BrownDyeBlowingFanProcessingType BROWN_DYE_BLOWING = register("brown_dye_blowing", new BrownDyeBlowingFanProcessingType());

    static {
        Object2ReferenceOpenHashMap<String, FanProcessingType> map = new Object2ReferenceOpenHashMap<>();
        map.put("FREEZING", FREEZING);
        map.put("RED_DYE_BLOWING", RED_DYE_BLOWING);
        map.put("ORANGE_DYE_BLOWING", ORANGE_DYE_BLOWING);
        map.put("YELLOW_DYE_BLOWING", YELLOW_DYE_BLOWING);
        map.put("GREEN_DYE_BLOWING", GREEN_DYE_BLOWING);
        map.put("LIME_DYE_BLOWING", LIME_DYE_BLOWING);
        map.put("BLUE_DYE_BLOWING", BLUE_DYE_BLOWING);
        map.put("LIGHT_BLUE_DYE_BLOWING", LIGHT_BLUE_DYE_BLOWING);
        map.put("CYAN_DYE_BLOWING", CYAN_DYE_BLOWING);
        map.put("PURPLE_DYE_BLOWING", PURPLE_DYE_BLOWING);
        map.put("MAGENTA_DYE_BLOWING", MAGENTA_DYE_BLOWING);
        map.put("PINK_DYE_BLOWING", PINK_DYE_BLOWING);
        map.put("BLACK_DYE_BLOWING", BLACK_DYE_BLOWING);
        map.put("GRAY_DYE_BLOWING", GRAY_DYE_BLOWING);
        map.put("LIGHT_GRAY_DYE_BLOWING", LIGHT_GRAY_DYE_BLOWING);
        map.put("WHITE_DYE_BLOWING", WHITE_DYE_BLOWING);
        map.put("BROWN_DYE_BLOWING", BROWN_DYE_BLOWING);
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
            return recipe.map(freezingFanRecipe -> RecipeApplier.applyRecipeOn(stack, freezingFanRecipe)).orElse(null);
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
				entity.hurt(GarnishedDamageSource.FAN_FREEZING, 2.0F);
            }

            if (entity.isOnFire()) {
                entity.clearFire();
            }
        }
    }

    public static class RedDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

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
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.RED_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.RED_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x8E1919, 0xBC4343, random.nextFloat()));
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
                entity.clearFire();
            }
        }
    }

    public static class OrangeDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

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
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.ORANGE_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.ORANGE_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0xA5562E, 0xB7793A, random.nextFloat()));
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
                entity.clearFire();
            }
        }
    }

    public static class YellowDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

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
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.YELLOW_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.YELLOW_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0xB28835, 0xCCB751, random.nextFloat()));
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
                entity.clearFire();
            }
        }
    }

    public static class GreenDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

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
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.GREEN_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.GREEN_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x438E29, 0x82BB49, random.nextFloat()));
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
                entity.clearFire();
            }
        }
    }

    public static class LimeDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.LIME_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.LIME_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 2500;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.LIME_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.LIME_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x37C646, 0x72E560, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.LIME_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.clearFire();
            }
        }
    }

    public static class BlueDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.BLUE_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.BLUE_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 2600;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.BLUE_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.BLUE_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x265B7F, 0x4CA0AD, random.nextFloat()));
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
                entity.clearFire();
            }
        }
    }

    public static class LightBlueDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.LIGHT_BLUE_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.LIGHT_BLUE_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 2700;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.LIGHT_BLUE_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.LIGHT_BLUE_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x3C89AE, 0x58CED5, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.LIGHT_BLUE_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.clearFire();
            }
        }
    }

    public static class CyanDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.CYAN_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.CYAN_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 2800;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.CYAN_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.CYAN_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x3E8A7C, 0x67C6A0, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.CYAN_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.clearFire();
            }
        }
    }

    public static class PurpleDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.PURPLE_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.PURPLE_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 2900;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.PURPLE_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.PURPLE_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x572499, 0x8139B2, random.nextFloat()));
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
                entity.clearFire();
            }
        }
    }

    public static class MagentaDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.MAGENTA_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.MAGENTA_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 3000;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.MAGENTA_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.MAGENTA_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0xA12FC6, 0xD346DB, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.MAGENTA_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.clearFire();
            }
        }
    }

    public static class PinkDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.PINK_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.PINK_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 3100;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.PINK_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.PINK_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0xC9508D, 0xE36CBF, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.PINK_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.clearFire();
            }
        }
    }

    public static class BlackDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.BLACK_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.BLACK_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 3200;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.BLACK_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.BLACK_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x06161E, 0x102F33, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.BLACK_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.clearFire();
            }
        }
    }

    public static class GrayDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.GRAY_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.GRAY_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 3300;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.GRAY_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.GRAY_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x2D333D, 0x475156, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.GRAY_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.clearFire();
            }
        }
    }

    public static class LightGrayDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.LIGHT_GRAY_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.LIGHT_GRAY_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 3400;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.LIGHT_GRAY_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.LIGHT_GRAY_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x7587A3, 0x9AB1BC, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.LIGHT_GRAY_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.clearFire();
            }
        }
    }

    public static class WhiteDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.WHITE_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.WHITE_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 3500;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.WHITE_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.WHITE_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0xC0C4E0, 0xE6E9F4, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.WHITE_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.clearFire();
            }
        }
    }

    public static class BrownDyeBlowingFanProcessingType implements FanProcessingType {
        private static final DyeBlowingFanRecipe.DyeBlowingWrapper BLOWING_WRAPPER = new DyeBlowingFanRecipe.DyeBlowingWrapper();

        @Override
        public boolean isValidAt(Level level, BlockPos pos) {
            FluidState fluidState = level.getFluidState(pos);
            return fluidState.is(GarnishedFluids.BROWN_MASTIC_RESIN.get().getSource()) || fluidState.is(GarnishedFluids.BROWN_MASTIC_RESIN.get().getFlowing());
        }

        @Override
        public int getPriority() {
            return 3600;
        }

        @Override
        public boolean canProcess(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.BROWN_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.isPresent();
        }

        @Override
        @Nullable
        public List<ItemStack> process(ItemStack stack, Level level) {
            BLOWING_WRAPPER.setItem(0, stack);
            Optional<DyeBlowingFanRecipe> recipe = GarnishedRecipeTypes.BROWN_DYE_BLOWING.find(BLOWING_WRAPPER, level);
            return recipe.map(dyeBlowingFanRecipe -> RecipeApplier.applyRecipeOn(stack, dyeBlowingFanRecipe)).orElse(null);
        }

        @Override
        public void spawnProcessingParticles(Level level, Vec3 pos) {
            if (level.random.nextInt(8) != 0)
                return;
            level.addParticle(ParticleTypes.ITEM_SLIME, pos.x, pos.y + .25f, pos.z, 0, 1 / 16f, 0);
        }

        @Override
        public void morphAirFlow(AirFlowParticleAccess particleAccess, RandomSource random) {
            particleAccess.setColor(Color.mixColors(0x614332, 0x825B43, random.nextFloat()));
            particleAccess.setAlpha(.5f);
            if (random.nextFloat() < 1 / 16f)
                particleAccess.spawnExtraParticle(new BlockParticleOption(ParticleTypes.BLOCK, GarnishedBlocks.BROWN_MASTIC_BLOCK.get().defaultBlockState()), .25f);
        }

        @Override
        public void affectEntity(Entity entity, Level level) {
            if (level.isClientSide) {
                return;
            }

            if (entity.isOnFire()) {
                entity.clearFire();
            }
        }
    }

    public static void register() {}
}
