package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.ModelDL_Queen_Bee;
import net.ltxprogrammer.turned.entity.DarkLatexQueenBeeEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarkLatexQueenBeeRenderer.class */
public class DarkLatexQueenBeeRenderer extends MobRenderer<DarkLatexQueenBeeEntity, ModelDL_Queen_Bee<DarkLatexQueenBeeEntity>> {
    public DarkLatexQueenBeeRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDL_Queen_Bee<>(context.bakeLayer(ModelDL_Queen_Bee.LAYER_LOCATION)), 1.0f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.DarkLatexQueenBeeRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/dark_latex_queen_bee_glow.png"));
            }
        });
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarkLatexQueenBeeEntity entity) {
        return new ResourceLocation("turned:textures/entities/dark_latex_queen_bee_texture.png");
    }
}
