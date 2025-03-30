
package net.sirgrantd.fabulous_blades.common.items.weapons;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.sirgrantd.fabulous_blades.common.items.FabulousWeapons;
import net.sirgrantd.fabulous_blades.common.items.WeaponsAttributes;
import net.sirgrantd.fabulous_blades.common.items.WeaponsConst;
import net.sirgrantd.fabulous_blades.common.items.WeaponsTier;

public class IronSwordLongbladeItem extends FabulousWeapons {
	private static final Tier LONGBLADE_TIER = WeaponsTier.IRON_TIER;

	private static final float ATTACK_DAMAGE = WeaponsConst.IRON_WEAPON_ATTACK_DAMAGE + WeaponsConst.LONGBLADE_WEAPON_ATTACK_DAMAGE;
	private static final float ATTACK_SPEED = WeaponsConst.LONGBLADE_WEAPON_ATTACK_SPEED;
	private static final float CRIT_CHANCE = WeaponsConst.LONGBLADE_WEAPON_CRIT_CHANCE;
	private static final float CRIT_DAMAGE = WeaponsConst.LONGBLADE_WEAPON_CRIT_DAMAGE;

	public IronSwordLongbladeItem() {
		super(LONGBLADE_TIER, new Item.Properties().attributes(WeaponsAttributes.swordsAttributes(ATTACK_DAMAGE, ATTACK_SPEED, CRIT_CHANCE, CRIT_DAMAGE)));
	}
}