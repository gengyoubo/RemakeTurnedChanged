package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelSlimeling_remaster;
import net.ltxprogrammer.turned.entity.ProtectorSlimelingEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/ProtectorSlimelingRenderer.class */
public class ProtectorSlimelingRenderer extends MobRenderer<ProtectorSlimelingEntity, ModelSlimeling_remaster<ProtectorSlimelingEntity>> {
    public ProtectorSlimelingRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelSlimeling_remaster<>(context.bakeLayer(ModelSlimeling_remaster.LAYER_LOCATION)), 0.5f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.ProtectorSlimelingRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/protector_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull ProtectorSlimelingEntity entity) {
        return new ResourceLocation("turned:textures/entities/protector_remaster_texture.png");
    }
}
