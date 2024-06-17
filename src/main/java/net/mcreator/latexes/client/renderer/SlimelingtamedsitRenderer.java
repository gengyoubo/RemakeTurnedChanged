package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelSlimeling_remaster_sit;
import net.mcreator.latexes.entity.SlimelingtamedsitEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/SlimelingtamedsitRenderer.class */
public class SlimelingtamedsitRenderer extends MobRenderer<SlimelingtamedsitEntity, ModelSlimeling_remaster_sit<SlimelingtamedsitEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.SlimelingtamedsitRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/SlimelingtamedsitRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<SlimelingtamedsitEntity, ModelSlimeling_remaster_sit<SlimelingtamedsitEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/slimeling_tamed_glow.png"));
        }
    }

    public SlimelingtamedsitRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelSlimeling_remaster_sit(context.bakeLayer(ModelSlimeling_remaster_sit.LAYER_LOCATION)), 0.7f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull SlimelingtamedsitEntity entity) {
        return new ResourceLocation("latex:textures/entities/slimeling_tamed_texture.png");
    }
}
