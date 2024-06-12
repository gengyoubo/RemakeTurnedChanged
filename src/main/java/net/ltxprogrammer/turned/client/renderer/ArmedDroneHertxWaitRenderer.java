package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelArmed_Drone_Hertx_Rest;
import net.ltxprogrammer.turned.entity.ArmedDroneHertxWaitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/ArmedDroneHertxWaitRenderer.class */
public class ArmedDroneHertxWaitRenderer extends MobRenderer<ArmedDroneHertxWaitEntity, ModelArmed_Drone_Hertx_Rest<ArmedDroneHertxWaitEntity>> {
    public ArmedDroneHertxWaitRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelArmed_Drone_Hertx_Rest(context.bakeLayer(ModelArmed_Drone_Hertx_Rest.LAYER_LOCATION)), 0.6f);
        addLayer(new EyesLayer<ArmedDroneHertxWaitEntity, ModelArmed_Drone_Hertx_Rest<ArmedDroneHertxWaitEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.ArmedDroneHertxWaitRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/armed_drone_hertx_texture_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(ArmedDroneHertxWaitEntity entity) {
        return new ResourceLocation("turned:textures/entities/armed_drone_hertx_texture.png");
    }
}
