package com.kc.asne.planets.moon.init;

import com.kc.asne.planets.moon.AsnePlanetMoon;
import com.kc.asne.planets.moon.tools.AsneMoonToolTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, AsnePlanetMoon.MOD_ID);

    public static final RegistryObject<Item> MOON_STONE = ITEMS.register("moon_stone", () -> new BlockItem(BlockInit.MOON_STONE.get(), new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));
    public static final RegistryObject<Item> HACKMANITE_MOON_ORE = ITEMS.register("hackmanite_moon_ore", () -> new BlockItem(BlockInit.HACKMANITE_MOON_ORE.get(), new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));
    public static final RegistryObject<Item> IOLITE_MOON_ORE = ITEMS.register("iolite_moon_ore", () -> new BlockItem(BlockInit.IOLITE_MOON_ORE.get(), new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));
    public static final RegistryObject<Item> IOLITE_GEM = ITEMS.register("iolite_gem", () -> new Item(new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));
    public static final RegistryObject<Item> HACKMANITE_GEM = ITEMS.register("hackmanite_gem", () -> new Item(new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));

    // tools

    public static final RegistryObject<Item> HACKMANITE_PICKAXE = ITEMS.register("hackmanite_pickaxe", () -> new PickaxeItem(AsneMoonToolTier.HACKMANITE_TIER, -1, 6f, new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));
    public static final RegistryObject<Item> HACKMANITE_AXE = ITEMS.register("hackmanite_axe", () -> new AxeItem(AsneMoonToolTier.HACKMANITE_TIER, 6f, 6f, new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));
    public static final RegistryObject<Item> HACKMANITE_SWORD = ITEMS.register("hackmanite_sword", () -> new SwordItem(AsneMoonToolTier.HACKMANITE_TIER, 6, 6f, new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));
    public static final RegistryObject<Item> HACKMANITE_SHOVEL = ITEMS.register("hackmanite_shovel", () -> new ShovelItem(AsneMoonToolTier.HACKMANITE_TIER, 6f, 6f, new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));
    public static final RegistryObject<Item> HACKMANITE_HOE = ITEMS.register("hackmanite_hoe", () -> new HoeItem(AsneMoonToolTier.HACKMANITE_TIER, 6f, new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));

    public static final RegistryObject<Item> IOLITE_PICKAXE = ITEMS.register("iolite_pickaxe", () -> new PickaxeItem(AsneMoonToolTier.IOLITE_TIER, 6, 6f, new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));
    public static final RegistryObject<Item> IOLITE_AXE = ITEMS.register("iolite_axe", () -> new AxeItem(AsneMoonToolTier.IOLITE_TIER, 6f, 6f, new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));
    public static final RegistryObject<Item> IOLITE_SWORD = ITEMS.register("iolite_sword", () -> new SwordItem(AsneMoonToolTier.IOLITE_TIER, 6, 6f, new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));
    public static final RegistryObject<Item> IOLITE_SHOVEL = ITEMS.register("iolite_shovel", () -> new ShovelItem(AsneMoonToolTier.IOLITE_TIER, 6f, 6f, new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));
    public static final RegistryObject<Item> IOLITE_HOE = ITEMS.register("iolite_hoe", () -> new HoeItem(AsneMoonToolTier.IOLITE_TIER, 6f, new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));

}
