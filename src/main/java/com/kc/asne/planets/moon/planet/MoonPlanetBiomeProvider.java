package com.kc.asne.planets.moon.planet;

import com.google.common.collect.ImmutableSet;
import com.kc.asne.planetsapi.base.AsnePlanetBiomeProvider;
import net.minecraft.world.biome.Biome;

import java.util.HashSet;
import java.util.Set;

public class MoonPlanetBiomeProvider extends AsnePlanetBiomeProvider {
    protected MoonPlanetBiomeProvider() {
        super(ImmutableSet.of(new MoonPlanetBiome()));
    }

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        return new MoonPlanetBiome();
    }
}
