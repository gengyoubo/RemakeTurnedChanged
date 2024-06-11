package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modelhertx_model_sit;
import net.mcreator.latexes.entity.HertxSitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/HertxSitRenderer.class */
public class HertxSitRenderer extends MobRenderer<HertxSitEntity, Modelhertx_model_sit<HertxSitEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.HertxSitRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/HertxSitRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<HertxSitEntity, Modelhertx_model_sit<HertxSitEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/hertx_glow.png"));
        }
    }

    public HertxSitRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_model_sit(context.bakeLayer(Modelhertx_model_sit.LAYER_LOCATION)), 0.7f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(HertxSitEntity entity) {
        return new ResourceLocation("latex:textures/entities/hertx_texture.png");
    }
}
