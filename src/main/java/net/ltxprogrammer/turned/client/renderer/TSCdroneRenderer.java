package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modeltsc_drone_model;
import net.ltxprogrammer.turned.entity.TSCdroneEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/TSCdroneRenderer.class */
public class TSCdroneRenderer extends MobRenderer<TSCdroneEntity, Modeltsc_drone_model<TSCdroneEntity>> {
    public TSCdroneRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeltsc_drone_model<>(context.bakeLayer(Modeltsc_drone_model.LAYER_LOCATION)), 0.5f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.TSCdroneRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/tsc_drone_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull TSCdroneEntity entity) {
        return new ResourceLocation("turned:textures/entities/tsc_drone_texture.png");
    }
}
