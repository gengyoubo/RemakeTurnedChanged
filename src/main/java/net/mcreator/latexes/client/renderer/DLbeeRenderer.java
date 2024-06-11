package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.entity.DLbeeEntity;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DLbeeRenderer.class */
public class DLbeeRenderer extends HumanoidMobRenderer<DLbeeEntity, HumanoidModel<DLbeeEntity>> {
    public DLbeeRenderer(EntityRendererProvider.Context context) {
        super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
        addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
        addLayer(new AnonymousClass1(this));
    }

    /* renamed from: net.mcreator.latexes.client.renderer.DLbeeRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DLbeeRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DLbeeEntity, HumanoidModel<DLbeeEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_bee_glow.png"));
        }
    }

    public ResourceLocation getTextureLocation(DLbeeEntity entity) {
        return new ResourceLocation("latex:textures/entities/dark_latex_bee_texture.png");
    }
}
