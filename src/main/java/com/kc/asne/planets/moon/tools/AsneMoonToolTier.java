package com.kc.asne.planets.moon.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum AsneMoonToolTier implements IItemTier {

    HACKMANITE_TIER(3000, 9f, 5f, 3, 10),
    IOLITE_TIER(3000, 9f, 5f, 3, 10);


    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int harvestLevel;
    private final int enchantability;

    private AsneMoonToolTier(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability) {

        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
    }
    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems();
    }
}
