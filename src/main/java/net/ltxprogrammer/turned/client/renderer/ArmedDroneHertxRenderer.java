package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelMilitary_Drone_Hertx;
import net.ltxprogrammer.turned.entity.ArmedDroneHertxEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/ArmedDroneHertxRenderer.class */
public class ArmedDroneHertxRenderer extends MobRenderer<ArmedDroneHertxEntity, ModelMilitary_Drone_Hertx<ArmedDroneHertxEntity>> {
    public ArmedDroneHertxRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelMilitary_Drone_Hertx<>(context.bakeLayer(ModelMilitary_Drone_Hertx.LAYER_LOCATION)), 0.6f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.ArmedDroneHertxRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/armed_drone_hertx_texture_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull ArmedDroneHertxEntity entity) {
        return new ResourceLocation("turned:textures/entities/armed_drone_hertx_texture.png");
    }
}
