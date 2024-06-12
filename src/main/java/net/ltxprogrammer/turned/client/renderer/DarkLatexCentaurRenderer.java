package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.changed.client.renderer.LatexHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
import net.ltxprogrammer.turned.LatexMod;
import net.ltxprogrammer.turned.client.model.ModelDark_Latex_Centaur_Model;
import net.ltxprogrammer.turned.entity.DarkLatexCentaurEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.layers.SaddleLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarkLatexCentaurRenderer.class */
public class DarkLatexCentaurRenderer extends LatexHumanoidRenderer<DarkLatexCentaurEntity, ModelDark_Latex_Centaur_Model, ArmorNoneModel<DarkLatexCentaurEntity>> {
    public DarkLatexCentaurRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDark_Latex_Centaur_Model(context.bakeLayer(ModelDark_Latex_Centaur_Model.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 1.5f);
        addLayer(new EyesLayer<>(this) { // from class: net.ltxprogrammer.turned.client.renderer.DarkLatexCentaurRenderer.1
            public @NotNull RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/dark_latex_centaur_glow.png"));
            }
        });
        addLayer(new SaddleLayer<>(this, getModel(), LatexMod.modResource("textures/entities/dark_latex_centaur_texture_saddle.png")));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarkLatexCentaurEntity entity) {
        return new ResourceLocation("turned:textures/entities/dark_latex_centaur_texture.png");
    }
}
