package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modelhertx_model_s1;
import net.mcreator.latexes.entity.HertxvarSolEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/HertxvarSolRenderer.class */
public class HertxvarSolRenderer extends MobRenderer<HertxvarSolEntity, Modelhertx_model_s1<HertxvarSolEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.HertxvarSolRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/HertxvarSolRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<HertxvarSolEntity, Modelhertx_model_s1<HertxvarSolEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/hertx_variant_soldier_glow.png"));
        }
    }

    public HertxvarSolRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_model_s1(context.bakeLayer(Modelhertx_model_s1.LAYER_LOCATION)), 0.6f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(HertxvarSolEntity entity) {
        return new ResourceLocation("latex:textures/entities/hertx_variant_soldier_texture.png");
    }
}