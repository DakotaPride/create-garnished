package net.dakotapride.garnished.registry;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.dakotapride.garnished.CreateGarnished;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.Set;
import java.util.stream.Stream;


public record GarnishedWoodType(String name, BlockSetType setType, SoundType soundType, SoundType hangingSignSoundType, SoundEvent fenceGateClose, SoundEvent fenceGateOpen) {
	private static final Set<WoodType> VALUES = new ObjectArraySet();
	public static final WoodType NUT;
	public static final WoodType SEPIA;

	public GarnishedWoodType(String pName, BlockSetType pSetType) {
		this(pName, pSetType, SoundType.WOOD, SoundType.HANGING_SIGN, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN);
	}

	public GarnishedWoodType(String name, BlockSetType setType, SoundType soundType, SoundType hangingSignSoundType, SoundEvent fenceGateClose, SoundEvent fenceGateOpen) {
		this.name = name;
		this.setType = setType;
		this.soundType = soundType;
		this.hangingSignSoundType = hangingSignSoundType;
		this.fenceGateClose = fenceGateClose;
		this.fenceGateOpen = fenceGateOpen;
	}

	public static WoodType register(WoodType pWoodType) {
		VALUES.add(pWoodType);
		return pWoodType;
	}

	public static Stream<WoodType> values() {
		return VALUES.stream();
	}

	public String name() {
		return this.name;
	}

	public BlockSetType setType() {
		return this.setType;
	}

	public SoundType soundType() {
		return this.soundType;
	}

	public SoundType hangingSignSoundType() {
		return this.hangingSignSoundType;
	}

	public SoundEvent fenceGateClose() {
		return this.fenceGateClose;
	}

	public SoundEvent fenceGateOpen() {
		return this.fenceGateOpen;
	}

	static {
		NUT = register(new WoodType("nut", GarnishedSetTypes.NUT));
		SEPIA = register(new WoodType("sepia", GarnishedSetTypes.SEPIA));
	}
}
