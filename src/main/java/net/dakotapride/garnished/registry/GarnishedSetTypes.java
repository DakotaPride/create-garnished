package net.dakotapride.garnished.registry;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

import java.util.Set;
import java.util.stream.Stream;

public record GarnishedSetTypes() {
	private static final Set<BlockSetType> VALUES = new ObjectArraySet<>();

	public static final BlockSetType SEPIA = register(new BlockSetType("sepia", true,
			SoundType.NETHER_WOOD, SoundEvents.NETHER_WOOD_DOOR_CLOSE, SoundEvents.NETHER_WOOD_DOOR_OPEN,
			SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN, SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF,
			SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_ON, SoundEvents.NETHER_WOOD_BUTTON_CLICK_OFF, SoundEvents.NETHER_WOOD_BUTTON_CLICK_ON));

	public static Stream<BlockSetType> values() {
		return VALUES.stream();
	}

	private static BlockSetType register(BlockSetType value) {
		VALUES.add(value);
		return value;
	}
}
