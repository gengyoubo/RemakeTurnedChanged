package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.changed.client.renderer.LatexHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
import net.ltxprogrammer.turned.client.model.Modeldark_latex_skeleton_model;
import net.ltxprogrammer.turned.entity.DarkLatexSkeletonEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarkLatexSkeletonRenderer.class */
public class DarkLatexSkeletonRenderer extends LatexHumanoidRenderer<DarkLatexSkeletonEntity, Modeldark_latex_skeleton_model, ArmorNoneModel<DarkLatexSkeletonEntity>> {
    public DarkLatexSkeletonRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldark_latex_skeleton_model(context.bakeLayer(Modeldark_latex_skeleton_model.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 0.5f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.DarkLatexSkeletonRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/dark_latex_skeleton_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarkLatexSkeletonEntity entity) {
        return new ResourceLocation("turned:textures/entities/dark_latex_skeleton_model.png");
    }
}
