package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.changed.client.renderer.LatexHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.layers.EmissiveBodyLayer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
import net.ltxprogrammer.turned.client.model.ModelDark_latex_fox;
import net.ltxprogrammer.turned.entity.DarkLatexFoxEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarkLatexFoxRenderer.class */
public class DarkLatexFoxRenderer extends LatexHumanoidRenderer<DarkLatexFoxEntity, ModelDark_latex_fox, ArmorNoneModel<DarkLatexFoxEntity>> {
    public DarkLatexFoxRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDark_latex_fox(context.bakeLayer(ModelDark_latex_fox.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 0.5f);
        addLayer(new EmissiveBodyLayer<>(this, new ResourceLocation("turned:textures/entities/dark_latex_fox_texture_glow.png")));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarkLatexFoxEntity entity) {
        return new ResourceLocation("turned:textures/entities/darklatexfoxtexture.png");
    }
}
