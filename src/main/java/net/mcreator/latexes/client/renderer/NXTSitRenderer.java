package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modelnxt_hertx_sit_model;
import net.mcreator.latexes.entity.NXTSitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/NXTSitRenderer.class */
public class NXTSitRenderer extends MobRenderer<NXTSitEntity, Modelnxt_hertx_sit_model<NXTSitEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.NXTSitRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/NXTSitRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<NXTSitEntity, Modelnxt_hertx_sit_model<NXTSitEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/nxt_hertx_glow.png"));
        }
    }

    public NXTSitRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelnxt_hertx_sit_model(context.bakeLayer(Modelnxt_hertx_sit_model.LAYER_LOCATION)), 0.7f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(NXTSitEntity entity) {
        return new ResourceLocation("latex:textures/entities/nxt_hertx_texture.png");
    }
}
