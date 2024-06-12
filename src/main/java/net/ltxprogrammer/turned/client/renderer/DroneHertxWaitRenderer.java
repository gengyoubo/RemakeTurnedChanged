package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelDrone_Hertx_Sit;
import net.ltxprogrammer.turned.entity.DroneHertxWaitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DroneHertxWaitRenderer.class */
public class DroneHertxWaitRenderer extends MobRenderer<DroneHertxWaitEntity, ModelDrone_Hertx_Sit<DroneHertxWaitEntity>> {
    public DroneHertxWaitRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDrone_Hertx_Sit(context.bakeLayer(ModelDrone_Hertx_Sit.LAYER_LOCATION)), 0.6f);
        addLayer(new EyesLayer<DroneHertxWaitEntity, ModelDrone_Hertx_Sit<DroneHertxWaitEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.DroneHertxWaitRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/drone_hertx_texture_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(DroneHertxWaitEntity entity) {
        return new ResourceLocation("turned:textures/entities/drone_hertx_texture.png");
    }
}
