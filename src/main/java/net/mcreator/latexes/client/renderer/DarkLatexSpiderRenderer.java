package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modelspider_latex_model;
import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexSpiderRenderer.class */
public class DarkLatexSpiderRenderer extends MobRenderer<DarkLatexSpiderEntity, Modelspider_latex_model<DarkLatexSpiderEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DarkLatexSpiderRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexSpiderRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DarkLatexSpiderEntity, Modelspider_latex_model<DarkLatexSpiderEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_spider_glow.png"));
        }
    }

    public DarkLatexSpiderRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelspider_latex_model(context.bakeLayer(Modelspider_latex_model.LAYER_LOCATION)), 0.8f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(DarkLatexSpiderEntity entity) {
        return new ResourceLocation("latex:textures/entities/spider_latex_texture.png");
    }
}