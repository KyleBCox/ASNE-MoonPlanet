package com.kc.asne.planets.moon.init;

import com.kc.asne.planets.moon.AsnePlanetMoon;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, AsnePlanetMoon.MOD_ID);

    public static final RegistryObject<Block> MOON_STONE = BLOCKS.register("moon_stone", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(2).hardnessAndResistance(1.3f, 6f)));
    public static final RegistryObject<Block> HACKMANITE_MOON_ORE = BLOCKS.register("hackmanite_moon_ore", () -> new Block(Block.Properties.create(Material.ROCK).harvestLevel(3).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2f, 6f)));
    public static final RegistryObject<Block> IOLITE_MOON_ORE = BLOCKS.register("iolite_moon_ore", () -> new Block(Block.Properties.create(Material.ROCK).harvestLevel(3).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2f, 6f)));

}
