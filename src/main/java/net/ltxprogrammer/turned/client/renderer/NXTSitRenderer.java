package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelnxt_hertx_sit_model;
import net.ltxprogrammer.turned.entity.NXTSitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/NXTSitRenderer.class */
public class NXTSitRenderer extends MobRenderer<NXTSitEntity, Modelnxt_hertx_sit_model<NXTSitEntity>> {
    public NXTSitRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelnxt_hertx_sit_model(context.bakeLayer(Modelnxt_hertx_sit_model.LAYER_LOCATION)), 0.7f);
        addLayer(new EyesLayer<NXTSitEntity, Modelnxt_hertx_sit_model<NXTSitEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.NXTSitRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/nxt_hertx_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(NXTSitEntity entity) {
        return new ResourceLocation("turned:textures/entities/nxt_hertx_texture.png");
    }
}
