package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modelhertx_ashbury_model;
import net.mcreator.latexes.entity.AshburyHertxEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/AshburyHertxRenderer.class */
public class AshburyHertxRenderer extends MobRenderer<AshburyHertxEntity, Modelhertx_ashbury_model<AshburyHertxEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.AshburyHertxRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/AshburyHertxRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<AshburyHertxEntity, Modelhertx_ashbury_model<AshburyHertxEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/hertx_ashbury_model_glow.png"));
        }
    }

    public AshburyHertxRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhertx_ashbury_model(context.bakeLayer(Modelhertx_ashbury_model.LAYER_LOCATION)), 0.6f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull AshburyHertxEntity entity) {
        return new ResourceLocation("latex:textures/entities/hertx_ashbury_model.png");
    }
}
