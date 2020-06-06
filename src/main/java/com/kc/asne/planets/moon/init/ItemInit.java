package com.kc.asne.planets.moon.init;

import com.kc.asne.planets.moon.AsnePlanetMoon;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, AsnePlanetMoon.MOD_ID);

    public static final RegistryObject<Item> MOON_STONE = ITEMS.register("moon_stone", () -> new BlockItem(BlockInit.MOON_STONE.get(), new Item.Properties().group(AsnePlanetMoon.MOON_ITEM_GROUP)));

}
