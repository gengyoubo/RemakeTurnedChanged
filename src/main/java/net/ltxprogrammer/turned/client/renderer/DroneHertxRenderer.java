package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelDrone_Hertx;
import net.ltxprogrammer.turned.entity.DroneHertxEntity;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DroneHertxRenderer.class */
public class DroneHertxRenderer extends MobRenderer<DroneHertxEntity, ModelDrone_Hertx<DroneHertxEntity>> {
    public DroneHertxRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDrone_Hertx<>(context.bakeLayer(ModelDrone_Hertx.LAYER_LOCATION)), 0.6f);
        addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.DroneHertxRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/drone_hertx_texture_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DroneHertxEntity entity) {
        return new ResourceLocation("turned:textures/entities/drone_hertx_texture.png");
    }
}
