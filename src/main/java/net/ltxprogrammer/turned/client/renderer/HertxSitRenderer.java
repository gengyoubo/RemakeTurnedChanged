package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelhertx_model_sit;
import net.ltxprogrammer.turned.entity.HertxSitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/HertxSitRenderer.class */
public class HertxSitRenderer extends MobRenderer<HertxSitEntity, Modelhertx_model_sit<HertxSitEntity>> {
    public HertxSitRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_model_sit<>(context.bakeLayer(Modelhertx_model_sit.LAYER_LOCATION)), 0.7f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.HertxSitRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/hertx_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull HertxSitEntity entity) {
        return new ResourceLocation("turned:textures/entities/hertx_texture.png");
    }
}
