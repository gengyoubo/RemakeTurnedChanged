package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelAHV_hertx_model;
import net.mcreator.latexes.entity.AHVHertxEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/AHVHertxRenderer.class */
public class AHVHertxRenderer extends MobRenderer<AHVHertxEntity, ModelAHV_hertx_model<AHVHertxEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.AHVHertxRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/AHVHertxRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<AHVHertxEntity, ModelAHV_hertx_model<AHVHertxEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/ahv_glow.png"));
        }
    }

    public AHVHertxRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelAHV_hertx_model(context.bakeLayer(ModelAHV_hertx_model.LAYER_LOCATION)), 0.7f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(AHVHertxEntity entity) {
        return new ResourceLocation("latex:textures/entities/ahv_texture.png");
    }
}
