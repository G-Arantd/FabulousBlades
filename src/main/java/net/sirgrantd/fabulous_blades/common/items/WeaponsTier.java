package net.sirgrantd.fabulous_blades.common.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class WeaponsTier {

    private static class WeaponTierProperties {
        int durability;
        int enchantmentValue;
        float digSpeed;
        Ingredient repairIngredient;
        TagKey<Block> incorrectBlocks;
    }

    public static final Tier IRON_TIER = getTier("iron");
    public static final Tier GOLD_TIER = getTier("gold");
    public static final Tier DIAMOND_TIER = getTier("diamond");
    public static final Tier NETHERITE_TIER = getTier("netherite");

    private static Tier getTier(String type) {

        final WeaponTierProperties properties = new WeaponTierProperties();

        switch (type) {
            case "iron":
                properties.durability = WeaponsConst.IRON_WEAPON_DURABILITY;
                properties.enchantmentValue = WeaponsConst.IRON_ENCHANTMENT_VALUE;
                properties.digSpeed = WeaponsConst.IRON_WEAPON_DIGGER_SPEED;
                properties.repairIngredient = WeaponsConst.WEAPON_REPAIR_IRON_ITEMS;
                properties.incorrectBlocks = BlockTags.INCORRECT_FOR_IRON_TOOL;
                break;
            case "gold":
                properties.durability = WeaponsConst.GOLD_WEAPON_DURABILITY;
                properties.enchantmentValue = WeaponsConst.GOLD_ENCHANTMENT_VALUE;
                properties.digSpeed = WeaponsConst.GOLD_WEAPON_DIGGER_SPEED;
                properties.repairIngredient = WeaponsConst.WEAPON_REPAIR_GOLD_ITEMS;
                properties.incorrectBlocks = BlockTags.INCORRECT_FOR_GOLD_TOOL;
                break;
            case "diamond":
                properties.durability = WeaponsConst.DIAMOND_WEAPON_DURABILITY;
                properties.enchantmentValue = WeaponsConst.DIAMOND_ENCHANTMENT_VALUE;
                properties.digSpeed = WeaponsConst.DIAMOND_WEAPON_DIGGER_SPEED;
                properties.repairIngredient = WeaponsConst.WEAPON_REPAIR_DIAMOND_ITEMS;
                properties.incorrectBlocks = BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
                break;
            case "netherite":
                properties.durability = WeaponsConst.NETHERITE_WEAPON_DURABILITY;
                properties.enchantmentValue = WeaponsConst.NETHERITE_ENCHANTMENT_VALUE;
                properties.digSpeed = WeaponsConst.NETHERITE_WEAPON_DIGGER_SPEED;
                properties.repairIngredient = WeaponsConst.WEAPON_REPAIR_NETHERITE_ITEMS;
                properties.incorrectBlocks = BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
                break;
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }

        return new Tier() {
            @Override
            public int getUses() {
                return properties.durability;
            }

            @Override
            public float getSpeed() {
                return properties.digSpeed;
            }

            @Override
            public float getAttackDamageBonus() {
                return 0;
            }

            @Override
            public int getEnchantmentValue() {
                return properties.enchantmentValue;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return properties.repairIngredient;
            }

            @Override
            public TagKey<Block> getIncorrectBlocksForDrops() {
                return properties.incorrectBlocks;
            }
        };
    }

    public static Tier getTier(int durability, int enchantmentValue, float digSpeed, Ingredient repairIngredient, TagKey<Block> incorrectBlocks) {

        return new Tier() {
            @Override
            public int getUses() {
                return durability;
            }

            @Override
            public float getSpeed() {
                return digSpeed;
            }

            @Override
            public float getAttackDamageBonus() {
                return 0;
            }

            @Override
            public int getEnchantmentValue() {
                return enchantmentValue;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return repairIngredient;
            }

            @Override
            public TagKey<Block> getIncorrectBlocksForDrops() {
                return incorrectBlocks;
            }
        };
    }
}
