package com.kc.asne.planets.moon.planet;

import com.kc.asne.planets.moon.settings.MoonAtmosphereSettings;
import com.kc.asne.planetsapi.base.AsnePlanetDimension;
import com.kc.asne.planetsapi.settings.IAtmosphereSettings;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class MoonPlanetDimension extends AsnePlanetDimension {
    public MoonPlanetDimension(World world, DimensionType type) {
        super(world, type, () -> new MoonChunkGenerator(world));
    }


    @Override
    public IAtmosphereSettings getAtmosphereSettings() {
        return new MoonAtmosphereSettings();
    }
}
