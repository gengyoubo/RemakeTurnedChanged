package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelDark_latex_creeper_enhanced;
import net.ltxprogrammer.turned.entity.DarkLatexCreeperEnhancedEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarkLatexCreeperEnhancedRenderer.class */
public class DarkLatexCreeperEnhancedRenderer extends MobRenderer<DarkLatexCreeperEnhancedEntity, ModelDark_latex_creeper_enhanced<DarkLatexCreeperEnhancedEntity>> {
    public DarkLatexCreeperEnhancedRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDark_latex_creeper_enhanced(context.bakeLayer(ModelDark_latex_creeper_enhanced.LAYER_LOCATION)), 0.8f);
        addLayer(new EyesLayer<DarkLatexCreeperEnhancedEntity, ModelDark_latex_creeper_enhanced<DarkLatexCreeperEnhancedEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.DarkLatexCreeperEnhancedRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/dark_latex_creeper_enhanced_glow_texture.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(DarkLatexCreeperEnhancedEntity entity) {
        return new ResourceLocation("turned:textures/entities/dark_latex_creeper_enhanced__texture.png");
    }
}
