package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modella_4_tankmorph_model_r;
import net.ltxprogrammer.turned.entity.La4tankmorphrEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/La4tankmorphrRenderer.class */
public class La4tankmorphrRenderer extends MobRenderer<La4tankmorphrEntity, Modella_4_tankmorph_model_r<La4tankmorphrEntity>> {
    public La4tankmorphrRenderer(EntityRendererProvider.Context context) {
        super(context, new Modella_4_tankmorph_model_r<>(context.bakeLayer(Modella_4_tankmorph_model_r.LAYER_LOCATION)), 1.1f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.La4tankmorphrRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/la4_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull La4tankmorphrEntity entity) {
        return new ResourceLocation("turned:textures/entities/la-4_tankmorph_evil.png");
    }
}
