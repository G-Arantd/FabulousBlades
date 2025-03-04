package net.sirgrantd.fabulous_blades.client.event;

import net.sirgrantd.fabulous_blades.FabulousBladesMod;
import net.sirgrantd.fabulous_blades.init.FabulousBladesItems;
import net.sirgrantd.fabulous_blades.client.models.FabulousBakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ModelEvent;

import java.util.HashMap;
import java.util.Map;

public class HandlerModelSword {
    private static final Map<ModelResourceLocation, ModelResourceLocation> COMPLIANCES = new HashMap<>();

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void onRegisterAdditional(ModelEvent.RegisterAdditional event) {
        FabulousBladesItems.REGISTRY.getEntries().forEach(deferredHolder -> {
            String itemName = getItemName(deferredHolder.get().getDescriptionId());
            String largeJsonPath = getLargeJsonPath(itemName);

            try (var inputStream = FabulousBladesMod.class.getResourceAsStream(largeJsonPath)) {
                if (inputStream != null) {
                    registerLargeModel(event, itemName);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private String getItemName(String descriptionId) {
        return descriptionId.substring("item.fabulous_blades.".length());
    }

    private String getLargeJsonPath(String itemName) {
        return String.format("/assets/fabulous_blades/models/item/%s_large.json", itemName);
    }

    private void registerLargeModel(ModelEvent.RegisterAdditional event, String itemName) {
        var smallResourceLocation = ResourceLocation.fromNamespaceAndPath(FabulousBladesMod.MODID, itemName);
        var largeResourceLocation = ResourceLocation.fromNamespaceAndPath(FabulousBladesMod.MODID, "item/" + itemName + "_large");

        var smallModelResourceLocation = new ModelResourceLocation(smallResourceLocation, "inventory");
        var largeModelResourceLocation = new ModelResourceLocation(largeResourceLocation, "standalone");

        COMPLIANCES.put(smallModelResourceLocation, largeModelResourceLocation);
        event.register(largeModelResourceLocation);
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void onModifyBakingResult(ModelEvent.ModifyBakingResult event) {
        var models = event.getModels();
        COMPLIANCES.forEach((smallModelResourceLocation, largeModelResourceLocation) -> {
            var smallBakedModel = models.get(smallModelResourceLocation);
            var largeBakedModel = models.get(largeModelResourceLocation);

            if (smallBakedModel != null && largeBakedModel != null) {
                var fabulousBakedModel = new FabulousBakedModel(smallBakedModel, largeBakedModel);
                models.put(smallModelResourceLocation, fabulousBakedModel);
            }
        });
    }
}