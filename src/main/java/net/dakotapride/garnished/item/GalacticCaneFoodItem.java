package net.dakotapride.garnished.item;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.registry.GarnishedEffects;
import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GalacticCaneFoodItem extends Item implements IGarnishedItem {
    public GalacticCaneFoodItem(Properties properties) {
        super(properties.stacksTo(16).food(GarnishedFoods.GALACTIC_CANE));
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity livingEntity) {
        if (livingEntity instanceof ServerPlayer serverPlayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, stack);
            serverPlayer.awardStat(Stats.ITEM_USED.get(this));

            livingEntity.addEffect(new MobEffectInstance(GarnishedEffects.COGNATE, getGalacticCaneEffectTick, 1));
        }

        return super.finishUsingItem(stack, level, livingEntity);
    }
}
