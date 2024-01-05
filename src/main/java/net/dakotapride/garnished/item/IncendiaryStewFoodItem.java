package net.dakotapride.garnished.item;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.dakotapride.garnished.registry.GarnishedFoods;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class IncendiaryStewFoodItem extends Item implements IGarnishedItem {
	public IncendiaryStewFoodItem(Properties properties) {
		super(properties.food(GarnishedFoods.INDENDCIARY_STEW).stacksTo(1));
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag adv) {
		tooltip.add(new TranslatableComponent("text.garnished.incendiary_stew.desc").withStyle(ChatFormatting.GRAY, ChatFormatting.ITALIC));
	}

	@Override
	public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, Level level, @NotNull LivingEntity entity) {
		if (!level.isClientSide) {
			PrimedTnt primedtnt = new PrimedTnt(level, (double)entity.blockPosition().getX() + 0.5D, (double)entity.blockPosition().getY(), (double)entity.blockPosition().getZ() + 0.5D, entity);
			int i = primedtnt.getFuse();
			primedtnt.setFuse((short)(level.random.nextInt(i / 4) + i / 8));
			level.addFreshEntity(primedtnt);
		}

		if (entity instanceof Player player) {
			player.getCooldowns().addCooldown(stack.getItem(), 30);
		}

		return super.finishUsingItem(stack, level, entity);
	}
}
