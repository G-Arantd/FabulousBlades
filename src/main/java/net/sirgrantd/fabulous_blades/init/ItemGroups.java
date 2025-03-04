package net.sirgrantd.fabulous_blades.init;

import net.sirgrantd.fabulous_blades.FabulousBladesMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class ItemGroups {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FabulousBladesMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FABULOUS_BLADES = REGISTRY.register("fabulous_blades", 
    () -> CreativeModeTab.builder().title(Component.translatable("item_group.fabulous_blades.group")).icon(() -> new ItemStack(FabulousBladesItems.REFORGE_TEMPLATE_SWORD_CLAYMORE.get())).displayItems((parameters, tabData) -> {
        tabData.accept(FabulousBladesItems.IRON_SWORD_CLAYMORE.get());
        tabData.accept(FabulousBladesItems.IRON_SWORD_LONGBLADE.get());
        tabData.accept(FabulousBladesItems.IRON_SWORD_KATANA.get());
        tabData.accept(FabulousBladesItems.GOLD_SWORD_CLAYMORE.get());
        tabData.accept(FabulousBladesItems.GOLD_SWORD_LONGBLADE.get());
        tabData.accept(FabulousBladesItems.GOLD_SWORD_KATANA.get());
        tabData.accept(FabulousBladesItems.DIAMOND_SWORD_CLAYMORE.get());
        tabData.accept(FabulousBladesItems.DIAMOND_SWORD_LONGBLADE.get());
        tabData.accept(FabulousBladesItems.DIAMOND_SWORD_KATANA.get());
        tabData.accept(FabulousBladesItems.NETHERITE_SWORD_CLAYMORE.get());
        tabData.accept(FabulousBladesItems.NETHERITE_SWORD_LONGBLADE.get());
        tabData.accept(FabulousBladesItems.NETHERITE_SWORD_KATANA.get());
        tabData.accept(FabulousBladesItems.REFORGE_TEMPLATE_SWORD_CLAYMORE.get());
        tabData.accept(FabulousBladesItems.REFORGE_TEMPLATE_SWORD_LONGBLADE.get());
        tabData.accept(FabulousBladesItems.REFORGE_TEMPLATE_SWORD_KATANA.get());
    }).build());
}
