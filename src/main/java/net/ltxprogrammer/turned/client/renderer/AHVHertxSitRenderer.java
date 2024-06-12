package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelAHV_hertx_sit_model;
import net.ltxprogrammer.turned.entity.AHVHertxSitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/AHVHertxSitRenderer.class */
public class AHVHertxSitRenderer extends MobRenderer<AHVHertxSitEntity, ModelAHV_hertx_sit_model<AHVHertxSitEntity>> {
    public AHVHertxSitRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelAHV_hertx_sit_model<>(context.bakeLayer(ModelAHV_hertx_sit_model.LAYER_LOCATION)), 0.7f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.AHVHertxSitRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/ahv_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull AHVHertxSitEntity entity) {
        return new ResourceLocation("turned:textures/entities/ahv_texture.png");
    }
}
