package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelhertx_sit_model_f;
import net.ltxprogrammer.turned.entity.HertxFSitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/HertxFSitRenderer.class */
public class HertxFSitRenderer extends MobRenderer<HertxFSitEntity, Modelhertx_sit_model_f<HertxFSitEntity>> {
    public HertxFSitRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_sit_model_f(context.bakeLayer(Modelhertx_sit_model_f.LAYER_LOCATION)), 0.7f);
        addLayer(new EyesLayer<HertxFSitEntity, Modelhertx_sit_model_f<HertxFSitEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.HertxFSitRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/hertx_variant_f_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(HertxFSitEntity entity) {
        return new ResourceLocation("turned:textures/entities/hertx_variant_f_texture.png");
    }
}
