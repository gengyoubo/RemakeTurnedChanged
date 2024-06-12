package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelhertx_ashbury_model;
import net.ltxprogrammer.turned.entity.AshburyHertxEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/AshburyHertxRenderer.class */
public class AshburyHertxRenderer extends MobRenderer<AshburyHertxEntity, Modelhertx_ashbury_model<AshburyHertxEntity>> {
    public AshburyHertxRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_ashbury_model(context.bakeLayer(Modelhertx_ashbury_model.LAYER_LOCATION)), 0.6f);
        addLayer(new EyesLayer<AshburyHertxEntity, Modelhertx_ashbury_model<AshburyHertxEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.AshburyHertxRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/hertx_ashbury_model_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(AshburyHertxEntity entity) {
        return new ResourceLocation("turned:textures/entities/hertx_ashbury_model.png");
    }
}
