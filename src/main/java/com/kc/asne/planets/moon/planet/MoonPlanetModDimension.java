package com.kc.asne.planets.moon.planet;

import com.kc.asne.planetsapi.base.AsnePlanetModDimension;
import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;

import java.util.function.BiFunction;

public class MoonPlanetModDimension extends AsnePlanetModDimension {
    @Override
    public BiFunction<World, DimensionType, ? extends Dimension> getFactory() {
        return MoonPlanetDimension::new;
    }

    @Override
    public boolean hasSkyLight() {
        return true;
    }
}
