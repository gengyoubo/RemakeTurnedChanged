package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.Modella_4_tankmorph_model_m;
import net.mcreator.latexes.entity.La4tankmorphmEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/La4tankmorphmRenderer.class */
public class La4tankmorphmRenderer extends MobRenderer<La4tankmorphmEntity, Modella_4_tankmorph_model_m<La4tankmorphmEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.La4tankmorphmRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/La4tankmorphmRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<La4tankmorphmEntity, Modella_4_tankmorph_model_m<La4tankmorphmEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/la4_glow.png"));
        }
    }

    public La4tankmorphmRenderer(EntityRendererProvider.Context context) {
        super(context, new Modella_4_tankmorph_model_m(context.bakeLayer(Modella_4_tankmorph_model_m.LAYER_LOCATION)), 1.1f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull La4tankmorphmEntity entity) {
        return new ResourceLocation("latex:textures/entities/la-4_tankmorph_evil.png");
    }
}
