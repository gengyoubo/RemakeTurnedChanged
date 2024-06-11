package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modella_4_tankmorph_model_r;
import net.mcreator.latexes.entity.La4tankmorphrEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/La4tankmorphrRenderer.class */
public class La4tankmorphrRenderer extends MobRenderer<La4tankmorphrEntity, Modella_4_tankmorph_model_r<La4tankmorphrEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.La4tankmorphrRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/La4tankmorphrRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<La4tankmorphrEntity, Modella_4_tankmorph_model_r<La4tankmorphrEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/la4_glow.png"));
        }
    }

    public La4tankmorphrRenderer(EntityRendererProvider.Context context) {
        super(context, new Modella_4_tankmorph_model_r(context.bakeLayer(Modella_4_tankmorph_model_r.LAYER_LOCATION)), 1.1f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(La4tankmorphrEntity entity) {
        return new ResourceLocation("latex:textures/entities/la-4_tankmorph_evil.png");
    }
}
