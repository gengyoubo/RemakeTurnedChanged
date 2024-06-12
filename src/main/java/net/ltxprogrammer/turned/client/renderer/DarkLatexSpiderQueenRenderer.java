package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelqueen_spider_latex_model;
import net.ltxprogrammer.turned.entity.DarkLatexSpiderQueenEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarkLatexSpiderQueenRenderer.class */
public class DarkLatexSpiderQueenRenderer extends MobRenderer<DarkLatexSpiderQueenEntity, Modelqueen_spider_latex_model<DarkLatexSpiderQueenEntity>> {
    public DarkLatexSpiderQueenRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelqueen_spider_latex_model(context.bakeLayer(Modelqueen_spider_latex_model.LAYER_LOCATION)), 1.2f);
        addLayer(new EyesLayer<DarkLatexSpiderQueenEntity, Modelqueen_spider_latex_model<DarkLatexSpiderQueenEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.DarkLatexSpiderQueenRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/spider_latex_queen_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(DarkLatexSpiderQueenEntity entity) {
        return new ResourceLocation("turned:textures/entities/spider_latex_queen_texture.png");
    }
}
