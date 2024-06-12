package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelhertx_model_f;
import net.ltxprogrammer.turned.entity.HertxvarFEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/HertxvarFRenderer.class */
public class HertxvarFRenderer extends MobRenderer<HertxvarFEntity, Modelhertx_model_f<HertxvarFEntity>> {
    public HertxvarFRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_model_f(context.bakeLayer(Modelhertx_model_f.LAYER_LOCATION)), 0.6f);
        addLayer(new EyesLayer<HertxvarFEntity, Modelhertx_model_f<HertxvarFEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.HertxvarFRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/hertx_variant_f_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(HertxvarFEntity entity) {
        return new ResourceLocation("turned:textures/entities/hertx_variant_f_texture.png");
    }
}
