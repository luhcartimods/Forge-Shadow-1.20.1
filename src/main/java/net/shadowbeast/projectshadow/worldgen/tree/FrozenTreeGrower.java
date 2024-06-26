package net.shadowbeast.projectshadow.worldgen.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.shadowbeast.projectshadow.worldgen.ModConfiguredFeatures;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FrozenTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(@NotNull RandomSource pRandom, boolean pHasFlowers) {
        return ModConfiguredFeatures.FROZEN_KEY;
    }
}
