package com.kc.asne.planets.moon.planet;

import com.kc.asne.planetsapi.base.AsnePlanetBiome;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class MoonPlanetBiome extends AsnePlanetBiome {
    protected MoonPlanetBiome(Builder biomeBuilder) {
        super(biomeBuilder);
    }

    public MoonPlanetBiome() {
        this(new Biome.Builder()
                .surfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.STONE_STONE_GRAVEL_CONFIG)
                .precipitation(RainType.NONE)
                .category(Category.NONE)
                .temperature(-0.1f)
                .downfall(0)
                .depth(1)
                .scale(1f)
                .waterColor(0xFFFFFF)
                .waterFogColor(0xFFFFFF));
    }

    @Override
    public int getSkyColor() {
        return 0x000000;
    }

    @Override
    public ITextComponent getDisplayName() {
        return new TranslationTextComponent("biome.asnemoon.moon");
    }

    @Override
    public <C extends IFeatureConfig> boolean hasStructure(Structure<C> structureIn) {
        return false;
    }
}
