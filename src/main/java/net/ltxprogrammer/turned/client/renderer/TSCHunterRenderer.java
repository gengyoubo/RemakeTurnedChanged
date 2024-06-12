package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelTSC_Hunter_model;
import net.ltxprogrammer.turned.entity.TSCHunterEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/TSCHunterRenderer.class */
public class TSCHunterRenderer extends MobRenderer<TSCHunterEntity, ModelTSC_Hunter_model<TSCHunterEntity>> {
    public TSCHunterRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelTSC_Hunter_model(context.bakeLayer(ModelTSC_Hunter_model.LAYER_LOCATION)), 0.6f);
        addLayer(new EyesLayer<TSCHunterEntity, ModelTSC_Hunter_model<TSCHunterEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.TSCHunterRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/tsc_hunter_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(TSCHunterEntity entity) {
        return new ResourceLocation("turned:textures/entities/tsc_hunter_texture.png");
    }
}
