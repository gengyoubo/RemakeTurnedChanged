package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modeldl_slug_model;
import net.mcreator.latexes.entity.DarklatexslugEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarklatexslugRenderer.class */
public class DarklatexslugRenderer extends MobRenderer<DarklatexslugEntity, Modeldl_slug_model<DarklatexslugEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DarklatexslugRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarklatexslugRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DarklatexslugEntity, Modeldl_slug_model<DarklatexslugEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/dl_slug_glow.png"));
        }
    }

    public DarklatexslugRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldl_slug_model(context.bakeLayer(Modeldl_slug_model.LAYER_LOCATION)), 0.6f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarklatexslugEntity entity) {
        return new ResourceLocation("latex:textures/entities/dl_slug_texture.png");
    }
}
