package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.changed.client.renderer.LatexHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.layers.EmissiveBodyLayer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
import net.ltxprogrammer.turned.client.model.ModelDark_latex_snep;
import net.ltxprogrammer.turned.entity.DarkLatexSnepEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarkLatexSnepRenderer.class */
public class DarkLatexSnepRenderer extends LatexHumanoidRenderer<DarkLatexSnepEntity, ModelDark_latex_snep, ArmorNoneModel<DarkLatexSnepEntity>> {
    public DarkLatexSnepRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDark_latex_snep(context.bakeLayer(ModelDark_latex_snep.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 0.5f);
        addLayer(new EmissiveBodyLayer<>(this, new ResourceLocation("turned:textures/entities/dark_latex_snep_glow.png")));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarkLatexSnepEntity entity) {
        return new ResourceLocation("turned:textures/entities/dl_snep_texture.png");
    }
}
