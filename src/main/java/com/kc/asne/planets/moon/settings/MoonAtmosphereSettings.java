package com.kc.asne.planets.moon.settings;

import com.kc.asne.planetsapi.settings.IAtmosphereSettings;

public class MoonAtmosphereSettings implements IAtmosphereSettings {

    @Override
    public int getTemperature() {
        return -1;
    }

    @Override
    public int getDensity() {
        return 1;
    }

    @Override
    public int getPressure() {
        return 1;
    }

    @Override
    public int getHumidity() {
        return 1;
    }

    @Override
    public boolean getIsBreathable() {
        return false;
    }

    @Override
    public float getGravityMultiplier() {
        return 0.6f;
    }
}
