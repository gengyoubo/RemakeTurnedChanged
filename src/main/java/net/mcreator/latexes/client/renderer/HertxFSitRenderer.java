package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modelhertx_sit_model_f;
import net.mcreator.latexes.entity.HertxFSitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/HertxFSitRenderer.class */
public class HertxFSitRenderer extends MobRenderer<HertxFSitEntity, Modelhertx_sit_model_f<HertxFSitEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.HertxFSitRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/HertxFSitRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<HertxFSitEntity, Modelhertx_sit_model_f<HertxFSitEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/hertx_variant_f_glow.png"));
        }
    }

    public HertxFSitRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_sit_model_f(context.bakeLayer(Modelhertx_sit_model_f.LAYER_LOCATION)), 0.7f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull HertxFSitEntity entity) {
        return new ResourceLocation("latex:textures/entities/hertx_variant_f_texture.png");
    }
}
