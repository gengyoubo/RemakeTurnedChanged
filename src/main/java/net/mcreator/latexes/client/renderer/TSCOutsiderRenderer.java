package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modeltsc_outsider_model;
import net.mcreator.latexes.entity.TSCOutsiderEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/TSCOutsiderRenderer.class */
public class TSCOutsiderRenderer extends MobRenderer<TSCOutsiderEntity, Modeltsc_outsider_model<TSCOutsiderEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.TSCOutsiderRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/TSCOutsiderRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<TSCOutsiderEntity, Modeltsc_outsider_model<TSCOutsiderEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/tsc_outsider_glow.png"));
        }
    }

    public TSCOutsiderRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeltsc_outsider_model(context.bakeLayer(Modeltsc_outsider_model.LAYER_LOCATION)), 0.5f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull TSCOutsiderEntity entity) {
        return new ResourceLocation("latex:textures/entities/tsc_outsider_texture.png");
    }
}
