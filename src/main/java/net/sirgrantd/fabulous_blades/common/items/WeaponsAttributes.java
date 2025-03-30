package net.sirgrantd.fabulous_blades.common.items;

import dev.shadowsoffire.apothic_attributes.api.ALObjects;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.Item;

public class WeaponsAttributes {

    public static ItemAttributeModifiers swordsAttributes(float attackDamage, float attackSpeed, float crit_chance, float crit_damage) {
        return ItemAttributeModifiers.builder()
            .add(
                Attributes.ATTACK_DAMAGE,
                new AttributeModifier(
                    Item.BASE_ATTACK_DAMAGE_ID,
                    (double)attackDamage-1.0,
                    AttributeModifier.Operation.ADD_VALUE
                ),
                EquipmentSlotGroup.MAINHAND
            )
            .add(
                Attributes.ATTACK_SPEED,
                new AttributeModifier(
                    Item.BASE_ATTACK_SPEED_ID,
                    (double)attackSpeed,
                    AttributeModifier.Operation.ADD_VALUE
                ),
                EquipmentSlotGroup.MAINHAND
            )
            .add(
                ALObjects.Attributes.CRIT_CHANCE,
                new AttributeModifier(
                    ResourceLocation.withDefaultNamespace("crit_chance"),
                    (double)crit_chance,
                    AttributeModifier.Operation.ADD_VALUE
                ),
                EquipmentSlotGroup.MAINHAND
            )
            .add(
                ALObjects.Attributes.CRIT_DAMAGE,
                new AttributeModifier(
                    ResourceLocation.withDefaultNamespace("crit_damage"),
                    (double)crit_damage,
                    AttributeModifier.Operation.ADD_VALUE
                ),
                EquipmentSlotGroup.MAINHAND
            )
            .build();
    }

}
