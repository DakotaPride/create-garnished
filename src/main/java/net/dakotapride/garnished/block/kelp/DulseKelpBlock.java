package net.dakotapride.garnished.block.kelp;

import org.jetbrains.annotations.NotNull;

import net.dakotapride.garnished.registry.GarnishedBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.HitResult;

public class DulseKelpBlock extends GarnishedKelpBlock {
    public DulseKelpBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull ItemStack getCloneItemStack(@NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull BlockState state) {
        return GarnishedBlocks.DULSE_KELP.asStack();
    }

    @Override
    protected @NotNull Block getBodyBlock() {
        return GarnishedBlocks.DULSE_KELP_PLANT.get();
    }
}
