package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modeltsc_outsider_ranged_model;
import net.ltxprogrammer.turned.entity.TSCOutsiderGunnerEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/TSCOutsiderGunnerRenderer.class */
public class TSCOutsiderGunnerRenderer extends MobRenderer<TSCOutsiderGunnerEntity, Modeltsc_outsider_ranged_model<TSCOutsiderGunnerEntity>> {
    public TSCOutsiderGunnerRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeltsc_outsider_ranged_model<>(context.bakeLayer(Modeltsc_outsider_ranged_model.LAYER_LOCATION)), 0.5f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.TSCOutsiderGunnerRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/tsc_outsider_gunner_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull TSCOutsiderGunnerEntity entity) {
        return new ResourceLocation("turned:textures/entities/tsc_outsider_gunner_texture.png");
    }
}
