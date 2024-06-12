package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelhertx_model_fb_sit;
import net.ltxprogrammer.turned.entity.HertxFBSitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/HertxFBSitRenderer.class */
public class HertxFBSitRenderer extends MobRenderer<HertxFBSitEntity, Modelhertx_model_fb_sit<HertxFBSitEntity>> {
    public HertxFBSitRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_model_fb_sit<>(context.bakeLayer(Modelhertx_model_fb_sit.LAYER_LOCATION)), 0.7f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.HertxFBSitRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/hertx_variant_fb_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull HertxFBSitEntity entity) {
        return new ResourceLocation("turned:textures/entities/hertx_variant_fb_texture.png");
    }
}
