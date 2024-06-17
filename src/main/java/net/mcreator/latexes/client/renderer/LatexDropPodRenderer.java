package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelLatex_Drop_Pod;
import net.mcreator.latexes.entity.LatexDropPodEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/LatexDropPodRenderer.class */
public class LatexDropPodRenderer extends MobRenderer<LatexDropPodEntity, ModelLatex_Drop_Pod<LatexDropPodEntity>> {
    public LatexDropPodRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelLatex_Drop_Pod(context.bakeLayer(ModelLatex_Drop_Pod.LAYER_LOCATION)), 1.2f);
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull LatexDropPodEntity entity) {
        return new ResourceLocation("latex:textures/entities/latex_drop_pod.png");
    }
}
