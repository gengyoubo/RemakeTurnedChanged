package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelhertx_ashbury_sit_model;
import net.ltxprogrammer.turned.entity.AshburySitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/AshburySitRenderer.class */
public class AshburySitRenderer extends MobRenderer<AshburySitEntity, Modelhertx_ashbury_sit_model<AshburySitEntity>> {
    public AshburySitRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_ashbury_sit_model<>(context.bakeLayer(Modelhertx_ashbury_sit_model.LAYER_LOCATION)), 0.7f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.AshburySitRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/hertx_ashbury_model_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull AshburySitEntity entity) {
        return new ResourceLocation("turned:textures/entities/hertx_ashbury_model.png");
    }
}
