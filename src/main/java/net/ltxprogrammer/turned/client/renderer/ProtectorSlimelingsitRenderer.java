package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelSlimeling_remaster_sit;
import net.ltxprogrammer.turned.entity.ProtectorSlimelingsitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/ProtectorSlimelingsitRenderer.class */
public class ProtectorSlimelingsitRenderer extends MobRenderer<ProtectorSlimelingsitEntity, ModelSlimeling_remaster_sit<ProtectorSlimelingsitEntity>> {
    public ProtectorSlimelingsitRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelSlimeling_remaster_sit(context.bakeLayer(ModelSlimeling_remaster_sit.LAYER_LOCATION)), 0.7f);
        addLayer(new EyesLayer<ProtectorSlimelingsitEntity, ModelSlimeling_remaster_sit<ProtectorSlimelingsitEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.ProtectorSlimelingsitRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/protector_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(ProtectorSlimelingsitEntity entity) {
        return new ResourceLocation("turned:textures/entities/protector_remaster_texture.png");
    }
}
