package net.dakotapride.garnished.registry;

import com.simibubi.create.foundation.data.CreateRegistrate;

import com.tterrag.registrate.fabric.SimpleFlowableFluid;

import com.tterrag.registrate.util.entry.FluidEntry;

import net.dakotapride.garnished.CreateGarnished;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidConstants;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributeHandler;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.EmptyItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.FullItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

import static net.minecraft.world.item.Items.BUCKET;

@SuppressWarnings("UnstableApiUsage")
public class GarnishedFluids {
	public static void setRegister() {}
	private static final CreateRegistrate REGISTRATE = CreateGarnished.registrate()
			.creativeModeTab(() -> GarnishedTabs.GARNISHED);


	public static final FluidEntry<SimpleFlowableFluid.Flowing> GARNISHED_WATER;

	static  {
		GARNISHED_WATER = REGISTRATE
				.fluid("garnished_water",
						new ResourceLocation(CreateGarnished.ID, "fluid/garnished_water_still"),
						new ResourceLocation(CreateGarnished.ID, "fluid/garnished_water_flowing")
				)
				.fluidProperties(p -> p.levelDecreasePerBlock(1)
						.canMultiply()
						.tickRate(5)
						.flowSpeed(2)
						.blastResistance(100f))
				.fluidAttributes(() -> new CreateAdditionsAttributeHandler("fluid.garnished_water", 1500, 800))
				.onRegisterAfter(Registry.ITEM_REGISTRY, fluid -> {
					Fluid source = fluid.getSource();
					FluidStorage.combinedItemApiProvider(source.getBucket()).register(context ->
							new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));
					FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
							new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucket()), source, FluidConstants.BUCKET));
				}).register();
	}


	private record CreateAdditionsAttributeHandler(Component name, int viscosity, boolean lighterThanAir) implements FluidVariantAttributeHandler {
		private CreateAdditionsAttributeHandler(String key, int viscosity, int density) {
			this(Component.translatable(key), viscosity, density <= 0);
		}

		@Override
		public Component getName(FluidVariant fluidVariant) {
			return name.copy();
		}

		@Override
		public int getViscosity(FluidVariant variant, @Nullable Level world) {
			return viscosity;
		}

		@Override
		public boolean isLighterThanAir(FluidVariant variant) {
			return lighterThanAir;
		}
	}
}
