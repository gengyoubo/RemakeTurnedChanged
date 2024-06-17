package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modelhertx_model_wait_s1;
import net.mcreator.latexes.entity.HertxSolWaitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/HertxSolWaitRenderer.class */
public class HertxSolWaitRenderer extends MobRenderer<HertxSolWaitEntity, Modelhertx_model_wait_s1<HertxSolWaitEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.HertxSolWaitRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/HertxSolWaitRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<HertxSolWaitEntity, Modelhertx_model_wait_s1<HertxSolWaitEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/hertx_variant_soldier_glow.png"));
        }
    }

    public HertxSolWaitRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_model_wait_s1(context.bakeLayer(Modelhertx_model_wait_s1.LAYER_LOCATION)), 0.6f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull HertxSolWaitEntity entity) {
        return new ResourceLocation("latex:textures/entities/hertx_variant_soldier_texture.png");
    }
}
