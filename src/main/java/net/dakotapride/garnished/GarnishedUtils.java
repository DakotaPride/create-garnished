package net.dakotapride.garnished;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;

public abstract class GarnishedUtils implements LevelReader {
    public enum IDs {
        MYTHIC_UPGRADES("mythicupgrades"),
        DEEPER_AND_DARKER("deeperdarker"),
        ADDITIONAL_ADDITIONS("additionaladditions");

        final String getID;

        IDs(String id) {
            this.getID = id;
        }
    }

    public static String getIDFromEnum(String id) {
        return id;
    }

    public static String mythicUpgradesID = IDs.MYTHIC_UPGRADES.getID;
    public static String deeperAndDarkerID = IDs.DEEPER_AND_DARKER.getID;
    public static String additionalAdditionsID = IDs.ADDITIONAL_ADDITIONS.getID;

    public static String mythicUpgrades() {
        return getIDFromEnum(mythicUpgradesID);
    }

    public static String deeperAndDarker() {
        return getIDFromEnum(deeperAndDarkerID);
    }

    public static String additionalAdditions() {
        return getIDFromEnum(additionalAdditionsID);
    }

	public static DamageSource createType(Level world, ResourceKey<DamageType> key) {
		return new DamageSource(world.registryAccess().registry(Registries.DAMAGE_TYPE).orElseThrow().getHolderOrThrow(key));
	}

	public static DamageSource genericDamageType(Entity entity) {
		return createType(entity.level(), DamageTypes.GENERIC);
	}

}
