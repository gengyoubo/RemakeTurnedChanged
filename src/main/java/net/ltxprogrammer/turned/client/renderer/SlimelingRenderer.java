package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelSlimeling_remaster;
import net.ltxprogrammer.turned.entity.SlimelingEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/SlimelingRenderer.class */
public class SlimelingRenderer extends MobRenderer<SlimelingEntity, ModelSlimeling_remaster<SlimelingEntity>> {
    public SlimelingRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelSlimeling_remaster(context.bakeLayer(ModelSlimeling_remaster.LAYER_LOCATION)), 0.5f);
        addLayer(new EyesLayer<SlimelingEntity, ModelSlimeling_remaster<SlimelingEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.SlimelingRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/slimeling_texture_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(SlimelingEntity entity) {
        return new ResourceLocation("turned:textures/entities/slimeling_texture.png");
    }
}
