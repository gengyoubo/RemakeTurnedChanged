package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelbee_hertx_model;
import net.ltxprogrammer.turned.entity.BeeHertxEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/BeeHertxRenderer.class */
public class BeeHertxRenderer extends MobRenderer<BeeHertxEntity, Modelbee_hertx_model<BeeHertxEntity>> {
    public BeeHertxRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelbee_hertx_model<>(context.bakeLayer(Modelbee_hertx_model.LAYER_LOCATION)), 0.6f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.BeeHertxRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/bee_hertx_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull BeeHertxEntity entity) {
        return new ResourceLocation("turned:textures/entities/hertx_bee_texture.png");
    }
}
