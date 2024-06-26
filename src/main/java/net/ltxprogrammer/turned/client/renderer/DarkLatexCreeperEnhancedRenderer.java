package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelDark_latex_creeper_enhanced;
import net.ltxprogrammer.turned.entity.DarkLatexCreeperEnhancedEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarkLatexCreeperEnhancedRenderer.class */
public class DarkLatexCreeperEnhancedRenderer extends MobRenderer<DarkLatexCreeperEnhancedEntity, ModelDark_latex_creeper_enhanced<DarkLatexCreeperEnhancedEntity>> {
    public DarkLatexCreeperEnhancedRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDark_latex_creeper_enhanced<>(context.bakeLayer(ModelDark_latex_creeper_enhanced.LAYER_LOCATION)), 0.8f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.DarkLatexCreeperEnhancedRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/dark_latex_creeper_enhanced_glow_texture.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarkLatexCreeperEnhancedEntity entity) {
        return new ResourceLocation("turned:textures/entities/dark_latex_creeper_enhanced__texture.png");
    }
}