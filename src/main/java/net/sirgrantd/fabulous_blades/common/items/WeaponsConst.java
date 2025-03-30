package net.sirgrantd.fabulous_blades.common.items;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

public class WeaponsConst {

    public static final float CLAYMORE_WEAPON_ATTACK_DAMAGE = 3;
    public static final float KATANA_WEAPON_ATTACK_DAMAGE = 1;
    public static final float LONGBLADE_WEAPON_ATTACK_DAMAGE = 2;

    public static final float CLAYMORE_WEAPON_ATTACK_SPEED = -3f;
    public static final float KATANA_WEAPON_ATTACK_SPEED = -2;
    public static final float LONGBLADE_WEAPON_ATTACK_SPEED = -2.2f;

    public static final float CLAYMORE_WEAPON_CRIT_CHANCE = 0.05f;
    public static final float KATANA_WEAPON_CRIT_CHANCE = 0.1f;
    public static final float LONGBLADE_WEAPON_CRIT_CHANCE = 0.07f;

    public static final float CLAYMORE_WEAPON_CRIT_DAMAGE = 0.3f;
    public static final float KATANA_WEAPON_CRIT_DAMAGE = 0.15f;
    public static final float LONGBLADE_WEAPON_CRIT_DAMAGE = 0.2f;

    public static final float IRON_WEAPON_ATTACK_DAMAGE = 6f;
    public static final float GOLD_WEAPON_ATTACK_DAMAGE = 4f;
    public static final float DIAMOND_WEAPON_ATTACK_DAMAGE = 7f;
    public static final float NETHERITE_WEAPON_ATTACK_DAMAGE = 8f;
    
    public static final int IRON_WEAPON_DURABILITY = 250;
    public static final int GOLD_WEAPON_DURABILITY = 32;
    public static final int DIAMOND_WEAPON_DURABILITY = 1561;
    public static final int NETHERITE_WEAPON_DURABILITY = 2031;

    public static final int IRON_ENCHANTMENT_VALUE = 14;
    public static final int GOLD_ENCHANTMENT_VALUE = 22;
    public static final int DIAMOND_ENCHANTMENT_VALUE = 10;
    public static final int NETHERITE_ENCHANTMENT_VALUE = 15;

    public static final float IRON_WEAPON_DIGGER_SPEED = 6f;
    public static final float GOLD_WEAPON_DIGGER_SPEED = 12f;
    public static final float DIAMOND_WEAPON_DIGGER_SPEED = 8f;
    public static final float NETHERITE_WEAPON_DIGGER_SPEED = 9f;

    public static final Ingredient WEAPON_REPAIR_IRON_ITEMS = Ingredient.of(new ItemStack(Items.IRON_INGOT));
    public static final Ingredient WEAPON_REPAIR_GOLD_ITEMS = Ingredient.of(new ItemStack(Items.GOLD_INGOT));
    public static final Ingredient WEAPON_REPAIR_DIAMOND_ITEMS = Ingredient.of(new ItemStack(Items.DIAMOND));
    public static final Ingredient WEAPON_REPAIR_NETHERITE_ITEMS = Ingredient.of(new ItemStack(Items.NETHERITE_INGOT));

}
