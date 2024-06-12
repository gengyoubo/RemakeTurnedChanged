package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modella_4_tankmorph_model_m;
import net.ltxprogrammer.turned.entity.La4tankmorphmEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/La4tankmorphmRenderer.class */
public class La4tankmorphmRenderer extends MobRenderer<La4tankmorphmEntity, Modella_4_tankmorph_model_m<La4tankmorphmEntity>> {
    public La4tankmorphmRenderer(EntityRendererProvider.Context context) {
        super(context, new Modella_4_tankmorph_model_m(context.bakeLayer(Modella_4_tankmorph_model_m.LAYER_LOCATION)), 1.1f);
        addLayer(new EyesLayer<La4tankmorphmEntity, Modella_4_tankmorph_model_m<La4tankmorphmEntity>>(this) { // from class: net.ltxprogrammer.turned.client.renderer.La4tankmorphmRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/la4_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(La4tankmorphmEntity entity) {
        return new ResourceLocation("turned:textures/entities/la-4_tankmorph_evil.png");
    }
}
