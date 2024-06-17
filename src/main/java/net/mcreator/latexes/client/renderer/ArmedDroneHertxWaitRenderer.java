package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelArmed_Drone_Hertx_Rest;
import net.mcreator.latexes.entity.ArmedDroneHertxWaitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/ArmedDroneHertxWaitRenderer.class */
public class ArmedDroneHertxWaitRenderer extends MobRenderer<ArmedDroneHertxWaitEntity, ModelArmed_Drone_Hertx_Rest<ArmedDroneHertxWaitEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.ArmedDroneHertxWaitRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/ArmedDroneHertxWaitRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<ArmedDroneHertxWaitEntity, ModelArmed_Drone_Hertx_Rest<ArmedDroneHertxWaitEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/armed_drone_hertx_texture_glow.png"));
        }
    }

    public ArmedDroneHertxWaitRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelArmed_Drone_Hertx_Rest(context.bakeLayer(ModelArmed_Drone_Hertx_Rest.LAYER_LOCATION)), 0.6f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull ArmedDroneHertxWaitEntity entity) {
        return new ResourceLocation("latex:textures/entities/armed_drone_hertx_texture.png");
    }
}
