package net.sirgrantd.fabulous_blades.init;

import net.sirgrantd.fabulous_blades.FabulousBladesMod;
import net.sirgrantd.fabulous_blades.common.items.reforges.ReforgeTemplateSwordClaymoreItem;
import net.sirgrantd.fabulous_blades.common.items.reforges.ReforgeTemplateSwordKatanaItem;
import net.sirgrantd.fabulous_blades.common.items.reforges.ReforgeTemplateSwordLongbladeItem;
import net.sirgrantd.fabulous_blades.common.items.weapons.DiamondSwordClaymoreItem;
import net.sirgrantd.fabulous_blades.common.items.weapons.DiamondSwordKatanaItem;
import net.sirgrantd.fabulous_blades.common.items.weapons.DiamondSwordLongbladeItem;
import net.sirgrantd.fabulous_blades.common.items.weapons.GoldSwordClaymoreItem;
import net.sirgrantd.fabulous_blades.common.items.weapons.GoldSwordKatanaItem;
import net.sirgrantd.fabulous_blades.common.items.weapons.GoldSwordLongbladeItem;
import net.sirgrantd.fabulous_blades.common.items.weapons.IronSwordClaymoreItem;
import net.sirgrantd.fabulous_blades.common.items.weapons.IronSwordKatanaItem;
import net.sirgrantd.fabulous_blades.common.items.weapons.IronSwordLongbladeItem;
import net.sirgrantd.fabulous_blades.common.items.weapons.NetheriteSwordClaymoreItem;
import net.sirgrantd.fabulous_blades.common.items.weapons.NetheriteSwordKatanaItem;
import net.sirgrantd.fabulous_blades.common.items.weapons.NetheriteSwordLongbladeItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class FabulousBladesItems {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FabulousBladesMod.MODID);
    public static final DeferredItem<Item> IRON_SWORD_CLAYMORE = REGISTRY.register("iron_sword_claymore", IronSwordClaymoreItem::new);
	public static final DeferredItem<Item> IRON_SWORD_LONGBLADE = REGISTRY.register("iron_sword_longblade", IronSwordLongbladeItem::new);
	public static final DeferredItem<Item> IRON_SWORD_KATANA = REGISTRY.register("iron_sword_katana", IronSwordKatanaItem::new);
	public static final DeferredItem<Item> GOLD_SWORD_CLAYMORE = REGISTRY.register("gold_sword_claymore", GoldSwordClaymoreItem::new);
	public static final DeferredItem<Item> GOLD_SWORD_LONGBLADE = REGISTRY.register("gold_sword_longblade", GoldSwordLongbladeItem::new);
	public static final DeferredItem<Item> GOLD_SWORD_KATANA = REGISTRY.register("gold_sword_katana", GoldSwordKatanaItem::new);
	public static final DeferredItem<Item> DIAMOND_SWORD_CLAYMORE = REGISTRY.register("diamond_sword_claymore", DiamondSwordClaymoreItem::new);
	public static final DeferredItem<Item> DIAMOND_SWORD_LONGBLADE = REGISTRY.register("diamond_sword_longblade", DiamondSwordLongbladeItem::new);
	public static final DeferredItem<Item> DIAMOND_SWORD_KATANA = REGISTRY.register("diamond_sword_katana", DiamondSwordKatanaItem::new);
	public static final DeferredItem<Item> NETHERITE_SWORD_CLAYMORE = REGISTRY.register("netherite_sword_claymore", NetheriteSwordClaymoreItem::new);
	public static final DeferredItem<Item> NETHERITE_SWORD_LONGBLADE = REGISTRY.register("netherite_sword_longblade", NetheriteSwordLongbladeItem::new);
	public static final DeferredItem<Item> NETHERITE_SWORD_KATANA = REGISTRY.register("netherite_sword_katana", NetheriteSwordKatanaItem::new);
	public static final DeferredItem<Item> REFORGE_TEMPLATE_SWORD_CLAYMORE = REGISTRY.register("reforge_template_sword_claymore", ReforgeTemplateSwordClaymoreItem::new);
	public static final DeferredItem<Item> REFORGE_TEMPLATE_SWORD_LONGBLADE = REGISTRY.register("reforge_template_sword_longblade", ReforgeTemplateSwordLongbladeItem::new);
	public static final DeferredItem<Item> REFORGE_TEMPLATE_SWORD_KATANA = REGISTRY.register("reforge_template_sword_katana", ReforgeTemplateSwordKatanaItem::new);
}
