package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelhertx_model_wait_s1;
import net.ltxprogrammer.turned.entity.HertxSolWaitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/HertxSolWaitRenderer.class */
public class HertxSolWaitRenderer extends MobRenderer<HertxSolWaitEntity, Modelhertx_model_wait_s1<HertxSolWaitEntity>> {
    public HertxSolWaitRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_model_wait_s1(context.bakeLayer(Modelhertx_model_wait_s1.LAYER_LOCATION)), 0.6f);
        addLayer(new EyesLayer<HertxSolWaitEntity, Modelhertx_model_wait_s1<HertxSolWaitEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.HertxSolWaitRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/hertx_variant_soldier_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(HertxSolWaitEntity entity) {
        return new ResourceLocation("turned:textures/entities/hertx_variant_soldier_texture.png");
    }
}
