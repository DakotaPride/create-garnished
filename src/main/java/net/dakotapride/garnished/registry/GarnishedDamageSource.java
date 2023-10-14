package net.dakotapride.garnished.registry;

import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.damagesource.DamageType;

public class GarnishedDamageSource extends DamageSources{

    public static DamageSource MULCH_MUNCHING = null;
	ResourceKey<DamageType> MULCH_MUNCHING_TYPE = ResourceKey.create(Registries.DAMAGE_TYPE,
			new ResourceLocation(CreateGarnished.ID, "mulch_munching"));

	public GarnishedDamageSource(RegistryAccess registry) {
		super(registry);
		MULCH_MUNCHING = create(MULCH_MUNCHING_TYPE);
	}


	public final DamageSource create(ResourceKey<DamageType> key) {
		return new DamageSource(damageTypes.getHolderOrThrow(key));
	}
}
