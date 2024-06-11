package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modeldark_latex_snek_model;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexSnakeRenderer.class */
public class DarkLatexSnakeRenderer extends MobRenderer<DarkLatexSnakeEntity, Modeldark_latex_snek_model<DarkLatexSnakeEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DarkLatexSnakeRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexSnakeRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DarkLatexSnakeEntity, Modeldark_latex_snek_model<DarkLatexSnakeEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_snake_glow.png"));
        }
    }

    public DarkLatexSnakeRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldark_latex_snek_model(context.bakeLayer(Modeldark_latex_snek_model.LAYER_LOCATION)), 0.5f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(DarkLatexSnakeEntity entity) {
        return new ResourceLocation("latex:textures/entities/dark_latex_snake_texture.png");
    }
}
