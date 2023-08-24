package net.dakotapride.garnished.block;

import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SoundType;

public class NutLeavesBlock extends LeavesBlock implements IBlock {
    public NutLeavesBlock(Properties properties) {
        super(properties.strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()
                .isValidSpawn(IBlock::ocelotOrParrot).isSuffocating(IBlock::never).isViewBlocking(IBlock::never));
    }
}
