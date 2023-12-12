package net.dakotapride.garnished.gen;

import org.jetbrains.annotations.Nullable;

import net.dakotapride.garnished.registry.GarnishedFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class ChestnutTreeGrower extends AbstractTreeGrower {

	@Nullable
	@Override
	protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean largeHive) {
		return GarnishedFeatures.CHESTNUT_TREE_CONFIGURED;
	}
}
