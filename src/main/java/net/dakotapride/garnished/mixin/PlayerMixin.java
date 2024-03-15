package net.dakotapride.garnished.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.dakotapride.garnished.item.hatchet.HatchetToolItem;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

@Mixin({Player.class})
public abstract class PlayerMixin extends LivingEntity {
	protected PlayerMixin(EntityType<? extends LivingEntity> entityType, Level world) {
		super(entityType, world);
	}

	@Inject(method = "killed", at = {@At("TAIL")})
	private void killedEntity(ServerLevel level, LivingEntity entity, CallbackInfo cir) {
		ItemStack main = this.getMainHandItem();
		Item var6 = main.getItem();
		if (var6 instanceof HatchetToolItem item) {
			item.dropsUponDeath(this, entity);
		}

	}
}
