package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modelhertx_model_fb;
import net.mcreator.latexes.entity.HertxvarFBEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/HertxvarFBRenderer.class */
public class HertxvarFBRenderer extends MobRenderer<HertxvarFBEntity, Modelhertx_model_fb<HertxvarFBEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.HertxvarFBRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/HertxvarFBRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<HertxvarFBEntity, Modelhertx_model_fb<HertxvarFBEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/hertx_variant_fb_glow.png"));
        }
    }

    public HertxvarFBRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_model_fb(context.bakeLayer(Modelhertx_model_fb.LAYER_LOCATION)), 0.6f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(HertxvarFBEntity entity) {
        return new ResourceLocation("latex:textures/entities/hertx_variant_fb_texture.png");
    }
}
