package net.dakotapride.garnished.registry;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.Set;
import java.util.stream.Stream;

public record GarnishedWoodTypes() {
	private static final Set<WoodType> VALUES = new ObjectArraySet<>();

	public static final WoodType SEPIA = register(new WoodType(CreateGarnished.ID + ":sepia", GarnishedSetTypes.SEPIA));

	public static final WoodType NUT = register(new WoodType(CreateGarnished.ID + ":nut", GarnishedSetTypes.NUT));

	public static Stream<WoodType> values() {
		return VALUES.stream();
	}

	private static WoodType register(WoodType value) {
		VALUES.add(value);
		return value;
	}
}
