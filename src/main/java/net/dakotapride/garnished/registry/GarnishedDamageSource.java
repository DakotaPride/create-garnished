package net.dakotapride.garnished.registry;

import net.minecraft.world.damagesource.DamageSource;

public class GarnishedDamageSource extends DamageSource {
	protected GarnishedDamageSource(String messageId) {
		super(messageId);
	}

	public static final GarnishedDamageSource MULCH_MUNCHING = (new GarnishedDamageSource("garnished.mulch_munching"));
	public static final GarnishedDamageSource FAN_FREEZING = (new GarnishedDamageSource("garnished.fan_freezing"));

}
