package com.kc.asne.planets.moon.planet;

import com.kc.asne.planets.moon.settings.MoonGenSettings;
import com.kc.asne.planetsapi.base.AsneChunkGenerator;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.INoiseGenerator;
import net.minecraft.world.gen.PerlinNoiseGenerator;

public class MoonChunkGenerator extends AsneChunkGenerator<MoonGenSettings> {

    private PerlinNoiseGenerator depthNoise;

    public MoonChunkGenerator(IWorld worldIn) {
        super(worldIn, new MoonPlanetBiomeProvider(), new MoonGenSettings());
        depthNoise = new PerlinNoiseGenerator(this.randomSeed, 1,1);
    }

    @Override
    protected double getNoiseDepthAt(int noiseX, int noiseZ) {
        double d0 = this.depthNoise.noiseAt((double)noiseX, (double)noiseZ, true) * 100;// 65535.0D / 8000.0D;
        if (d0 < 0.0D) {
            d0 = -d0 * 0.3D;
        }

        d0 = d0 * 3.0D - 2.0D;
        if (d0 < 0.0D) {
            d0 /= 28.0D;
        } else {
            if (d0 > 1.0D) {
                d0 = 1.0D;
            }

            d0 /= 40.0D;
        }

        return d0;
    }
}
