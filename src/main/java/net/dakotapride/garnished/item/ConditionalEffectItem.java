package net.dakotapride.garnished.item;

import org.jetbrains.annotations.NotNull;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ConditionalEffectItem extends Item implements IGarnishedUtilities {
    int value;
    float chance;

    public ConditionalEffectItem(int value, float chance, Properties pProperties) {
        super(pProperties);
        this.value = value;
        this.chance = chance;
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level world, @NotNull LivingEntity entity) {
        Player playerentity = entity instanceof Player ? (Player) entity : null;
        if (playerentity instanceof ServerPlayer)
            CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) playerentity, stack);

        if (!world.isClientSide)
            entity.addEffect(triggerConditionalEffect(value, chance));

        return super.finishUsingItem(stack, world, entity);
    }

}
