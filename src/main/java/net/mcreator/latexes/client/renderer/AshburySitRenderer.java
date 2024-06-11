package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modelhertx_ashbury_sit_model;
import net.mcreator.latexes.entity.AshburySitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/AshburySitRenderer.class */
public class AshburySitRenderer extends MobRenderer<AshburySitEntity, Modelhertx_ashbury_sit_model<AshburySitEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.AshburySitRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/AshburySitRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<AshburySitEntity, Modelhertx_ashbury_sit_model<AshburySitEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/hertx_ashbury_model_glow.png"));
        }
    }

    public AshburySitRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_ashbury_sit_model(context.bakeLayer(Modelhertx_ashbury_sit_model.LAYER_LOCATION)), 0.7f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(AshburySitEntity entity) {
        return new ResourceLocation("latex:textures/entities/hertx_ashbury_model.png");
    }
}
