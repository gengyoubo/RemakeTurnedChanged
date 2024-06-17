package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modeldark_latex_cone_model;
import net.mcreator.latexes.entity.DarklatexconeEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarklatexconeRenderer.class */
public class DarklatexconeRenderer extends MobRenderer<DarklatexconeEntity, Modeldark_latex_cone_model<DarklatexconeEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DarklatexconeRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarklatexconeRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DarklatexconeEntity, Modeldark_latex_cone_model<DarklatexconeEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_cone_glow.png"));
        }
    }

    public DarklatexconeRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldark_latex_cone_model(context.bakeLayer(Modeldark_latex_cone_model.LAYER_LOCATION)), 0.5f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarklatexconeEntity entity) {
        return new ResourceLocation("latex:textures/entities/dark_latex_cone_texture.png");
    }
}
