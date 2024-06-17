package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modelhertx_model_fb_sit;
import net.mcreator.latexes.entity.HertxFBSitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/HertxFBSitRenderer.class */
public class HertxFBSitRenderer extends MobRenderer<HertxFBSitEntity, Modelhertx_model_fb_sit<HertxFBSitEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.HertxFBSitRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/HertxFBSitRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<HertxFBSitEntity, Modelhertx_model_fb_sit<HertxFBSitEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/hertx_variant_fb_glow.png"));
        }
    }

    public HertxFBSitRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_model_fb_sit(context.bakeLayer(Modelhertx_model_fb_sit.LAYER_LOCATION)), 0.7f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull HertxFBSitEntity entity) {
        return new ResourceLocation("latex:textures/entities/hertx_variant_fb_texture.png");
    }
}
