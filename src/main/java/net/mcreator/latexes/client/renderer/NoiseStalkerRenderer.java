package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modeldark_latex_noise_stalker;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/NoiseStalkerRenderer.class */
public class NoiseStalkerRenderer extends MobRenderer<NoiseStalkerEntity, Modeldark_latex_noise_stalker<NoiseStalkerEntity>> {
    public NoiseStalkerRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldark_latex_noise_stalker(context.bakeLayer(Modeldark_latex_noise_stalker.LAYER_LOCATION)), 0.8f);
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull NoiseStalkerEntity entity) {
        return new ResourceLocation("latex:textures/entities/dark_latex_noisestalker_texture.png");
    }
}
