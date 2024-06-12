package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelSlimeling_remaster_sit;
import net.ltxprogrammer.turned.entity.SlimelingtamedsitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/SlimelingtamedsitRenderer.class */
public class SlimelingtamedsitRenderer extends MobRenderer<SlimelingtamedsitEntity, ModelSlimeling_remaster_sit<SlimelingtamedsitEntity>> {
    public SlimelingtamedsitRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelSlimeling_remaster_sit<>(context.bakeLayer(ModelSlimeling_remaster_sit.LAYER_LOCATION)), 0.7f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.SlimelingtamedsitRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/slimeling_tamed_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull SlimelingtamedsitEntity entity) {
        return new ResourceLocation("turned:textures/entities/slimeling_tamed_texture.png");
    }
}
