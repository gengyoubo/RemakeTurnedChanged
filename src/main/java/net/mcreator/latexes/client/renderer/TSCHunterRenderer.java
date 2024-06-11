package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelTSC_Hunter_model;
import net.mcreator.latexes.entity.TSCHunterEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/TSCHunterRenderer.class */
public class TSCHunterRenderer extends MobRenderer<TSCHunterEntity, ModelTSC_Hunter_model<TSCHunterEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.TSCHunterRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/TSCHunterRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<TSCHunterEntity, ModelTSC_Hunter_model<TSCHunterEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/tsc_hunter_glow.png"));
        }
    }

    public TSCHunterRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelTSC_Hunter_model(context.bakeLayer(ModelTSC_Hunter_model.LAYER_LOCATION)), 0.6f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(TSCHunterEntity entity) {
        return new ResourceLocation("latex:textures/entities/tsc_hunter_texture.png");
    }
}
