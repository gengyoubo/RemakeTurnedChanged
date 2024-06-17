package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modeldark_latex_model;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarklatexRenderer.class */
public class DarklatexRenderer extends MobRenderer<DarklatexEntity, Modeldark_latex_model<DarklatexEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DarklatexRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarklatexRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DarklatexEntity, Modeldark_latex_model<DarklatexEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_glow.png"));
        }
    }

    public DarklatexRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldark_latex_model(context.bakeLayer(Modeldark_latex_model.LAYER_LOCATION)), 0.5f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarklatexEntity entity) {
        return new ResourceLocation("latex:textures/entities/dark_latex_texture.png");
    }
}
