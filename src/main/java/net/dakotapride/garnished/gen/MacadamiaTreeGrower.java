package net.dakotapride.garnished.gen;

import java.util.Random;

import org.jetbrains.annotations.Nullable;

import io.github.fabricators_of_create.porting_lib.util.ServerLifecycleHooks;
import net.dakotapride.garnished.registry.GarnishedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class MacadamiaTreeGrower extends AbstractTreeGrower {

	@Nullable
	@Override
	protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random random, boolean largeHive) {
		ResourceLocation locateFeature = GarnishedFeatures.MACADAMIA_TREE_CONFIGURED.location();
		ConfiguredFeature<?, ?> feature = ServerLifecycleHooks.getCurrentServer().registryAccess()
				.registryOrThrow(Registry.CONFIGURED_FEATURE_REGISTRY).get(locateFeature);
		if (null == feature) {
			throw new IllegalArgumentException("Failed to create holder for unknown configured feature: " + locateFeature);
		}
		return Holder.direct(feature);
	}
}
