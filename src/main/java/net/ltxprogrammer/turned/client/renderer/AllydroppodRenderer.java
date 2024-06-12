package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelScientific_Drop_Pod;
import net.ltxprogrammer.turned.entity.AllydroppodEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/AllydroppodRenderer.class */
public class AllydroppodRenderer extends MobRenderer<AllydroppodEntity, ModelScientific_Drop_Pod<AllydroppodEntity>> {
    public AllydroppodRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelScientific_Drop_Pod<>(context.bakeLayer(ModelScientific_Drop_Pod.LAYER_LOCATION)), 1.2f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.AllydroppodRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/scientific_drop_pod_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull AllydroppodEntity entity) {
        return new ResourceLocation("turned:textures/entities/scientific_drop_pod.png");
    }
}
