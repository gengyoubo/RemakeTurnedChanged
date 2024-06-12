package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelhertx_model_fb;
import net.ltxprogrammer.turned.entity.HertxvarFBEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/HertxvarFBRenderer.class */
public class HertxvarFBRenderer extends MobRenderer<HertxvarFBEntity, Modelhertx_model_fb<HertxvarFBEntity>> {
    public HertxvarFBRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_model_fb<>(context.bakeLayer(Modelhertx_model_fb.LAYER_LOCATION)), 0.6f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.HertxvarFBRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/hertx_variant_fb_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull HertxvarFBEntity entity) {
        return new ResourceLocation("turned:textures/entities/hertx_variant_fb_texture.png");
    }
}
