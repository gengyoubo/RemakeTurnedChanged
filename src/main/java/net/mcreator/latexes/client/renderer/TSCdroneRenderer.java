package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modeltsc_drone_model;
import net.mcreator.latexes.entity.TSCdroneEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/TSCdroneRenderer.class */
public class TSCdroneRenderer extends MobRenderer<TSCdroneEntity, Modeltsc_drone_model<TSCdroneEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.TSCdroneRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/TSCdroneRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<TSCdroneEntity, Modeltsc_drone_model<TSCdroneEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/tsc_drone_glow.png"));
        }
    }

    public TSCdroneRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeltsc_drone_model(context.bakeLayer(Modeltsc_drone_model.LAYER_LOCATION)), 0.5f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull TSCdroneEntity entity) {
        return new ResourceLocation("latex:textures/entities/tsc_drone_texture.png");
    }
}
