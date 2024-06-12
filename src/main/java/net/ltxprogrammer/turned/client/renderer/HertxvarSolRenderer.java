package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelhertx_model_s1;
import net.ltxprogrammer.turned.entity.HertxvarSolEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/HertxvarSolRenderer.class */
public class HertxvarSolRenderer extends MobRenderer<HertxvarSolEntity, Modelhertx_model_s1<HertxvarSolEntity>> {
    public HertxvarSolRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_model_s1(context.bakeLayer(Modelhertx_model_s1.LAYER_LOCATION)), 0.6f);
        addLayer(new EyesLayer<HertxvarSolEntity, Modelhertx_model_s1<HertxvarSolEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.HertxvarSolRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/hertx_variant_soldier_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(HertxvarSolEntity entity) {
        return new ResourceLocation("turned:textures/entities/hertx_variant_soldier_texture.png");
    }
}
