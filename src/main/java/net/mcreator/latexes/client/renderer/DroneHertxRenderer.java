package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelDrone_Hertx;
import net.mcreator.latexes.entity.DroneHertxEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DroneHertxRenderer.class */
public class DroneHertxRenderer extends MobRenderer<DroneHertxEntity, ModelDrone_Hertx<DroneHertxEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DroneHertxRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DroneHertxRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DroneHertxEntity, ModelDrone_Hertx<DroneHertxEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/drone_hertx_texture_glow.png"));
        }
    }

    public DroneHertxRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDrone_Hertx(context.bakeLayer(ModelDrone_Hertx.LAYER_LOCATION)), 0.6f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DroneHertxEntity entity) {
        return new ResourceLocation("latex:textures/entities/drone_hertx_texture.png");
    }
}
