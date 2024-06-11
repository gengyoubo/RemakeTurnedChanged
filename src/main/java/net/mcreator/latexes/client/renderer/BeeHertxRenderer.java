package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modelbee_hertx_model;
import net.mcreator.latexes.entity.BeeHertxEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/BeeHertxRenderer.class */
public class BeeHertxRenderer extends MobRenderer<BeeHertxEntity, Modelbee_hertx_model<BeeHertxEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.BeeHertxRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/BeeHertxRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<BeeHertxEntity, Modelbee_hertx_model<BeeHertxEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/bee_hertx_glow.png"));
        }
    }

    public BeeHertxRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelbee_hertx_model(context.bakeLayer(Modelbee_hertx_model.LAYER_LOCATION)), 0.6f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(BeeHertxEntity entity) {
        return new ResourceLocation("latex:textures/entities/hertx_bee_texture.png");
    }
}
