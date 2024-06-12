package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelspider_latex_model;
import net.ltxprogrammer.turned.entity.DarkLatexSpiderEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarkLatexSpiderRenderer.class */
public class DarkLatexSpiderRenderer extends MobRenderer<DarkLatexSpiderEntity, Modelspider_latex_model<DarkLatexSpiderEntity>> {
    public DarkLatexSpiderRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelspider_latex_model(context.bakeLayer(Modelspider_latex_model.LAYER_LOCATION)), 0.8f);
        addLayer(new EyesLayer<DarkLatexSpiderEntity, Modelspider_latex_model<DarkLatexSpiderEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.DarkLatexSpiderRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/dark_latex_spider_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(DarkLatexSpiderEntity entity) {
        return new ResourceLocation("turned:textures/entities/spider_latex_texture.png");
    }
}
