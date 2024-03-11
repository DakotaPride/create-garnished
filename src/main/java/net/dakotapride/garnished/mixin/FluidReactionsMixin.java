package net.dakotapride.garnished.mixin;

import io.github.fabricators_of_create.porting_lib.fluids.FluidStack;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.simibubi.create.content.fluids.FluidReactions;
import com.simibubi.create.foundation.fluid.FluidHelper;

import net.dakotapride.garnished.registry.GarnishedFluids;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

@Mixin(value = FluidReactions.class, remap = false)
public class FluidReactionsMixin {

	@Inject(method = "handlePipeFlowCollision", at = @At("HEAD"))
	private static void handlePipeFlowCollisionFallback(Level world, BlockPos pos, FluidStack fluid, FluidStack fluid2, CallbackInfo ci) {
		Fluid f1 = fluid.getFluid();
		Fluid f2 = fluid2.getFluid();

		if (f1 == Fluids.LAVA && FluidHelper.hasBlockState(f2)) {
			BlockState lavaInteraction = GarnishedFluids.getLavaInteraction(FluidHelper.convertToFlowing(f2).defaultFluidState());
			if (lavaInteraction != null) {
				world.setBlockAndUpdate(pos, lavaInteraction);
			}
		} else if (f2 == Fluids.LAVA && FluidHelper.hasBlockState(f1)) {
			BlockState lavaInteraction = GarnishedFluids.getLavaInteraction(FluidHelper.convertToFlowing(f1).defaultFluidState());
			if (lavaInteraction != null) {
				world.setBlockAndUpdate(pos, lavaInteraction);
			}
		}
	}

	@Inject(method = "handlePipeSpillCollision", at = @At("HEAD"))
	private static void handlePipeSpillCollisionFallback(Level world, BlockPos pos, Fluid pipeFluid, FluidState worldFluid, CallbackInfo ci) {
		Fluid pf = FluidHelper.convertToStill(pipeFluid);
		Fluid wf = worldFluid.getType();

		if (FluidHelper.isTag(pf, FluidTags.WATER) && wf == Fluids.LAVA) {
			world.setBlockAndUpdate(pos, Blocks.OBSIDIAN.defaultBlockState());
		}

		if (pf == Fluids.LAVA) {
			BlockState lavaInteraction = GarnishedFluids.getLavaInteraction(wf.defaultFluidState());
			if (lavaInteraction != null) {
				world.setBlockAndUpdate(pos, lavaInteraction);
			}
		} else if (wf == Fluids.FLOWING_LAVA && FluidHelper.hasBlockState(pf)) {
			BlockState lavaInteraction = GarnishedFluids.getLavaInteraction(FluidHelper.convertToFlowing(pf).defaultFluidState());
			if (lavaInteraction != null) {
				world.setBlockAndUpdate(pos, lavaInteraction);
			}
		}
	}

}
