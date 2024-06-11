package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelAHV_hertx_sit_model;
import net.mcreator.latexes.entity.AHVHertxSitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/AHVHertxSitRenderer.class */
public class AHVHertxSitRenderer extends MobRenderer<AHVHertxSitEntity, ModelAHV_hertx_sit_model<AHVHertxSitEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.AHVHertxSitRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/AHVHertxSitRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<AHVHertxSitEntity, ModelAHV_hertx_sit_model<AHVHertxSitEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/ahv_glow.png"));
        }
    }

    public AHVHertxSitRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelAHV_hertx_sit_model(context.bakeLayer(ModelAHV_hertx_sit_model.LAYER_LOCATION)), 0.7f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(AHVHertxSitEntity entity) {
        return new ResourceLocation("latex:textures/entities/ahv_texture.png");
    }
}
