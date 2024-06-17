package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelDark_latex_fox;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexFoxRenderer.class */
public class DarkLatexFoxRenderer extends MobRenderer<DarkLatexFoxEntity, ModelDark_latex_fox<DarkLatexFoxEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DarkLatexFoxRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexFoxRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DarkLatexFoxEntity, ModelDark_latex_fox<DarkLatexFoxEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_fox_texture_glow.png"));
        }
    }

    public DarkLatexFoxRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDark_latex_fox(context.bakeLayer(ModelDark_latex_fox.LAYER_LOCATION)), 0.5f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarkLatexFoxEntity entity) {
        return new ResourceLocation("latex:textures/entities/darklatexfoxtexture.png");
    }
}
