package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modelqueen_spider_latex_model;
import net.mcreator.latexes.entity.DarkLatexSpiderQueenEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexSpiderQueenRenderer.class */
public class DarkLatexSpiderQueenRenderer extends MobRenderer<DarkLatexSpiderQueenEntity, Modelqueen_spider_latex_model<DarkLatexSpiderQueenEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DarkLatexSpiderQueenRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexSpiderQueenRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DarkLatexSpiderQueenEntity, Modelqueen_spider_latex_model<DarkLatexSpiderQueenEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/spider_latex_queen_glow.png"));
        }
    }

    public DarkLatexSpiderQueenRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelqueen_spider_latex_model(context.bakeLayer(Modelqueen_spider_latex_model.LAYER_LOCATION)), 1.2f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarkLatexSpiderQueenEntity entity) {
        return new ResourceLocation("latex:textures/entities/spider_latex_queen_texture.png");
    }
}
