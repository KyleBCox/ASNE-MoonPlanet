package com.kc.asne.planets.moon.planet;

import com.kc.asne.planets.moon.settings.MoonGenSettings;
import com.kc.asne.planetsapi.base.AsneChunkGenerator;
import net.minecraft.world.IWorld;

public class MoonChunkGenerator extends AsneChunkGenerator<MoonGenSettings> {
    public MoonChunkGenerator(IWorld worldIn) {
        super(worldIn, new MoonPlanetBiomeProvider(), new MoonGenSettings());
    }
}
