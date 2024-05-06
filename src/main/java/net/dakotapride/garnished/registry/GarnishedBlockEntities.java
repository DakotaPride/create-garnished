package net.dakotapride.garnished.registry;

import com.simibubi.create.foundation.data.CreateRegistrate;

import com.tterrag.registrate.util.entry.BlockEntityEntry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.block.cake.AnniversaryCakeBlockEntity;

public class GarnishedBlockEntities {
	private static final CreateRegistrate REGISTRATE = CreateGarnished.registrate();

	public static final BlockEntityEntry<AnniversaryCakeBlockEntity> CAKE = REGISTRATE
			.blockEntity("anniversary_cake", AnniversaryCakeBlockEntity::new)
			.validBlocks(GarnishedBlocks.ANNIVERSARY_CAKE)
			.register();

	public static void setRegister() {}
}
