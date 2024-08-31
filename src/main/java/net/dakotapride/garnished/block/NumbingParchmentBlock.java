package net.dakotapride.garnished.block;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.item.IGarnishedUtilities;
import net.dakotapride.garnished.registry.GarnishedEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.PolarBear;
import net.minecraft.world.entity.monster.Stray;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.state.BlockState;

public class NumbingParchmentBlock extends Block implements IGarnishedUtilities {
    public NumbingParchmentBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void stepOn(@NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState state, @NotNull Entity entity) {
        if (entity instanceof LivingEntity living && !(living instanceof Stray || living instanceof PolarBear) && !living.isSteppingCarefully()) {
            if (EnchantmentHelper.hasFrostWalker(living)) {
                living.addEffect(new MobEffectInstance(GarnishedEffects.FREEZING, tick * 12, 0));
                living.setTicksFrozen(tick * 15);
            } else {
                living.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, tick * 6, 1));
            }
        }
    }

    public static class Carpet extends CarpetBlock implements IGarnishedUtilities {
        public Carpet(Properties properties) {
            super(properties);
        }

        @Override
        public void entityInside(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Entity entity) {
            if (entity instanceof LivingEntity living && !(living instanceof Stray || living instanceof PolarBear) && !living.isSteppingCarefully()) {
                if (EnchantmentHelper.hasFrostWalker(living)) {
                    living.addEffect(new MobEffectInstance(GarnishedEffects.FREEZING, tick * 12, 0));
                    living.setTicksFrozen(tick * 15);
                } else {
                    living.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, tick * 6, 1));
                }
            }
        }
    }
}
