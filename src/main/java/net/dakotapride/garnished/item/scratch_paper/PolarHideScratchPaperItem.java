package net.dakotapride.garnished.item.scratch_paper;

import javax.annotation.ParametersAreNonnullByDefault;

import com.simibubi.create.AllSoundEvents;
import com.simibubi.create.foundation.item.CustomUseEffectsItem;
import com.simibubi.create.foundation.mixin.accessor.LivingEntityAccessor;
import com.simibubi.create.foundation.utility.VecHelper;

import io.github.fabricators_of_create.porting_lib.util.NBTSerializer;
import net.dakotapride.garnished.registry.GarnishedEffects;
import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class PolarHideScratchPaperItem extends Item implements CustomUseEffectsItem {

    public PolarHideScratchPaperItem(Properties properties) {
        super(properties.defaultDurability(16));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
        ItemStack itemstack = playerIn.getItemInHand(handIn);
        InteractionResultHolder<ItemStack> FAIL = new InteractionResultHolder<>(InteractionResult.FAIL, itemstack);

        if (itemstack.getOrCreateTag()
                .contains("ClearsEffect")) {
            playerIn.startUsingItem(handIn);
            return new InteractionResultHolder<>(InteractionResult.PASS, itemstack);
        }

        InteractionHand otherHand =
                handIn == InteractionHand.MAIN_HAND ? InteractionHand.OFF_HAND : InteractionHand.MAIN_HAND;
        ItemStack itemInOtherHand = playerIn.getItemInHand(otherHand);
        if ((playerIn.hasEffect(GarnishedEffects.FREEZING) || playerIn.isFreezing() || playerIn.getTicksFrozen() > 0) && itemInOtherHand.is(GarnishedItems.FROST.get())) {
            ItemStack item = itemInOtherHand.copy();
            ItemStack toUtilize = item.split(1);
            playerIn.startUsingItem(handIn);
            itemstack.getOrCreateTag()
                    .put("ClearsEffect", NBTSerializer.serializeNBT(toUtilize));
            playerIn.setItemInHand(otherHand, item);
            return new InteractionResultHolder<>(InteractionResult.SUCCESS, itemstack);
        }

        return FAIL;

    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity living) {
        if (!(living instanceof Player player))
            return stack;
        CompoundTag tag = stack.getOrCreateTag();
        if (tag.contains("ClearsEffect")) {

            if (worldIn.isClientSide) {
                spawnParticles(living.getEyePosition(1).add(living.getLookAngle().scale(.5f)), Items.BLUE_ICE.getDefaultInstance(), worldIn);
                return stack;
            }

            player.removeEffect(GarnishedEffects.FREEZING);
            player.setTicksFrozen(0);
            tag.remove("ClearsEffect");
            stack.hurtAndBreak(1, living, p -> p.broadcastBreakEvent(p.getUsedItemHand()));
        }

        return stack;
    }

    public static void spawnParticles(Vec3 location, ItemStack particleStack, Level world) {
        for (int i = 0; i < 20; i++) {
            Vec3 motion = VecHelper.offsetRandomly(Vec3.ZERO, world.random, 1 / 8f);
            world.addParticle(new ItemParticleOption(ParticleTypes.ITEM, particleStack), location.x, location.y,
                    location.z, motion.x, motion.y, motion.z);
        }
    }

    @Override
    public void releaseUsing(ItemStack stack, Level worldIn, LivingEntity entityLiving, int timeLeft) {
        if (!(entityLiving instanceof Player))
            return;
        Player player = (Player) entityLiving;
        CompoundTag tag = stack.getOrCreateTag();
        if (tag.contains("ClearsEffect")) {
            ItemStack toUtilize = ItemStack.of(tag.getCompound("ClearsEffect"));
            player.getInventory()
                    .placeItemBackInInventory(toUtilize);
            tag.remove("ClearsEffect");
        }
    }

//	@Override
//	public boolean canPerformAction(ItemStack stack, ToolAction toolAction) {
//		return toolAction == ToolActions.AXE_SCRAPE || toolAction == ToolActions.AXE_WAX_OFF;
//	}

    @Override
    public Boolean shouldTriggerUseEffects(ItemStack stack, LivingEntity entity) {
        // Trigger every tick so that we have more fine grain control over the animation
        return true;
    }

    @Override
    public boolean triggerUseEffects(ItemStack stack, LivingEntity entity, int count, RandomSource random) {
        CompoundTag tag = stack.getOrCreateTag();
        if (tag.contains("ClearsEffect")) {
            ItemStack clearingEffect = ItemStack.of(tag.getCompound("ClearsEffect"));
            ((LivingEntityAccessor) entity).create$callSpawnItemParticles(clearingEffect, 1);
        }

        // After 6 ticks play the sound every 7th
        if ((entity.getTicksUsingItem() - 6) % 7 == 0)
            entity.playSound(entity.getEatingSound(stack), 0.9F + 0.2F * random.nextFloat(),
                    random.nextFloat() * 0.2F + 0.9F);

        return true;
    }

    @Override
    public SoundEvent getEatingSound() {
        return AllSoundEvents.SANDING_SHORT.getMainEvent();
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.EAT;
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 16;
    }

    @Override
    public int getEnchantmentValue() {
        return 1;
    }

}

