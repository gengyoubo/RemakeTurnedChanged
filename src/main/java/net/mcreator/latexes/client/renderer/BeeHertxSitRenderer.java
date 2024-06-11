package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modelbee_hertx_sit_model;
import net.mcreator.latexes.entity.BeeHertxSitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/BeeHertxSitRenderer.class */
public class BeeHertxSitRenderer extends MobRenderer<BeeHertxSitEntity, Modelbee_hertx_sit_model<BeeHertxSitEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.BeeHertxSitRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/BeeHertxSitRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<BeeHertxSitEntity, Modelbee_hertx_sit_model<BeeHertxSitEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/bee_hertx_glow.png"));
        }
    }

    public BeeHertxSitRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelbee_hertx_sit_model(context.bakeLayer(Modelbee_hertx_sit_model.LAYER_LOCATION)), 0.7f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(BeeHertxSitEntity entity) {
        return new ResourceLocation("latex:textures/entities/hertx_bee_texture.png");
    }
}
