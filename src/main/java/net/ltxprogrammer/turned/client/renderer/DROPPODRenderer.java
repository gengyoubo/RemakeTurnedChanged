package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modeldrop_pod;
import net.ltxprogrammer.turned.entity.DROPPODEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DROPPODRenderer.class */
public class DROPPODRenderer extends MobRenderer<DROPPODEntity, Modeldrop_pod<DROPPODEntity>> {
    public DROPPODRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldrop_pod<>(context.bakeLayer(Modeldrop_pod.LAYER_LOCATION)), 1.2f);
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DROPPODEntity entity) {
        return new ResourceLocation("turned:textures/entities/drop_pod.png");
    }
}
