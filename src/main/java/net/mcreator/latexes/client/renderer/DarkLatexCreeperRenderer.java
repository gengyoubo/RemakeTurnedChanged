package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelDark_latex_creeper;
import net.mcreator.latexes.entity.DarkLatexCreeperEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexCreeperRenderer.class */
public class DarkLatexCreeperRenderer extends MobRenderer<DarkLatexCreeperEntity, ModelDark_latex_creeper<DarkLatexCreeperEntity>> {
    public DarkLatexCreeperRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDark_latex_creeper(context.bakeLayer(ModelDark_latex_creeper.LAYER_LOCATION)), 0.5f);
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarkLatexCreeperEntity entity) {
        return new ResourceLocation("latex:textures/entities/dark_latex_creeper_texture.png");
    }
}
