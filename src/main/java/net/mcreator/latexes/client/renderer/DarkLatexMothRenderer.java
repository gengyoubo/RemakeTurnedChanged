package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modeldl_moth_model;
import net.mcreator.latexes.entity.DarkLatexMothEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexMothRenderer.class */
public class DarkLatexMothRenderer extends MobRenderer<DarkLatexMothEntity, Modeldl_moth_model<DarkLatexMothEntity>> {
    public DarkLatexMothRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldl_moth_model(context.bakeLayer(Modeldl_moth_model.LAYER_LOCATION)), 0.6f);
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarkLatexMothEntity entity) {
        return new ResourceLocation("latex:textures/entities/dl_moth_texture.png");
    }
}
