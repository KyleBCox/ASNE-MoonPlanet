package com.kc.asne.planets.moon;

import com.kc.asne.planets.moon.init.BlockInit;
import com.kc.asne.planets.moon.init.ItemInit;
import com.kc.asne.planets.moon.planet.MoonPlanetBiome;
import com.kc.asne.planets.moon.planet.MoonPlanetDimension;
import com.kc.asne.planets.moon.planet.MoonPlanetModDimension;
import com.kc.asne.planets.moon.planet.surfacebulders.MoonSurfaceBuilder;
import com.kc.asne.planetsapi.PlanetsAPI;
import com.kc.asne.planetsapi.register.ModPlanetsRegister;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AsnePlanetMoon.MOD_ID)
public class AsnePlanetMoon {

    public static final String MOD_ID = "asnemoon";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public AsnePlanetMoon() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        BlockInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        registerPlanets();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // some example code to dispatch IMC to another mo
    }

    private void processIMC(final InterModProcessEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    private void registerPlanets(){
        ModPlanetsRegister register = PlanetsAPI.createRegister("asne");
        register.registerPlanet("moon_planet", MoonPlanetModDimension::new);
        register.registerBiome("moon_planet_biome", MoonPlanetBiome::new);
        register.registerSurfaceBuilder("moon_planet", () -> new MoonSurfaceBuilder(SurfaceBuilderConfig::deserialize));

    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }

    public static final ItemGroup MOON_ITEM_GROUP = new ItemGroup("asne_moon") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.MOON_STONE.get());
        }
    };

}
