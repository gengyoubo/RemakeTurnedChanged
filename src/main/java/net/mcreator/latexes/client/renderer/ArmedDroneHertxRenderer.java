package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelMilitary_Drone_Hertx;
import net.mcreator.latexes.entity.ArmedDroneHertxEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/ArmedDroneHertxRenderer.class */
public class ArmedDroneHertxRenderer extends MobRenderer<ArmedDroneHertxEntity, ModelMilitary_Drone_Hertx<ArmedDroneHertxEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.ArmedDroneHertxRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/ArmedDroneHertxRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<ArmedDroneHertxEntity, ModelMilitary_Drone_Hertx<ArmedDroneHertxEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/armed_drone_hertx_texture_glow.png"));
        }
    }

    public ArmedDroneHertxRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelMilitary_Drone_Hertx(context.bakeLayer(ModelMilitary_Drone_Hertx.LAYER_LOCATION)), 0.6f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(ArmedDroneHertxEntity entity) {
        return new ResourceLocation("latex:textures/entities/armed_drone_hertx_texture.png");
    }
}
