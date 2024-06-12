package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelDark_latex_creeper;
import net.ltxprogrammer.turned.entity.DarkLatexCreeperEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarkLatexCreeperRenderer.class */
public class DarkLatexCreeperRenderer extends MobRenderer<DarkLatexCreeperEntity, ModelDark_latex_creeper<DarkLatexCreeperEntity>> {
    public DarkLatexCreeperRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDark_latex_creeper<>(context.bakeLayer(ModelDark_latex_creeper.LAYER_LOCATION)), 0.5f);
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarkLatexCreeperEntity entity) {
        return new ResourceLocation("turned:textures/entities/dark_latex_creeper_texture.png");
    }
}
