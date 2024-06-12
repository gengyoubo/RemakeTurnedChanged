package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelLatex_Drop_Pod;
import net.ltxprogrammer.turned.entity.LatexDropPodEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/LatexDropPodRenderer.class */
public class LatexDropPodRenderer extends MobRenderer<LatexDropPodEntity, ModelLatex_Drop_Pod<LatexDropPodEntity>> {
    public LatexDropPodRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelLatex_Drop_Pod<>(context.bakeLayer(ModelLatex_Drop_Pod.LAYER_LOCATION)), 1.2f);
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull LatexDropPodEntity entity) {
        return new ResourceLocation("turned:textures/entities/latex_drop_pod.png");
    }
}
