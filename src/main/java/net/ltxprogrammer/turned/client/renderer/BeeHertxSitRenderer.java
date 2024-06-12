package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modelbee_hertx_sit_model;
import net.ltxprogrammer.turned.entity.BeeHertxSitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/BeeHertxSitRenderer.class */
public class BeeHertxSitRenderer extends MobRenderer<BeeHertxSitEntity, Modelbee_hertx_sit_model<BeeHertxSitEntity>> {
    public BeeHertxSitRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelbee_hertx_sit_model(context.bakeLayer(Modelbee_hertx_sit_model.LAYER_LOCATION)), 0.7f);
        addLayer(new EyesLayer<BeeHertxSitEntity, Modelbee_hertx_sit_model<BeeHertxSitEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.BeeHertxSitRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/bee_hertx_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(BeeHertxSitEntity entity) {
        return new ResourceLocation("turned:textures/entities/hertx_bee_texture.png");
    }
}
