package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelhertx_model;
import net.ltxprogrammer.turned.entity.HertxEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/HertxRenderer.class */
public class HertxRenderer extends MobRenderer<HertxEntity, Modelhertx_model<HertxEntity>> {
    public HertxRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_model(context.bakeLayer(Modelhertx_model.LAYER_LOCATION)), 0.6f);
        addLayer(new EyesLayer<HertxEntity, Modelhertx_model<HertxEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.HertxRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/hertx_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(HertxEntity entity) {
        return new ResourceLocation("turned:textures/entities/hertx_texture.png");
    }
}
