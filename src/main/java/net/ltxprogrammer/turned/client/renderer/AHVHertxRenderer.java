package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelAHV_hertx_model;
import net.ltxprogrammer.turned.entity.AHVHertxEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/AHVHertxRenderer.class */
public class AHVHertxRenderer extends MobRenderer<AHVHertxEntity, ModelAHV_hertx_model<AHVHertxEntity>> {
    public AHVHertxRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelAHV_hertx_model(context.bakeLayer(ModelAHV_hertx_model.LAYER_LOCATION)), 0.7f);
        addLayer(new EyesLayer<AHVHertxEntity, ModelAHV_hertx_model<AHVHertxEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.AHVHertxRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/ahv_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(AHVHertxEntity entity) {
        return new ResourceLocation("turned:textures/entities/ahv_texture.png");
    }
}
