package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modeldark_latex_skeleton_model;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexSkeletonRenderer.class */
public class DarkLatexSkeletonRenderer extends MobRenderer<DarkLatexSkeletonEntity, Modeldark_latex_skeleton_model<DarkLatexSkeletonEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DarkLatexSkeletonRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexSkeletonRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DarkLatexSkeletonEntity, Modeldark_latex_skeleton_model<DarkLatexSkeletonEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_skeleton_glow.png"));
        }
    }

    public DarkLatexSkeletonRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldark_latex_skeleton_model(context.bakeLayer(Modeldark_latex_skeleton_model.LAYER_LOCATION)), 0.5f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(DarkLatexSkeletonEntity entity) {
        return new ResourceLocation("latex:textures/entities/dark_latex_skeleton_model.png");
    }
}
