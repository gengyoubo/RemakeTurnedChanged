package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.changed.client.renderer.LatexHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.layers.EmissiveBodyLayer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
import net.ltxprogrammer.turned.client.model.Modeldark_latex_cake_model;
import net.ltxprogrammer.turned.entity.DarkLatexCakeEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarkLatexCakeRenderer.class */
public class DarkLatexCakeRenderer extends LatexHumanoidRenderer<DarkLatexCakeEntity, Modeldark_latex_cake_model, ArmorNoneModel<DarkLatexCakeEntity>> {
    public DarkLatexCakeRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldark_latex_cake_model(context.bakeLayer(Modeldark_latex_cake_model.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 0.5f);
        addLayer(new EmissiveBodyLayer<>(this, new ResourceLocation("turned:textures/entities/dark_latex_cake_glow.png")));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarkLatexCakeEntity entity) {
        return new ResourceLocation("turned:textures/entities/dark_latex_cake_model.png");
    }
}
