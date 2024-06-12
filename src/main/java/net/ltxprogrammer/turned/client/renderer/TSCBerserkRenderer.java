package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modeltsc_berserk_model;
import net.ltxprogrammer.turned.entity.TSCBerserkEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/TSCBerserkRenderer.class */
public class TSCBerserkRenderer extends MobRenderer<TSCBerserkEntity, Modeltsc_berserk_model<TSCBerserkEntity>> {
    public TSCBerserkRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeltsc_berserk_model(context.bakeLayer(Modeltsc_berserk_model.LAYER_LOCATION)), 0.7f);
        addLayer(new EyesLayer<TSCBerserkEntity, Modeltsc_berserk_model<TSCBerserkEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.TSCBerserkRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/tsc_berserk_texture_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(TSCBerserkEntity entity) {
        return new ResourceLocation("turned:textures/entities/tsc_berserk_texture.png");
    }
}
