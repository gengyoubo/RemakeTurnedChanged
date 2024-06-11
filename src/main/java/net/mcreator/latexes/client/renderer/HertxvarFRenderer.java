package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modelhertx_model_f;
import net.mcreator.latexes.entity.HertxvarFEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/HertxvarFRenderer.class */
public class HertxvarFRenderer extends MobRenderer<HertxvarFEntity, Modelhertx_model_f<HertxvarFEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.HertxvarFRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/HertxvarFRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<HertxvarFEntity, Modelhertx_model_f<HertxvarFEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/hertx_variant_f_glow.png"));
        }
    }

    public HertxvarFRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_model_f(context.bakeLayer(Modelhertx_model_f.LAYER_LOCATION)), 0.6f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(HertxvarFEntity entity) {
        return new ResourceLocation("latex:textures/entities/hertx_variant_f_texture.png");
    }
}
