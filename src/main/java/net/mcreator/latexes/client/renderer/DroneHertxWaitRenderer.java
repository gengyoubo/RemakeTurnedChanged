package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelDrone_Hertx_Sit;
import net.mcreator.latexes.entity.DroneHertxWaitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DroneHertxWaitRenderer.class */
public class DroneHertxWaitRenderer extends MobRenderer<DroneHertxWaitEntity, ModelDrone_Hertx_Sit<DroneHertxWaitEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DroneHertxWaitRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DroneHertxWaitRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DroneHertxWaitEntity, ModelDrone_Hertx_Sit<DroneHertxWaitEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/drone_hertx_texture_glow.png"));
        }
    }

    public DroneHertxWaitRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDrone_Hertx_Sit(context.bakeLayer(ModelDrone_Hertx_Sit.LAYER_LOCATION)), 0.6f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DroneHertxWaitEntity entity) {
        return new ResourceLocation("latex:textures/entities/drone_hertx_texture.png");
    }
}
