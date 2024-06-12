package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modeltsc_outsider_model;
import net.ltxprogrammer.turned.entity.TSCOutsiderEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/TSCOutsiderRenderer.class */
public class TSCOutsiderRenderer extends MobRenderer<TSCOutsiderEntity, Modeltsc_outsider_model<TSCOutsiderEntity>> {
    public TSCOutsiderRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeltsc_outsider_model(context.bakeLayer(Modeltsc_outsider_model.LAYER_LOCATION)), 0.5f);
        addLayer(new EyesLayer<TSCOutsiderEntity, Modeltsc_outsider_model<TSCOutsiderEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.TSCOutsiderRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/tsc_outsider_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(TSCOutsiderEntity entity) {
        return new ResourceLocation("turned:textures/entities/tsc_outsider_texture.png");
    }
}
