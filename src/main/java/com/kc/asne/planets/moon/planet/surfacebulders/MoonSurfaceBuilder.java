package com.kc.asne.planets.moon.planet.surfacebulders;

import com.kc.asne.planets.moon.init.BlockInit;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;
import java.util.function.Function;

public class MoonSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {
    public MoonSurfaceBuilder(Function<Dynamic<?>, ? extends SurfaceBuilderConfig> p_i51305_1_) {
        super(p_i51305_1_);
    }

    public static final SurfaceBuilderConfig MOON_CONFIG = new SurfaceBuilderConfig(BlockInit.MOON_STONE.get().getDefaultState(), BlockInit.MOON_STONE.get().getDefaultState(), BlockInit.MOON_STONE.get().getDefaultState());

    @Override
    public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        for (int i = startHeight; i >= 0; --i) {
            if (i <= 1) {
                chunkIn.setBlockState(new BlockPos(x, i, z), Blocks.BEDROCK.getDefaultState(), false);
            } else {
                chunkIn.setBlockState(new BlockPos(x, i, z), BlockInit.MOON_STONE.get().getDefaultState(), false);
            }
        }
    }
}
