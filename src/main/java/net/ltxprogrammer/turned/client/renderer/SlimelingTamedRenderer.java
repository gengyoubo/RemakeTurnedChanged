package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelSlimeling_remaster;
import net.ltxprogrammer.turned.entity.SlimelingTamedEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/SlimelingTamedRenderer.class */
public class SlimelingTamedRenderer extends MobRenderer<SlimelingTamedEntity, ModelSlimeling_remaster<SlimelingTamedEntity>> {
    public SlimelingTamedRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelSlimeling_remaster(context.bakeLayer(ModelSlimeling_remaster.LAYER_LOCATION)), 0.5f);
        addLayer(new EyesLayer<SlimelingTamedEntity, ModelSlimeling_remaster<SlimelingTamedEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.SlimelingTamedRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/slimeling_tamed_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(SlimelingTamedEntity entity) {
        return new ResourceLocation("turned:textures/entities/slimeling_tamed_texture.png");
    }
}
