package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelSlimeling_remaster;
import net.mcreator.latexes.entity.ProtectorSlimelingEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/ProtectorSlimelingRenderer.class */
public class ProtectorSlimelingRenderer extends MobRenderer<ProtectorSlimelingEntity, ModelSlimeling_remaster<ProtectorSlimelingEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.ProtectorSlimelingRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/ProtectorSlimelingRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<ProtectorSlimelingEntity, ModelSlimeling_remaster<ProtectorSlimelingEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public @NotNull RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/protector_glow.png"));
        }
    }

    public ProtectorSlimelingRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelSlimeling_remaster(context.bakeLayer(ModelSlimeling_remaster.LAYER_LOCATION)), 0.5f);
        addLayer(new AnonymousClass1(this));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull ProtectorSlimelingEntity entity) {
        return new ResourceLocation("latex:textures/entities/protector_remaster_texture.png");
    }
}
