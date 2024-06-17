package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modeldark_latex_shark;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DlsharkRenderer.class */
public class DlsharkRenderer extends MobRenderer<DlsharkEntity, Modeldark_latex_shark<DlsharkEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DlsharkRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DlsharkRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DlsharkEntity, Modeldark_latex_shark<DlsharkEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_shark_glow.png"));
        }
    }

    public DlsharkRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldark_latex_shark(context.bakeLayer(Modeldark_latex_shark.LAYER_LOCATION)), 0.6f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DlsharkEntity entity) {
        return new ResourceLocation("latex:textures/entities/dark_latex_shark_texture.png");
    }
}
