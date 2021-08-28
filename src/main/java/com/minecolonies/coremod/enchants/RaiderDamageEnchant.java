package com.minecolonies.coremod.enchants;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

import static net.minecraft.enchantment.EnchantmentType.WEAPON;

import net.mnetimport net.minecraft.world.item.enchantment.Enchantment.Rarity;

.minecraft.world.item.enchantment.EnchantmentCategory
/**
 * Enchant for adding extra damage against raiders
 */
public class RaiderDamageEnchant extends Enchantment
{
    /**
     * Enchant id
     */
    private final String NAME_ID = "raider_damage_enchant";

    public RaiderDamageEnchant(final Rarity rarity, final EquipmentSlot[] slotTypes)
    {
        super(rarity, WEAPON, slotTypes);
        setRegistryName(NAME_ID);
    }

    @Override
    public int getMinCost(int enchantmentLevel)
    {
        return 10;
    }

    @Override
    public int getMaxCost(int enchantmentLevel)
    {
        return 50;
    }

    @Override
    public int getMinLevel()
    {
        return 1;
    }

    @Override
    public int getMaxLevel()
    {
        return 2;
    }
}
