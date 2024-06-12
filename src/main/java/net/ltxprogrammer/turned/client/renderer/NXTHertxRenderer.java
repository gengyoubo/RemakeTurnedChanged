package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelnxt_hertx_model;
import net.ltxprogrammer.turned.entity.NXTHertxEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/NXTHertxRenderer.class */
public class NXTHertxRenderer extends MobRenderer<NXTHertxEntity, Modelnxt_hertx_model<NXTHertxEntity>> {
    public NXTHertxRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelnxt_hertx_model<>(context.bakeLayer(Modelnxt_hertx_model.LAYER_LOCATION)), 0.6f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.NXTHertxRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/nxt_hertx_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull NXTHertxEntity entity) {
        return new ResourceLocation("turned:textures/entities/nxt_hertx_texture.png");
    }
}
