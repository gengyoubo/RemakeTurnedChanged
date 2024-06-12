package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modeldl_slug_model;
import net.ltxprogrammer.turned.entity.DarklatexslugEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarklatexslugRenderer.class */
public class DarklatexslugRenderer extends MobRenderer<DarklatexslugEntity, Modeldl_slug_model<DarklatexslugEntity>> {
    public DarklatexslugRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldl_slug_model(context.bakeLayer(Modeldl_slug_model.LAYER_LOCATION)), 0.6f);
        addLayer(new EyesLayer<DarklatexslugEntity, Modeldl_slug_model<DarklatexslugEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.DarklatexslugRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/dl_slug_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(DarklatexslugEntity entity) {
        return new ResourceLocation("turned:textures/entities/dl_slug_texture.png");
    }
}
