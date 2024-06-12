package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelSlimeling_remaster;
import net.ltxprogrammer.turned.entity.SlimelingEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/SlimelingRenderer.class */
public class SlimelingRenderer extends MobRenderer<SlimelingEntity, ModelSlimeling_remaster<SlimelingEntity>> {
    public SlimelingRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelSlimeling_remaster<>(context.bakeLayer(ModelSlimeling_remaster.LAYER_LOCATION)), 0.5f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.SlimelingRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/slimeling_texture_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull SlimelingEntity entity) {
        return new ResourceLocation("turned:textures/entities/slimeling_texture.png");
    }
}
