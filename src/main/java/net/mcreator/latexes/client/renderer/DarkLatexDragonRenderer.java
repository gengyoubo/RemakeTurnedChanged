package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modeldl_dragon_model;
import net.mcreator.latexes.entity.DarkLatexDragonEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexDragonRenderer.class */
public class DarkLatexDragonRenderer extends MobRenderer<DarkLatexDragonEntity, Modeldl_dragon_model<DarkLatexDragonEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DarkLatexDragonRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexDragonRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DarkLatexDragonEntity, Modeldl_dragon_model<DarkLatexDragonEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/dl_dragon_glow.png"));
        }
    }

    public DarkLatexDragonRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldl_dragon_model(context.bakeLayer(Modeldl_dragon_model.LAYER_LOCATION)), 0.8f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarkLatexDragonEntity entity) {
        return new ResourceLocation("latex:textures/entities/dark_latex_dragon.png");
    }
}
