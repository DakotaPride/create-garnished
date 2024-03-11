package net.dakotapride.garnished.item.scratch_paper;

import java.util.function.Consumer;

import org.jetbrains.annotations.NotNull;

import com.simibubi.create.AllSoundEvents;
import com.simibubi.create.foundation.item.CustomUseEffectsItem;
import com.simibubi.create.foundation.mixin.accessor.LivingEntityAccessor;
import com.simibubi.create.foundation.utility.VecHelper;

import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

public class PolarHideScratchPaperItem extends ScratchPaperItem implements CustomUseEffectsItem {
    public PolarHideScratchPaperItem(Properties pProperties) {
        super(MobEffects.MOVEMENT_SLOWDOWN, GarnishedItems.FROST, Items.BLUE_ICE.getDefaultInstance(), pProperties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, Player player, @NotNull InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        InteractionResultHolder<ItemStack> FAIL = new InteractionResultHolder<>(InteractionResult.FAIL, itemstack);

        if (itemstack.getOrCreateTag()
                .contains("ClearsEffect")) {
            player.startUsingItem(hand);
            return new InteractionResultHolder<>(InteractionResult.PASS, itemstack);
        }

        InteractionHand otherHand =
                hand == InteractionHand.MAIN_HAND ? InteractionHand.OFF_HAND : InteractionHand.MAIN_HAND;
        ItemStack itemInOtherHand = player.getItemInHand(otherHand);
        if ((player.hasEffect(effect) || player.isFreezing() || player.getTicksFrozen() > 0) && itemInOtherHand.is(utility.get())) {
            ItemStack item = itemInOtherHand.copy();
            ItemStack toUtilize = item.split(1);
            player.startUsingItem(hand);
            itemstack.getOrCreateTag()
                    .put("ClearsEffect", toUtilize.serializeNBT());
            player.setItemInHand(otherHand, item);
            return new InteractionResultHolder<>(InteractionResult.SUCCESS, itemstack);
        }

        BlockHitResult raytraceresult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.NONE);
        Vec3 hitVec = raytraceresult.getLocation();

        AABB bb = new AABB(hitVec, hitVec).inflate(1f);
        ItemEntity pickUp = null;
        for (ItemEntity itemEntity : level.getEntitiesOfClass(ItemEntity.class, bb)) {
            if (!itemEntity.isAlive())
                continue;
            if (itemEntity.position()
                    .distanceTo(player.position()) > 3)
                continue;
            if (!(player.hasEffect(effect) || player.isFreezing() || player.getTicksFrozen() > 0) && itemInOtherHand.is(utility.get()))
                continue;
            pickUp = itemEntity;
            break;
        }

        if (pickUp == null)
            return FAIL;

        ItemStack item = pickUp.getItem()
                .copy();
        ItemStack toUtilize = item.split(1);

        player.startUsingItem(hand);

        if (!level.isClientSide) {
            itemstack.getOrCreateTag()
                    .put("ClearsEffect", toUtilize.serializeNBT());
            if (item.isEmpty())
                pickUp.discard();
            else
                pickUp.setItem(item);
        }

        return new InteractionResultHolder<>(InteractionResult.SUCCESS, itemstack);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity living) {
        if (!(living instanceof Player player))
            return stack;
        CompoundTag tag = stack.getOrCreateTag();
        if (tag.contains("ClearsEffect")) {

            if (level.isClientSide) {
                spawnParticles(living.getEyePosition(1).add(living.getLookAngle().scale(.5f)), level, particleStack);
                return stack;
            }

            player.removeEffect(effect);
            player.setTicksFrozen(0);
            tag.remove("ClearsEffect");
            stack.hurtAndBreak(1, living, p -> p.broadcastBreakEvent(p.getUsedItemHand()));
        }

        return stack;
    }

    public static void spawnParticles(Vec3 location, Level world, ItemStack particleStack) {
        for (int i = 0; i < 20; i++) {
            Vec3 motion = VecHelper.offsetRandomly(Vec3.ZERO, world.random, 1 / 8f);
            world.addParticle(new ItemParticleOption(ParticleTypes.ITEM, particleStack), location.x, location.y,
                    location.z, motion.x, motion.y, motion.z);
        }
    }

    @Override
    public void releaseUsing(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity living, int timeLeft) {
        if (!(living instanceof Player player))
            return;
        CompoundTag tag = stack.getOrCreateTag();
        if (tag.contains("ClearsEffect")) {
            ItemStack toUtilize = ItemStack.of(tag.getCompound("ClearsEffect"));
            player.getInventory().placeItemBackInInventory(toUtilize);
            tag.remove("ClearsEffect");
        }
    }

    @Override
    public Boolean shouldTriggerUseEffects(ItemStack stack, LivingEntity entity) {
        // Trigger every tick so that we have more fine grain control over the animation
        return true;
    }

    @Override
    public boolean triggerUseEffects(ItemStack stack, LivingEntity entity, int count, RandomSource random) {
        CompoundTag tag = stack.getOrCreateTag();
        if (tag.contains("ClearsEffect")) {
            ItemStack utilityItem = ItemStack.of(tag.getCompound("ClearsEffect"));
            ((LivingEntityAccessor) entity).create$callSpawnItemParticles(utilityItem, 1);
        }

        // After 6 ticks play the sound every 7th
        if ((entity.getTicksUsingItem() - 6) % 7 == 0)
            entity.playSound(entity.getEatingSound(stack), 0.9F + 0.2F * random.nextFloat(),
                    random.nextFloat() * 0.2F + 0.9F);

        return true;
    }

    @Override
    public @NotNull SoundEvent getEatingSound() {
        return AllSoundEvents.SANDING_SHORT.getMainEvent();
    }

    @Override
    public @NotNull UseAnim getUseAnimation(@NotNull ItemStack stack) {
        return UseAnim.EAT;
    }

    @Override
    public int getUseDuration(@NotNull ItemStack stack) {
        return 16;
    }

    @Override
    public int getEnchantmentValue() {
        return 1;
    }
}
