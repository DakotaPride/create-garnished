package net.dakotapride.garnished.effect;

import io.github.fabricators_of_create.porting_lib.entity.events.living.LivingEntityDamageEvents;
import net.dakotapride.garnished.registry.GarnishedEffects;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.CombatRules;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;

public class SpiritedResistanceMobEffect extends MobEffect {
	public SpiritedResistanceMobEffect() {
		super(MobEffectCategory.BENEFICIAL, 0x7BFAFE);
	}

}
