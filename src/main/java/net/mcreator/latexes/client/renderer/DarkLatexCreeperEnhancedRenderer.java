package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelDark_latex_creeper_enhanced;
import net.mcreator.latexes.entity.DarkLatexCreeperEnhancedEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexCreeperEnhancedRenderer.class */
public class DarkLatexCreeperEnhancedRenderer extends MobRenderer<DarkLatexCreeperEnhancedEntity, ModelDark_latex_creeper_enhanced<DarkLatexCreeperEnhancedEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DarkLatexCreeperEnhancedRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexCreeperEnhancedRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DarkLatexCreeperEnhancedEntity, ModelDark_latex_creeper_enhanced<DarkLatexCreeperEnhancedEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_creeper_enhanced_glow_texture.png"));
        }
    }

    public DarkLatexCreeperEnhancedRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDark_latex_creeper_enhanced(context.bakeLayer(ModelDark_latex_creeper_enhanced.LAYER_LOCATION)), 0.8f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(DarkLatexCreeperEnhancedEntity entity) {
        return new ResourceLocation("latex:textures/entities/dark_latex_creeper_enhanced__texture.png");
    }
}
