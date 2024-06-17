package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelDark_latex_snep;
import net.mcreator.latexes.entity.DarkLatexSnepEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexSnepRenderer.class */
public class DarkLatexSnepRenderer extends MobRenderer<DarkLatexSnepEntity, ModelDark_latex_snep<DarkLatexSnepEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DarkLatexSnepRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexSnepRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DarkLatexSnepEntity, ModelDark_latex_snep<DarkLatexSnepEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_snep_glow.png"));
        }
    }

    public DarkLatexSnepRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDark_latex_snep(context.bakeLayer(ModelDark_latex_snep.LAYER_LOCATION)), 0.5f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarkLatexSnepEntity entity) {
        return new ResourceLocation("latex:textures/entities/dl_snep_texture.png");
    }
}
