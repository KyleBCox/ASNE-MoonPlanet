package com.kc.asne.planets.moon.planet;

import com.google.common.collect.ImmutableSet;
import com.kc.asne.planetsapi.base.AsnePlanetBiomeProvider;
import net.minecraft.world.biome.Biome;

import java.util.HashSet;
import java.util.Set;

public class MoonPlanetBiomeProvider extends AsnePlanetBiomeProvider {
    private static final ImmutableSet<Biome> BIOMES = ImmutableSet.of(new MoonPlanetBiome());
    protected MoonPlanetBiomeProvider() {
        super(BIOMES);
    }

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        return new MoonPlanetBiome();
    }
}
