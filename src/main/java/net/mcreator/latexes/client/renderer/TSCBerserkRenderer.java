package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modeltsc_berserk_model;
import net.mcreator.latexes.entity.TSCBerserkEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/TSCBerserkRenderer.class */
public class TSCBerserkRenderer extends MobRenderer<TSCBerserkEntity, Modeltsc_berserk_model<TSCBerserkEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.TSCBerserkRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/TSCBerserkRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<TSCBerserkEntity, Modeltsc_berserk_model<TSCBerserkEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/tsc_berserk_texture_glow.png"));
        }
    }

    public TSCBerserkRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeltsc_berserk_model(context.bakeLayer(Modeltsc_berserk_model.LAYER_LOCATION)), 0.7f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(TSCBerserkEntity entity) {
        return new ResourceLocation("latex:textures/entities/tsc_berserk_texture.png");
    }
}
