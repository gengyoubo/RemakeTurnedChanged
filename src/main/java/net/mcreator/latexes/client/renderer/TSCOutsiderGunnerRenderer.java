package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modeltsc_outsider_ranged_model;
import net.mcreator.latexes.entity.TSCOutsiderGunnerEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/TSCOutsiderGunnerRenderer.class */
public class TSCOutsiderGunnerRenderer extends MobRenderer<TSCOutsiderGunnerEntity, Modeltsc_outsider_ranged_model<TSCOutsiderGunnerEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.TSCOutsiderGunnerRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/TSCOutsiderGunnerRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<TSCOutsiderGunnerEntity, Modeltsc_outsider_ranged_model<TSCOutsiderGunnerEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/tsc_outsider_gunner_glow.png"));
        }
    }

    public TSCOutsiderGunnerRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeltsc_outsider_ranged_model(context.bakeLayer(Modeltsc_outsider_ranged_model.LAYER_LOCATION)), 0.5f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull TSCOutsiderGunnerEntity entity) {
        return new ResourceLocation("latex:textures/entities/tsc_outsider_gunner_texture.png");
    }
}
