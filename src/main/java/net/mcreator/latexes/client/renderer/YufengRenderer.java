package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modeldark_latex_yufeng_model;
import net.mcreator.latexes.entity.YufengEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/YufengRenderer.class */
public class YufengRenderer extends MobRenderer<YufengEntity, Modeldark_latex_yufeng_model<YufengEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.YufengRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/YufengRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<YufengEntity, Modeldark_latex_yufeng_model<YufengEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_yufeng_glow.png"));
        }
    }

    public YufengRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldark_latex_yufeng_model(context.bakeLayer(Modeldark_latex_yufeng_model.LAYER_LOCATION)), 0.5f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull YufengEntity entity) {
        return new ResourceLocation("latex:textures/entities/dark_latex_yufeng_model.png");
    }
}
