package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modeldark_latex_squiddog_model;
import net.mcreator.latexes.entity.DlSquidDogEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DlSquidDogRenderer.class */
public class DlSquidDogRenderer extends MobRenderer<DlSquidDogEntity, Modeldark_latex_squiddog_model<DlSquidDogEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DlSquidDogRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DlSquidDogRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DlSquidDogEntity, Modeldark_latex_squiddog_model<DlSquidDogEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_squiddog_glow.png"));
        }
    }

    public DlSquidDogRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldark_latex_squiddog_model(context.bakeLayer(Modeldark_latex_squiddog_model.LAYER_LOCATION)), 0.6f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(DlSquidDogEntity entity) {
        return new ResourceLocation("latex:textures/entities/dark_latex_squiddog_model.png");
    }
}
